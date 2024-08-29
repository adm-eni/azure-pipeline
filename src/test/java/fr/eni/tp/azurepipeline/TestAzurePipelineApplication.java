package fr.eni.tp.azurepipeline;

import org.springframework.boot.SpringApplication;

public class TestAzurePipelineApplication {

  public static void main(String[] args) {
    SpringApplication.from(AzurePipelineApplication::main).with(TestcontainersConfiguration.class).run(args);
  }

}
