package com.ideal.linked.toposoid.protocol.model.frontend

import play.api.libs.json.{Json, OWrites, Reads}

/**
 *
 * @param analyzedEdges
 */
case class AnalyzedEdges(analyzedEdges:List[AnalyzedEdge])
object AnalyzedEdges {
  implicit val jsonWrites: OWrites[AnalyzedEdges] = Json.writes[AnalyzedEdges]
  implicit val jsonReads: Reads[AnalyzedEdges] = Json.reads[AnalyzedEdges]
}
