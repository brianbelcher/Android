package com.example.mapsproto;

import android.graphics.Point;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnMapClickListener;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, OnMapClickListener {

    private GoogleMap mMap;
    private Point originPosition;
    private Point destinationPosition;
    private Marker destinationMarker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        //mMap.addOnMapClick

        // Add a marker at the Caperton Center and move the camera
        LatLng WVUP = new LatLng(39.216045, -81.507987);
        mMap.addMarker(new MarkerOptions().position(WVUP).title("Marker at Caperton Center WVUP"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(WVUP));
        //CameraUpdate zoomIn(WVUP, 15.5f);
    }

    @Override
    public void onMapClick(LatLng point) {
        destinationMarker = mMap.addMarker(new MarkerOptions().position(point));




    }







}
