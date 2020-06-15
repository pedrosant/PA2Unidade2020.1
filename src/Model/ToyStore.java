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
public class ToyStore extends Decorator{

    public ToyStore(Decorator acessorios) {
        super(acessorios);
    }

    public ToyStore() {
    }
    
    

    @Override
    public double calculaValor(ValorDecorator valorDecorator) {
        return 300 + calcula(valorDecorator);
    }
    
}
