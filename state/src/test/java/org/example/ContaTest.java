package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    Conta conta;

    @BeforeEach
    public void setUp() {
        conta = new Conta();
    }

    @Test
    void naoDeveAtivarContaAtiva() {
        assertFalse(conta.ativar());
    }

    @Test
    void deveBloquearContaAtiva() {
        assertTrue(conta.bloquear());
        assertEquals(ContaEstadoBloqueada.getInstancia(), conta.getEstado());
    }

    @Test
    void deveEspecializarContaAtiva() {
        assertTrue(conta.bloquear());
        assertEquals(ContaEstadoBloqueada.getInstancia(), conta.getEstado());
    }

    @Test
    void deveInativarContaAtiva() {
        assertTrue(conta.inativar());
        assertEquals(ContaEstadoInativa.getInstancia(), conta.getEstado());
    }

    @Test
    void deveEncerrarContaAtiva() {
        assertTrue(conta.encerrar());
        assertEquals(ContaEstadoEncerrada.getInstancia(), conta.getEstado());
    }

    @Test
    void deveAtivarContaBloqueada() {
        conta.setEstado(ContaEstadoBloqueada.getInstancia());
        assertTrue(conta.ativar());
        assertEquals(ContaEstadoAtiva.getInstancia(), conta.getEstado());
    }

    @Test
    void naoDeveEspecializarContaBloqueada() {
        conta.setEstado(ContaEstadoBloqueada.getInstancia());
        assertFalse(conta.especializar());
    }

    @Test
    void naoDeveInativarContaBloqueada() {
        conta.setEstado(ContaEstadoBloqueada.getInstancia());
        assertFalse(conta.inativar());
    }

    @Test
    void naoDeveEncerrarContaBloqueada() {
        conta.setEstado(ContaEstadoBloqueada.getInstancia());
        assertFalse(conta.encerrar());
    }

    @Test
    void naoDeveBloquearContaBloqueada() {
        conta.setEstado(ContaEstadoBloqueada.getInstancia());
        assertFalse(conta.bloquear());
    }

    @Test
    void deveAtivarContaEspecial() {
        conta.setEstado(ContaEstadoEspecial.getInstancia());
        assertTrue(conta.ativar());
        assertEquals(ContaEstadoAtiva.getInstancia(), conta.getEstado());
    }

    @Test
    void deveBloquearContaEspecial() {
        conta.setEstado(ContaEstadoEspecial.getInstancia());
        assertTrue(conta.bloquear());
        assertEquals(ContaEstadoBloqueada.getInstancia(), conta.getEstado());
    }

    @Test
    void naoDeveEspecializarContaEspecial() {
        conta.setEstado(ContaEstadoEspecial.getInstancia());
        assertFalse(conta.especializar());
    }

    @Test
    void naoDeveInativarContaEspecial() {
        conta.setEstado(ContaEstadoEspecial.getInstancia());
        assertFalse(conta.inativar());
    }

    @Test
    void naoDeveEncerrarContaEspecial() {
        conta.setEstado(ContaEstadoEspecial.getInstancia());
        assertFalse(conta.encerrar());
    }

    @Test
    void deveEncerrarContaInativa() {
        conta.setEstado(ContaEstadoInativa.getInstancia());
        assertTrue(conta.encerrar());
        assertEquals(ContaEstadoEncerrada.getInstancia(), conta.getEstado());
    }

    @Test
    void deveAtivarContaInativa() {
        conta.setEstado(ContaEstadoInativa.getInstancia());
        assertTrue(conta.ativar());
        assertEquals(ContaEstadoAtiva.getInstancia(), conta.getEstado());
    }

    @Test
    void naoDeveInativarContaInativa() {
        conta.setEstado(ContaEstadoInativa.getInstancia());
        assertFalse(conta.inativar());
    }

    @Test
    void naoDeveBloquearContaInativa() {
        conta.setEstado(ContaEstadoInativa.getInstancia());
        assertFalse(conta.bloquear());
    }

    @Test
    void naoDeveEspecializarContaInativa() {
        conta.setEstado(ContaEstadoInativa.getInstancia());
        assertFalse(conta.especializar());
    }

    @Test
    void naoDeveAtivarContaEncerrada() {
        conta.setEstado(ContaEstadoEncerrada.getInstancia());
        assertFalse(conta.ativar());
    }

    @Test
    void naoDeveBloqeuarContaEncerrada() {
        conta.setEstado(ContaEstadoEncerrada.getInstancia());
        assertFalse(conta.bloquear());
    }

    @Test
    void naoDeveEspecializarContaEncerrada() {
        conta.setEstado(ContaEstadoEncerrada.getInstancia());
        assertFalse(conta.especializar());
    }

    @Test
    void naoDeveInativarContaEncerrada() {
        conta.setEstado(ContaEstadoEncerrada.getInstancia());
        assertFalse(conta.inativar());
    }

    @Test
    void naoDeveEncerrarContaEncerrada() {
        conta.setEstado(ContaEstadoEncerrada.getInstancia());
        assertFalse(conta.encerrar());
    }

}