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

import play.api.libs.json.{Json, OWrites, Reads}

/**
 *
 * @param deductionUnit
 * @param propositionId
 * @param sentenceId
 * @param coveredPropositionEdges
 */
//case class CoveredPropositionResult(deductionUnit:String, propositionId:String, sentenceId:String, coveredPropositionEdges:List[CoveredPropositionEdge], knowledgeBaseSideInfoList:List[KnowledgeBaseSideInfo])
case class CoveredPropositionResult(propositionId:String, sentenceId:String, coveredPropositionEdges:List[CoveredPropositionEdge])
object CoveredPropositionResult {
  implicit val jsonWrites: OWrites[CoveredPropositionResult] = Json.writes[CoveredPropositionResult]
  implicit val jsonReads: Reads[CoveredPropositionResult] = Json.reads[CoveredPropositionResult]
}
