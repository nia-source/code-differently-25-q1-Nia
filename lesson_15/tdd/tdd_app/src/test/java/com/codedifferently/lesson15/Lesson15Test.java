package com.codedifferently.lesson15;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class Lesson15Test {

  @Test
  public void testLesson15() {
    assertThat(new Lesson15()).isNotNull();
  }

  @Test
  public void testGetGreeting() {
    // Act
    Lesson15.main(null);
  }

  @Test
  public void getId() {
    Employee employee = new Employee(1, "Nia Pack", "Communications", 75000.00);
    assertThat(employee.getId()).isEqualTo(1);
  }
}
