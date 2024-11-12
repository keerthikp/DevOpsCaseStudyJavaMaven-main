package com.helloworld;

public class CalculatorUsingMath {

  public int addition(int num1, int num2) {
    return Math.addExact(num1, num2);
  }

  public int subtraction(int num1, int num2) {
    return Math.subtractExact(num1, num2);
  }

  public int multiplication(int num1, int num2) {
    return Math.multiplyExact(num1, num2);
  }
}
