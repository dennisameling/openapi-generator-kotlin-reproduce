package com.example.openapigenerator.kotlin.spring.models

import java.util.Objects
import com.example.openapigenerator.kotlin.spring.models.Animal
import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import jakarta.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param breed 
 */
data class Dog(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("type", required = true) override val type: kotlin.String,

    @Schema(example = "null", description = "")
    @get:JsonProperty("breed") val breed: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") override val name: kotlin.String? = null
    ) : Animal{

}

