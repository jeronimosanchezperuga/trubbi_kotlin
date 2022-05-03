package com.example.apptrubbi.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.recyclerview.widget.RecyclerView
import com.example.apptrubbi.R


class EventListFragment : Fragment() , SearchView.OnQueryTextListener {

    //lateinit var buscador : SearchView
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val vista = inflater.inflate(R.layout.fragment_event_list, container, false)

        //buscador = vista.findViewById(R.id.txt_buscar)

        // Inflate the layout for this fragment
        val eventList = Datasource(this).getEventList()
        recyclerView = vista.findViewById(R.id.recycler_view)
        recyclerView.adapter = EventAdapter(eventList)
        return vista
    }

    override fun onStart() {
        super.onStart()
        //buscador.setOnQueryTextListener(this)
    }

    //SearchView
    override fun onQueryTextSubmit(p0: String?): Boolean {
        TODO("Not yet implemented")
    }

    //SearchView
    override fun onQueryTextChange(p0: String?): Boolean {
        TODO("Not yet implemented")
    }


}