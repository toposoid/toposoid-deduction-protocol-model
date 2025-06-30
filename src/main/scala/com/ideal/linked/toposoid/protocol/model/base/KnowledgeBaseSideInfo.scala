package com.ideal.linked.toposoid.protocol.model.base

import play.api.libs.json.{Json, OWrites, Reads}

case class KnowledgeBaseSideInfo(propositionId:String, sentenceId:String, featureInfoList:List[MatchedFeatureInfo])

object KnowledgeBaseSideInfo {
  implicit val jsonWrites: OWrites[KnowledgeBaseSideInfo] = Json.writes[KnowledgeBaseSideInfo]
  implicit val jsonReads: Reads[KnowledgeBaseSideInfo] = Json.reads[KnowledgeBaseSideInfo]
}

