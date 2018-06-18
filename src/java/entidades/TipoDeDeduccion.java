/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ingva
 */
@Entity
@Table(name = "TIPO_DE_DEDUCCION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoDeDeduccion.findAll", query = "SELECT t FROM TipoDeDeduccion t")
    , @NamedQuery(name = "TipoDeDeduccion.findByNombreTipoDeduccion", query = "SELECT t FROM TipoDeDeduccion t WHERE t.nombreTipoDeduccion = :nombreTipoDeduccion")
    , @NamedQuery(name = "TipoDeDeduccion.findByPorcentaje", query = "SELECT t FROM TipoDeDeduccion t WHERE t.porcentaje = :porcentaje")
    , @NamedQuery(name = "TipoDeDeduccion.findByIdTipoDeduccion", query = "SELECT t FROM TipoDeDeduccion t WHERE t.idTipoDeduccion = :idTipoDeduccion")})
public class TipoDeDeduccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOMBRE_TIPO_DEDUCCION")
    private String nombreTipoDeduccion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PORCENTAJE")
    private BigDecimal porcentaje;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_TIPO_DEDUCCION")
    private Integer idTipoDeduccion;

    public TipoDeDeduccion() {
    }

    public TipoDeDeduccion(Integer idTipoDeduccion) {
        this.idTipoDeduccion = idTipoDeduccion;
    }

    public TipoDeDeduccion(Integer idTipoDeduccion, String nombreTipoDeduccion) {
        this.idTipoDeduccion = idTipoDeduccion;
        this.nombreTipoDeduccion = nombreTipoDeduccion;
    }

    public String getNombreTipoDeduccion() {
        return nombreTipoDeduccion;
    }

    public void setNombreTipoDeduccion(String nombreTipoDeduccion) {
        this.nombreTipoDeduccion = nombreTipoDeduccion;
    }

    public BigDecimal getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(BigDecimal porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Integer getIdTipoDeduccion() {
        return idTipoDeduccion;
    }

    public void setIdTipoDeduccion(Integer idTipoDeduccion) {
        this.idTipoDeduccion = idTipoDeduccion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoDeduccion != null ? idTipoDeduccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoDeDeduccion)) {
            return false;
        }
        TipoDeDeduccion other = (TipoDeDeduccion) object;
        if ((this.idTipoDeduccion == null && other.idTipoDeduccion != null) || (this.idTipoDeduccion != null && !this.idTipoDeduccion.equals(other.idTipoDeduccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.TipoDeDeduccion[ idTipoDeduccion=" + idTipoDeduccion + " ]";
    }
    
}
