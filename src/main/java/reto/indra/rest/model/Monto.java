package reto.indra.rest.model;

import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

public class Monto {

    @Id
    private int id;
    private BigDecimal monto;
    private BigDecimal  tipoCambio;

    private String monedaOrigen;

    private String monedaDestino;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal  getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(BigDecimal  tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public String getMonedaOrigen() {
        return monedaOrigen;
    }

    public void setMonedaOrigen(String monedaOrigen) {
        this.monedaOrigen = monedaOrigen;
    }

    public String getMonedaDestino() {
        return monedaDestino;
    }

    public BigDecimal  getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal  monto) {
        this.monto = monto;
    }

    public void setMonedaDestino(String monedaDestino) {
        this.monedaDestino = monedaDestino;
    }

    public Monto(BigDecimal  tipoCambio, String monedaOrigen, String monedaDestino) {
        this.tipoCambio = tipoCambio;
        this.monedaOrigen = monedaOrigen;
        this.monedaDestino = monedaDestino;
    }

    public Monto(String monedaOrigen, String monedaDestino) {
        this.monedaOrigen = monedaOrigen;
        this.monedaDestino = monedaDestino;
    }

    public Monto(BigDecimal  monto, BigDecimal tipoCambio, String monedaOrigen, String monedaDestino) {
        this.monto=monto;
        this.tipoCambio = tipoCambio;
        this.monedaOrigen = monedaOrigen;
        this.monedaDestino = monedaDestino;
    }

    public Monto() {

    }

    @Override
    public String toString() {
        return "Monto [id=" + id + ", tipoCambio=" + tipoCambio + ", monedaOrigen=" + monedaOrigen + ", monedaDestino=" + monedaDestino + "]";
    }
}
