package com.uco.managewood.apimanagewood.domain.colaborador;


import com.uco.managewood.apimanagewood.domain.sede.Sede;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "colaborador")
public class Colaborador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigocolaborador",nullable = false)
    private int codigocolaborador;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "identificacion")
    private String identificacion;


    @ManyToOne
    @JoinColumn(name = "codigotipoidentificacion")
    private TipoIdentificacion codigotipoidentificacion;

    @ManyToOne
    @JoinColumn(name = "codigoestadocolaborador")
    private EstadoColaborador codigoestadocolaborador;

    @ManyToOne
    @JoinColumn(name = "codigotipocolaborador")
    private TipoColaborador codigotipocolaborador;

    @ManyToOne
    @JoinColumn(name = "codigosede")
    private Sede codigosede;

    public int getCodigocolaborador() {
        return codigocolaborador;
    }

    public void setCodigocolaborador(int codigocolaborador) {
        this.codigocolaborador = codigocolaborador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public TipoIdentificacion getCodigotipoidentificacion() {
        return codigotipoidentificacion;
    }

    public void setCodigotipoidentificacion(TipoIdentificacion codigotipoidentificacion) {
        this.codigotipoidentificacion = codigotipoidentificacion;
    }

    public EstadoColaborador getCodigoestadocolaborador() {
        return codigoestadocolaborador;
    }

    public void setCodigoestadocolaborador(EstadoColaborador codigoestadocolaborador) {
        this.codigoestadocolaborador = codigoestadocolaborador;
    }

    public TipoColaborador getCodigotipocolaborador() {
        return codigotipocolaborador;
    }

    public void setCodigotipocolaborador(TipoColaborador codigotipocolaborador) {
        this.codigotipocolaborador = codigotipocolaborador;
    }

    public Sede getCodigosede() {
        return codigosede;
    }

    public void setCodigosede(Sede codigosede) {
        this.codigosede = codigosede;
    }
}
