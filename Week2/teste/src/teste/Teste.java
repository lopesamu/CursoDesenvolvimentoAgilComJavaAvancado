/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;
import java.io.IOException;

public class Teste {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Dictionary d = new Dictionary("C:\\Users\\samul\\Documents\\MeusProjetos\\CursoDesenvolvimentoAgilComJavaAvancado\\Week2\\teste\\src\\teste\\words.txt");
        
        System.out.println(d.translateWord("pêssego"));
    }
    
}
