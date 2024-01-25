package com.vulinh.lazyfetching;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class LazyFetchStaticTest {

  @Test
  void fetchStatic() {
    var result = Optional.ofNullable(LazyFetch.nullableGet(4))
            .orElse("No data");

    assertEquals("No data", result);
  }

  @SuppressWarnings("ExcessiveLambdaUsage")
  @Test
  void fetchStaticSupplier() {
    var result = Optional.ofNullable(LazyFetch.nullableGet(4))
            .orElseGet(() -> "No data");

    assertEquals("No data", result);
  }

}
