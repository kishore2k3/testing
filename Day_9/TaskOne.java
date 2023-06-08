package com.example.ice.day9;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class TaskOne {
	CalculatorLogic c1 = new CalculatorLogic();
	
  @Test(dataProvider = "addValues")
  public void add(int a,int b,int output) {
	  int result = c1.add(a, b);
	  Assert.assertEquals(result, output);
  }
  @DataProvider
  public Object[][] addValues(){
	  return new Object[][] {
		  {1,2,3},{4,4,8}
	  };
  }
  @Test(dataProvider = "subValues")
  public void subtract(int a,int b,int output)
  {
	  int result = c1.subtract(a,b);
	  Assert.assertEquals(result, output);
  }
  @DataProvider
  public Object[][] subValues(){
	  return new Object[][] {
		  {1,2,-1},{4,4,0}
	  };
  }
  @Test(dataProvider = "multiplyValues")
  public void multiply(int a,int b,int output)
  {
	  int result = c1.multiply(a,b);
	  Assert.assertEquals(result, output);
  }
  @DataProvider
  public Object[][] multiplyValues(){
	  return new Object[][] {
		  {1,2,2},{4,4,16}
	  };
  }
  @Test(dataProvider = "divideValues")
  public void divide(int a,int b,int output)
  {
	  int result = c1.divide(a,b);
	  Assert.assertEquals(result, output);
  }
  @DataProvider
  public Object[][] divideValues(){
	  return new Object[][] {
		  {2,1,2},{4,4,1}
	  };
  }
}
