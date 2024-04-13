package com.vishcustom.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val showName=findViewById<TextView>(R.id.name)
        val showEmail=findViewById<TextView>(R.id.email)

        val bundle =intent.extras
        showName.setText(bundle!!.getString("name","name"))
        showEmail.setText(bundle!!.getString("email","email"))


    }
}