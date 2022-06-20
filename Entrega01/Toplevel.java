/*
    Trabalho   -  Analisador Lexico
    Alunos     -  Vitor Brandao Raposo & Fernando Faria Soares 
    Professora -  Kecia Marques Ferreira
*/

package Entrega01;

import java.io.IOException;

public class Toplevel {

    public static void main(String[] args) throws IOException {

        Token currentToken;
        Lexer lexer = new Lexer("C:/Coding/Compiladores/Analisador_Lexico/teste1");

        System.out.println("Analise Lexica:");
        System.out.println("-----------------");
        for (int i = 0; i < 1000; i++) {
            currentToken = lexer.scan();
            if(currentToken.tag == 65535){
                break;
            }
            System.out.println(currentToken.toString() + " : TOKEN." + currentToken.tag);
        }
        System.out.println('\n');
        System.out.println("Tabela de Simbolos:");
        System.out.println("-----------------");
        System.out.println(lexer.words.toString());
        System.out.println('\n');
        
    }
}