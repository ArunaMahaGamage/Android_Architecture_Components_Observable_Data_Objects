package com.example.observable

import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableArrayMap
import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt


class User {

    // Observable fields
    val firstName = ObservableField<String>()
    val lastName = ObservableField<String>()
    val age = ObservableInt()

    // Observable collections
    var ObservableArrayMap = ObservableArrayMap<String, Any>().apply {
        put("firstName", "Google")
        put("lastName", "Inc.")
        put("age", 17)
    }

    // List
    var observableArrayList = ObservableArrayList<Any>().apply {
        add("Google")
        add("Inc.")
        add(17)
    }

    // Observable objects
    var observableObjects = ObservableObjectsUser()
}