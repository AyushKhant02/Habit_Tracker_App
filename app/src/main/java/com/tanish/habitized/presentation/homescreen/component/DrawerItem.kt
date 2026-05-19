package com.tanish.habitized.presentation.homescreen.component

import androidx.annotation.DrawableRes
import com.tanish.habitized.R

data class DrawerItem(
    @DrawableRes val icon : Int ,
    val text : String,
    val onclick : () ->Unit = {}
)