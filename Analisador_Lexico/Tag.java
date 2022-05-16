package Analisador_Lexico;

public class Tag {
    public final static int
    // Palavras reservadas
    PRG = 256,
            BEG = 257,
            END = 258,
            TYPE = 259,
            INT = 260,
            CHAR = 261,
            BOOL = 262,
            IF = 263,
            ELSE = 264,
            TRUE = 265,
            FALSE = 266,

            // Operadores e pontuação

            EQ = 288,
            GE = 289,
            LE = 290,
            NE = 291,
            AND = 292,
            OR = 293,

            // Outros tokens
            NUM = 278,
            ID = 279;
}
