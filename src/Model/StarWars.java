/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Decorator;

/**
 *
 * @author Roberto Borges
 */
public class StarWars extends Decorator{

    public StarWars(Decorator acessorios) {
        super(acessorios);
    }

    public StarWars() {
    }

    
    
    
    @Override
    public double calculaValor(ValorDecorator valorDecorator) {
        return 2000 + calcula(valorDecorator);
    }
    
}
