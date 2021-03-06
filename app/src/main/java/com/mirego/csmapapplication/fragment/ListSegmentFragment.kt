package com.mirego.csmapapplication.fragment

import android.support.v4.app.Fragment
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mirego.csmapapplication.R

import RecyclerAdapter
import android.graphics.Color
import kotlinx.android.synthetic.main.fragment_list.*

private lateinit var viewAdapter: RecyclerView.Adapter<*>

class ListSegmentFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        viewAdapter = RecyclerAdapter()

        val recyclerView = view?.findViewById<RecyclerView>(R.layout.fragment_list.itemList)
        recyclerView?.layoutManager = LinearLayoutManager(this.activity)
        recyclerView?.adapter = viewAdapter
        recyclerView?.setBackgroundColor(Color.BLACK)

        return inflater.inflate(R.layout.fragment_list, container, false)
    }
}
