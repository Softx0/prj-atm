package Controller;

import entidades.TipoDeDeduccion;
import ModeloFacade.TipoDeDeduccionFacade;
import Controller.util.MobilePageController;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

@Named(value = "tipoDeDeduccionController")
@ViewScoped
public class TipoDeDeduccionController extends AbstractController<TipoDeDeduccion> {

    @Inject
    private MobilePageController mobilePageController;

    public TipoDeDeduccionController() {
        // Inform the Abstract parent controller of the concrete TipoDeDeduccion Entity
        super(TipoDeDeduccion.class);
    }

}
