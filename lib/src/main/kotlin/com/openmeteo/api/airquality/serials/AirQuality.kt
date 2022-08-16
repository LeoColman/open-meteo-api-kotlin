package com.openmeteo.api.airquality.serials

import com.openmeteo.api.common.serials.TimeZoneSerializer
import kotlinx.serialization.Serializable
import java.util.*

@Serializable
class AirQuality(
    val latitude: Float,
    val longitude: Float,
    val generationtime_ms: Double,
    val utc_offset_seconds: Int,
    @Serializable(with = TimeZoneSerializer::class)
    val timezone: TimeZone,
    val timezone_abbreviation: String,
    val hourly_units: HourlyUnits? = null,
    val hourly: Hourly? = null,
)