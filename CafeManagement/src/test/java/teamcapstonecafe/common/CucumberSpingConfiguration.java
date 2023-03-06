package teamcapstonecafe.common;


import teamcapstonecafe.CafeManagementApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { CafeManagementApplication.class })
public class CucumberSpingConfiguration {
    
}
