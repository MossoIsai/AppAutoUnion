package com.example.isaigarciamoso.appautounion.models;

/**
 * Created by isaigarciamoso on 20/10/16.
 */
public class Auto {

    private String marca;
    private String modelo;
    private String version;
    private String kilometraje;
    private String anio;
    private String transmicion;
    private String colorExterior;
    private String colorInterior;
    private String descripcion;
    private String votos;
    private String precio;
    private String seminuevo;
    private String vendido;
    private String tipoAuto;
    private String fechaPublicacion;
    private String combustible;
    private String motor;
    private String logo;
    private String id;
    private String ageciaAuto;


    public  Auto(){

    }

    public Auto(String marca, String modelo, String version, String kilometraje, String anio, String transmicion, String colorExterior, String colorInterior, String descripcion, String votos, String precio, String seminuevo, String vendido, String tipoAuto, String fechaPublicacion, String combustible, String motor, String logo, String id, String ageciaAuto) {
        this.marca = marca;
        this.modelo = modelo;
        this.version = version;
        this.kilometraje = kilometraje;
        this.anio = anio;
        this.transmicion = transmicion;
        this.colorExterior = colorExterior;
        this.colorInterior = colorInterior;
        this.descripcion = descripcion;
        this.votos = votos;
        this.precio = precio;
        this.seminuevo = seminuevo;
        this.vendido = vendido;
        this.tipoAuto = tipoAuto;
        this.fechaPublicacion = fechaPublicacion;
        this.combustible = combustible;
        this.motor = motor;
        this.logo = logo;
        this.id = id;
        this.ageciaAuto = ageciaAuto;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(String kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getTransmicion() {
        return transmicion;
    }

    public void setTransmicion(String transmicion) {
        this.transmicion = transmicion;
    }

    public String getColorExterior() {
        return colorExterior;
    }

    public void setColorExterior(String colorExterior) {
        this.colorExterior = colorExterior;
    }

    public String getColorInterior() {
        return colorInterior;
    }

    public void setColorInterior(String colorInterior) {
        this.colorInterior = colorInterior;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getVotos() {
        return votos;
    }

    public void setVotos(String votos) {
        this.votos = votos;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getSeminuevo() {
        return seminuevo;
    }

    public void setSeminuevo(String seminuevo) {
        this.seminuevo = seminuevo;
    }

    public String getVendido() {
        return vendido;
    }

    public void setVendido(String vendido) {
        this.vendido = vendido;
    }

    public String getTipoAuto() {
        return tipoAuto;
    }

    public void setTipoAuto(String tipoAuto) {
        this.tipoAuto = tipoAuto;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getAgeciaAuto() {
        return ageciaAuto;
    }

    public void setAgeciaAuto(String ageciaAuto) {
        this.ageciaAuto = ageciaAuto;
    }
}
