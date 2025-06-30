package com.ideal.linked.toposoid.protocol.model.parser

import com.ideal.linked.toposoid.knowledgebase.regist.model.Knowledge
import play.api.libs.json.{Json, OWrites, Reads}

/**
 * Input information for deductive reasoning
 * @param premise List of sentence strings classified as premise
 * @param claim List of sentence strings classified as claim
 */
case class InputSentence(premise:List[Knowledge], claim:List[Knowledge])
object InputSentence {
  implicit val jsonWrites: OWrites[InputSentence] = Json.writes[InputSentence]
  implicit val jsonReads: Reads[InputSentence] = Json.reads[InputSentence]
}

