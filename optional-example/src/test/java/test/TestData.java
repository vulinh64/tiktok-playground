package test;

import com.vulinh.data.*;
import lombok.Generated;

import java.time.LocalDate;
import java.util.Optional;

class TestData {

  public static final Employee EMPLOYEE_1 =
      Employee.builder()
          .name("Vũ Linh")
          .gender(Gender.MALE)
          .birthDate(LocalDate.of(1993, 4, 6))
          .address(Address.builder().city("Hà Nội").ward("Mễ Trì").district("Nam Từ Liêm").build())
          .performance(
              Performance.builder()
                  .ai(0.0)
                  .office(90.0)
                  .programming(Programming.builder().name("Java").score(90.0).build())
                  .build())
          .build();

  public static final Employee EMPLOYEE_2 =
      Employee.builder()
          .name("Lê Hằng")
          .gender(Gender.FEMALE)
          .birthDate(LocalDate.of(1995, 6, 17))
          .address(
              Address.builder().city("Nghệ An").ward("Minh Châu").district("Diễn Châu").build())
          .performance(
              Performance.builder()
                  .ai(80.0)
                  .office(50.0)
                  .programming(Programming.builder().name(".NET").score(90.0).build())
                  .build())
          .build();

  public static final Employee EMPLOYEE_3 =
      Employee.builder()
          .name("Hermione Granger")
          .gender(Gender.FEMALE)
          .birthDate(LocalDate.of(1979, 9, 19))
          .address(Address.builder().city("London").ward("Unknown").district("Unknown").build())
          .performance(
              Performance.builder()
                  .ai(100)
                  .office(100)
                  .programming(Programming.builder().name("Python").score(100).build())
                  .build())
          .build();

  @Generated
  public static void happyVietnameseWomenDay(Employee employee) {
    Optional.ofNullable(employee)
        .filter(other -> Gender.FEMALE.equals(other.gender()))
        // Hàm này Java 9+ mới dùng được bạn nhé
        .ifPresentOrElse(
            e -> System.out.printf("Chúc bạn %s ngày phụ nữ Việt Nam ý nghĩa!%n", e.name()),
            () ->
                System.out.println("Chúc bạn hạnh phúc bên những người phụ nữ thân yêu của bạn!"));
  }
}
