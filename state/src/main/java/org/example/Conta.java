package org.example;

public class Conta {

    private ContaEstado estado;

    public Conta() {
        this.estado = ContaEstadoAtiva.getInstancia();
    }

    public ContaEstado getEstado() {
        return estado;
    }

    public void setEstado(ContaEstado estado) {
        this.estado = estado;
    }

    public boolean ativar() {
        return estado.ativar(this);
    }

    public boolean bloquear() {
        return estado.bloquear(this);
    }

    public boolean encerrar() {
        return estado.encerrar(this);
    }

    public boolean especializar() {
        return estado.especializar(this);
    }

    public boolean inativar() {
        return estado.inativar(this);
    }

}
