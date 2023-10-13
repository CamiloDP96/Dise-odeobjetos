package com.designepoo;

public class reserva {
    private String nombre;
    private String documento;
    private String contacto;
    private String fechaHora;
    private String tipoReserva;

    public reserva(String nombre, String documento, String contacto, String fechaHora, String tipoReserva) {
        this.nombre = nombre;
        this.documento = documento;
        this.contacto = contacto;
        this.fechaHora = fechaHora;
        this.tipoReserva = tipoReserva;
    }

    @Override
    public String toString() {
        return "Reserva para " + nombre + " identificado con el nuemro de documento numero" + documento + " el " + fechaHora + ".\nTipo: " + tipoReserva + "\nContacto: " + contacto;
    }
}
