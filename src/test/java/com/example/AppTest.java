package com.example;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class AppTest {

    @BeforeClass
    public void setup() {
        System.out.println("\n========================================");
        System.out.println("  DevOps App - TestNG Test Suite");
        System.out.println("  Experiment No. 10 - Omkar Barad");
        System.out.println("========================================\n");
    }

    // Test 1 - Basic sanity check
    @Test(priority = 1)
    public void testApplicationStartup() {
        System.out.println("Test 1: Application startup check");
        boolean appStarted = true;
        Assert.assertTrue(appStarted, "Application failed to start!");
        System.out.println("PASSED - Application started successfully\n");
    }

    // Test 2 - Test servlet URL path
    @Test(priority = 2)
    public void testServletPath() {
        System.out.println("Test 2: Servlet path check");
        String servletPath = "/hello";
        Assert.assertEquals(servletPath, "/hello",
            "Servlet path is incorrect!");
        System.out.println("PASSED - Servlet path is correct: " + servletPath + "\n");
    }

    // Test 3 - Test response content
    @Test(priority = 3)
    public void testResponseContent() {
        System.out.println("Test 3: Response content check");
        String expectedContent = "Hello from DevOps Pipeline!";
        String actualContent   = "Hello from DevOps Pipeline!";
        Assert.assertEquals(actualContent, expectedContent,
            "Response content mismatch!");
        System.out.println("PASSED - Response content is correct\n");
    }

    // Test 4 - Test app version
    @Test(priority = 4)
    public void testAppVersion() {
        System.out.println("Test 4: Application version check");
        String version = "1.0-SNAPSHOT";
        Assert.assertNotNull(version, "Version should not be null!");
        Assert.assertTrue(version.contains("1.0"),
            "Version format is incorrect!");
        System.out.println("PASSED - App version is: " + version + "\n");
    }

    // Test 5 - Calculator logic test
    @Test(priority = 5)
    public void testBusinessLogic() {
        System.out.println("Test 5: Business logic check");
        int result = 10 + 20;
        Assert.assertEquals(result, 30,
            "Business logic calculation failed!");
        System.out.println("PASSED - Business logic: 10 + 20 = " + result + "\n");
    }

    // Test 6 - String validation test
    @Test(priority = 6)
    public void testStringValidation() {
        System.out.println("Test 6: String validation check");
        String appName = "DevOpsApp";
        Assert.assertFalse(appName.isEmpty(), "App name must not be empty!");
        Assert.assertTrue(appName.contains("DevOps"),
            "App name must contain 'DevOps'!");
        System.out.println("PASSED - App name validated: " + appName + "\n");
    }

    @AfterClass
    public void teardown() {
        System.out.println("========================================");
        System.out.println("  All Tests Completed Successfully!");
        System.out.println("========================================\n");
    }
}