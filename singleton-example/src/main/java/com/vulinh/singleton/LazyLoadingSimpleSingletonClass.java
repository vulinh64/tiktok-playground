package com.vulinh.singleton;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LazyLoadingSimpleSingletonClass {

  private int value;

  public static LazyLoadingSimpleSingletonClass getInstance() {
    if (instance == null) {
      instance = new LazyLoadingSimpleSingletonClass();
    }

    return instance;
  }

  private static LazyLoadingSimpleSingletonClass instance;

  // Not available to the public
  // Can use Lombok's @NoArgsConstructor(access = AccessLevel.PRIVATE)
  private LazyLoadingSimpleSingletonClass() {
    // Do your initialization here
  }
}
