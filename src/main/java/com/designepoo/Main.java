package com.designepoo;

public class Main {
    public static void main(String[] args) {
        sitemaReservas sistema = new sitemaReservas();

        reserva reserva1 = new reserva("Juan Topo", "12345678", "300 000 000", "2023-10-13 10:00", "Hotel");
        reserva reserva2 = new reserva("Mary poopins", "98765432", "315 000 000", "2023-10-14 15:30", "Restaurante");

        sistema.hacerReserva(reserva1);
        sistema.hacerReserva(reserva2);

        sistema.mostrarReservas();
    }
}