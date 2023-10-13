package com.designepoo;

import java.util.ArrayList;

public class sitemaReservas {
    private ArrayList<reserva> reservas;

    public sitemaReservas() {
        this.reservas = new ArrayList<>();
    }

    public void hacerReserva(reserva reserva) {
        this.reservas.add(reserva);
    }

    public void mostrarReservas() {
        for (reserva reserva : reservas) {
            System.out.println(reserva);
        }
    }
}
