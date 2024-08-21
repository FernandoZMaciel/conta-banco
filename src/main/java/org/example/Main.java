package org.example;

import org.example.domain.TerminalBanco;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TerminalBanco terminalBanco = new TerminalBanco();
        System.out.print("Por favor, digite o número da conta: ");
        try {
            terminalBanco.setNum(scanner.nextInt());
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        System.out.print("Por favor, digite o número da agência: ");
        terminalBanco.setAgency(scanner.nextLine());
        terminalBanco.setAgency(scanner.nextLine());
        System.out.print("Por favor, digite o nome do cliente: ");
        terminalBanco.setName(scanner.nextLine());
        System.out.print("Por favor, digite o saldo da conta: ");
        try{
            terminalBanco.setBalance(scanner.nextDouble());
        } catch (InputMismatchException e ){
            e.printStackTrace();
        }
        terminalBanco.printAccount();
    }
}
