 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Model.CriarFesta;
import Controller.InterfaceFesta;

/**
 *
 * @author Roberto Borges
 */
public class Avaliacao2Unidade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CriarFesta fabricar = new CriarFesta();
        
        InterfaceFesta criarFesta = fabricar.criarFesta("criar");
        criarFesta.criarFesta();
        
        
}
    
}
