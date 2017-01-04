package com.github.shokohara.euler

import scalaz.Foldable
import scalaz.std.anyVal._
import scalaz.std.list._
import scalaz.syntax.equal._

object Problem01 extends Problem {

  def resolve = f(999)

  def f(n: Int) = Foldable[List].fold((for (x <- 1 to n if x % 3 === 0 || x % 5 === 0) yield x).toList)
}
