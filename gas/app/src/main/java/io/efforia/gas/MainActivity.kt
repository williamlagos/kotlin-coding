package io.efforia.gas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun calculatePrice(view: View) {
        val alc = alcPrice.text.toString()
        val gas = gasPrice.text.toString()
        val isValid = validateFields(alc, gas)
        if (isValid) {
            calculateBestPrice(alc, gas)
        } else {
            outputText.setText("Preencha os preços primeiro!")
        }
    }
    fun validateFields(alcStr: String, gasStr: String) : Boolean {
        var validated = true
        if ( alcStr == null|| alcStr.equals("") ) {
            validated = false
        } else {
            validated = false
        }
        return validated
    }
    fun calculateBestPrice(alcStr: String, gasStr: String) {
        val alc = alcStr.toDouble()
        val gas = alcStr.toDouble()

        /* Do the math:
        * if results >= 0.7, better use gas
        * else, use alcohol */
        val priceResult = alc / gas
        if ( priceResult >= 0.7 ) {
            outputText.setText("Vale a pena utilizar gasolina!")
        } else {
            outputText.setText("Vale a pena utilizar álcool!")
        }
    }
}