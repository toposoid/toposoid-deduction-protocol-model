package com.ideal.linked.toposoid.protocol.model.base

import play.api.libs.json.{Json, OWrites, Reads}

final case class DeductionConfiguration(actionModeType:Int, llmModel:String, llmModelHyperParameters:Map[String, String])
object DeductionConfiguration {
  implicit val jsonWrites: OWrites[DeductionConfiguration] = Json.writes[DeductionConfiguration]
  implicit val jsonReads: Reads[DeductionConfiguration] = Json.reads[DeductionConfiguration]
}
