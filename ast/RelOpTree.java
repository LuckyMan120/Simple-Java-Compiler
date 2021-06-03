package ast;

import lexer.Symbol;
import lexer.Token;
import visitor.*;

public class RelOpTree extends AST {
    private Symbol symbol;
    private int line;
    
    public int getLine() {
    	return line;
    }
    
    
/**
 *  @param tok contains the Symbol which indicates the specific relational operator
*/
    public RelOpTree(Token tok) {
        this.symbol = tok.getSymbol();
        this.line =tok.getLineno();
    }

    public Object accept(ASTVisitor v) {
        return v.visitRelOpTree(this);
    }

    public Symbol getSymbol() {
        return symbol;
    }
    
    public String getType() {
    	return "RelOp";
    }

}

