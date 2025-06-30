package com.ideal.linked.toposoid.protocol.model.parser

import com.ideal.linked.toposoid.knowledgebase.regist.model.PropositionRelation
import play.api.libs.json.{Json, OWrites, Reads}

case class KnowledgeSentenceSetForParser(premiseList:List[KnowledgeForParser],premiseLogicRelation:List[PropositionRelation], claimList:List[KnowledgeForParser], claimLogicRelation:List[PropositionRelation])
object KnowledgeSentenceSetForParser {
  implicit val jsonWrites: OWrites[KnowledgeSentenceSetForParser] = Json.writes[KnowledgeSentenceSetForParser]
  implicit val jsonReads: Reads[KnowledgeSentenceSetForParser] = Json.reads[KnowledgeSentenceSetForParser]
}
