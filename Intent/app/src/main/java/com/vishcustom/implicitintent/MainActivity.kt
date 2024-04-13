package com.vishcustom.implicitintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.implicit_intent)
    }

    fun shareData(view: View) {
        val intent =Intent(Intent.ACTION_VIEW)
        startActivity(Intent.createChooser(intent,"Share with..."))
    }
}