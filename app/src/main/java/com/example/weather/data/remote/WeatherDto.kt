package com.example.weather.data.remote

import com.example.weather.domain.weather.WeatherType
import com.squareup.moshi.Json

data class WeatherDto(
    @field:Json(name="hourly")
    val weatherData:WeatherDataDto
)
