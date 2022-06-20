/*
    Trabalho   -  Analisador Lexico
    Alunos     -  Vitor Brandao Raposo & Fernando Faria Soares 
    Professora -  Kecia Marques Ferreira
*/

package Entrega01;

public class Token {
    public final int tag; // constante que representa o token

    public Token(int t) {
        tag = t;
    }

    public String toString() {
        return "" + tag;
    }
}
