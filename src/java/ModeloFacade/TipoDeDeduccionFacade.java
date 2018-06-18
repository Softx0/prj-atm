/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloFacade;

import entidades.TipoDeDeduccion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ingva
 */
@Stateless
public class TipoDeDeduccionFacade extends AbstractFacade<TipoDeDeduccion> {

    @PersistenceContext(unitName = "ATMWebPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoDeDeduccionFacade() {
        super(TipoDeDeduccion.class);
    }
    
}
