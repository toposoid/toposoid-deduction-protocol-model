/*
 * Copyright 2021 Linked Ideal LLC.[https://linked-ideal.com/]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ideal.linked.toposoid.protocol.model.neo4j

import play.api.libs.json.Json

/**
 * For search of knowledge graph
 * @param query　Query string issued when each deductive inference logic references the knowledge graph
 * @param target　Knowledge graph database name.
 */
case class CypherQuery(query:String, target:String)
object CypherQuery{
  implicit val jsonWrites = Json.writes[CypherQuery]
  implicit val jsonReads = Json.reads[CypherQuery]
}

