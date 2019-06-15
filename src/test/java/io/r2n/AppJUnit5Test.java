package io.r2n;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("JUnit 5 modern tests")
class AppJUnit5Test {

  @Test
  @DisplayName("Positive test")
  void testPositive() {
    assertThat(true).isEqualTo(true);
  }

  @Test
  @DisplayName("Negative test")
  void testNegative() {

    assertThrows(AssertionError.class, () -> assertThat(false).isEqualTo(true),
        "Assertion error should thrown");
  }
}