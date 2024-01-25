package com.vulinh.lazyfetching;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class LazyFetch {

  public static String nullableGet(int number) {
    // Odd number returns "data"
    // Even number returns null
    return number % 2 != 0
            ? "Data"
            : null;
  }

  public static String getWithSideEffect() {
    System.out.println("Invoked side effect!");

    return "No data";
  }

}
