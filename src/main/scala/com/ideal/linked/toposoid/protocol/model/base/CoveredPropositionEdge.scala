package com.ideal.linked.toposoid.protocol.model.base

import play.api.libs.json.{Json, OWrites, Reads}

/**
 *
 * @param sourceNode
 * @param destinationNode
 */
case class CoveredPropositionEdge(sourceNode:CoveredPropositionNode, destinationNode:CoveredPropositionNode)
object CoveredPropositionEdge {
  implicit val jsonWrites: OWrites[CoveredPropositionEdge] = Json.writes[CoveredPropositionEdge]
  implicit val jsonReads: Reads[CoveredPropositionEdge] = Json.reads[CoveredPropositionEdge]
}
