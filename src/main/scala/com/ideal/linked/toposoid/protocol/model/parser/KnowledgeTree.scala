package com.ideal.linked.toposoid.protocol.model.parser

import com.ideal.linked.toposoid.knowledgebase.regist.model.KnowledgeSentenceSet
import play.api.libs.json.{Json, Reads, __}

/**
 * Data structure for expressing logical expressions with natural sentences as propositions
 */
sealed trait KnowledgeTree

/**
 * A node in the KnowledgeTree
 * @param operator
 * @param knowledgeLeft
 * @param knowledgeRight
 */
case class KnowledgeNode(operator: String, knowledgeLeft: KnowledgeTree, knowledgeRight: KnowledgeTree) extends KnowledgeTree
object KnowledgeNode {
  implicit lazy val reader: Reads[KnowledgeNode] = Json.reads[KnowledgeNode]
}

/**
 * A leaf in the KnowledgeTree
 * @param leaf
 */
case class KnowledgeLeaf(leaf: KnowledgeSentenceSet) extends KnowledgeTree
object KnowledgeLeaf {
  implicit lazy val reader: Reads[KnowledgeLeaf] = Json.reads[KnowledgeLeaf]
}

object KnowledgeTree {
  implicit lazy val treeReads: Reads[KnowledgeTree] =
    __.lazyRead(KnowledgeNode.reader).map(x => x:KnowledgeTree) orElse __.lazyRead(KnowledgeLeaf.reader).map(x => x:KnowledgeTree)
}