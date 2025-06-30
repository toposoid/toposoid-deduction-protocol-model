package com.ideal.linked.toposoid.protocol.model.sat

import play.api.libs.json.{Json, OWrites, Reads}

/**
 *
 * @param satResultMap
 * @param subFormulaResultMap
 * @param status
 */
case class SatSolverResult(satResultMap: Map[String, Boolean], subFormulaResultMap: Map[String, Boolean], status:String)
object SatSolverResult {
  implicit val jsonWrites: OWrites[SatSolverResult] = Json.writes[SatSolverResult]
  implicit val jsonReads: Reads[SatSolverResult] = Json.reads[SatSolverResult]
}

