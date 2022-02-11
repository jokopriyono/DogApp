package com.jokopriyono.dogapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.jokopriyono.dogapp.data.Person
import com.jokopriyono.dogapp.data.PersonParcel

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Baca intent satuan
        val myName = intent.getStringExtra("name")
        val myCity = intent.getStringExtra("city")
        val myCountry = intent.getStringExtra("country")
        // Baca intent melalui Serializable
        val serializable = intent.getSerializableExtra("serial") as Person
        val serialName = serializable.name
        val serialCity = serializable.city
        val serialCountry = serializable.country
        // Baca intent melalui Bundle
        val bundle = intent.getBundleExtra("bundle")!!
        val bundleName = bundle.getString("name")
        val bundleCity = bundle.getString("city")
        val bundleCountry = bundle.getString("country")
        // Baca intent melalui Parcelable
        val parcel = intent.getParcelableExtra<PersonParcel>("parcel")!!
        val parcelName = parcel.name
        val parcelCity = parcel.city
        val parcelCountry = parcel.country


        findViewById<TextView>(R.id.txtName).text = myName
        findViewById<TextView>(R.id.txtLocation).let {
            val location = "$myCity, $myCountry"
            it.text = location
        }
    }
}