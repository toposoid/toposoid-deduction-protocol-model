package com.ideal.linked.toposoid.protocol.model.redis

import play.api.libs.json.{Json, OWrites, Reads}

case class KeyValueStoreInfo(identifier:String, key:String, value:String)
object KeyValueStoreInfo{
  implicit val jsonWrites: OWrites[KeyValueStoreInfo] = Json.writes[KeyValueStoreInfo]
  implicit val jsonReads: Reads[KeyValueStoreInfo] = Json.reads[KeyValueStoreInfo]
}
