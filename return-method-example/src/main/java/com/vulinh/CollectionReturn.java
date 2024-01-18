package com.vulinh;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CollectionReturn {

  public static List<String> generateList(int number) {
    return number < 1
            ? null
            : IntStream.rangeClosed(1, number)
                       .mapToObj(String::valueOf)
                       .toList();
  }

  public static List<String> generateList2(int number) {
    return number < 1
        ? Collections.emptyList()
        : IntStream.rangeClosed(1, number)
                   .mapToObj(String::valueOf)
                   .toList();
  }

  public static void main(String[] args) {
    // Đây là list rỗng
    var emptyList = Collections.emptyList();

    // Đây là set rỗng
    var emptySet = Collections.emptySet();

    // Đây là map rỗng
    var emptyMap = Collections.emptyMap();

    System.out.println(emptyList + ";" + emptySet + ";" + emptyMap);
  }
}
