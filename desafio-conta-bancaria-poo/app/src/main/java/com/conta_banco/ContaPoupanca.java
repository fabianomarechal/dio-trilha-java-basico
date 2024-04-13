package com.conta_banco;

public class ContaPoupanca extends Conta {
  public ContaPoupanca(double saldoInicial) {
      super(saldoInicial);
  }

  @Override
  public void transferir(double valor, Conta contaDestino) {
      // Implementação específica, se necessário
      this.sacar(valor);
      contaDestino.depositar(valor);
  }
}
