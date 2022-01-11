package automatizacion.prueba.tasks;

import automatizacion.prueba.userinterfaces.PaginaDavivienda;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirTask implements Task {
    private PaginaDavivienda paginaDavivienda;

    public static AbrirTask appDavivienda() {
        return Tasks.instrumented(AbrirTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
     actor.wasAbleTo(Open.browserOn(paginaDavivienda));
    }
}
