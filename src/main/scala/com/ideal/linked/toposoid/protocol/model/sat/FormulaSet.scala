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

