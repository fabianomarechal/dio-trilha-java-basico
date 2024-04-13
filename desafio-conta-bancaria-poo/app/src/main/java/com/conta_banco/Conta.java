package com.conta_banco;

import lombok.Getter;
import lombok.Setter;

@Getter
public abstract class Conta {
  @Setter private double saldo;

  public Conta(double saldoInicial) {
      this.saldo = saldoInicial;
  }

  public void depositar(double valor) {
      if (valor > 0) {
          this.saldo += valor;
      }
  }

  public void sacar(double valor) {
      if (valor > 0 && valor <= this.saldo) {
          this.saldo -= valor;
      }
  }

  public abstract void transferir(double valor, Conta contaDestino);
}