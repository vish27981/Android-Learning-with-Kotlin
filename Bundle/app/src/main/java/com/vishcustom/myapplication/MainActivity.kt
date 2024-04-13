package com.vishcustom.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name=findViewById<EditText>(R.id.name)
        val email=findViewById<EditText>(R.id.email)
        val passData=findViewById<Button>(R.id.btn)

        passData.setOnClickListener{
            val getName=name.text.toString()
            val getEmail=email.text.toString()

            val bundle =Bundle()
            bundle.putString("name",getName)
            bundle.putString("email",getEmail)

            val intent =Intent(this,SecondActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }

    }
}