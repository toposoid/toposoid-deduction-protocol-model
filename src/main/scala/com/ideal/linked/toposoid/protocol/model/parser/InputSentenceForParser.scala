package com.ideal.linked.toposoid.protocol.model.parser

import play.api.libs.json.{Json, OWrites, Reads}

/**
 * Input of parser
 * @param premise List of sentence strings and ids classified as premise
 * @param claim List of sentence strings and ids classified as claim
 */
case class InputSentenceForParser(premise:List[KnowledgeForParser], claim:List[KnowledgeForParser])
object InputSentenceForParser {
  implicit val jsonWrites: OWrites[InputSentenceForParser] = Json.writes[InputSentenceForParser]
  implicit val jsonReads: Reads[InputSentenceForParser] = Json.reads[InputSentenceForParser]
}

