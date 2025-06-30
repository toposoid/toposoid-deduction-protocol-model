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

