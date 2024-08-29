package fr.eni.tp.azurepipeline.web;

import fr.eni.tp.azurepipeline.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

  @GetMapping
  public User getUserInfo() {
    return new User("Jacques Yes", "jy@email.com", 1724925453);
  }
}
