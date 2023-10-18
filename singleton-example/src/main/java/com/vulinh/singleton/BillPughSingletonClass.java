package com.vulinh.singleton;

import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("java:S6548")
@Getter
@Setter
public class BillPughSingletonClass {

  private int value;

  public BillPughSingletonClass getInstance() {
    return BillPughSingletonInnerClass.INSTANCE;
  }

  // Not available to the public
  // Can use Lombok's @NoArgsConstructor(access = AccessLevel.PRIVATE)
  private BillPughSingletonClass() {
    // Do your initialization here
  }

  private static class BillPughSingletonInnerClass {
    private static final BillPughSingletonClass INSTANCE
            = new BillPughSingletonClass();
  }
}
