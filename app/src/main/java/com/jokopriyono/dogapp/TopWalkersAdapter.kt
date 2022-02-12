package com.jokopriyono.dogapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TopWalkersAdapter(
    private val listTopWalkers: List<String>
) : RecyclerView.Adapter<TopWalkersAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TopWalkersAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_top_walkers, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: TopWalkersAdapter.ViewHolder, position: Int) {
    }

    override fun getItemCount(): Int {
//        return listTopWalkers.size
        return 10
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}