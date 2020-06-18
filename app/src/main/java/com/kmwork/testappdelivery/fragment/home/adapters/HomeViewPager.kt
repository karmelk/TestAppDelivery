package com.kmwork.testappdelivery.fragment.home.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.kmwork.testappdelivery.fragment.marksmap.MarkersMapFragment
import com.kmwork.testappdelivery.fragment.stops.StopsFragment

class HomeViewPager(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 ->
                return StopsFragment()
            1 ->
                return MarkersMapFragment()
        }
        return StopsFragment()
    }

}