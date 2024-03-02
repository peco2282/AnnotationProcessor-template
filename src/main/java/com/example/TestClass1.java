package com.example;

import com.example.annotations.CustomAnnotation;
import org.junit.jupiter.api.Test;

public class TestClass1 {
  @CustomAnnotation
  @Test
  public void test1() {
    System.out.println("Test1");
  }
}
