package com.openmeteo.api.forecast.serials

import com.openmeteo.api.common.serials.Time
import com.openmeteo.api.common.serials.WeatherCode
import kotlinx.serialization.Serializable

@Serializable
class Hourly(
    val time: Array<Time>,
    val temperature_2m: Array<Float?>? = null,
    val relativehumidity_2m: Array<Float?>? = null,
    val dewpoint_2m: Array<Float?>? = null,
    val apparent_temperature: Array<Float?>? = null,
    val pressure_msl: Array<Float?>? = null,
    val surface_pressure: Array<Float?>? = null,
    val cloudcover: Array<Float?>? = null,
    val cloudcover_low: Array<Float?>? = null,
    val cloudcover_mid: Array<Float?>? = null,
    val cloudcover_high: Array<Float?>? = null,
    val windspeed_10m: Array<Float?>? = null,
    val windspeed_80m: Array<Float?>? = null,
    val windspeed_120m: Array<Float?>? = null,
    val windspeed_180m: Array<Float?>? = null,
    val winddirection_10m: Array<Float?>? = null,
    val winddirection_80m: Array<Float?>? = null,
    val winddirection_120m: Array<Float?>? = null,
    val winddirection_180m: Array<Float?>? = null,
    val windgusts_10m: Array<Float?>? = null,
    val shortwave_radiation: Array<Float?>? = null,
    val direct_radiation: Array<Float?>? = null,
    val direct_normal_irradiance: Array<Float?>? = null,
    val diffuse_radiation: Array<Float?>? = null,
    val vapor_pressure_deficit: Array<Float?>? = null,
    val evapotranspiration: Array<Float?>? = null,
    val et0_fao_evapotranspiration: Array<Float?>? = null,
    val precipitation: Array<Float?>? = null,
    val snowfall: Array<Float?>? = null,
    val rain: Array<Float?>? = null,
    val showers: Array<Float?>? = null,
    val weathercode: Array<WeatherCode>? = null,
    val snow_depth: Array<Float?>? = null,
    val freezinglevel_height: Array<Float?>? = null,
    val soil_temperature_0cm: Array<Float?>? = null,
    val soil_temperature_6cm: Array<Float?>? = null,
    val soil_temperature_18cm: Array<Float?>? = null,
    val soil_temperature_54cm: Array<Float?>? = null,
    val soil_moisture_0_1cm: Array<Float?>? = null,
    val soil_moisture_1_3cm: Array<Float?>? = null,
    val soil_moisture_3_9cm: Array<Float?>? = null,
    val soil_moisture_9_27cm: Array<Float?>? = null,
    val soil_moisture_27_81cm: Array<Float?>? = null,
)
