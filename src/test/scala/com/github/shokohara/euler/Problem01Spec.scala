package com.github.shokohara.euler

import com.github.shokohara.euler.Problem01._
import org.scalatest._

class Problem01Spec extends FlatSpec with Matchers {

  behavior of getClass.getSimpleName.replace("Spec", "")

  "fact" should "be right" in {
    f(9) shouldBe 23
  }
}
