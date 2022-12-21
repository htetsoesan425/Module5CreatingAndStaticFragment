package com.padc.kotlin.ftc.creatingandstaticfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.padc.kotlin.ftc.creatingandstaticfragment.HomeFragment.Companion.KEY_HOME_DESCRIPTION
import com.padc.kotlin.ftc.creatingandstaticfragment.ShortsFragment.Companion.KEY_SHORTS_DESCRIPTION
import com.padc.kotlin.ftc.creatingandstaticfragment.SubscriptionFragment.Companion.KEY_SUBSCRIPTION_DESCRIPTION

class DifferentScreensViewPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> {

                val homeFragment = HomeFragment()

                //pass data
                val bundle = Bundle()
                bundle.putString(KEY_HOME_DESCRIPTION, "This is Home Fragment")
                homeFragment.arguments = bundle
                //end

                return homeFragment
            }
            1 -> {

                val shortsFragment = ShortsFragment()

                //pass data
                val bundle = Bundle()
                bundle.putString(KEY_SHORTS_DESCRIPTION, "This is Shorts Fragment")
                shortsFragment.arguments = bundle
                //end

                return shortsFragment
            }

            else -> {

                val subscriptionFragment = SubscriptionFragment()

                //pass data
                val bundle = Bundle()
                bundle.putString(KEY_SUBSCRIPTION_DESCRIPTION, "This is Subscription Fragment")
                subscriptionFragment.arguments = bundle
                //end

                return subscriptionFragment
            }
        }
    }
}