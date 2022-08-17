package com.example.asj_session4

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.asj_session4.databinding.ItemLayoutBinding

class ItemAdapter(private val context: Context, private val itemList: List<Item>): RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    private lateinit var binding:ItemLayoutBinding



    class ViewHolder(private val binding: ItemLayoutBinding): RecyclerView.ViewHolder(binding.root){
        val title = binding.title
        val image = binding.cat1
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val currentItem = itemList[position]

        holder.title.text = currentItem.title
        holder.image.setImageResource(currentItem.image)
        holder.itemView.setOnClickListener{
            Toast.makeText(context, "${holder.title.text} Clicked",Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}