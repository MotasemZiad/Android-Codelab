package com.motasem.ziad.sqlitedatabase.model

import android.os.Parcel
import android.os.Parcelable

data class Student(var id: Int, var name: String?, var avg: Double, var image: String?) :
    Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readDouble(),
        parcel.readString()
    )

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest!!.writeInt(id)
        dest.writeString(name)
        dest.writeDouble(avg)
        dest.writeString(image)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Student> {
        override fun createFromParcel(parcel: Parcel): Student {
            return Student(parcel)
        }

        override fun newArray(size: Int): Array<Student?> {
            return arrayOfNulls(size)
        }

        val COL_ID = "id"
        val COL_NAME = "name"
        val COL_AVG = "avg"
        val COL_IMAGE = "image"

        val TABLE_NAME = "Student"
        val TABLE_CREATE =
            "create table $TABLE_NAME($COL_ID integer primary key autoincrement, $COL_NAME text not null, $COL_AVG double, $COL_IMAGE text);"
    }
}

