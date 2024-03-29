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

import play.api.libs.json.{Json, OWrites, Reads}

/**
 *
 * @param status
 * @param coveredPropositionResults
 * @param havePremiseInGivenProposition parameter is valid only when SentenceType is Claim.
 *　　　　　　　　　　　　　　　　　　　　　　　This parameter will be True only if the proposition has a Premise and
 *                                      there is a corresponding Claim in Knowledgebase that is related to the Proposition's Premise.
 */
case class DeductionResult(status:Boolean, coveredPropositionResults:List[CoveredPropositionResult], havePremiseInGivenProposition:Boolean = false)
object DeductionResult {
  implicit val jsonWrites: OWrites[DeductionResult] = Json.writes[DeductionResult]
  implicit val jsonReads: Reads[DeductionResult] = Json.reads[DeductionResult]
}
