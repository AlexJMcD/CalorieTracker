package com.am.tracker_data.mapper

import com.am.tracker_data.remote.dto.Product
import com.am.tracker_domain.model.TrackableFood
import kotlin.math.roundToInt

fun Product.toTrackableFood(): TrackableFood? {

    val carbsPer100g = nutrients.carbohydrates100g.roundToInt()
    val proteinPer100g = nutrients.proteins100g.roundToInt()
    val fatPer100g = nutrients.fats100g.roundToInt()
    val caloriesPer100g = nutrients.energyKcal100g.roundToInt()
    return TrackableFood(
        name = productName ?: return null,
        carbsPer100g = carbsPer100g,
        caloriesPer100g = caloriesPer100g,
        proteinPer100g = proteinPer100g,
        fatPer100g = fatPer100g,
        imageUrl = imageFrontThumbUrl
    )
}