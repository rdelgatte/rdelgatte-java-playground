package com.decathlon;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class HelloTest {

  @Test
  void helloWorld() {
    Hello cut = new Hello();
    assertThat(cut.hello("World")).isEqualTo("Hello World");
  }
}
