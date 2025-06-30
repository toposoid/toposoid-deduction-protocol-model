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