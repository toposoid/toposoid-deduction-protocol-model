package com.ideal.linked.toposoid.protocol.model.parser

import com.ideal.linked.toposoid.knowledgebase.regist.model.Knowledge
import play.api.libs.json.{Json, OWrites, Reads}

/**
 * Input of parser
 * @param propositionId
 * @param sentenceId
 * @param knowledge
 */
case class KnowledgeForParser(propositionId:String, sentenceId:String, knowledge:Knowledge)
object KnowledgeForParser {
  implicit val jsonWrites: OWrites[KnowledgeForParser] = Json.writes[KnowledgeForParser]
  implicit val jsonReads: Reads[KnowledgeForParser] = Json.reads[KnowledgeForParser]
}

