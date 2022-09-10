package com.openmeteo.apix.ecmwf

import com.openmeteo.apix.common.query.QueryHourly
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class HourlyOptions : QueryHourly.Options {
    @SerialName("pressure_msl")
    PressureMsl,
    @SerialName("surface_air_pressure")
    SurfaceAirPressure,
    @SerialName("skin_temperature")
    SkinTemperature,
    @SerialName("soil_temperature_0_to_7cm")
    SoilTemperature0To7cm,
    @SerialName("total_column_integrated_water_vapour")
    TotalColumnIntegratedWaterVapour,
    @SerialName("temperature_2m")
    Temperature2m,
    @SerialName("temperature_1000hPa")
    Temperature1000hPa,
    @SerialName("temperature_925hPa")
    Temperature925hPa,
    @SerialName("temperature_850hPa")
    Temperature850hPa,
    @SerialName("temperature_700hPa")
    Temperature700hPa,
    @SerialName("temperature_500hPa")
    Temperature500hPa,
    @SerialName("temperature_300hPa")
    Temperature300hPa,
    @SerialName("temperature_250hPa")
    Temperature250hPa,
    @SerialName("temperature_200hPa")
    Temperature200hPa,
    @SerialName("temperature_50hPa")
    Temperature50hPa,
    @SerialName("geopotential_height_1000hPa")
    GeopotentialHeight1000hPa,
    @SerialName("geopotential_height_925hPa")
    GeopotentialHeight925hPa,
    @SerialName("geopotential_height_850hPa")
    GeopotentialHeight850hPa,
    @SerialName("geopotential_height_700hPa")
    GeopotentialHeight700hPa,
    @SerialName("geopotential_height_500hPa")
    GeopotentialHeight500hPa,
    @SerialName("geopotential_height_300hPa")
    GeopotentialHeight300hPa,
    @SerialName("geopotential_height_250hPa")
    GeopotentialHeight250hPa,
    @SerialName("geopotential_height_200hPa")
    GeopotentialHeight200hPa,
    @SerialName("geopotential_height_50hPa")
    GeopotentialHeight50hPa,
    @SerialName("windspeed_10m")
    Windspeed10m,
    @SerialName("windspeed_1000hPa")
    Windspeed1000hPa,
    @SerialName("windspeed_925hPa")
    Windspeed925hPa,
    @SerialName("windspeed_850hPa")
    Windspeed850hPa,
    @SerialName("windspeed_700hPa")
    Windspeed700hPa,
    @SerialName("windspeed_500hPa")
    Windspeed500hPa,
    @SerialName("windspeed_300hPa")
    Windspeed300hPa,
    @SerialName("windspeed_250hPa")
    Windspeed250hPa,
    @SerialName("windspeed_200hPa")
    Windspeed200hPa,
    @SerialName("windspeed_50hPa")
    Windspeed50hPa,
    @SerialName("winddirection_10m")
    Winddirection10m,
    @SerialName("winddirection_1000hPa")
    Winddirection1000hPa,
    @SerialName("winddirection_925hPa")
    Winddirection925hPa,
    @SerialName("winddirection_850hPa")
    Winddirection850hPa,
    @SerialName("winddirection_700hPa")
    Winddirection700hPa,
    @SerialName("winddirection_500hPa")
    Winddirection500hPa,
    @SerialName("winddirection_300hPa")
    Winddirection300hPa,
    @SerialName("winddirection_250hPa")
    Winddirection250hPa,
    @SerialName("winddirection_200hPa")
    Winddirection200hPa,
    @SerialName("winddirection_50hPa")
    Winddirection50hPa,
    @SerialName("relative_humidity_1000hPa")
    RelativeHumidity1000hPa,
    @SerialName("relative_humidity_925hPa")
    RelativeHumidity925hPa,
    @SerialName("relative_humidity_850hPa")
    RelativeHumidity850hPa,
    @SerialName("relative_humidity_700hPa")
    RelativeHumidity700hPa,
    @SerialName("relative_humidity_500hPa")
    RelativeHumidity500hPa,
    @SerialName("relative_humidity_300hPa")
    RelativeHumidity300hPa,
    @SerialName("relative_humidity_250hPa")
    RelativeHumidity250hPa,
    @SerialName("relative_humidity_200hPa")
    RelativeHumidity200hPa,
    @SerialName("relative_humidity_50hPa")
    RelativeHumidity50hPa,
    @SerialName("specific_humidity_1000hPa")
    SpecificHumidity1000hPa,
    @SerialName("specific_humidity_925hPa")
    SpecificHumidity925hPa,
    @SerialName("specific_humidity_850hPa")
    SpecificHumidity850hPa,
    @SerialName("specific_humidity_700hPa")
    SpecificHumidity700hPa,
    @SerialName("specific_humidity_500hPa")
    SpecificHumidity500hPa,
    @SerialName("specific_humidity_300hPa")
    SpecificHumidity300hPa,
    @SerialName("specific_humidity_250hPa")
    SpecificHumidity250hPa,
    @SerialName("specific_humidity_200hPa")
    SpecificHumidity200hPa,
    @SerialName("specific_humidity_50hPa")
    SpecificHumidity50hPa,
    @SerialName("atmosphere_relative_vorticity_1000hPa")
    AtmosphereRelativeVorticity1000hPa,
    @SerialName("atmosphere_relative_vorticity_925hPa")
    AtmosphereRelativeVorticity925hPa,
    @SerialName("atmosphere_relative_vorticity_850hPa")
    AtmosphereRelativeVorticity850hPa,
    @SerialName("atmosphere_relative_vorticity_700hPa")
    AtmosphereRelativeVorticity700hPa,
    @SerialName("atmosphere_relative_vorticity_500hPa")
    AtmosphereRelativeVorticity500hPa,
    @SerialName("atmosphere_relative_vorticity_300hPa")
    AtmosphereRelativeVorticity300hPa,
    @SerialName("atmosphere_relative_vorticity_250hPa")
    AtmosphereRelativeVorticity250hPa,
    @SerialName("atmosphere_relative_vorticity_200hPa")
    AtmosphereRelativeVorticity200hPa,
    @SerialName("atmosphere_relative_vorticity_50hPa")
    AtmosphereRelativeVorticity50hPa,
    @SerialName("divergence_of_wind_1000hPa")
    DivergenceOfWind1000hPa,
    @SerialName("divergence_of_wind_925hPa")
    DivergenceOfWind925hPa,
    @SerialName("divergence_of_wind_850hPa")
    DivergenceOfWind850hPa,
    @SerialName("divergence_of_wind_700hPa")
    DivergenceOfWind700hPa,
    @SerialName("divergence_of_wind_500hPa")
    DivergenceOfWind500hPa,
    @SerialName("divergence_of_wind_300hPa")
    DivergenceOfWind300hPa,
    @SerialName("divergence_of_wind_250hPa")
    DivergenceOfWind250hPa,
    @SerialName("divergence_of_wind_200hPa")
    DivergenceOfWind200hPa,
    @SerialName("divergence_of_wind_50hPa")
    DivergenceOfWind50hPa,
}

