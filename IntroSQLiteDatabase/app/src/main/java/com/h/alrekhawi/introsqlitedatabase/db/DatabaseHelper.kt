package com.h.alrekhawi.introsqlitedatabase.db

import android.app.Activity
import android.content.ContentValues
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.h.alrekhawi.introsqlitedatabase.model.Student

class DatabaseHelper(activity: Activity) :
    SQLiteOpenHelper(activity, DATABASE_NAME, null, DATABASE_VERSION) {

    private val db: SQLiteDatabase = this.writableDatabase

    override fun onCreate(db: SQLiteDatabase?) {
        db!!.execSQL(Student.TABLE_CREATE)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db!!.execSQL("Drop table if exists ${Student.TABLE_NAME}")
        onCreate(db)
    }

    //==============================================================================================
    //DML

    fun insertStudent(name: String, average: Double, image: String): Boolean {
        val cv = ContentValues()
        cv.put(Student.COL_NAME, name)
        cv.put(Student.COL_AVERAGE, average)
        cv.put(Student.COL_IMAGE, image)
        return db.insert(Student.TABLE_NAME, null, cv) > 0
    }

    fun getAllStudents(): ArrayList<Student> {
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
        //return db.delete(Student.TABLE_NAME,"${Student.COL_ID} = ?", arrayOf(id.toString()))>0
        return db.delete(Student.TABLE_NAME, "${Student.COL_ID} = $id", null) > 0
    }

    fun updateStudent(oldId: Int, name: String?, average: Double): Boolean {
        val cv = ContentValues()
        //if(name!=null)
        cv.put(Student.COL_NAME, name)
        cv.put(Student.COL_AVERAGE, average)
        return db.update(Student.TABLE_NAME, cv, "${Student.COL_ID} = $oldId", null) > 0
    }

    companion object {
        val DATABASE_NAME = "University"
        val DATABASE_VERSION = 1

    }
}