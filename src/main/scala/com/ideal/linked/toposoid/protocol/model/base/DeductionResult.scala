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
