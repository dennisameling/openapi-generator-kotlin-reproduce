/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package com.example.openapigenerator.client.models

import com.example.openapigenerator.client.models.Animal

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 
 *
 * @param type 
 * @param name 
 * @param color 
 */


data class Cat (

    @get:JsonProperty("type")
    override val type: kotlin.String,

    @get:JsonProperty("name")
    override val name: kotlin.String? = null,

    @get:JsonProperty("color")
    val color: kotlin.String? = null

) : Animal {


}

