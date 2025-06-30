package com.ideal.linked.toposoid.protocol.model.frontend

import play.api.libs.json.{Json, OWrites, Reads}

/**
 *
 * @param sentence
 * @param assignment
 * @param reasons
 * @param status "OPTINUM_FOUND/TRIVIAL/UNSATISEFIED/
 * @param isNegativeSentence
 */
case class AnalyzedNode(sentence:String, assignment:Boolean, reasons:List[String], status:String, isNegativeSentence:Boolean)
object AnalyzedNode {
  implicit val jsonWrites: OWrites[AnalyzedNode] = Json.writes[AnalyzedNode]
  implicit val jsonReads: Reads[AnalyzedNode] = Json.reads[AnalyzedNode]
}

