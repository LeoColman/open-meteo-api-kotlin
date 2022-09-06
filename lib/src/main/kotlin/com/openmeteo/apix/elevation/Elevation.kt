package com.openmeteo.apix.elevation

import com.openmeteo.apix.common.http.Endpoint
import com.openmeteo.apix.common.query.Query
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient
import java.net.URL

open class Elevation(
    val latitude: Collection<Float>,
    val longitude: Collection<Float>,
    context: URL = Companion.context,
) : Endpoint(context) {

    companion object {
        val context = URL("https://api.open-meteo.com/v1/elevation")
    }

    constructor(
        coordinates: Pair<Collection<Float>, Collection<Float>>,
        context: URL = Companion.context,
    ) : this(
        coordinates.first,
        coordinates.second,
        context,
    )

    constructor(
        vararg coordinates: Pair<Float, Float>,
        context: URL = Companion.context,
    ) : this(
        coordinates.unzip(),
        context,
    )

    init {
        require(longitude.size == latitude.size)
    }

    @Transient
    val coordinates get() =
        latitude.zip(longitude)

    @Serializable
    open class Response(
        val elevation: FloatArray,
    )

    operator fun invoke() = invoke<Response>()
    operator fun invoke(query: Query) = invoke<Response>(query)
}
