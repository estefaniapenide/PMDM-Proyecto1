package com.example.penide_estefania_p1_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.R.layout
import android.content.Intent
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class Ej4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ej4)


        val textoSi:TextView=findViewById(R.id.textView14)
        val textoNo:TextView=findViewById(R.id.textView15)
        val textoAveces:TextView=findViewById(R.id.textView16)

        textoSi.setOnClickListener{
            Toast.makeText(this@Ej4Activity,"SÍ", Toast.LENGTH_SHORT).show()
        }

        textoNo.setOnClickListener{
            Toast.makeText(this@Ej4Activity,"NO", Toast.LENGTH_SHORT).show()
        }

        textoAveces.setOnClickListener{
            Toast.makeText(this@Ej4Activity,"A VECES", Toast.LENGTH_SHORT).show()
        }

        val botonVuelta: Button = findViewById(R.id.button12)

        botonVuelta.setOnClickListener {
            val intent = Intent(
                this,
                MainActivity::class.java
            )
            startActivity(intent)
        }
    }
}