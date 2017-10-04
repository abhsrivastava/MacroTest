package com.abhi

/**
  * Created by ASrivastava on 10/3/17.
  */
object HelloWorld extends App {
   println("Hello World")
   import com.abhi.MyMacros._
   println(isNumberEven(10))
}
