package com.abhi

/**
  * Created by ASrivastava on 10/3/17.
  */
import scala.reflect.macros.blackbox.Context
import scala.language.experimental.macros

object MyMacros {
   def isNumberEven(i: Int) : String = macro isNumberEvenImpl
   def isNumberEvenImpl(c: Context)(i : c.Tree) : c.Tree = {
      import c.universe._
      q"""
         if ($i % 2 == 0) "even" else "odd"
       """
   }
}
