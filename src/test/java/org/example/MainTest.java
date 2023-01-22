package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

  @Test
  void hello() {
    var text = Main.hello("JMC");
    Assertions.assertEquals(text,"Hello, JMC");
  }
}