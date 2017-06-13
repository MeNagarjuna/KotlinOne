package com.navigationdrawer.kotlinone

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        /*  Kotlin Android Extensions is basically a view binder that will let you use your XML views
        in your code by just using their id. It will automatically create properties for them without
        using any external annotation or findViewById methods.*/

        editName.setText("Name is Naga")
        editPassword.setText("password")

        textView.text = "simple text for testing"
        passwordText.text = "polam"
    }
}