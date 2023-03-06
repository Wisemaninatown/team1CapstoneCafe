package teamcapstonecafe.common;


import teamcapstonecafe.CustomerManagementApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { CustomerManagementApplication.class })
public class CucumberSpingConfiguration {
    
}
