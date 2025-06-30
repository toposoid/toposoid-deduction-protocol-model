package com.ideal.linked.toposoid.protocol.model.neo4j

import play.api.libs.json.{Json, OWrites, Reads}

/**
 * Knowledge graph database search results
 * @param records　List of Neo4jRecordMap list
 */
case class Neo4jRecords(records:List[List[Neo4jRecordMap]])
object Neo4jRecords {
  implicit val jsonWrites: OWrites[Neo4jRecords] = Json.writes[Neo4jRecords]
  implicit val jsonReads: Reads[Neo4jRecords] = Json.reads[Neo4jRecords]
}

