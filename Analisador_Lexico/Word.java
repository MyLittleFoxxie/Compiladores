/*
    Trabalho   -  Analisador Lexico
    Alunos     -  Vitor Brandao Raposo & Fernando Faria Soares 
    Professora -  Kecia Marques Ferreira
*/

package Analisador_Lexico;

public class Word extends Token {
    private String lexeme = "";
    public static final Word le = new Word("<=", Tag.LE),
            ge = new Word(">=", Tag.GE),
            ne = new Word("<>", Tag.NE),
            ass = new Word(":=", Tag.ASSIGN);

    public Word(String s, int tag) {
        super(tag);
        lexeme = s;
    }

    public String toString() {
        return "" + lexeme;
    }

    public String getLexeme() {
        return lexeme;
    }
}