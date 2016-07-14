package example1

import scala.collection.mutable.ListBuffer

/**
  * Created by João Nobre on 13/07/2016.
  */
object Main {
  def main(args: Array[String]): Unit = {
    println("Triangulo de Pascal")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }

  }

  /**
    * Triangulo de pascal
    */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /**
    * Parentesis balanceados
    */
  def balance(chars: List[Char]): Boolean = {
    def f(chars: List[Char], numOpens: Int): Boolean = {
      if (chars.isEmpty) {
        numOpens == 0
      } else {
        val h = chars.head
        val n =
          if (h == '(') numOpens + 1
          else if (h == ')') numOpens - 1
          else numOpens
        if (n >= 0) f(chars.tail, n)
        else false
      }
    }

    f(chars, 0)
  }


  /**
    *  Número de todas as combinaçoes de troco possiveis
    */
  def countChange2( money: Int , coins: List[ Int ] ) : Int = {
    if( money == 0 )
      1
    else if( money > 0 && !coins.isEmpty )
      countChange2( money - coins.head , coins ) + countChange2( money , coins.tail )
    else
      0
  }


}