package es.upm.dit.isst.factorrh04.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "Ausencias")
public class Ausencias {

    @Id
    @Column(name = "idausencia")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer idausencia;
    @Column(name = "idempleado", length = 4)
    private String idempleado;
    @jakarta.persistence.Temporal(TemporalType.DATE)
    @Column(name = "inicio", nullable = true, columnDefinition = "DATE DEFAULT null")
    private Date inicio;
    @jakarta.persistence.Temporal(TemporalType.DATE)
    @Column(name = "fin", nullable = true, columnDefinition = "DATE DEFAULT null")
    private Date fin;
    @Column(name = "tipo_ausencia", length = 3)
    private String tipo_ausencia;
    @Column(name = "autorizada", length = 1)
    private String autorizada;
    @Column(name = "n_dias", precision = 8, scale = 2)
    private Integer n_dias;
    @jakarta.persistence.Temporal(TemporalType.DATE)

    @Column(name = "fecha_comunicacion", nullable = true, columnDefinition = "DATE DEFAULT null")
    private Date fecha_comunicacion;
    @Column(name = "notas", length = 255)
    private String notas;

    public Ausencias() {

    }

    public String getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(String idempleado) {
        this.idempleado = idempleado;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public String getTipo_ausencia() {
        return tipo_ausencia;
    }

    public void setTipo_ausencia(String tipo_ausencia) {
        this.tipo_ausencia = tipo_ausencia;
    }

    public String getAutorizada() {
        return autorizada;
    }

    public void setAutorizada(String autorizada) {
        this.autorizada = autorizada;
    }

    public Integer getN_dias() {
        return n_dias;
    }

    public void setN_dias(Integer n_dias) {
        this.n_dias = n_dias;
    }

    public Date getFecha_comunicacion() {
        return fecha_comunicacion;
    }

    public void setFecha_comunicacion(Date fecha_comunicacion) {
        this.fecha_comunicacion = fecha_comunicacion;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public Integer getIdausencia() {
        return idausencia;
    }

    public void setIdausencia(Integer idausencia) {
        this.idausencia = idausencia;
    }

}