package com.vulinh.lazyfetching;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.function.Supplier;
import org.junit.jupiter.api.Test;

class CacheDatabaseTest {

  @Test
  void testCacheDatabase() {
    var student = getStudent(1,
            () -> Database.get(1));

    if (student == null) {
      System.out.println("null student");
    } else {
      System.out.println(student);
    }

    assertNotNull(student);
  }

  public Student getStudent(
          int id,
          Supplier<? extends Student> ifNotPresent) {
    var possibleStudent = Cache.get(id);

    return possibleStudent == null
            ? ifNotPresent.get()
            : possibleStudent;
  }

}
