package com.example.placesoftheworld

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.placesoftheworld.databinding.PlaceItemModelBinding

class PlaceAdaptor(var placeList: List<PlaceData>): RecyclerView.Adapter<PlaceAdaptor.PlaceViewHolder>() {
    fun update(newList: List<PlaceData>) {
        placeList = newList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceViewHolder {
        return PlaceViewHolder(PlaceItemModelBinding.inflate(LayoutInflater.from(parent.context)))
    }

    public override fun onBindViewHolder(holder: PlaceViewHolder, position: Int) {

        holder.binding(placeList[position])
        val isExpandable: Boolean = placeList[position].visibility
        holder.binding.expandedLayout.visibility = if(isExpandable)View.VISIBLE else View.GONE
        holder.binding.overallLayout.setOnClickListener {
            val place = placeList[position]
            place.visibility = !place.visibility
            notifyItemChanged(position)
        }

    }

    override fun getItemCount(): Int = placeList.size
    class PlaceViewHolder(val binding: PlaceItemModelBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun binding(place: PlaceData) {
            binding.displayName.text = place.placeName
            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
            Glide.with(binding.placeImage.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(place.imageUrl)
                .into(binding.placeImage)
            binding.InformationText.text = place.info
        }
    }
}
