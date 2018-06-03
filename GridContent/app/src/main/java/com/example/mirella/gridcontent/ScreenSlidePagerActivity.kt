package com.example.mirella.gridcontent

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.example.mirella.gridcontent.page_fragments.GridSlidePageFragment
import com.example.mirella.gridcontent.page_fragments.ScreenSlidePageFragment

class ScreenSlidePagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

    companion object {
        private val NUM_PAGES = 5
    }

    override fun getItem(position: Int): Fragment {

        return when(position){
            0 -> ScreenSlidePageFragment()
            1 -> GridSlidePageFragment()
            else -> ScreenSlidePageFragment()
        }
    }

    override fun getCount(): Int {
        return NUM_PAGES
    }
}