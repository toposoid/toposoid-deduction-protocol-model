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
