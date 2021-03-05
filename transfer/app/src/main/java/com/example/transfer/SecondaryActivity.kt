package com.example.transfer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_secondary.*

class SecondaryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)
        val dados: Bundle? = intent.extras
        val nome_text = dados?.getString("nome")
        val idade_text = dados?.getInt("idade")
        nome.text = nome_text
        idade.text = idade_text.toString()
    }
}