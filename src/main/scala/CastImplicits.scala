package ymath
import ymath.number.YInt

object CastImplicits {
    implicit def yint2int(yn: YInt): Int = yn.n
    implicit def int2yint(n: Int): YInt = YInt(n)
}
