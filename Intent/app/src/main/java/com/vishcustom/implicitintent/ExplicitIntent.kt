package com.vishcustom.implicitintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ExplicitIntent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit_intent)

        val btn=findViewById<Button>(R.id.button2)
        btn.setOnClickListener{
            val intent =Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}