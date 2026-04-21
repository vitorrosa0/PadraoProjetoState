package org.example;

public class ContaEstadoAtiva extends ContaEstado{

    private ContaEstadoAtiva() {}

    private static class Holder {
        private static final ContaEstadoAtiva INSTANCIA = new ContaEstadoAtiva();
    }

    public static ContaEstadoAtiva getInstancia() {
        return ContaEstadoAtiva.Holder.INSTANCIA;
    }

    public String getEstado() {
        return "Ativa";
    }

    public boolean bloquear(Conta conta) {
        conta.setEstado(ContaEstadoBloqueada.getInstancia());
        return true;
    }

    public boolean especializar(Conta conta) {
        conta.setEstado(ContaEstadoEspecial.getInstancia());
        return true;
    }

    public boolean inativar(Conta conta) {
        conta.setEstado(ContaEstadoInativa.getInstancia());
        return true;
    }

    public boolean encerrar(Conta conta) {
        conta.setEstado(ContaEstadoEncerrada.getInstancia());
        return true;
    }
}
