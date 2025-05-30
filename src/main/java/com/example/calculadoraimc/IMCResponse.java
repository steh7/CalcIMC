package com.example.calculadoraimc;
 
public class IMCResponse {
    private double imc;
    private String classificacao;
 
    public IMCResponse(double imc, String classificacao) {
        this.imc = imc;
        this.classificacao = classificacao;
    }
 
    public double getImc() {
        return imc;
    }
 
    public String getClassificacao() {
        return classificacao;
    }
}