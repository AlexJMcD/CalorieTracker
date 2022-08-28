package com.am.tracker_domain.use_case

data class TrackerUseCases (
    val trackFood: TrackFood,
    val searchFood: SearchFood,
    val deleteTrackedFoods: DeleteTrackedFoods,
    val getFoodsForDate: GetFoodsForDate,
    val calculateMealNutrients: CalculateMealNutrients
    )