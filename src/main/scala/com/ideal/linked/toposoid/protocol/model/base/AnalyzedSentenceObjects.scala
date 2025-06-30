package com.ideal.linked.toposoid.protocol.model.base

import play.api.libs.json.{Json, OWrites, Reads}

/**
 * A model that stores the results of analyzing natural sentences.It becomes the input information of the deduction logic.
 * @param analyzedSentenceObjects List of AnalyzedSentenceObjects
 */
case class AnalyzedSentenceObjects(analyzedSentenceObjects:List[AnalyzedSentenceObject])
object AnalyzedSentenceObjects {
  implicit val jsonWrites: OWrites[AnalyzedSentenceObjects] = Json.writes[AnalyzedSentenceObjects]
  implicit val jsonReads: Reads[AnalyzedSentenceObjects] = Json.reads[AnalyzedSentenceObjects]
}

