/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.InterfaceFesta;
import Model.Festa;

/**
 *
 * @author Roberto Borges
 */
public class CriarFesta {
    
    public InterfaceFesta criarFesta(String festa){
        
        try{
            if (festa.equals("criar")) {
            return new Festa();
        }else{
            return null;
        }
        }catch(Exception e){
            System.out.println("Digite 'criar' no método principal");
        }     
        return null;
        
        
        
    }
    
}
