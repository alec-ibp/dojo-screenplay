package co.com.bancolombia.certification.example.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.bancolombia.certification.example.userinterfaces.StartSharpDashboard.DASHBOARD_TITLE;

public class VerifyDashboard implements Question<Boolean> {

    private final String question;

    public VerifyDashboard(String question) {
        this.question = question;
    }

    public static VerifyDashboard withTheTitle(String question) {
        return new VerifyDashboard(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String answer = Text.of(DASHBOARD_TITLE).viewedBy(actor).asString();
        return question.equals(answer);
    }
}
