package com.decathlon;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

  private final FizzBuzz cut = new FizzBuzz();

  @Test
  void fizzBuzz() {
    assertThat(cut.fizzBuzz(3)).isEqualTo("1 2 Fizz");
    assertThat(cut.fizzBuzz(5)).isEqualTo("1 2 Fizz 4 Buzz");
    assertThat(cut.fizzBuzz(15)).isEqualTo("1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz");
  }

}
