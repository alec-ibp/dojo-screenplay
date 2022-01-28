package co.com.bancolombia.certification.example.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.bancolombia.certification.example.userinterfaces.LoginPage.*;


public class MakeLogin implements Task {

    private final String username;
    private final String password;


    public MakeLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static MakeLogin withCredentials(String username, String password) {
        return Tasks.instrumented(MakeLogin.class, username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(USERNAME_FIELD),
                Enter.theValue(password).into(PASSWORD_FIELD),
                Click.on(SIGN_IN_BUTTON)
        );
    }
}
