package com.jokopriyono.dogapp.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.io.Serializable

data class Person(
    val name: String,
    val city: String,
    val country: String
): Serializable

fun getDataDummy() = Person(
    "Joko Priyono",
    "Tangerang Selatan",
    "Indonesia"
)

@Parcelize
data class PersonParcel(
    val name: String,
    val city: String,
    val country: String
): Parcelable

fun getParcelDummy() = PersonParcel(
    "Joko Priyono",
    "Tangerang Selatan",
    "Indonesia"
)