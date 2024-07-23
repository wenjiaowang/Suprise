package com.example.suprise

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val message = intent.getStringExtra("message")

        // 显示消息
        val textView: TextView = findViewById(R.id.textView)
        textView.text = message ?: "No message received"


        val buttonBackToMain: Button = findViewById(R.id.mainButton)
        buttonBackToMain.setOnClickListener {
            onBackPressed()
        }
    }

}