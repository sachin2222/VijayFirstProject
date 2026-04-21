package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;


// 10 sessions -5 to 6 sessions for auotmation
// 4 sessions- Rest APi Testing(Manual)+ API Automation(1 Demo)


//Extent Reports-- Done
// log4j is like tool used for logging in our framework-Done
// Deatailed information step by step

// Cross Browser Testing using properties File-- Done
// Proeprty File --> different environments-- Done



// Maven  --> Build Management Tool , Dependency Management Tool
// How to run automation project by maven?
// Maven commands to run the Projects

// Maven Life Cycle

// mvn test ---> searches on xml file pom.xml
// mvn test -->pom.xml --> testng.xml-->Testrunner Class

// mvn deploy --> real time Projects only


// CC flow --> Team1(20%)----> deploy maven project on NEXUS MAVEN repository--->0.0.2
//          --> My Team2(40%)--> i install that above mvn project 0.0.2
//          --->Team 3(40%)-->

// Cuucumber -TestNG Integration

// Git and Github
// Jenkins CI/CD Pipeline(FreeStyleJob and ScheduledJobs)
// Parallel Execution
// headless Testing
// Cross Browser Testing using properties File
// takes Screenshot
// How to Find Broken Links ?
// Data Driven Testing - using Json and Excel(Apachae POI)
// FluentWait


// we have to design one Framework on TestNG - 3-4 sessions

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",   // Feature files path
        glue = "stepDefinations",                  // Step definition package
        plugin = {
                "pretty",
                "html:target/cucumber-reports.html",

        },
        monochrome = true,                         // Cleaner console output
        dryRun = false,                            // true = check steps only
        tags = "@login"                            // Run specific tags
)

public class TestRunner extends AbstractTestNGCucumberTests {

}

//Hey I am making changes for Github


//Changes done by other QA Team Members


//Changes for git commands for Vijay

// I am making changes for Vijay to show git pull 








