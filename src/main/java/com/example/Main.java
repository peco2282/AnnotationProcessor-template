package com.example;

import com.example.annotations.CustomAnnotation;

// Shift を 2 回押して 'どこでも検索' ダイアログを開き、`show whitespaces` と入力して
// Enter キーを押します。これでコードに空白文字が表示されます。
public class Main {
  public static void main(String[] args) {
    // ハイライトされたテキストにキャレットがある状態で Alt+Enter を押して
    // IntelliJ IDEA が提案する修正方法を表示します。
    System.out.println("Hello and welcome!");
  }

  @Override
  @CustomAnnotation
  public String toString() {
    return "Main";
  }
}