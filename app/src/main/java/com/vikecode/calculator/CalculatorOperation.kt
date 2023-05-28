package com.vikecode.calculator

sealed class CalculatorOperation(val symbol: String){
    object Add: CalculatorOperation("+")
    object Multiply: CalculatorOperation("*")
    object Substract: CalculatorOperation("-")
    object Divide: CalculatorOperation("/")
}
