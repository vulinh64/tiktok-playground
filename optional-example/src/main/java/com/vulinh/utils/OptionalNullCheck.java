package com.vulinh.utils;

import com.vulinh.data.Employee;
import com.vulinh.data.Gender;
import com.vulinh.data.Performance;
import java.util.Optional;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class OptionalNullCheck {

  public static boolean isSeniorJavaEngineer(Employee employee) {
    return Optional.ofNullable(employee)
        .map(Employee::performance)
        .map(Performance::programming)
        .filter(Utils::isSeniorJava)
        .isPresent();
  }

  public static boolean isFemale(Employee employee) {
    return Optional.ofNullable(employee)
        .map(Employee::gender)
        .filter(Gender.FEMALE::equals)
        .isPresent();
  }

  public static boolean isMiddlePythonAIEngineer(Employee employee) {
    return Optional.ofNullable(employee)
        .map(Employee::performance)
        .filter(p -> p.ai() > 60)
        .map(Performance::programming)
        .filter(Utils::isMiddlePython)
        .isPresent();
  }

  public static boolean isJuniorDotNetEngineerInHanoi(Employee employee) {
    return Optional.ofNullable(employee)
        .filter(
            e ->
                Optional.ofNullable(e.address())
                    .filter(a ->
                            "Hanoi".equalsIgnoreCase(a.city()))
                    .isPresent())
        .map(Employee::performance)
        .map(Performance::programming)
        .filter(Utils::isJuniorDotNet)
        .isPresent();
  }
}
