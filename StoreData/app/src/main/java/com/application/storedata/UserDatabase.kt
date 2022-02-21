package com.application.storedata

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.graphics.Bitmap
import android.graphics.Bitmap.CompressFormat
import android.graphics.BitmapFactory
import java.io.ByteArrayOutputStream


class UserDatabase(context: Context) : SQLiteOpenHelper(context, "database", null, 2) {
    override fun onCreate(p0: SQLiteDatabase?) {

        val CREATE_TABLE_USER =
            ("CREATE TABLE " + "User" + "("
                    + "id" + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "name" + " TEXT,"
                    + "mobile" + " TEXT,"
                    + "image" + " BLOB,"
                    + ");")

        p0!!.execSQL(CREATE_TABLE_USER)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        p0!!.execSQL("DROP TABLE IF EXISTS" + "User")
        onCreate(p0)
    }

    fun insertUser(user: User): Long {
        var database = this.writableDatabase
        val image  = getBitmapAsByteArray(user.image!!)
        var contentValues = ContentValues()
        contentValues.put("name", user.name)
        contentValues.put("mobile", user.mobile)
        contentValues.put("image", image)

        var id = database.insert("user", null, contentValues)
        return id
    }


    fun getUserData(id: Long): User {
        val db = this.readableDatabase
        val query = ("select * from user where id=$id" + "")
        val cursor = db.rawQuery(query, null)
        cursor.moveToFirst()
        val user = User(
            cursor.getString(cursor.getColumnIndex("name")),
            cursor.getString(cursor.getColumnIndex("mobile")),
            getImage(cursor.getBlob(cursor.getColumnIndex("image")))
        )

        cursor.close()
        return user
    }

    fun deleteUser(id: Long){
        val db = this.writableDatabase
        db.delete("user","id=$id",null)
    }

    fun getAllUser():MutableList<User>{
        val list = mutableListOf<User>()
        val db = this.readableDatabase
        val query = ("select * from user")
        val cursor = db.rawQuery(query, null)
        if (cursor.moveToFirst()){
            do {
                val user = User(
                    cursor.getString(cursor.getColumnIndex("name")),
                    cursor.getString(cursor.getColumnIndex("mobile")),
                    getImage(cursor.getBlob(cursor.getColumnIndex("image")))
                )
                list.add(user)
            }while (cursor.moveToNext())
        }
        db.close()
        return list
    }


    fun getUserCount(): Int {
        val db = this.readableDatabase
        val query = ("select * from user" + "")
        val cursor = db.rawQuery(query, null)
        return cursor.count
    }

    fun getBitmapAsByteArray(bitmap: Bitmap): ByteArray? {
        val outputStream = ByteArrayOutputStream()
        bitmap.compress(CompressFormat.JPEG, 0, outputStream)
        return outputStream.toByteArray()
    }

    fun getImage(image: ByteArray): Bitmap? {
        return BitmapFactory.decodeByteArray(image, 0, image.size)
    }

}