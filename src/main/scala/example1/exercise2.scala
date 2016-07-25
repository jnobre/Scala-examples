package example1

/**
  * Created by João Nobre on 22/07/2016.
  */
object exercise2 {
  def product( f: Int => Int )( a: Int, b: Int ): Int =
    if( a > b ) 1
    else f(a) * product( f )( a + 1 , b )
  product(x => x * x)(3, 7)


  val x = new Rational(1, 3)
  val y = new Rational(5, 7)
  val z = new Rational(3, 2)
  val strange = new Rational(1, 0)
  strange + strange

}


class Rational(x: Int, y: Int) {
  require( y > 0 , "denominator must to be nonzero!" )
  private def gcd(a: Int, b: Int): Int = if ( b == 0 ) a else gcd( b , a % b )
  private val g = gcd( x , y )
  def numr = x / g
  def denom = y / g

  def + (that: Rational)=
    new Rational(
      numr * that.denom + that.numr * denom,
    denom * that.denom)

  def neg: Rational = new Rational( -numr , denom )

  def sub( that: Rational ) = this + that.neg

  def less(that: Rational) = numr * that.denom < that.numr * denom

  def max(that: Rational) = if( this.less( that ) ) that else this

  override def toString = numr + "/" + denom

}

