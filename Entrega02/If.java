package Entrega02;

public class If extends Stmt {
    Expr expr;
    Stmt stmt;

    public If(Expr x, Stmt s) {
        expr = x;
        stmt = s;
    }

    public void gen(int b, int a) {
        int label = newlabel(); // label for the code for stmt
        expr.jumping(0, a); // fall through on true, goto a on false
        emitlabel(label);
        stmt.gen(label, a);
    }
}
