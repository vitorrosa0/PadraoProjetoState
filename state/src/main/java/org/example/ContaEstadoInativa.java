package org.example;

public class ContaEstadoInativa extends ContaEstado {

    private ContaEstadoInativa() {}

    private static class Holder {
        private static final ContaEstadoInativa INSTANCIA = new ContaEstadoInativa();
    }

    public static ContaEstadoInativa getInstancia() {
        return ContaEstadoInativa.Holder.INSTANCIA;
    }

    public String getEstado() {
        return "Inativa";
    }

    public boolean encerrar(Conta conta) {
        conta.setEstado(ContaEstadoEncerrada.getInstancia());
        return true;
    }

    public boolean ativar(Conta conta) {
        conta.setEstado(ContaEstadoAtiva.getInstancia());
        return true;
    }

}
