package com.kmwork.testappdelivery.fragment.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayout
import com.kmwork.testappdelivery.R
import com.kmwork.testappdelivery.changeFragment
import com.kmwork.testappdelivery.fragment.marksmap.MarkersMapFragment
import com.kmwork.testappdelivery.fragment.stops.StopsFragment
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
        setupView()
    }

    private fun setupView() {
        activity?.let {
            val fragment = StopsFragment()
            changeFragment(it, fragment)
            tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
                override fun onTabReselected(tab: TabLayout.Tab?) {

                }

                override fun onTabUnselected(tab: TabLayout.Tab?) {

                }

                override fun onTabSelected(tab: TabLayout.Tab?) {
                    tab?.apply {
                        when (position) {
                            0 -> {
                                val stopsFragment = StopsFragment()
                                changeFragment(
                                    it,
                                    stopsFragment
                                )
                            }
                            1 -> {
                                val markersMapFragment = MarkersMapFragment()
                                changeFragment(
                                    it,
                                    markersMapFragment
                                )
                            }
                        }
                    }
                }
            })
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = HomeFragment()
    }
}