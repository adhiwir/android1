package com.example.adhi.fragment.model

import java.io.Serializable

data class Student(
        var id: String? = null,
        var name: String? = null,
        var email: String? = null,
        var imgAvatar: Int? = null


) : Serializable