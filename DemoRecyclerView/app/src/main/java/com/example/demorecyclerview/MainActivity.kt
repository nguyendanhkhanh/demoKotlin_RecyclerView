package com.example.demorecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<News>
    lateinit var list1 : Array<String>
    lateinit var list2 : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list1 = arrayOf("Khanh", "Vuong", "Tiep", "Lan", "Khanh", "Vuong", "Tiep", "Lan", "Khanh", "Vuong", "Tiep", "Lan", "Khanh", "Vuong", "Tiep", "Lan")
        list2 = arrayOf("0964913998", "0967364021", "190008178", "2199903", "0964913998", "0967364021", "190008178", "2199903", "0964913998", "0967364021", "190008178", "2199903", "0964913998", "0967364021", "190008178", "2199903")

        newRecyclerView = findViewById(R.id.rvPhoto)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<News>()
        getUserdata()
    }

    private fun getUserdata(){
        for(i in list1.indices){
            val news = News(list1[i], list2[i])
            newArrayList.add(news)

        }
        newRecyclerView.adapter = MyAdapter(newArrayList)
    }
}