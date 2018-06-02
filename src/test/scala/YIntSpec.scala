package ymath.number

import org.scalatest._

class YIntSpec extends FlatSpec with Matchers {
  "YInt object" should "be able to initialized" in {
    YInt(32)
    1 shouldEqual 1
  }
}

