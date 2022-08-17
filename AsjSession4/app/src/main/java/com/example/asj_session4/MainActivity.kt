package com.example.asj_session4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.asj_session4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var dummyList: ArrayList<Item>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initData()
        setUpRecyclerView()


    }

    private fun setUpRecyclerView() {
        binding.recyclerView.adapter = ItemAdapter(this,dummyList)
        val layoutManager = LinearLayoutManager (this)
        binding.recyclerView.layoutManager = layoutManager
        binding.recyclerView.setHasFixedSize(true)
    }

    private fun initData() {
        dummyList = ArrayList()
        dummyList.add(Item("Cat",R.drawable.cat1))
        dummyList.add(Item("Lol",R.drawable.cat1))
        dummyList.add(Item("Alok",R.drawable.ic_launcher_foreground))
        dummyList.add(Item("Cat",R.drawable.cat1))
        dummyList.add(Item("Yo",R.drawable.ic_launcher_background))

    }
}