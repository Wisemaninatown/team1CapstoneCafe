package teamcapstonecafe.common;


import teamcapstonecafe.DashBoardApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { DashBoardApplication.class })
public class CucumberSpingConfiguration {
    
}
