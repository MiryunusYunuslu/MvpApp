package com.example.mvpapplication.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.domain.model.Article
import com.example.mvpapplication.databinding.ItemMainNewsBinding

import com.example.data.util.setImageWithGlide

class MainAdapter(private val newsList: ArrayList<Article>) :
    RecyclerView.Adapter<MainAdapter.ViewHolder>() {
    class ViewHolder(val binding: ItemMainNewsBinding) : RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemMainNewsBinding.inflate(LayoutInflater.from(parent.context))
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.tvMainNewsTitle.text = newsList[position].title
        holder.binding.ivMainNews.setImageWithGlide(newsList[position].urlToImage)
    }

    override fun getItemCount() = newsList.size
}