package com.vulinh.utils;

import com.vulinh.data.Programming;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Utils {

  public static boolean isSeniorJava(Programming programming) {
    return "java".equalsIgnoreCase(programming.name())
            && isSenior(programming.score());
  }

  private static boolean isSenior(double score) {
    return score >= 90;
  }

  public static boolean isMiddlePython(Programming programming) {
    return "python".equalsIgnoreCase(programming.name())
            && isMiddle(programming.score());
  }

  private static boolean isMiddle(double score) {
    return score >= 50 && score <= 90;
  }

  public static boolean isJuniorDotNet(Programming programming) {
    return ".NET".equalsIgnoreCase(programming.name())
            && isJunior(programming.score());
  }

  private static boolean isJunior(double score) {
    return score >= 20 && score <= 50;
  }
}
