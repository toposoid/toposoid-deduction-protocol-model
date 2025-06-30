package com.ideal.linked.toposoid.protocol.model.frontend

import play.api.libs.json.Json

case class Endpoint(host:String, port:String, name:String)
object Endpoint {
  implicit val jsonWrites = Json.writes[Endpoint]
  implicit val jsonReads = Json.reads[Endpoint]
}
