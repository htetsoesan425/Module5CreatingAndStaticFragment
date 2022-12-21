package com.padc.kotlin.ftc.creatingandstaticfragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_with_tabs.*

class ActivityWithTabs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_with_tabs)

        //setup view pager
        val differentScreensViewPagerAdapter = DifferentScreensViewPagerAdapter(this)
        viewPagerDifferentScreens.adapter = differentScreensViewPagerAdapter

        //setup tab layout
        TabLayoutMediator(tabLayoutDifferentScreens, viewPagerDifferentScreens) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "Home"
                }
                1 -> {
                    tab.text = "Shorts"
                }
                else -> {
                    tab.text = "Subscription"
                }
            }
        }.attach()
    }
}