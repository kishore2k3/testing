package com.example.ice2.excel;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelTest {
  @Test(dataProvider = "values")
  public void f(double a,double b,double c) {
	  Assert.assertEquals(a+b,c);
  }
  @DataProvider
  public Object[][] values() throws IOException
  {
	  return ExcelUtility.readExcel();
  }
}