package com.vulinh.lazyfetching;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Optional;
import java.util.Random;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Database {

  public static Student get(int id) {
    return Optional.of(new Random())
        .map(Random::nextInt)
        .filter(value -> value == id)
        .map(matched -> new Student(matched, "Random student", LocalDate.of(1970, 1, 1)))
        .orElse(null);
  }
}
