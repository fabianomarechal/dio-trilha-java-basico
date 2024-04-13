package com.conta_banco;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Bem-vindo ao sistema bancário!");

            Conta contaCorrente = new ContaCorrente(100);
            Conta contaPoupanca = new ContaPoupanca(50);

            System.out.println("Saldo inicial da conta corrente: R$" + contaCorrente.getSaldo());
            System.out.println("Saldo inicial da conta poupança: R$" + contaPoupanca.getSaldo());

            contaCorrente.depositar(450);
            contaPoupanca.sacar(25);
            contaCorrente.transferir(50, contaPoupanca);

            System.out.println("Saldo final da conta corrente: R$" + contaCorrente.getSaldo());
            System.out.println("Saldo final da conta poupança: R$" + contaPoupanca.getSaldo());

        } catch (NumberFormatException e) {
            System.out.println("Erro: Por favor, insira um valor numérico válido.");
        } finally {
            scanner.close();
            System.out.println("Operação finalizada.");
        }
    }

    private static void realizarDeposito(Conta conta) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor para depositar: ");
        double valorDeposito = Double.parseDouble(scanner.nextLine());
        conta.depositar(valorDeposito);
        System.out.println("Depósito realizado.");
    }

    private static void realizarSaque(Conta conta) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor para sacar: ");
        double valorSaque = Double.parseDouble(scanner.nextLine());
        conta.sacar(valorSaque);
        System.out.println("Saque realizado.");
    }

    private static void realizarTransferencia(Conta contaOrigem, Conta contaDestino) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor para transferir: ");
        double valorTransferencia = Double.parseDouble(scanner.nextLine());
        contaOrigem.transferir(valorTransferencia, contaDestino);
        System.out.println("Transferência realizada.");
    }
}