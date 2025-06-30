package com.ideal.linked.toposoid.protocol.model.neo4j

import play.api.libs.json.{Json, OWrites, Reads}

/**
 * For search of knowledge graph
 * @param query　Query string issued when each deductive inference logic references the knowledge graph
 * @param target　Knowledge graph database name.
 */
case class CypherQuery(query:String, target:String)
object CypherQuery{
  implicit val jsonWrites: OWrites[CypherQuery] = Json.writes[CypherQuery]
  implicit val jsonReads: Reads[CypherQuery] = Json.reads[CypherQuery]
}

