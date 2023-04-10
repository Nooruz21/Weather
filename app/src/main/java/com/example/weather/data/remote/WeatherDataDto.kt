package com.example.weather.data.remote

import com.squareup.moshi.Json

data class  WeatherDataDto(
    val time: List<String>,
    @field:Json(name = "temperature_2m")
    val temperature: List<Double>,
    @field:Json(name = "weathercode")
    val weatherCodes: List<Int>,
    @field:Json(name = "pressure_msl")
    val pressure: List<Double>,
    @field:Json(name = "windspeed_10m")
    val windSpeed: List<Double>,
    @field:Json(name = "relativehumidity_2m")
    val humidities: List<Double>,

)
