package runner;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.testng.annotations.BeforeClass;

//import com.cucumber.listener.ExtentCucumberFormatter;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps"
            
        )

public class PositiveTest  {
	
}


