fun main(){
  // this is a single line comment
  /*
    This is a multiline comment
  */

  // println adds a a line at the output
  println("Hello World!");
  //print does not include a newline
  // \ can be used to escape special characters
  // like n (new line), t (tab), quotes (" and ')
  // and even back slash
  print("This is my second line\n");
  print("\tThis is a third line?\b");


  /*
  DataTypes
      whole numbers
        Int
        Long
        Short
        Byte
      Floating point numbers
        Double
        Float
      String
      Char
      Boolean

      int myFavNum;
      String name;
  */
  print("Enter your name: ")
  // we can define variables as var or val
  //val name = readln()
  var name = readln()
  println("Hello " + name + "!")

  print("Enter another name: ")
  // you *cannot* change the value of a val
  name = readln()
  println("Hi " + name + "!")

  print("Enter your first and last name")
  var (first, last) = readln().split(' ')
  println("Hello " + first + "\n" + last)


  print("Enter a number: ")
  // Kotlin will decide what datatype the variable should be
  // or we can assign the variable type manually
  // in either case, once a datatype has been assigned, it cannot be a different type
  var input: String = readln()

  var num = input.toInt()

  /*
    operations
      + addition
      - subtraction
      * multiplication
      / division
      % modulous (remainder)

    operations and assignment
      +=
      -=
      *=
      /=
      %=
  */
  ++num
  num *= 2
  println("You entered " + num)
}
