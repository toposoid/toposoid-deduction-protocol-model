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