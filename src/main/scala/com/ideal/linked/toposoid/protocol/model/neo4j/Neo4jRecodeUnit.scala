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

import com.ideal.linked.toposoid.knowledgebase.model.{KnowledgeBaseEdge, KnowledgeBaseGlobalEdge, KnowledgeBaseGlobalNode, KnowledgeBaseNode, KnowledgeBaseSemiGlobalEdge, KnowledgeBaseSemiGlobalNode, KnowledgeBaseSynonymEdge, KnowledgeBaseSynonymNode, KnowledgeFeatureReference, KnowledgeFeatureReferenceEdge, OtherElement}
import play.api.libs.json.{Json, OWrites, Reads}

/**
 *
 * @param logicNode com.ideal.linked.toposoid.knowledgebase.model.KnowledgeBaseNode
 * @param logicEdge com.ideal.linked.toposoid.knowledgebase.model.KnowledgeBaseEdge
 * @param semiGlobalNode com.ideal.linked.toposoid.knowledgebase.model.KnowledgeBaseSemiGlobalNode
 * @param semiGlobalEdge com.ideal.linked.toposoid.knowledgebase.model.KnowledgeBaseSemiGlobalEdge
 * @param globalNode com.ideal.linked.toposoid.knowledgebase.model.KnowledgeBaseGlobalNode
 * @param globalEdge com.ideal.linked.toposoid.knowledgebase.model.KnowledgeBaseGlobalEdge
 * @param synonymNode com.ideal.linked.toposoid.knowledgebase.model.KnowledgeBaseSynonymNode
 * @param synonymEdge com.ideal.linked.toposoid.knowledgebase.model.KnowledgeBaseSynonymEdge
 * @param featureNode com.ideal.linked.toposoid.knowledgebase.model.KnowledgeFeatureReference
 * @param featureEdge com.ideal.linked.toposoid.knowledgebase.model.KnowledgeFeatureReferenceEdge
 * @param otherElement com.ideal.linked.toposoid.knowledgebase.model.OtherElement
 */
case class Neo4jRecodeUnit(localNode:Option[KnowledgeBaseNode],
                           localEdge:Option[KnowledgeBaseEdge],
                           semiGlobalNode:Option[KnowledgeBaseSemiGlobalNode],
                           semiGlobalEdge:Option[KnowledgeBaseSemiGlobalEdge],
                           globalNode: Option[KnowledgeBaseGlobalNode],
                           globalEdge: Option[KnowledgeBaseGlobalEdge],
                           synonymNode:Option[KnowledgeBaseSynonymNode],
                           synonymEdge:Option[KnowledgeBaseSynonymEdge],
                           featureNode:Option[KnowledgeFeatureReference],
                           featureEdge:Option[KnowledgeFeatureReferenceEdge],
                           otherElement:Option[OtherElement])
object Neo4jRecodeUnit {
  implicit val jsonWrites: OWrites[Neo4jRecodeUnit] = Json.writes[Neo4jRecodeUnit]
  implicit val jsonReads: Reads[Neo4jRecodeUnit] = Json.reads[Neo4jRecodeUnit]
}
