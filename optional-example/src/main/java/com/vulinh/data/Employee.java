package com.vulinh.data;

import lombok.Builder;

import java.io.Serializable;
import java.time.LocalDate;

@Builder
public record Employee(
    String name,
    Gender gender,
    LocalDate birthDate,
    Address address,
    Performance performance)
    implements Serializable {}
