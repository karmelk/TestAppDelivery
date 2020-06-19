package com.kmwork.testappdelivery.fragment.stops

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.kmwork.testappdelivery.R
import com.kmwork.testappdelivery.fragment.stops.adapter.StopsAdapter
import com.kmwork.testappdelivery.fragment.stops.viewmodel.StopsViewModel
import kotlinx.android.synthetic.main.fragment_stops.*
import org.koin.androidx.viewmodel.ext.android.viewModel


class StopsFragment : Fragment() {
    private lateinit var stopsAdapter: StopsAdapter
    private val stopsViewModel: StopsViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_stops, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initFragmentView()
        initViewModel()
    }

    private fun initFragmentView() {
        stopsAdapter = StopsAdapter(
            finish = {

            },
            navigate = {

            })
        stopsRv.adapter = stopsAdapter
    }

    private fun initViewModel() {
        stopsViewModel.getStopsDataLD.observe(viewLifecycleOwner, Observer {
            stopsAdapter.updateList(it)
        })
    }

}