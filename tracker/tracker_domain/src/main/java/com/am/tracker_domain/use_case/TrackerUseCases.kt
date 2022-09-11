package com.am.tracker_domain.use_case

data class TrackerUseCases(
    val trackFood: TrackFood,
    val searchFood: SearchFood,
    val getFoodsForDate: GetFoodsForDate,
    val deleteTrackedFoods: DeleteTrackedFoods,
    val calculateMealNutrients: CalculateMealNutrients
)