package com.vulinh.data;

import java.io.Serializable;
import lombok.Builder;

@Builder
public record Programming(
        String name,
        double score)
        implements Serializable {}
