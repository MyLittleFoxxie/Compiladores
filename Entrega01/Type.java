/*
    Trabalho   -  Analisador Lexico
    Alunos     -  Vitor Brandao Raposo & Fernando Faria Soares 
    Professora -  Kecia Marques Ferreira
*/

package Entrega01;


public class Type extends Word {
    public int width = 0; // width e usado par alocacao de memoria

    public Type(String s, int tag, int w) {
        super(s, tag);
        width = w;
    }

    public static final Type INT = new Type("int", Tag.INT, 4),
            FLOAT = new Type("float", Tag.FLOAT, 8),
            CHAR = new Type("char", Tag.CHAR, 1);

    public static boolean numeric(Type p) {
        if (p == Type.INT || p == Type.FLOAT || p == Type.CHAR) {
            return true;
        } else {
            return false;
        }
    }

    public static Type max(Type p1, Type p2) {
        if (!numeric(p1) || !numeric(p2)) {
            return null;
        } else if (p1 == Type.FLOAT || p2 == Type.FLOAT) {
            return Type.FLOAT;
        } else if (p1 == Type.INT || p2 == Type.INT) {
            return Type.INT;
        } else {
            return Type.CHAR;
        }
    }

}
