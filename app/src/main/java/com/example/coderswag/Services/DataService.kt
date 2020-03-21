package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category( "HOODIES", "hoodieimage"),
        Category( "HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie", "$18", "hat1"),
        Product("Devslopes Hat Black", "$15", "hat2"),
        Product("Devslopes Hat White", "$10", "hat3"),
        Product("Devslopes Hat Snapback", "$24", "hat4")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Grey", "$28", "hoodie1"),
        Product("Devslopes Hoodie Red", "$32", "hoodie2"),
        Product("Devslopes Hoodie Black", "$28", "hoodie3"),
        Product("Devslopes Hoodie Blue", "$32", "hoodie4")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black", "$18", "shirt1"),
        Product("Devslopes Badge Light Grey", "$20", "shirt2"),
        Product("Devslopes Logo Shirt Red", "$22", "shirt3"),
        Product("Devslopes Hustle", "$22", "shirt4"),
        Product("Kickflip Studios", "$18", "shirt5")
    )
}