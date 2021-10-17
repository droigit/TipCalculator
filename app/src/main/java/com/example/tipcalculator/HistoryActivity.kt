package com.example.tipcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

private const val TAG = "HistoryActivity"

class HistoryActivity : AppCompatActivity() {
    private lateinit var tvListTotal: TextView
    private lateinit var bExit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        tvListTotal = findViewById(R.id.tvListTotal)
        bExit = findViewById(R.id.bCalcualtor)

        val previous = intent.getStringArrayListExtra("prev")
        if (previous != null) {
            for (item in previous) {
                tvListTotal.text = tvListTotal.text.toString() + "\n" + item
            }
        }

        bExit.setOnClickListener({
            this.finish()
        })
    }
}