package com.learnkotlin.fillrtest.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.learnkotlin.fillrtest.R
import com.learnkotlin.fillrtest.model.User

class MyAdapter(private val context: Activity, private val arrayList: ArrayList<User>) : ArrayAdapter<User>
    (context, R.layout.list_item, arrayList){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflator : LayoutInflater   = LayoutInflater.from(context)
        val view : View = inflator.inflate(R.layout.list_item,null)

        val imageView : ImageView = view.findViewById(R.id.image_view)
        val userName : TextView = view.findViewById(R.id.text_view)

        imageView.setImageResource(arrayList[position].imageId)
        userName.text = arrayList[position].name

      //  return super.getView(position, convertView, parent)
        return view
    }
}