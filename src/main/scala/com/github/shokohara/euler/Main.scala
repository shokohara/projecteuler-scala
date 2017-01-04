package com.github.shokohara.euler

import scalaz.std.anyVal._
import scalaz.std.either._
import scalaz.syntax.bifunctor._
import scalaz.syntax.id._
import scalaz.syntax.show._
import scalaz.syntax.std.string._

object Main {

  val problems: Map[Int, Problem] = Map((1, Problem01) ::
    Nil: _*)

  def main(args: Array[String]): Unit = (for {
    stringN <- args.headOption toRight "Found no problem number."
    n <- stringN.parseInt.toEither leftMap (_ => "The input is not a number.")
    a <- problems.get(n) map (_.resolve.shows) toRight "The problem has not been implemented yet."
  } yield a).fold((_, 1), (_, 0)) |> (printlnWithExitCode _).tupled

  def printlnWithExitCode(output: String, code: Int): Unit = {
    println(output)
    System.exit(code)
  }
}
