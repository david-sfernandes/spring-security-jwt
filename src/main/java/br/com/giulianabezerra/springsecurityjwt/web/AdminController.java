package br.com.giulianabezerra.springsecurityjwt.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
  @GetMapping("admin")
  public String getMessage() {
    return "Hello from admin API controller";
  }
}
