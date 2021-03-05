package com.example.coins

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        image_jogar.setOnClickListener {
            val intent = Intent(applicationContext, ResultadoActivity::class.java)
            val numero = Random.nextInt(2)
//            Log.i("",numero.toString())
            intent.putExtra("numero", numero)
            startActivity(intent)
        }
    }
}