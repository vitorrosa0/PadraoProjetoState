package org.example;

public abstract class ContaEstado {

    public abstract String getEstado();

    public boolean ativar(Conta conta) {
        return false;
    }

    public boolean bloquear(Conta conta) {
        return false;
    }

    public boolean encerrar(Conta conta) {
        return false;
    }

    public boolean especializar(Conta conta) {
        return false;
    }

    public boolean inativar(Conta conta) {
        return false;
    }
}
