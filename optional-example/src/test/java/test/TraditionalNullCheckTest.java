package test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.vulinh.utils.TraditionalNullCheck;
import org.junit.jupiter.api.Test;

class TraditionalNullCheckTest {

  @Test
  void checkEmployeeSeniorJavaEngineer() {
    assertTrue(
            TraditionalNullCheck.isSeniorJavaEngineer(TestData.EMPLOYEE_1));

    assertFalse(
            TraditionalNullCheck.isSeniorJavaEngineer(TestData.EMPLOYEE_2));

    assertFalse(
            TraditionalNullCheck.isSeniorJavaEngineer(TestData.EMPLOYEE_3));
  }

  @Test
  void checkEmployeeSeniorJavaEngineer2() {
    assertTrue(
            TraditionalNullCheck.isSeniorJavaEngineer2(TestData.EMPLOYEE_1));

    assertFalse(
            TraditionalNullCheck.isSeniorJavaEngineer2(TestData.EMPLOYEE_2));

    assertFalse(
            TraditionalNullCheck.isSeniorJavaEngineer2(TestData.EMPLOYEE_3));
  }

  @Test
  void checkEmployeeMiddlePythonAIEngineer() {
    assertFalse(
            TraditionalNullCheck.isMiddlePythonAIEngineer(TestData.EMPLOYEE_1));

    assertFalse(
            TraditionalNullCheck.isMiddlePythonAIEngineer(TestData.EMPLOYEE_2));

    assertFalse(
            TraditionalNullCheck.isMiddlePythonAIEngineer(TestData.EMPLOYEE_3));
  }

  @Test
  void checkEmployeeSeniorDotNetInHanoi() {
    assertFalse(
            TraditionalNullCheck.isJuniorDotNetEngineerInHanoi(TestData.EMPLOYEE_1));

    assertFalse(
            TraditionalNullCheck.isJuniorDotNetEngineerInHanoi(TestData.EMPLOYEE_2));

    assertFalse(
            TraditionalNullCheck.isJuniorDotNetEngineerInHanoi(TestData.EMPLOYEE_3));
  }

  @Test
  void checkEmployeeGender() {
    assertFalse(
            TraditionalNullCheck.isFemale(TestData.EMPLOYEE_1));

    assertTrue(
            TraditionalNullCheck.isFemale(TestData.EMPLOYEE_2));

    assertTrue(
            TraditionalNullCheck.isFemale(TestData.EMPLOYEE_3));
  }
}
