package com.example.placesoftheworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.SimpleItemAnimator
import com.example.placesoftheworld.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.recyclerView.setHasFixedSize(true)
        var list = DataFile.createDataSet();
        var placeAdapter = PlaceAdaptor(list)
       binding.recyclerView.adapter=placeAdapter

//        binding.addAPlace.setOnClickListener {
//            val placeNameInput = binding.placeName.text.toString()
//            val imageUrlInput = binding.imageUrl.text.toString()
//            val bodyInput = binding.placeDescription.text.toString()
//            binding.placeName.text.clear()
//            binding.imageUrl.text.clear()
//            binding.placeDescription.text.clear()
//            list.add(PlaceData(placeNameInput, imageUrlInput, bodyInput))
//            placeAdapter.update(list)
//        }
    }
}