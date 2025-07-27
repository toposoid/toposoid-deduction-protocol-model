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

package com.ideal.linked.toposoid.protocol.model.base

import com.ideal.linked.toposoid.knowledgebase.model.{KnowledgeBaseEdge, KnowledgeBaseNode, KnowledgeBaseSemiGlobalNode}
import play.api.libs.json.{Json, OWrites, Reads}

/**
 *
 * @param nodeMap
 * @param edgeList
 * @param knowledgeBaseSemiGlobalNode
 * @param deductionResult
 */
case class AnalyzedSentenceObject(nodeMap:Map[String, KnowledgeBaseNode], edgeList:List[KnowledgeBaseEdge], knowledgeBaseSemiGlobalNode: KnowledgeBaseSemiGlobalNode, deductionResult:DeductionResult)
object AnalyzedSentenceObject {
  implicit val jsonWrites: OWrites[AnalyzedSentenceObject] = Json.writes[AnalyzedSentenceObject]
  implicit val jsonReads: Reads[AnalyzedSentenceObject] = Json.reads[AnalyzedSentenceObject]
}

