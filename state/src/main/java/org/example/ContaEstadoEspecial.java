package org.example;

public class ContaEstadoEspecial extends ContaEstado {

    private ContaEstadoEspecial() {}

    private static class Holder {
        private static final ContaEstadoEspecial INSTANCIA = new ContaEstadoEspecial();
    }

    public static ContaEstadoEspecial getInstancia() {
        return ContaEstadoEspecial.Holder.INSTANCIA;
    }

    public String getEstado() {
        return "Especial";
    }

    public boolean ativar(Conta conta) {
        conta.setEstado(ContaEstadoAtiva.getInstancia());
        return true;
    }

    public boolean bloquear(Conta conta) {
        conta.setEstado(ContaEstadoBloqueada.getInstancia());
        return true;
    }

}