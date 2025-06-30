package com.ideal.linked.toposoid.protocol.model.frontend

import play.api.libs.json.{Json, OWrites, Reads}

case class AnalyzedEdge(source:AnalyzedNode, target:AnalyzedNode, value:String)
object AnalyzedEdge {
  implicit val jsonWrites: OWrites[AnalyzedEdge] = Json.writes[AnalyzedEdge]
  implicit val jsonReads: Reads[AnalyzedEdge] = Json.reads[AnalyzedEdge]
}

