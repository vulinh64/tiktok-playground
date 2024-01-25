package com.vulinh.lazyfetching;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;
import org.junit.jupiter.api.Test;

class LazyFetchTest {

  @Test
  void getWithSideEffect() {
    var result =
        Optional.ofNullable(LazyFetch.nullableGet(3))
                .orElse(LazyFetch.getWithSideEffect());

    System.out.println(result);

    assertEquals("Data", result);
  }

  @Test
  void getWithoutSideEffect() {
    var result =
        Optional.ofNullable(LazyFetch.nullableGet(3))
                .orElseGet(LazyFetch::getWithSideEffect);

    System.out.println(result);

    assertEquals("Data", result);
  }

}
