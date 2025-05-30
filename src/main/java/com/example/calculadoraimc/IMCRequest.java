package com.example.calculadoraimc;
 
public class IMCRequest {
    private double peso;
    private double altura;
 
    public IMCRequest() {
    }
 
    public double getPeso() {
        return peso;
    }
 
    public void setPeso(double peso) {
        this.peso = peso;
    }
 
    public double getAltura() {
        return altura;
    }
 
    public void setAltura(double altura) {
        this.altura = altura;
    }
}