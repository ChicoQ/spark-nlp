package com.johnsnowlabs.nlp.annotators.tokenizer.bpe

import com.johnsnowlabs.nlp.annotators.common.{IndexedToken, Sentence, TokenPiece}
import com.johnsnowlabs.nlp.annotators.tokenizer.moses.MosesTokenizer
import com.johnsnowlabs.nlp.annotators.tokenizer.normalizer.MosesPunctNormalizer

class XlmTokenizer(
                    merges: Array[String],
                    vocab: Map[String, Int],
                    lang: String = "en",
                    specialTokens: SpecialTokens,
                    padWithSentenceTokens: Boolean = false
                  ) extends BpeTokenizer(merges, vocab, specialTokens) {
  require(lang == "en", "Only English is supported currently.")
  override def tokenize(sentence: Sentence): Array[IndexedToken] = ???

  override def encode(indToken: IndexedToken): Array[TokenPiece] = ???
  val mosesNormalizer = new MosesPunctNormalizer()
  val mosesTokenizer = new MosesTokenizer(lang)
}