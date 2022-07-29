package com.danish.daeat.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Recipe(
    val name: String?,
    val photo: String?,
    var ingredients: String?,
    var instructions: String?,
    var description: String?,
) : Parcelable


