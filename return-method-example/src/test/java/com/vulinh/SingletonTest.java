package com.vulinh;

import static org.junit.jupiter.api.Assertions.*;

import com.vulinh.singleton.EnumSingletonClassAsComparator;
import com.vulinh.singleton.SerializableSingletonClass;
import com.vulinh.singleton.SimpleSingletonClass;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

@Log4j2
class SingletonTest {

  @Test
  @SneakyThrows
  void assertThatTwoObjectsAreNotTheSame() {
    var object1 = SimpleSingletonClass.instance;

    var constructor = SimpleSingletonClass.class.getDeclaredConstructors()[0];

    constructor.setAccessible(true);
    var object2 = constructor.newInstance();

    assertNotSame(object1, object2);
  }

  @Test
  void assertThatTwoObjectsAreNotTheSame2() {
    var object1 = SerializableSingletonClass.instance;
    var object2 = org.apache.commons.lang3.SerializationUtils.clone(object1);

    assertNotSame(object1, object2);
  }

  @Test
  void assertThatCannotCreateEnumReflectively() {
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          var c = EnumSingletonClassAsComparator.class
                  .getDeclaredConstructors()[0];
          c.setAccessible(true);
          var y = c.newInstance();
          log.info("You cannot reach here with y = {}", y);
        });
  }
}
