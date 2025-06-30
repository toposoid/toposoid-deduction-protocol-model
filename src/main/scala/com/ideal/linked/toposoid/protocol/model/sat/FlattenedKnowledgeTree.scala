package com.ideal.linked.toposoid.protocol.model.sat

import play.api.libs.json.{Json, OWrites, Reads}

/**
 *
 * @param regulation
 * @param hypothesis
 */
case class FlattenedKnowledgeTree(regulation:FormulaSet, hypothesis:FormulaSet)
object FlattenedKnowledgeTree {
  implicit val jsonWrites: OWrites[FlattenedKnowledgeTree] = Json.writes[FlattenedKnowledgeTree]
  implicit val jsonReads: Reads[FlattenedKnowledgeTree] = Json.reads[FlattenedKnowledgeTree]
}
