/**
 *   Copyright 2019, Dapps Incorporated.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */


package io.adappt.policy


import net.corda.core.serialization.CordaSerializable

/**
 * @param basics basics
 * @param medical in years
 * @param financials in centimeters
 * @param diet in kilograms
 * @param exercise average rate in beats per minute
 * @param sleep average hours of sleep per night
 */


@CordaSerializable
data class PolicyHolderDetails(
        val basics: Basics,
        val medical: Medical,
        val financials: Financials,
        val diet: Diet = Diet(),
        val exercise: Float = 0.0f,
        val sleep: Float = 0.0f

)