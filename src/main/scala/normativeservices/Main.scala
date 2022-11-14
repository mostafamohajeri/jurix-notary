package io.github.mostafamohajeri
package normativeservices

import util.EFLINT

object Main extends App {
  val eflint = new EFLINT("src/main/eflint/notary.eflint", true)
  println("done")
}
