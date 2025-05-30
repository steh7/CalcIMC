package com.example.calculadoraimc;
 
import org.springframework.web.bind.annotation.*;
 
@RestController
@RequestMapping("/imc")
public class IMCController {
 
    @PostMapping
    public IMCResponse calcularIMC(@RequestBody IMCRequest request) {
        double peso = request.getPeso();
        double altura = request.getAltura();
 
        double imc = peso / (altura * altura);
        String classificacao;
 
        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc < 24.9) {
            classificacao = "Peso normal";
        } else if (imc < 29.9) {
            classificacao = "Sobrepeso";
        } else if (imc < 34.9) {
            classificacao = "Obesidade grau I";
        } else if (imc < 39.9) {
            classificacao = "Obesidade grau II";
        } else {
            classificacao = "Obesidade grau III ou mórbida";
        }
 
        return new IMCResponse(imc, classificacao);
    }
}