package com.vulinh.data;

import java.time.LocalDate;

public record Student(
        String name,
        LocalDate birthDate,
        double score) {}
