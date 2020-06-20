package com.kmwork.testappdelivery.fragment.marksmap

import androidx.fragment.app.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.kmwork.entities.localmodel.MarkerMapModel
import com.kmwork.testappdelivery.R
import com.kmwork.testappdelivery.fragment.marksmap.viewmodel.MarkerMapViewModel
import com.kmwork.testappdelivery.getMarkerIconWithLabel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MarkersMapFragment : Fragment() {
    private var mapFragment: SupportMapFragment? = null
    private val markerMapViewModel: MarkerMapViewModel by viewModel()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_markers_map, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        initViewModel()

    }

    private fun initViewModel() {
        markerMapViewModel.getMarkerMapDataLD.observe(
            viewLifecycleOwner,
            Observer(::updateMarkerOnMap)
        )
        markerMapViewModel.getErrorMapDataLD.observe(viewLifecycleOwner, Observer {
            Toast.makeText(context, it, Toast.LENGTH_SHORT).show()
        })

    }

    private fun updateMarkerOnMap(markerList: MutableList<MarkerMapModel>) {
        mapFragment?.getMapAsync { googleMap ->
            context?.apply {
                for (item in markerList) {
                    val lat = item.addressLat
                    val lon = item.addressLon
                    val sydney = LatLng(lat, lon)
                    googleMap.addMarker(
                        MarkerOptions()
                            .position(sydney)
                            .title(item.addressName)
                            .icon(
                                BitmapDescriptorFactory.fromBitmap(
                                    getMarkerIconWithLabel(
                                        this,
                                        item
                                    )
                                )
                            )
                    )
                    googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney,13f))
                }
            }
        }
    }
}