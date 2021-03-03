package com.beuni.puppyadoption.model

import android.os.Parcel
import android.os.Parcelable

data class DogData(
   val name: String?,
   val age: String?,
   val gender: String?,
   val bread: String?,
   val imageUrl: String?,
   val description: String?,
): Parcelable {
   constructor(parcel: Parcel) : this(
      parcel.readString(),
      parcel.readString(),
      parcel.readString(),
      parcel.readString(),
      parcel.readString(),
      parcel.readString()
   ) {
   }

   override fun writeToParcel(parcel: Parcel, flags: Int) {
      parcel.writeString(name)
      parcel.writeString(age)
      parcel.writeString(gender)
      parcel.writeString(bread)
      parcel.writeString(imageUrl)
      parcel.writeString(description)
   }

   override fun describeContents(): Int {
      return 0
   }

   companion object CREATOR : Parcelable.Creator<DogData> {
      override fun createFromParcel(parcel: Parcel): DogData {
         return DogData(parcel)
      }

      override fun newArray(size: Int): Array<DogData?> {
         return arrayOfNulls(size)
      }
   }
}
