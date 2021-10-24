package com.example.tipcalculator
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter (val list: ArrayList<String>): RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    private val image = R.drawable.ic_money
    private var previous = list;

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.prev_total, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.imageView.setImageResource(image)
        holder.textView.text = previous.get(position)
    }

    override fun getItemCount(): Int {
        return previous.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView: ImageView
        val textView: TextView

        init{
            imageView = itemView.findViewById(R.id.ivMoney)
            textView = itemView.findViewById(R.id.tvPrevTotal)
        }
    }

}