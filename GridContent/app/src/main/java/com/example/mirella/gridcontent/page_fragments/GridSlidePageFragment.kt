package com.example.mirella.gridcontent.page_fragments

import android.content.res.Resources
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mirella.gridcontent.R
import com.example.mirella.gridcontent.RecyclerViewAdapter
import com.example.mirella.gridcontent.Report
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main2.view.*

class GridSlidePageFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(
                R.layout.activity_main2, container, false) as ViewGroup

        val image = context!!.resources.getDrawable(R.drawable.ic_launcher_foreground)

        val report1 = Report(image)
        val report2 = Report(image)
        val report3 = Report(image)
        val report4 = Report(image)

        val list = listOf(report1, report2, report3, report4)
//
        val adapter = RecyclerViewAdapter(list)
        rootView.recycler_view_id.layoutManager = GridLayoutManager(context, 2)
        rootView.recycler_view_id.adapter = adapter

        return rootView
    }

}