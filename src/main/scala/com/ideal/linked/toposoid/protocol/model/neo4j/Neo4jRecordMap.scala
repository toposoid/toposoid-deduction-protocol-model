package com.ideal.linked.toposoid.protocol.model.neo4j

import play.api.libs.json.{Json, OWrites, Reads}

/**
 * Knowledge graph database search results
 * @param key Knowledge Graph Object Identification ID
 * @param value　Knowledge Graph Object
 */
case class Neo4jRecordMap(key:String, value:Neo4jRecodeUnit)
object Neo4jRecordMap {
  implicit val jsonWrites: OWrites[Neo4jRecordMap] = Json.writes[Neo4jRecordMap]
  implicit val jsonReads: Reads[Neo4jRecordMap] = Json.reads[Neo4jRecordMap]
}

