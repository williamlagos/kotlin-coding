package io.efforia.phrases

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var text: TextView
    val phrases = arrayOf(
        "O importante não é vencer todos os dias, mas lutar sempre.",
        "Maior que a tristeza de não haver vencido é a vergonha de nunca ter tentado.",
        "É melhor conquistar a si mesmo do que vencer mil batalhas.",
        "Enquanto houver vontade de lutar haverá esperança de vencer."
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text = findViewById(R.id.textView) as TextView
    }
    fun generatePhrase(view: View) {
        val totalItemsArraySize = phrases.size
        val randomNumber = Random().nextInt(totalItemsArraySize)
        text.setText(phrases[randomNumber])
    }
}