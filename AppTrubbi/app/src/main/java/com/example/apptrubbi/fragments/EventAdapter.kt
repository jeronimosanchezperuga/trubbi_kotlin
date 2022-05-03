package com.example.apptrubbi.fragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.apptrubbi.R

class EventAdapter (val eventList: Array<String>) :
    RecyclerView.Adapter<EventAdapter.EventViewHolder>() {

    // vista de un item, lugar en recyclerView
    class EventViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val eventTextView: TextView = itemView.findViewById(R.id.event_text)

        fun bind(word: String) {
            eventTextView.text = word
        }
    }

    // Returns a new ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.event_item, parent, false)

        return EventViewHolder(view)
    }

    // Returns size of data list
    override fun getItemCount(): Int {
        return eventList.size
    }

    // Displays data at a certain position
    override fun onBindViewHolder(holder: EventViewHolder, position: Int) {
        holder.bind(eventList[position])
    }
}