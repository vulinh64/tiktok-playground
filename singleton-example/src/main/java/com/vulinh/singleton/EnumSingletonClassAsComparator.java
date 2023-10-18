package com.vulinh.singleton;

import com.vulinh.data.Student;
import java.util.Comparator;

@SuppressWarnings("java:S6548")
public enum EnumSingletonClassAsComparator
        implements Comparator<Student> {
  INSTANCE;

  @Override
  public int compare(Student s1, Student s2) {
    var comparator =
        Comparator.nullsLast(
                Comparator.comparingDouble(Student::score))
                .thenComparing(
                        Student::name,
                        Comparator.nullsLast(
                                Comparator.naturalOrder()))
                .thenComparing(
                        Student::birthDate,
                        Comparator.nullsLast(
                                Comparator.naturalOrder()));

    return comparator.compare(s1, s2);
  }
}
