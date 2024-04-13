package com.conta_banco;

public class ContaCorrente extends Conta {
  public ContaCorrente(double saldoInicial) {
      super(saldoInicial);
  }

  @Override
  public void transferir(double valor, Conta contaDestino) {
      this.sacar(valor);
      contaDestino.depositar(valor);
  }
}
