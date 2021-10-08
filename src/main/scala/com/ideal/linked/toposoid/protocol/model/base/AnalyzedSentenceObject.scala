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

package com.ideal.linked.toposoid.protocol.model.base

import com.ideal.linked.toposoid.knowledgebase.model.{KnowledgeBaseEdge, KnowledgeBaseNode}
import play.api.libs.json.Json

/**
 *
 * @param nodeMap
 * @param edgeList
 * @param sentenceType
 * @param deductionResultMap
 */
case class AnalyzedSentenceObject(nodeMap:Map[String, KnowledgeBaseNode], edgeList:List[KnowledgeBaseEdge], sentenceType:Int, deductionResultMap:Map[String,DeductionResult])
object AnalyzedSentenceObject {
  implicit val jsonWrites = Json.writes[AnalyzedSentenceObject]
  implicit val jsonReads = Json.reads[AnalyzedSentenceObject]
}

