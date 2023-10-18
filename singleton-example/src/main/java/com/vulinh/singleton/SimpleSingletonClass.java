package com.vulinh.singleton;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SimpleSingletonClass {

  private int value;

  public static final SimpleSingletonClass instance
          = new SimpleSingletonClass();

  // Not available to the public
  // Can use Lombok's @NoArgsConstructor(access = AccessLevel.PRIVATE)
  private SimpleSingletonClass() {
    // Do your initialization here
  }
}
