package com.vulinh.singleton;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DoubleLockingSynchronizedSingletonClass {

    private int value;

    private static DoubleLockingSynchronizedSingletonClass instance;

    public static DoubleLockingSynchronizedSingletonClass getInstance() {
        if (instance == null) {
            synchronized (DoubleLockingSynchronizedSingletonClass.class) {
                if (instance == null) {
                    instance = new DoubleLockingSynchronizedSingletonClass();
                }
            }
        }

        return instance;
    }

    // Not available to the public
    // Can use Lombok's @NoArgsConstructor(access = AccessLevel.PRIVATE)
    private DoubleLockingSynchronizedSingletonClass() {
        // Do your initialization here
    }
}
