package com.kmwork.testappdelivery.fragment.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
import com.kmwork.testappdelivery.R
import com.kmwork.testappdelivery.fragment.home.adapters.HomeViewPager
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tabTitles = arrayOf(
            resources.getString(R.string.stops),
            resources.getString(R.string.maps)
        )
        activity?.let {
            val homeViewPager= HomeViewPager(it)
            viewPager.adapter=homeViewPager
            TabLayoutMediator(
                tabLayout, viewPager,
                TabConfigurationStrategy { tab: TabLayout.Tab, position: Int ->
                    tab.text = tabTitles[position]
                }
            ).attach()
        }

    }

    companion object {
        @JvmStatic
        fun newInstance() = HomeFragment()
    }
}