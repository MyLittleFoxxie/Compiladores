/*
    Trabalho   -  Analisador Lexico
    Alunos     -  Vitor Brandao Raposo & Fernando 
    Professora -  Kecia Marques Ferreira
*/

package Analisador_Lexico;

public class Word extends Token {
    private String lexeme = "";
    public static final Word le = new Word("<=", Tag.LE);
    public static final Word ge = new Word(">=", Tag.GE);
    public static final Word ne = new Word("<>", Tag.NE);
    public static final Word ass = new Word(":=", Tag.ASSIGN);

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