package com.example.mirella.gridcontent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.PagerAdapter
import android.support.v4.view.ViewPager

class Main2Activity : AppCompatActivity() {

    private var mPager: ViewPager? = null
    private var mPagerAdapter: PagerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test)

        mPager = findViewById(R.id.pager)
        mPagerAdapter = ScreenSlidePagerAdapter(supportFragmentManager)
        mPager!!.adapter = mPagerAdapter
    }

    override fun onBackPressed() {
        if (mPager!!.currentItem == 0) {
            super.onBackPressed()
        } else {
            mPager!!.currentItem = mPager!!.currentItem - 1
        }
    }
}
