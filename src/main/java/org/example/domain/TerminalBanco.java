package org.example.domain;

public class TerminalBanco {
    private int num;
    private String agency;
    private String name;
    private double balance;

    public void printAccount() {
        System.out.println("Olá " + this.name + ", obrigado por criar uma conta em nosso banco, sua agência é " + this.agency + ", conta " + this.num + " e seu saldo " + this.balance + "  já está disponível para sake");
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
