package com.ideal.linked.toposoid.protocol.model.base

import play.api.libs.json.{Json, OWrites, Reads}

case class MatchedKnowledgeNode(sentenceId:String, nodeId:String, caseNameOnEdge:String, isDenialWord:Boolean, nodeType: Int)

object MatchedKnowledgeNode {
  implicit val jsonWrites: OWrites[MatchedKnowledgeNode] = Json.writes[MatchedKnowledgeNode]
  implicit val jsonReads: Reads[MatchedKnowledgeNode] = Json.reads[MatchedKnowledgeNode]
}
