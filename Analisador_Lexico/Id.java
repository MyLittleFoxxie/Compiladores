/*
    Trabalho   -  Analisador Lexico
    Alunos     -  Vitor Brandao Raposo & Fernando Faria Soares 
    Professora -  Kecia Marques Ferreira
*/

package Analisador_Lexico;

public class Id extends Expr{
    public int offset;  //relative address
    public Id(Word id, Type p, int b) {
        super(id, p);
        offset = b;
    }
    
}
