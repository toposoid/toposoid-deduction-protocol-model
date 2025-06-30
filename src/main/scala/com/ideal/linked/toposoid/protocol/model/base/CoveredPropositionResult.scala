package com.ideal.linked.toposoid.protocol.model.base

import play.api.libs.json.{Json, OWrites, Reads}

/**
 *
 * @param deductionUnit
 * @param propositionId
 * @param sentenceId
 * @param coveredPropositionEdges
 */
case class CoveredPropositionResult(deductionUnit:String, propositionId:String, sentenceId:String, coveredPropositionEdges:List[CoveredPropositionEdge], knowledgeBaseSideInfoList:List[KnowledgeBaseSideInfo])
object CoveredPropositionResult {
  implicit val jsonWrites: OWrites[CoveredPropositionResult] = Json.writes[CoveredPropositionResult]
  implicit val jsonReads: Reads[CoveredPropositionResult] = Json.reads[CoveredPropositionResult]
}
