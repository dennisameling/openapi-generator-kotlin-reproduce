/**
 * Petstore
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
*/
package com.example.openapigenerator.models

import com.example.openapigenerator.models.Animal

/**
 * 
 * @param breed 
 */
data class Dog(
    val type: kotlin.String,
    val breed: kotlin.String? = null,
    val name: kotlin.String? = null
)

