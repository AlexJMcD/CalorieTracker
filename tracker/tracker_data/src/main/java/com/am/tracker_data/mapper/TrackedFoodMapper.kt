package com.am.tracker_data.mapper

import com.am.tracker_data.local.entity.TrackedFoodEntity
import com.am.tracker_domain.model.MealType
import com.am.tracker_domain.model.TrackedFood
import java.time.LocalDate

fun TrackedFoodEntity.toTrackedFood(): TrackedFood{
    return TrackedFood(
        name = name,
        carbs = carbs,
        calories = calories,
        protein = protein,
        fat = fats,
        imageUrl = imageUrl,
        mealType = MealType.fromString(type),
        amount = amount,
        date = LocalDate.of(year, month, dayOfMonth),
        id = id
    )
}

fun TrackedFood.toTrackedFoodEntity(): TrackedFoodEntity{
    return TrackedFoodEntity(
        name = name,
        carbs = carbs,
        protein = protein,
        fats = fat,
        imageUrl = imageUrl,
        type = mealType.name,
        amount = amount,
        dayOfMonth = date.dayOfMonth,
        month = date.monthValue,
        year = date.year,
        calories = calories,
        id = id
    )
}