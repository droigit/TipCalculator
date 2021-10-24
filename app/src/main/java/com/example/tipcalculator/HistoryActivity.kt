package com.example.tipcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

private const val TAG = "HistoryActivity"

class HistoryActivity : AppCompatActivity() {
    private lateinit var bExit: Button
    private lateinit var rvPrev: RecyclerView
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        bExit = findViewById(R.id.bCalcualtor)
        rvPrev = findViewById(R.id.rvPrev)

        layoutManager = LinearLayoutManager(this)

        rvPrev.layoutManager = layoutManager

        //simply to play with RecyclerView - data is wiped after closing app
        val previous = intent.getStringArrayListExtra("prev")
        adapter = previous?.let { RecyclerAdapter(it) }
        rvPrev.adapter = adapter

        bExit.setOnClickListener({
            this.finish()
        })
    }
}