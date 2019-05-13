package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if ( c == 0 || c == r ) {
        1
      } else {
        pascal(c - 1, r - 1) + pascal(c, r - 1)
      }
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {

      def balancer(chars: List[Char], numOpen: Int): Boolean = {
        if (chars.isEmpty) {
          numOpen == 0
        } else {
          if (chars.head == '(') {
            balancer(chars.tail, numOpen + 1)
          }
          else if (chars.head == ')') {
            numOpen > 0 && balancer(chars.tail, numOpen - 1)
          } else {
            balancer(chars.tail, numOpen)
          }
        }
      }

      balancer(chars, 0)
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
      if (money == 0) {
        1
      } else if (money < 0 || (coins.length == 0 && money >= 1)) {
        0
      } else {
        countChange(money - coins(0), coins) + countChange(money, coins.tail)
      }
    }
  }
