package com.motasem.ziad.sqlitedatabase.db

import android.app.Activity
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.content.ContentValues
import com.motasem.ziad.sqlitedatabase.model.Student

class DatabaseHelper(activity: Activity) :
    SQLiteOpenHelper(activity, DATABASE_NAME, null, DATABASE_VERSION) {

    private val db: SQLiteDatabase = this.writableDatabase

    companion object {
        val DATABASE_NAME = "University"
        val DATABASE_VERSION = 1
    }

    // DDL
    override fun onCreate(db: SQLiteDatabase?) {
        db!!.execSQL(Student.TABLE_CREATE)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db!!.execSQL("Drop table if exists ${Student.TABLE_NAME}")
        onCreate(db)
    }

    //================================================
    // DML

    fun insertStudent(name: String, avg: Double, img: String): Boolean {
        val cv = ContentValues()
        cv.put(Student.COL_NAME, name)
        cv.put(Student.COL_AVG, avg)
        cv.put(Student.COL_IMAGE, img)
        return db.insert(Student.TABLE_NAME, null, cv) > 0
    }

    fun getAllStudent(): ArrayList<Student> {
        val data = ArrayList<Student>()
        val c =
            db.rawQuery("select * from ${Student.TABLE_NAME} order by ${Student.COL_ID} desc", null)
        c.moveToFirst()
        while (!c.isAfterLast) {
            val s = Student(c.getInt(0), c.getString(1), c.getDouble(2), c.getString(3))
            data.add(s)
            c.moveToNext()
        }
        c.close()
        return data
    }

    fun deleteStudent(id: Int): Boolean {
        //return db.delete(Student.TABLE_NAME,"${Student.COL_ID}= ?", arrayOf(id.toString()))>0
        return db.delete(Student.TABLE_NAME, "${Student.COL_ID}=$id", null) > 0
    }

    fun updateStudent(oldId: Int, name: String?, avg: Double): Boolean {
        val cv = ContentValues()
        //if(name!=null)
        cv.put(Student.COL_NAME, name)
        cv.put(Student.COL_AVG, avg)
        return db.update(Student.TABLE_NAME, cv, "${Student.COL_ID}=$oldId", null) > 0
    }


}