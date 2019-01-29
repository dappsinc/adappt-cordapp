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

@CordaSerializable
data class Financials(val revenue: Int = 0,
                      val salary: Int = 0,
                      val options: Int = 0,
                      val bonus: Int = 0,
                      val debt: Int = 0,
                      val profit: Int = 0,
                      val cash: Int = 0,
                      val stock: Int = 0,
                      val bonds: Int = 0,
                      val credit: Int = 0,
                      val teikoku: Int = 0)