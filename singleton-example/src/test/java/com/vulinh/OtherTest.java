package com.vulinh;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.vulinh.data.Student;
import com.vulinh.singleton.EnumSingletonClassAsComparator;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class OtherTest {

  @Test
  void testComparator() {
    var s =
        new ArrayList<>(
            List.of(
                new Student("a", LocalDate.of(1993, 4, 6), 85.0),
                new Student("a", LocalDate.of(1993, 4, 6), 75.0),
                new Student("b", LocalDate.of(1995, 6, 17), 65.0),
                new Student("b", LocalDate.of(1996, 6, 17), 65.0),
                new Student(null, LocalDate.of(1993, 4, 6), 95.0),
                new Student(null, null, 45.0),
                new Student("c", null, 55.0)));

    s.add(null);

    s.sort(EnumSingletonClassAsComparator.INSTANCE);

    s.forEach(System.out::println);

    assertNotNull(s);
  }
}
