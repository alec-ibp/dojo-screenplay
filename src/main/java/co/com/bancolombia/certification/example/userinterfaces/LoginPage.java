package co.com.bancolombia.certification.example.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    public static final Target USERNAME_FIELD = Target.the("Input text field for the username")
            .located(By.id("StartSharp_Membership_LoginPanel0_Username"));

    public static final Target PASSWORD_FIELD = Target.the("Input text field for the password")
            .located(By.id("StartSharp_Membership_LoginPanel0_Password"));

    public static final Target SIGN_IN_BUTTON = Target.the("Button for sign on at the app")
            .located(By.id("StartSharp_Membership_LoginPanel0_LoginButton"));

}
