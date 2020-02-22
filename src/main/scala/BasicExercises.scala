/* Scala Practise Exercises
 * (Basic)
 *
 *  Author - Nganga
 */

object BasicExercises {

  def main(args: Array[String]) = {
    //Exercise 1
    println("Exercise 1 - Hello World:")
    println("Hello World!")
    println("-------------------")

    //Exercise 2
    println("Exercise 2 - Assignment:")
    val hello = "Hello World"
    println(hello)
    println("-------------------")

    //Exercise 3
    println("Exercise 3 - Parameters:")
    printString("This is a test string")
    println("-------------------")

    //Exercise 4
    println("Exercise 4 - Return Types:")
    println(returnHW())
    println("-------------------")

    //Exercise 5
    println("Exercise 5 - Type Inference:")
    returnAny(12.5)
    returnAny("Hello")
    returnAny(25)
    returnAny(false)
    println("-------------------")

    //Exercise 6
    println("Exercise 6 - Strings:")
    println(splitString("Hello",3))
    println("-------------------")

    //Exercise 7
    println("Exercise 7 - Strings 2:")
    println(joinString("Ha", "llo", 'a' ,'e'))
    println("-------------------")

    //Exercise 8
    println("Exercise 8 - Operators:")
    println(sumOf(4,2))
    println("-------------------")

    //Exercise 9
    println("Exercise 9 - Conditionals:")
    println(sumOrMulti(46,4,false))
    println(sumOrMulti(23,51,true))
    println("-------------------")

    //Exercise 10
    println("Exercise 10 - Conditionals 2:")
    println(sumOrMultiZero(0,54, true))
    println(sumOrMultiZero(13,0, false))
    println(sumOrMultiZero(0,0, true))
    println("-------------------")

    //Exercise 11
    println("Exercise 11 - Iteration:")
    loopString("Hi",3)
    println("-------------------")

    //Exercise 12
    println("Exercise 12 - Iteration 2:")
    stringGrid("H",4)
    println("-------------------")

    //Exercise 13
    println("Exercise 13 - Iteration 3:")
    fizzBuzz("Fizz", "Buzz", 15)
    println("-------------------")
  }

  //Function 3: Accepts a string as a parameter, and then outputs that string
  def printString(str:String) = println("Printing: " + str)

  //Function 4: returns a string to use as output
  def returnHW(): String = {
    val str = "Hello World"
    return str
  }

  //Function 5: does not signify a return type and outputs whatever is given to it
  def returnAny(value:Any) = {
    println(value)
  }

  /* Function 6: Accepts two parameters, one being a string and one being an integer
  *            return the amount of characters from the end of the string that the integer specifies
  */
  def splitString(str:String, splitNum:Int): String = {
    val newStr = str.substring(splitNum-1)
    return newStr
  }

  /* Function 7: accepts 4 parameters, two being a String and two being a character,
  *            joins both strings together and then replace all occurrences of the
  *            character provided with the second character provided.
  */
  def joinString(str1:String, str2:String, oldChar:Char, newChar:Char):String = {
    val newStr = str1.concat(str2)
    return newStr.replace(oldChar, newChar)
  }

  //Function 8: accepts two Integers as an input, then returns the sum of those integers
  def sumOf(num1:Int, num2:Int): Int = {
    val total = num1 + num2
    return total
  }

  /* Function 9: accepts two Integers and Boolean as an input,
   *           if true, returns the sum of those integers
   *           if false, returns the multiplication of these integers
   */
  def sumOrMulti(num1:Int, num2:Int, isSum: Boolean): Int = {
    var total = 0

    if (!isSum) {
      total = num1 * num2
    } else {
      total = num1 + num2
    }

    return total
  }

  /* Function 10: accepts two Integers and Boolean as an input,
   *           if true, returns the sum of those integers
   *           if false, returns the multiplication of these integers
   *           checks if one number = 0
   */
  def sumOrMultiZero(num1:Int, num2:Int, isSum: Boolean): Int = {
    var total = 0

    if (num1 == 0) {
      total = num2
    } else if (num2 == 0){
      total = num1
    } else {
      if (!isSum) {
        total = num1 * num2
      } else {
        total = num1 + num2
      }
    }

    return total
  }

  /* Function 11: accepts two parameters, a string and an integer,
   *           print out the string provided as many times as the integer designates
   */
  def loopString(str:String, loops:Int): Unit = {
    for (i <- 1 to loops) println(str)
  }

  /* Function 12: accepts two parameters, a string and an integer,
   *           output that string in a rectangle-like fashion as many times as the number dictates.
   */
  def stringGrid(input:String, loops:Int): Unit = {
    var strLine: String = ""

    for (i <- 1 to loops) {
      strLine = ""
      for (j <- 1 to loops) {
        strLine = strLine.concat(input)
        strLine = strLine.concat(" ")
      }
      println(strLine)
    }
  }

  /* Function 13: accepts three parameters, two strings and one integer,
   *           loops from 1 to the integer provided, outputting the current iteration count every iteration.
   *           if value is multiple of 3, output "Fizz", if value is multiple of 5, output "Buzz"
   *           if value is multiple of 3 and 5, output "FizzBuzz",
   */
  def fizzBuzz(fizz:String, buzz:String, loops:Int): Unit = {

    for (i <- 1 to loops) {
      if (i % 3 == 0 && i % 5 == 0 ) {
        print(fizz.concat(buzz))
      } else if (i % 3 == 0) {
        print(fizz)
      } else if (i % 5 == 0) {
        print(buzz)
      } else {
        print(i)
      }
      print(", ")
    }
    println("")
  }
}
