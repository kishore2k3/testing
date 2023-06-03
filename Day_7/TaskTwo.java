package com.example.ice.day7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TaskTwo {
	int num1=6;
	int num2=2;
  @Test(priority=1)
  public void sum() {
	  int sum = num1 + num2;
	  Assert.assertEquals(sum, 8);
  }
  @Test(priority=2)
  public void subtract() {
	  int subtract = num1 - num2;
	  Assert.assertEquals(subtract, 4);
  }
  @Test(priority=3)
  public void multiply()
  {
	  int multiply = num1 * num2;
	  Assert.assertEquals(multiply, 12);
  }
  @Test(priority=4)
  public void divide()
  {
	  int divide = num1/num2;
	  Assert.assertEquals(divide, 3);
  }
}
