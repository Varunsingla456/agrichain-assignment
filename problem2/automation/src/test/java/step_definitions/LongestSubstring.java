package step_definitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.InputPage;
import locators.ResultPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LongestSubstring {

    private void checkText(By locator, String expectedText) {
        String actualText = Hooks.driver.findElement(locator).getText().trim();
        Assert.assertEquals(expectedText, actualText);
    }

    @Given("the user navigates to the input page")
    public void theUserNavigatesToTheInputPage() {
        Hooks.driver.get("https://agrichain.com/qa/input");
        throw new PendingException();
    }

    @Then("the user should see the brand title {string} on the input page")
    public void theUserShouldSeeTheBrandTitleOnTheInputPage(String expectedText) {
        checkText(InputPage.brandTitle, expectedText);
        throw new PendingException();
    }

    @And("the user should see the login link {string} on the input page")
    public void theUserShouldSeeTheLoginLinkOnTheInputPage(String expectedText) {
        checkText(InputPage.loginLink, expectedText);
        throw new PendingException();
    }

    @And("the user should see the register link {string} on the input page")
    public void theUserShouldSeeTheRegisterLinkOnTheInputPage(String expectedText) {
        checkText(InputPage.registerLink, expectedText);
        throw new PendingException();
    }

    @When("the user enters the {string} in the string input")
    public void theUserEntersTheInTheStringInput(String text) {
        Hooks.driver.findElement(InputPage.stringInput).clear();
        Hooks.driver.findElement(InputPage.stringInput).sendKeys(text);
        throw new PendingException();
    }

    @And("the user clicks on the Submit button")
    public void theUserClicksOnTheSubmitButton() {
        Hooks.driver.findElement(InputPage.submitButton).click();
        throw new PendingException();
    }

    @Then("the user should see the result page")
    public void theUserShouldSeeTheResultPage() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("/qa/result"));

        String url = Hooks.driver.getCurrentUrl();
        Assert.assertTrue("URL was " + url, url.contains("/qa/result"));
        throw new PendingException();
    }

    @And("the user should see the brand title {string} on the result page")
    public void theUserShouldSeeTheBrandTitleOnTheResultPage(String expectedText) {
        checkText(ResultPage.brandTitle, expectedText);
        throw new PendingException();
    }

    @And("the user should see the output label {string}")
    public void theUserShouldSeeTheOutputLabel(String expectedText) {
        checkText(ResultPage.outputLabel, expectedText);
        throw new PendingException();
    }

    @And("the user should see the output value {string}")
    public void theUserShouldSeeTheOutputValue(String expectedText) {
        checkText(ResultPage.outputValue, expectedText);
        throw new PendingException();
    }

    @And("the user should see the back to home text {string}")
    public void theUserShouldSeeTheBackToHomeText(String expectedText) {
        checkText(ResultPage.backToHome, expectedText);
        throw new PendingException();
    }
}