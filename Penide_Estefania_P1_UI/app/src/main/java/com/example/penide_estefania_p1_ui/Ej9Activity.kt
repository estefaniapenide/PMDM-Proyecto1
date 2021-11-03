package com.example.penide_estefania_p1_ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.core.widget.addTextChangedListener
import com.example.penide_estefania_p1_ui.databinding.ActivityEj8Binding
import com.example.penide_estefania_p1_ui.databinding.ActivityEj9Binding

class Ej9Activity : AppCompatActivity() {
    private lateinit var binding: ActivityEj9Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEj9Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button18.setOnClickListener {
            val intent = Intent(
                this,
                MainActivity::class.java
            )
            startActivity(intent)
        }
        //android:inputType="textCapSentences"


    }
}