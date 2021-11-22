package com.example.penide_estefania_p1_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.penide_estefania_p1_ui.databinding.ActivityEj12Binding

class Ej12Activity : AppCompatActivity() {
    private lateinit var binding:ActivityEj12Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityEj12Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}