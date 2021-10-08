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

import com.ideal.linked.toposoid.knowledgebase.model.{KnowledgeBaseEdge, KnowledgeBaseNode, KnowledgeBaseSynonymEdge, KnowledgeBaseSynonymNode, OtherElement}
import play.api.libs.json.Json

/**
 * Knowledge graph database search results
 * @param logicNode com.ideal.linked.toposoid.knowledgebase.model.KnowledgeBaseNode
 * @param logicEdge com.ideal.linked.toposoid.knowledgebase.model.KnowledgeBaseEdge
 * @param synonymNode com.ideal.linked.toposoid.knowledgebase.model.KnowledgeBaseSynonymNode
 * @param synonymEdge com.ideal.linked.toposoid.knowledgebase.model.KnowledgeBaseSynonymEdge
 * @param otherElement com.ideal.linked.toposoid.knowledgebase.model.OtherElement
 */
case class Neo4jRecodeUnit(logicNode:KnowledgeBaseNode,
                           logicEdge:KnowledgeBaseEdge,
                           synonymNode:KnowledgeBaseSynonymNode,
                           synonymEdge:KnowledgeBaseSynonymEdge,
                           otherElement:OtherElement)
object Neo4jRecodeUnit {
  implicit val jsonWrites = Json.writes[Neo4jRecodeUnit]
  implicit val jsonReads = Json.reads[Neo4jRecodeUnit]
}

