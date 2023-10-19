package com.vulinh.utils;

import com.vulinh.data.Employee;
import com.vulinh.data.Gender;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TraditionalNullCheck {

  public static boolean isSeniorJavaEngineer(Employee employee) {
    return employee != null
        && employee.performance() != null
        && employee.performance().programming() != null
        && Utils.isSeniorJava(
                employee.performance().programming());
  }

  public static boolean isSeniorJavaEngineer2(Employee employee) {
      if (employee == null) { return false; }

      var performance = employee.performance();

      if (performance == null) { return false; }

      var programming = performance.programming();

      return programming != null
              && Utils.isSeniorJava(programming);
  }

  public static boolean isFemale(Employee employee) {
    return employee != null
            && Gender.FEMALE == employee.gender();
  }

  public static boolean isMiddlePythonAIEngineer(Employee employee) {
    return employee != null
        && employee.performance() != null
        && employee.performance().ai() >= 60
        && employee.performance().programming() != null
        && Utils.isMiddlePython(
                employee.performance().programming());
  }

  public static boolean isJuniorDotNetEngineerInHanoi(Employee employee) {
    return employee != null
        && employee.address() != null
        && "Hanoi".equalsIgnoreCase(employee.address().city())
        && employee.performance() != null
        && employee.performance().programming() != null
        && Utils.isJuniorDotNet(employee.performance().programming());
  }
}
