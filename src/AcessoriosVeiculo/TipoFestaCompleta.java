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
public class TipoFestaCompleta extends Decorator{

    @Override
    public double calculaValor(ValorDecorator valorDecorator) {
       return 1000 + calcula(valorDecorator);
    }
    
}
