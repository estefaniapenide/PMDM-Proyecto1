package com.example.penide_estefania_p1_ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.penide_estefania_p1_ui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            val intent = Intent(
                this,
                Ej1Activity::class.java
            )
            startActivity(intent)
        }

        binding.button2.setOnClickListener{
            val intent = Intent(
                this,
                Ej2Activity::class.java
            )
            startActivity(intent)
        }

        binding.button3.setOnClickListener{
            val intent = Intent(
                this,
                Ej3Activity::class.java
            )
            startActivity(intent)
        }

        binding.button4.setOnClickListener{
            val intent = Intent(
                this,
                Ej4Activity::class.java
            )
            startActivity(intent)
        }

        binding.button5.setOnClickListener{
            val intent = Intent(
                this,
                Ej5Activity::class.java
            )
            startActivity(intent)
        }

        binding.button6.setOnClickListener{
            val intent = Intent(
                this,
                Ej6Activity::class.java
            )
            startActivity(intent)
        }

        binding.button7.setOnClickListener{
            val intent = Intent(
                this,
                Ej7Activity::class.java
            )
            startActivity(intent)
        }

        binding.button8.setOnClickListener{
            val intent = Intent(
                this,
                Ej8Activity::class.java
            )
            startActivity(intent)
        }

        binding.button16.setOnClickListener{
            val intent = Intent(
                this,
                Ej9Activity::class.java
            )
            startActivity(intent)
        }

        binding.button21.setOnClickListener{
            val intent = Intent(
                this,
                Ej10Activity::class.java
            )
            startActivity(intent)
        }


    }
}