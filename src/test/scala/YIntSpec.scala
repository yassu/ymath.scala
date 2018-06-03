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
    YInt(32).gcd(YInt(4)) shouldEqual(4)
  }
  "YInt instance" should "be able to compute gcd in case of other.n < 0" in {
    println(YInt(32).gcd(YInt(-4)))
    YInt(32).gcd(YInt(-4)) shouldEqual(4)
  }

  // maxSquare
  "MaxSquare of -1" should "None" in {
    YInt(-1).maxSquare shouldEqual None
  }
  "maxSquare of 0" should "0" in {
    YInt(0).maxSquare shouldEqual Some(0)
  }
  "maxSquare of 1" should "1" in {
    YInt(1).maxSquare shouldEqual Some(1)
  }
  "maxSquare of 2" should "1" in {
    YInt(2).maxSquare shouldEqual Some(1)
  }
  "maxSquare of 3" should "1" in {
    YInt(3).maxSquare shouldEqual Some(1)
  }
  "maxSquare of 4" should "1" in {
    YInt(4).maxSquare shouldEqual Some(2)
  }

  // isSquare
  "YInt instance" should "be able to compute isSquare" in {
    YInt(-1).isSquare shouldEqual(false)
  }
  "YInt instance" should "be able to compute isSquare in 0 case" in {
    YInt(0).isSquare shouldEqual(true)
  }
  "YInt instance" should "be able to compute isSquare in 1 case" in {
    YInt(1).isSquare shouldEqual(true)
  }
  "YInt instance" should "be able to compute isSquare in 3 case" in {
    YInt(3).isSquare shouldEqual(false)
  }
  "YInt instance" should "be able to compute isSquare in positive case" in {
    YInt(4).isSquare shouldEqual(true)
  }
}

