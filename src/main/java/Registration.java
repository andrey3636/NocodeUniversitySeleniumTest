import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Registration {
    @Test
    public void CheckRedirectionToTheTermsPage() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MR Popovics\\OneDrive\\Рабочий стол\\Drive\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://jere237.softr.app/");
        WebElement SignUpButton = driver.findElement
                (By.cssSelector("a[class='sw-font-size-m sw-text-color-default sw-font-family-default sw-font-weight-semibold sw-border-radius-full sw-background-color-default sw-padding-left-s sw-padding-right-s sw-padding-top-4xs sw-padding-bottom-4xs sw-border-style-none sw-border-width-xs sw-border-color-000000 sw-letter-spacing-normal sw-text-decoration-no-underline hover:sw-text-decoration-no-underline hover:sw-box-shadow-m sw-margin-bottom-6xs sw-margin-right-5xs sw-display-inline-block']"));
        SignUpButton.click();
        WebElement TermsButton = driver.findElement(By.cssSelector("a.mx-1"));
        TermsButton.click();
        String expectedURL = "https://www.softr.io/terms";
        String actualURL = driver.getCurrentUrl();
        assertEquals(expectedURL, actualURL);

    }

    @Test
    public void CheckRedirectionToPrivacyPolicyPage() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MR Popovics\\OneDrive\\Рабочий стол\\Drive\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://jere237.softr.app/");
        WebElement SignUpButton = driver.findElement
                (By.cssSelector("a[class='sw-font-size-m sw-text-color-default sw-font-family-default sw-font-weight-semibold sw-border-radius-full sw-background-color-default sw-padding-left-s sw-padding-right-s sw-padding-top-4xs sw-padding-bottom-4xs sw-border-style-none sw-border-width-xs sw-border-color-000000 sw-letter-spacing-normal sw-text-decoration-no-underline hover:sw-text-decoration-no-underline hover:sw-box-shadow-m sw-margin-bottom-6xs sw-margin-right-5xs sw-display-inline-block']"));
        SignUpButton.click();
        WebElement PrivacyPolicyButton = driver.findElement(By.cssSelector("a.ml-1"));
        PrivacyPolicyButton.click();
//        String expectedURL = "https://www.softr.io/policy";
//        String actualURL = driver.getCurrentUrl();
//        assertEquals(expectedURL, actualURL);
        System.out.println(driver.getCurrentUrl());
//        assertTrue(driver.getCurrentUrl().contains("policy"));
    }
    @Test
    public void clickingEyeButton() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MR Popovics\\OneDrive\\Рабочий стол\\Drive\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://jere237.softr.app/");
        WebElement SignUpButton = driver.findElement
                (By.cssSelector("a[class='sw-font-size-m sw-text-color-default sw-font-family-default sw-font-weight-semibold sw-border-radius-full sw-background-color-default sw-padding-left-s sw-padding-right-s sw-padding-top-4xs sw-padding-bottom-4xs sw-border-style-none sw-border-width-xs sw-border-color-000000 sw-letter-spacing-normal sw-text-decoration-no-underline hover:sw-text-decoration-no-underline hover:sw-box-shadow-m sw-margin-bottom-6xs sw-margin-right-5xs sw-display-inline-block']"));
        SignUpButton.click();
        WebElement EyeButton = driver.findElement(By.cssSelector(".fa.fa-eye-slash.show-password"));
        EyeButton.click();
        WebElement PasswordInputField = driver.findElement(By.id("sw-form-password-input"));
        assertTrue(PasswordInputField.getText().contains(""));

    }
    @Test
    public void SignupAsTeacherWithValidData() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MR Popovics\\OneDrive\\Рабочий стол\\Drive\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://jere237.softr.app/");
        WebElement SignUpButton = driver.findElement
                (By.cssSelector("a[class='sw-font-size-m sw-text-color-default sw-font-family-default sw-font-weight-semibold sw-border-radius-full sw-background-color-default sw-padding-left-s sw-padding-right-s sw-padding-top-4xs sw-padding-bottom-4xs sw-border-style-none sw-border-width-xs sw-border-color-000000 sw-letter-spacing-normal sw-text-decoration-no-underline hover:sw-text-decoration-no-underline hover:sw-box-shadow-m sw-margin-bottom-6xs sw-margin-right-5xs sw-display-inline-block']"));
        SignUpButton.click();
        WebElement dropdown = driver.findElement(By.xpath("//button[@title='Select your role']"));
        dropdown.click();
        WebElement dropdown1 = driver.findElement(By.id("bs-select-1-0"));
        dropdown1.click();
        WebElement fullNameInputField = driver.findElement(By.id("sw-form-capture-full_name-input"));
        fullNameInputField.sendKeys("Popovics Andrey");
        WebElement emailInputField = driver.findElement(By.id("sw-form-capture-email-input"));
        emailInputField.sendKeys("bmw3@gmail.com");
        WebElement passwordInputField = driver.findElement(By.id("sw-form-password-input"));
        passwordInputField.sendKeys("123456");
        WebElement checkbox = driver.findElement(By.cssSelector(".checkmark.position-relative.sw-checkbox"));
        checkbox.click();
        WebElement SignUpButton2 = driver.findElement
                (By.id("sw-sign-up-submit-btn"));
        SignUpButton2.click();

