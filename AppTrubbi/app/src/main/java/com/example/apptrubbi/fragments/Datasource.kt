package com.example.apptrubbi.fragments

import android.content.Context
import com.example.apptrubbi.R

class Datasource(val context: EventListFragment) {
    fun getEventList(): Array<String> {

        // Return values/string.ml : name 'event_array'
        return context.resources.getStringArray(R.array.event_array)
    }
}