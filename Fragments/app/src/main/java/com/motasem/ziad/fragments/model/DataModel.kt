package com.motasem.ziad.fragments.model

import android.os.Parcel
import android.os.Parcelable

data class DataModel(
    var id: Int,
    var username: String?,
    var password: String?,
    var isChecked: Boolean
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString(),
        parcel.readByte() != 0.toByte()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(username)
        parcel.writeString(password)
        parcel.writeByte(if (isChecked) 1 else 0)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<DataModel> {
        override fun createFromParcel(parcel: Parcel): DataModel {
            return DataModel(parcel)
        }

        override fun newArray(size: Int): Array<DataModel?> {
            return arrayOfNulls(size)
        }
    }
}