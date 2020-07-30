package io.efforia.draw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun drawNumber(view: View) {
        var text = findViewById(R.id.drawText) as TextView
        var drewNumber = Random().nextInt(11)
        text.setText("Número sorteado é: $drewNumber")
    }
}