/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AcessoriosVeiculo;

/**
 *
 * @author Roberto Borges
 */
public abstract class Decorator {
    protected Decorator acessorio;
    public Decorator(Decorator Acessorio) {
        acessorio = Acessorio; 
    }

    public Decorator() {
    }
    
    public abstract double calculaValor(ValorDecorator valorDecorator);
    
    public double calcula(ValorDecorator valorDecorator){
        if (acessorio == null) {
            return 0;
        }else{
            return acessorio.calculaValor(valorDecorator);
        }
    }
}
