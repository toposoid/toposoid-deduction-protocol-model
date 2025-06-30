/*
 * Copyright (C) 2025  Linked Ideal LLC.[https://linked-ideal.com/]
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

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

