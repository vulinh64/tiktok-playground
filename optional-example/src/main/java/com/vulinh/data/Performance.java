package com.vulinh.data;

import java.io.Serializable;
import lombok.Builder;

@Builder
public record Performance(
        double office,
        double ai,
        Programming programming)
        implements Serializable {}
