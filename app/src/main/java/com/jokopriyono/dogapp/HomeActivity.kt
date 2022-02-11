package com.jokopriyono.dogapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.google.android.material.button.MaterialButton
import com.jokopriyono.dogapp.data.getDataDummy
import com.jokopriyono.dogapp.data.getParcelDummy

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val intent = Intent(this, ProfileActivity::class.java)
        // Kirim data satuan
        intent.putExtra("name", "Joko Priyono")
        intent.putExtra("city", "Tangerang Selatan")
        intent.putExtra("country", "Indonesia")
        // Kirim data Serializable
        val personSerializable = getDataDummy()
        intent.putExtra("serial", personSerializable)
        // Kirim data Bundle
        val bundle = Bundle().apply {
            putString("name", "Joko Priyono")
            putString("city", "Tangerang Selatan")
            putString("country", "Indonesia")
        }
        intent.putExtra("bundle", bundle)
        // Kirim data Parcelable
        val personParcel = getParcelDummy()
        intent.putExtra("parcel", personParcel)

        findViewById<MaterialButton>(R.id.btnBook).let {
            it.setOnClickListener {
                startActivity(intent)
            }
        }
    }
}