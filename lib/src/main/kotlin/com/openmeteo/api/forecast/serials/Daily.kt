package com.openmeteo.api.forecast.serials

import com.openmeteo.api.common.serials.Time
import com.openmeteo.api.common.serials.WeatherCode
import kotlinx.serialization.Serializable

@Serializable
class Daily(
    val time: Array<Time>,
    val temperature_2m_max: Array<Float?>? = null,
    val temperature_2m_min: Array<Float?>? = null,
    val apparent_temperature_max: Array<Float?>? = null,
    val apparent_temperature_min: Array<Float?>? = null,
    val precipitation_sum: Array<Float?>? = null,
    val rain_sum: Array<Float?>? = null,
    val showers_sum: Array<Float?>? = null,
    val snowfall_sum: Array<Float?>? = null,
    val precipitation_hours: Array<Float?>? = null,
    val weathercode: Array<WeatherCode?>? = null,
    val sunrise: Array<Float?>? = null,
    val sunset: Array<Float?>? = null,
    val windspeed_10m_max: Array<Float?>? = null,
    val windgusts_10m_max: Array<Float?>? = null,
    val winddirection_10m_dominant: Array<Float?>? = null,
    val shortwave_radiation_sum: Array<Float?>? = null,
    val et0_fao_evapotranspiration: Array<Float?>? = null,
)