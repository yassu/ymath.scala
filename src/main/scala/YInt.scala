package ymath.number

import ymath.CastImplicits._
import math.{sqrt, round}

case class YInt(n: Int) {
  def gcd(other: YInt): Int =
    if (n < other.n)
        other.gcd(this)
    else if (n < 0)
        YInt(-n).gcd(other)
    else if (other.n < 0)
        this.gcd(YInt(-other.n))
    else if (other.n == 0)
     this
    else if (n == 0)
      other
    else
        other.gcd(n % other.n)

  def isSquare: Boolean = {
    val candidate = round(sqrt(n))
    candidate * candidate == n
  }
}
