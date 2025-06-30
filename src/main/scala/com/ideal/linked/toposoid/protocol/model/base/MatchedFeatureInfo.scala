package com.ideal.linked.toposoid.protocol.model.base

import play.api.libs.json.{Json, OWrites, Reads}

/**
 *
 * @param featureId
 * @param similarity
 */
case class MatchedFeatureInfo(featureId:String, similarity:Float)

object MatchedFeatureInfo {
  implicit val jsonWrites: OWrites[MatchedFeatureInfo] = Json.writes[MatchedFeatureInfo]
  implicit val jsonReads: Reads[MatchedFeatureInfo] = Json.reads[MatchedFeatureInfo]
}
