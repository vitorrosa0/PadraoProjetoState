package org.example;

public class ContaEstadoEncerrada extends ContaEstado{

    private ContaEstadoEncerrada() {}

    private static class Holder {
        private static final ContaEstadoEncerrada INSTANCIA = new ContaEstadoEncerrada();
    }

    public static ContaEstadoEncerrada getInstancia() {
        return ContaEstadoEncerrada.Holder.INSTANCIA;
    }

    public String getEstado() {
        return "Encerrada";
    }
}
