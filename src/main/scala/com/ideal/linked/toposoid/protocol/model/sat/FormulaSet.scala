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

package com.ideal.linked.toposoid.protocol.model.sat

import play.api.libs.json.{Json, OWrites, Reads}

/**
 *
 * @param formula formula formula
 * @param subFormulaMap subFormulaMap Relationship between leaf of a tree and sub-formula
 */
case class FormulaSet(formula:String, subFormulaMap:Map[String, String])
object FormulaSet {
  implicit val jsonWrites: OWrites[FormulaSet] = Json.writes[FormulaSet]
  implicit val jsonReads: Reads[FormulaSet] = Json.reads[FormulaSet]
}

