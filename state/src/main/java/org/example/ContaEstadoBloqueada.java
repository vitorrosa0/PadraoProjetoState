package org.example;

public class ContaEstadoBloqueada extends ContaEstado {

    private ContaEstadoBloqueada() {}

    private static class Holder {
        private static final ContaEstadoBloqueada INSTANCIA = new ContaEstadoBloqueada();
    }

    public static ContaEstadoBloqueada getInstancia() {
        return ContaEstadoBloqueada.Holder.INSTANCIA;
    }

    public String getEstado() {
        return "Bloqueada";
    }

    public boolean ativar(Conta conta) {
        conta.setEstado(ContaEstadoAtiva.getInstancia());
        return true;
    }

}