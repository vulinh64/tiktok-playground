package com.vulinh.data;

import java.io.Serializable;
import lombok.Builder;

@Builder
public record Address(
        String ward,
        String district,
        String city)
        implements Serializable {}