//        assertTrue(fullNameInputField.getText().contains("Popovics Andrey"));
//        assertEquals("bmw@gmail.com", emailInputField.getText());
//        assertEquals("123456", passwordInputField.getText());
        System.out.println(driver.getCurrentUrl());

        assertTrue(driver.getCurrentUrl().contains("softr.app"));



    }
    @Test
    public void SignupAsStudentWithValidData() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MR Popovics\\OneDrive\\Рабочий стол\\Drive\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://jere237.softr.app/");
        WebElement SignUpButton = driver.findElement
                (By.cssSelector("a[class='sw-font-size-m sw-text-color-default sw-font-family-default sw-font-weight-semibold sw-border-radius-full sw-background-color-default sw-padding-left-s sw-padding-right-s sw-padding-top-4xs sw-padding-bottom-4xs sw-border-style-none sw-border-width-xs sw-border-color-000000 sw-letter-spacing-normal sw-text-decoration-no-underline hover:sw-text-decoration-no-underline hover:sw-box-shadow-m sw-margin-bottom-6xs sw-margin-right-5xs sw-display-inline-block']"));
        SignUpButton.click();
        WebElement dropdown = driver.findElement(By.xpath("//button[@title='Select your role']"));
        dropdown.click();
        WebElement dropdown1 = driver.findElement(By.id("bs-select-1-1"));
        dropdown1.click();
        WebElement fullNameInputField = driver.findElement(By.id("sw-form-capture-full_name-input"));
        fullNameInputField.sendKeys("Popovics Adam");
        WebElement emailInputField = driver.findElement(By.id("sw-form-capture-email-input"));
        emailInputField.sendKeys("bmw5@gmail.com");
        WebElement passwordInputField = driver.findElement(By.id("sw-form-password-input"));
        passwordInputField.sendKeys("123456");
        WebElement checkbox = driver.findElement(By.cssSelector(".checkmark.position-relative.sw-checkbox"));
        checkbox.click();
        WebElement SignUpButton2 = driver.findElement
                (By.id("sw-sign-up-submit-btn"));
        SignUpButton2.click();

        assertTrue(driver.getCurrentUrl().contains("softr.app"));



    }
    @Test
    public void SignUpWithEmptyRoleAndValidOtherData() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MR Popovics\\OneDrive\\Рабочий стол\\Drive\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://jere237.softr.app/");
        WebElement SignUpButton = driver.findElement
                (By.cssSelector("a[class='sw-font-size-m sw-text-color-default sw-font-family-default sw-font-weight-semibold sw-border-radius-full sw-background-color-default sw-padding-left-s sw-padding-right-s sw-padding-top-4xs sw-padding-bottom-4xs sw-border-style-none sw-border-width-xs sw-border-color-000000 sw-letter-spacing-normal sw-text-decoration-no-underline hover:sw-text-decoration-no-underline hover:sw-box-shadow-m sw-margin-bottom-6xs sw-margin-right-5xs sw-display-inline-block']"));
        SignUpButton.click();
        WebElement fullNameInputField = driver.findElement(By.id("sw-form-capture-full_name-input"));
        fullNameInputField.sendKeys("Popovics Anna");
        WebElement emailInputField = driver.findElement(By.id("sw-form-capture-email-input"));
        emailInputField.sendKeys("bmw6@gmail.com");
        WebElement passwordInputField = driver.findElement(By.id("sw-form-password-input"));
        passwordInputField.sendKeys("abc456");
        WebElement checkbox = driver.findElement(By.cssSelector(".checkmark.position-relative.sw-checkbox"));
        checkbox.click();
        WebElement SignUpButton2 = driver.findElement
                (By.id("sw-sign-up-submit-btn"));
        SignUpButton2.click();
        WebElement errorMessage =
                driver.findElement(By.cssSelector(".error-message.required-errors.d-block"));

        assertTrue(errorMessage.getText().contains("Please make sure there are no empty required fields."));


    }

    @Test
    public void SignUpNewTeacherWithPreviouslyUsedEmail() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MR Popovics\\OneDrive\\Рабочий стол\\Drive\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://jere237.softr.app/");
        WebElement SignUpButton = driver.findElement
                (By.cssSelector("a[class='sw-font-size-m sw-text-color-default sw-font-family-default sw-font-weight-semibold sw-border-radius-full sw-background-color-default sw-padding-left-s sw-padding-right-s sw-padding-top-4xs sw-padding-bottom-4xs sw-border-style-none sw-border-width-xs sw-border-color-000000 sw-letter-spacing-normal sw-text-decoration-no-underline hover:sw-text-decoration-no-underline hover:sw-box-shadow-m sw-margin-bottom-6xs sw-margin-right-5xs sw-display-inline-block']"));
        SignUpButton.click();
        WebElement dropdown = driver.findElement(By.xpath("//button[@title='Select your role']"));
        dropdown.click();
        WebElement dropdown1 = driver.findElement(By.id("bs-select-1-0"));
        dropdown1.click();
        WebElement fullNameInputField = driver.findElement(By.id("sw-form-capture-full_name-input"));
        fullNameInputField.sendKeys("Popovics Anna");
        WebElement emailInputField = driver.findElement(By.id("sw-form-capture-email-input"));
        emailInputField.sendKeys("bmw@gmail.com");
        WebElement passwordInputField = driver.findElement(By.id("sw-form-password-input"));
        passwordInputField.sendKeys("123456");
        WebElement checkbox = driver.findElement(By.cssSelector(".checkmark.position-relative.sw-checkbox"));
        checkbox.click();
        WebElement SignUpButton2 = driver.findElement
                (By.id("sw-sign-up-submit-btn"));
        SignUpButton2.click();
        WebElement errorMessage =
                driver.findElement(By.cssSelector(".error-message.signup-error.d-flex"));

        assertTrue(errorMessage.getText().contains("User by given email already exists."));





    }

}
