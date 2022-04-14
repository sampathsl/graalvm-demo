package com.github.sampathsl.graalvm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/hello")
  public String getCustomers() {
    return "Hello!";
  }
}
