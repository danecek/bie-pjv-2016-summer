
package expressions;

public class AddOp extends BinOp {

    public AddOp(char op, Expr left, Expr right) {
        super(1, op, left, right);
        if (op != '+' && op != '-') {
            throw new IllegalArgumentException("invalid op");
        }
    }

    @Override
    int eval() throws UndefinedValueException {
        switch (op) {
            case '+':
                return left.eval() + right.eval();
            case '-':
                return left.eval() - right.eval();

            default:
                throw new RuntimeException("unknown op");
        }
    }

}
