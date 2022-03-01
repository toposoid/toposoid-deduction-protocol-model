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

package com.ideal.linked.toposoid.protocol.model.frontend

import play.api.libs.json.Json

/**
 *
 * @param sentence
 * @param assignment
 * @param reasons
 * @param status "OPTINUM_FOUND/TRIVIAL/UNSATISEFIED/
 */
case class AnalyzedNode(sentence:String, assignment:Boolean, reasons:List[String], status:String)
object AnalyzedNode {
  implicit val jsonWrites = Json.writes[AnalyzedNode]
  implicit val jsonReads = Json.reads[AnalyzedNode]
}

