package com.example.coins

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado.*

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        val dados: Bundle? = intent.extras
        val numero = dados?.getInt("numero")

        if(numero == 0) {
            image_resultado.setImageResource(R.drawable.moeda_cara)
        } else {
            image_resultado.setImageResource(R.drawable.moeda_coroa)
        }

        back.setOnClickListener {
            finish()
        }
    }
}