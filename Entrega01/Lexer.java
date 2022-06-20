/*
    Trabalho   -  Analisador Lexico
    Alunos     -  Vitor Brandao Raposo & Fernando 
    Professora -  Kecia Marques Ferreira
*/

package Entrega01;

import java.io.*;
import java.util.*;

public class Lexer {
    public static int line = 1; // contador de linhas
    private char peek = ' '; // caractere lido do arquivo
    private FileReader file;
    public Hashtable<String, Word> words = new Hashtable<String, Word>();

    /* Método para inserir palavras reservadas na HashTable */
    private void reserve(Word w) {
        words.put(w.getLexeme(), w); // lexema é a chave para entrada na HashTable
    }

    /* Método construtor */
    public Lexer(String fileName) throws FileNotFoundException {
        try {
            file = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
            throw e;
        }
        // Insere palavras reservadas na HashTable
        reserve(new Word("routine", Tag.ROUTINE));
        reserve(new Word("begin", Tag.BEGIN));
        reserve(new Word("end", Tag.END));
        reserve(new Word("declare", Tag.DECLARE));
        reserve(new Word("if", Tag.IF));
        reserve(new Word("then", Tag.THEN));
        reserve(new Word("else", Tag.ELSE));
        reserve(new Word("repeat", Tag.REPEAT));
        reserve(new Word("until", Tag.UNTIL));
        reserve(new Word("while", Tag.WHILE));
        reserve(new Word("do", Tag.DO));
        reserve(new Word("read", Tag.READ));
        reserve(new Word("write", Tag.WRITE));
        reserve(new Word("not", Tag.NOT));
        reserve(new Word("or", Tag.OR));
        reserve(new Word("and", Tag.AND));
        reserve(Type.INT);
        reserve(Type.FLOAT);
        reserve(Type.CHAR);
    }

    /* Lê o próximo caractere do arquivo */
    private void readch() throws IOException {
        peek = (char) file.read();
    }

    /* Lê o próximo caractere do arquivo e verifica se é igual a c */
    private boolean readch(char c) throws IOException {
        readch();
        if (peek != c)
            return false;
        peek = ' ';
        return true;
    }

    public Token scan() throws IOException {
        // Desconsidera delimitadores na entrada
        for (;; readch()) {
            if (peek == ' ' || peek == '\t' || peek == '\r' || peek == '\b')
                continue;
            else if (peek == '\n')
                line++; // conta linhas
            else
                break;
        }

        // Operadores e pontuação
        switch (peek) {
            case '<':
                if (readch('='))
                    return Word.le;
                if (readch('='))
                    return Word.ne;
                else
                    return new Token(Tag.LT);
            case '>':
                if (readch('='))
                    return Word.ge;
                else
                    return new Token(Tag.GT);
            case ':':
                if (readch('='))
                    return Word.ass;
                else
                    return new Token(Tag.COLON);
            case ',':
                peek = ' ';
                return new Token(Tag.COMMA);
            case ';':
                peek = ' ';
                return new Token(Tag.SEMI_COLON);
            case '(':
                peek = ' ';
                return new Token(Tag.PAR_OPEN);
            case ')':
                peek = ' ';
                return new Token(Tag.PAR_CLOSE);
            case '"':
                peek = ' ';
                return new Token(Tag.DOUBLE_APOSTROPHE);
            case '+':
                peek = ' ';
                return new Token(Tag.ADD);
            case '-':
                peek = ' ';
                return new Token(Tag.SUB);
            case '*':
                peek = ' ';
                return new Token(Tag.MUL);
            case '/':
                peek = ' ';
                return new Token(Tag.DIV);
            case '%':
                peek = ' ';
                return new Token(Tag.COMMENT);
            case '.':
                peek = ' ';
                return new Token(Tag.DOT);
        }
        // Números
        if (Character.isDigit(peek)) {
            int value = 0;
            do {
                value = 10 * value + Character.digit(peek, 10);
                readch();
            } while (Character.isDigit(peek));
            return new Num(value);
        }

        // Identificadores
        if (Character.isLetter(peek)) {
            StringBuffer sb = new StringBuffer();
            do {
                sb.append(peek);
                readch();
            } while (Character.isLetterOrDigit(peek));
            String s = sb.toString();
            Word w = (Word) words.get(s);
            if (w != null)
                return w; // palavra já existe na HashTable
            w = new Word(s, Tag.ID);
            words.put(s, w);
            return w;
        }

        // Caracteres não especificados
        Token t = new Token(peek);
        peek = ' ';
        return t;
    }
}
