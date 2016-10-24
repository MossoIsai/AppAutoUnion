package com.example.isaigarciamoso.appautounion.models;

/**
 * Created by isaigarciamoso on 20/10/16.
 */
public class Agencia {

    private String nombre;
    private String logo;
    private String calle;
    private String estado;
    private String numero;
    private String codigoPostal;
    private String municipio;
    private String colonia;
    private String id;
    private String telefono;

    public Agencia(){

    }

    public Agencia(String nombre, String logo, String calle, String estado, String numero, String codigoPostal, String municipio, String colonia, String id, String telefono) {
        this.nombre = nombre;
        this.logo = logo;
        this.calle = calle;
        this.estado = estado;
        this.numero = numero;
        this.codigoPostal = codigoPostal;
        this.municipio = municipio;
        this.colonia = colonia;
        this.id = id;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
