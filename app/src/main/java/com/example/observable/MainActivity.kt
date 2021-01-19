package com.example.observable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableArrayMap
import com.example.observable.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        // Data Binding
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
            this, R.layout.activity_main)

        var user = User()
        user.firstName.set("gggg")

        // UI to Model Bind
        binding.user = user

        // Model data Change
        var text = binding.text.text
        user.firstName.set("ccc")

        user.observableObjects.firstName = "fdffds"
    }
}