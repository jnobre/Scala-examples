package example1

/**
  * Created by João Nobre on 25/07/2016.
  */
object scratch {

  new Rational( 1 , 2 )
  def error( msg: String ) = throw new Error( msg )

  error("Test") //show exception with description Test

  val x = null        //x : Null = null
  val y: String = x   // y : String = null

  val z: Int = null //error syntax ( it is incompatible with subtypes of AnyVal )

  if ( true ) 1 else false  //res1: AnyVal = 1

}
