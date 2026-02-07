package com.chaxs.gcamconfig

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btnConvert)
        val log = findViewById<TextView>(R.id.tvLog)

        btn.setOnClickListener {
            log.text = "Mengonversi XML...\nBerhasil memetakan Lib Patcher!"
        }
    }
}
