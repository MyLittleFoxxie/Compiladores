/*
    Trabalho   -  Analisador Lexico
    Alunos     -  Vitor Brandao Raposo & Fernando Faria Soares 
    Professora -  Kecia Marques Ferreira
*/

package Analisador_Lexico;

public class Tag {
    public final static int
    // Palavras reservadas
    ROUTINE = 256,
            BEGIN = 257,
            END = 258,
            DECLARE = 259,
            INT = 260,
            FLOAT = 261,
            CHAR = 262,
            IF = 263,
            THEN = 264,
            ELSE = 265,
            REPEAT = 266,
            UNTIL = 267,
            WHILE = 268,
            DO = 269,
            READ = 270,
            WRITE = 271,
            NOT = 272,
            AND = 273,
            OR = 274,
            INDEX = 275,

            // Operadores e pontuação
            EQ = 288,
            GT = 289,
            GE = 290,
            LT = 291,
            LE = 292,
            NE = 293,
            ADD = 294,
            SUB = 295,
            MUL = 296,
            DIV = 297,
            PAR_OPEN = 298,
            PAR_CLOSE = 299,
            SEMI_COLON = 300,
            COMMA = 301,
            ASSIGN = 302,
            APOSTROPHE = 303,
            QUOTATION = 304,
            DOT = 305,
            DOUBLE_APOSTROPHE = 306,
            COLON = 307,
            COMMENT = 308,

            // Outros tokens
            CONST_INT = 278,
            CONST_FLOAT = 279,
            CONST_CHAR = 280,
            LITERAL = 281,
            ID = 282,
            LETTER = 283,
            DIGIT = 284,
            CARAC = 285,
            NUM = 286;
}
