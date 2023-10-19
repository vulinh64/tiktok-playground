package test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.vulinh.utils.OptionalNullCheck;

import org.junit.jupiter.api.Test;

class OptionalNullCheckTest {

  @Test
  void checkEmployeeSeniorJavaEngineer() {
    assertTrue(
            OptionalNullCheck.isSeniorJavaEngineer(TestData.EMPLOYEE_1));

    assertFalse(
            OptionalNullCheck.isSeniorJavaEngineer(TestData.EMPLOYEE_2));

    assertFalse(
            OptionalNullCheck.isSeniorJavaEngineer(TestData.EMPLOYEE_3));
  }

  @Test
  void checkEmployeeMiddlePythonAIEngineer() {
    assertFalse(
            OptionalNullCheck.isMiddlePythonAIEngineer(TestData.EMPLOYEE_1));

    assertFalse(
            OptionalNullCheck.isMiddlePythonAIEngineer(TestData.EMPLOYEE_2));

    assertFalse(
            OptionalNullCheck.isMiddlePythonAIEngineer(TestData.EMPLOYEE_3));
  }

  @Test
  void checkEmployeeSeniorDotNetInHanoi() {
    assertFalse(
            OptionalNullCheck.isJuniorDotNetEngineerInHanoi(TestData.EMPLOYEE_1));

    assertFalse(
            OptionalNullCheck.isJuniorDotNetEngineerInHanoi(TestData.EMPLOYEE_2));

    assertFalse(
            OptionalNullCheck.isJuniorDotNetEngineerInHanoi(TestData.EMPLOYEE_3));
  }

  @Test
  void checkEmployeeGender() {
    assertFalse(
            OptionalNullCheck.isFemale(TestData.EMPLOYEE_1));

    assertTrue(
            OptionalNullCheck.isFemale(TestData.EMPLOYEE_2));

    assertTrue(
            OptionalNullCheck.isFemale(TestData.EMPLOYEE_3));
  }
}
