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
 * @param breed 
 */


data class Dog (

    @get:JsonProperty("type")
    override val type: kotlin.String,

    @get:JsonProperty("name")
    override val name: kotlin.String? = null,

    @get:JsonProperty("breed")
    val breed: kotlin.String? = null

) : Animal {


}

