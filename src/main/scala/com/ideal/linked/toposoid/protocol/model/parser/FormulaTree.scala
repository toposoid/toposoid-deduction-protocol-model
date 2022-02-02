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
sealed trait FormulaTree

/**
 * A node in the FormulaTree
 * @param operator
 * @param formulaLeft
 * @param formulaRight
 */
case class FormulaNode(operator: String, formulaLeft: FormulaTree, formulaRight: FormulaTree) extends FormulaTree
object FormulaNode {
  implicit lazy val reader = Json.reads[FormulaNode]
}

/**
 * A leaf in the FormulaTree
 * @param leaf
 */
case class FormulaLeaf(leaf: KnowledgeSentenceSet) extends FormulaTree
object FormulaLeaf {
  implicit lazy val reader = Json.reads[FormulaLeaf]
}

object FormulaTree {
  implicit lazy val treeReads: Reads[FormulaTree] =
    __.lazyRead(FormulaNode.reader).map(x => x:FormulaTree) orElse __.lazyRead(FormulaLeaf.reader).map(x => x:FormulaTree)
}

