package com.example.penide_estefania_p1_ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Ej6Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ej6)

        val botonVuelta: Button = findViewById(R.id.button14)

        botonVuelta.setOnClickListener {
            val intent = Intent(
                this,
                MainActivity::class.java
            )
            startActivity(intent)
        }
    }
}