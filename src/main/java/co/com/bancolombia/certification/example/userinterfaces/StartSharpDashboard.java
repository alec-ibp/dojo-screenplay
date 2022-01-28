package co.com.bancolombia.certification.example.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StartSharpDashboard {
    public static final Target DASHBOARD_TITLE = Target.the("The Title of the dashboard")
            .located(By.cssSelector("header + main > section > section"));
}
