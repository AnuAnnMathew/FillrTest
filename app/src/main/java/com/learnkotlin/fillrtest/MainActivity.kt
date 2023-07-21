package com.learnkotlin.fillrtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.learnkotlin.fillrtest.adapter.MyAdapter
import com.learnkotlin.fillrtest.databinding.ActivityMainBinding
import com.learnkotlin.fillrtest.model.User
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val BASE_URL = "https://www.flickr.com"
class MainActivity : AppCompatActivity() {

   private lateinit var binding :ActivityMainBinding
   private  lateinit var userArrayList : ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getMyData()

        var imageId = intArrayOf(

            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground
        )
        val name = arrayOf("Anu","Ann","Mathew","Brielle")

        userArrayList = ArrayList()
        for(i in name.indices)
        {
            val user = User(name[i], imageId[i])
            userArrayList.add(user)
        }

        binding.listview.isClickable = true
        binding.listview.adapter = MyAdapter(this,userArrayList)
        binding.listview.setOnItemClickListener{parent, view, position, id ->

            val name = name[position]
            val ImageId = imageId[position]

            val i = Intent(this, UserActivity::class.java)
            i.putExtra("name",name)
            i.putExtra("ImageId",ImageId)
            startActivity(i)

        }
    }

    private fun getMyData() {
        val retrofitBuilder = Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
            .BASE_URL();
    }
}