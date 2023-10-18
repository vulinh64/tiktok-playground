package com.vulinh.singleton;

import java.io.Serial;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SerializableSingletonClass
        implements Serializable {

    @Serial
    private static final long serialVersionUID
            = -4426145418599395403L;

    private int value;

    public static final SerializableSingletonClass instance
            = new SerializableSingletonClass();

    // Not available to the public
    // Can use Lombok's @NoArgsConstructor(access = AccessLevel.PRIVATE)
    private SerializableSingletonClass() {
        // Do your initialization here
    }
}
