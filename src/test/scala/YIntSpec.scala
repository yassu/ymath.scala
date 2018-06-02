package ymath.number

import ymath.CastImplicits._
import org.scalatest._

class YIntSpec extends FlatSpec with Matchers {
  "YInt object" should "be able to initialized" in {
    YInt(32)
    1 shouldEqual 1
  }

  // gcd
  "YInt instance" should "be able to transfered to Int instance" in {
    YInt(32) + YInt(32) shouldEqual 64
  }
  "YInt instance" should "be able to compute gcd" in {
    println(YInt(32).gcd(YInt(4)))
    YInt(32).gcd(YInt(4)) shouldEqual(4)
  }
  "YInt instance" should "be able to compute gcd in case of other.n < 0" in {
    println(YInt(32).gcd(YInt(-4)))
    YInt(32).gcd(YInt(-4)) shouldEqual(4)
  }
}

