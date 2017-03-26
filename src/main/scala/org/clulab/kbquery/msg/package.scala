package org.clulab.kbquery

package object msg {

  /** The default namespace string for KBs. */
  val DefaultNamespace: String = "uaz"

  /** The string used to separate a namespace and an ID. */
  val NamespaceIdSeparator: String = ":"

  /** Concatenate and return a valid NS/ID from the given separate parts. */
  def makeNamespaceId (namespace: String, id: String): String =
    s"${namespace.trim.toLowerCase}${NamespaceIdSeparator}${id.trim}"

  /** Return a (possibly empty) list containing the namespace and ID from the given NS/ID string. */
  def parseNamespaceId (nsId: String): List[String] = {
    val parts = nsId.split(NamespaceIdSeparator).toList
    if (parts.size == 2) parts else List[String]()
  }


  /** Trait implemented by all model class which are used as messages. */
  trait Message

}