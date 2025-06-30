package com.ideal.linked.toposoid.protocol.model.base

import play.api.libs.json.{Json, OWrites, Reads}

/**
 *
 * @param currentId
 * @param propositionCurrentId
 * @param surface
 */
case class CoveredPropositionNode(terminalId:String, terminalSurface:String, terminalUrl:String)
object CoveredPropositionNode {
  implicit val jsonWrites: OWrites[CoveredPropositionNode] = Json.writes[CoveredPropositionNode]
  implicit val jsonReads: Reads[CoveredPropositionNode] = Json.reads[CoveredPropositionNode]
}
