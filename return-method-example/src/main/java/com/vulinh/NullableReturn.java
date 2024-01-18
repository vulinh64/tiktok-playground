package com.vulinh;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Optional;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class NullableReturn {

  public static String format(String input, Object... args) {
    return input == null ? null : input.formatted(args);
  }

  public static Optional<String> optionalFormat1(String input, Object... args) {
    return input == null ? Optional.empty() : Optional.ofNullable(input.formatted(args));
  }

  public static Optional<String> optionalFormat2(String input, Object... args) {
    return Optional.ofNullable(input).map(s -> s.formatted(args));
  }
}
