package com.vulinh.singleton;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SynchronizedSimpleSingletonClass {

  private int value;

  public static synchronized SynchronizedSimpleSingletonClass
  getInstance() {
    if (instance == null) {
      instance =
              new SynchronizedSimpleSingletonClass();
    }
    return instance;
  }

  private static SynchronizedSimpleSingletonClass instance;

  // Not available to the public
  // Can use Lombok's @NoArgsConstructor(access = AccessLevel.PRIVATE)
  private SynchronizedSimpleSingletonClass() {
    // Do your initialization here
  }
}
