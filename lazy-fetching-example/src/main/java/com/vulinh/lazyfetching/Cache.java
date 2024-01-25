package com.vulinh.lazyfetching;

import java.time.LocalDate;
import java.util.Map;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Cache {

  public static Student get(int id) {
    return DEMO_CACHE.get(id);
  }

  private static final Map<Integer, Student> DEMO_CACHE =
      Map.ofEntries(
          Map.entry(1, new Student(1, "Vũ Linh", LocalDate.of(1993, 4, 6))),
          Map.entry(2, new Student(2, "Lê Hằng", LocalDate.of(1993, 4, 6))));
}
