/*
    Trabalho   -  Compilador
    Alunos     -  Vitor Brandao Raposo & Fernando Faria Soares 
    Professora -  Kecia Marques Ferreira
*/

package Entrega02;

public class Id extends Expr{
    public int offset;  //relative address
    public Id(Word id, Type p, int b) {
        super(id, p);
        offset = b;
    }
    
}
