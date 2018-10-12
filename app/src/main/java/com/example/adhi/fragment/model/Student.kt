package com.example.adhi.fragment.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Student(
        var id: String? = null,
        var name: String? = null,
        var email: String? = null,
        var imgAvatar: Int? = null
) : Parcelable