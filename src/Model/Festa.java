/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import Model.ValorDecorator;
import Controller.Decorator;
import Model.StarWars;
import Model.TipoFestaSimples;
import Model.ToyStore;
import Controller.InterfaceFesta;
/**
 *
 * @author Roberto Borges
 */
public class Festa implements InterfaceFesta{

    
    public Festa(){
        
    }
    
    
    @Override
    public void criarFesta() {
        ValorDecorator valorDecorator = new ValorDecorator(0);
        Decorator festaStarWars = new StarWars(new StarWars());
        Decorator festaToyStore = new ToyStore(new ToyStore());
        Decorator festaStarWarsSimples = new StarWars(new ToyStore(new StarWars(new TipoFestaSimples())));
        
        double valor1 = festaStarWars.calcula(valorDecorator);
        double valor2 = festaToyStore.calcula(valorDecorator);
        double valor3 = festaStarWarsSimples.calcula(valorDecorator);
        
        
        System.out.println("Valor festa StarWars: " + valor1);
        System.out.println("Valor festa ToyStore: " + valor2);
        System.out.println("Valor festa StarWars Simples: " + valor3);
    }
    

    
    
}
