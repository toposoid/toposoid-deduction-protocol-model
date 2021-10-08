/*
 * Copyright 2021 Linked Ideal LLC.[https://linked-ideal.com/]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ideal.linked.toposoid.protocol.model.base

import play.api.libs.json.Json

/**
 * A model that stores the results of deductive reasoning.
 * @param status
 * @param matchedPropositionIds
 * @param deductionUnit
 */
case class DeductionResult(status:Boolean, matchedPropositionIds:List[String], deductionUnit:String)
object DeductionResult {
  implicit val jsonWrites = Json.writes[DeductionResult]
  implicit val jsonReads = Json.reads[DeductionResult]
}
