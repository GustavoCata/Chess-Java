package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

	public King(Board board, Color color) {
		super(board, color);
	}
	
	@Override
    public String toString(){
		return "K";
	}
	
	
	private boolean canMove(Position position ) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p == null || p.getColor() != getColor ();
		}

	@Override
	public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        
        Position p = new Position(0, 0);
        
        
        //cima
        p.setValues(p.getRow() - 1, position.getColumn());
        if (getBoard().positionExists(p) && canMove(p)) {
        	mat[p.getRow()][p.getColumn()] = true;
        }
        
        //baixo
        p.setValues(p.getRow() + 1, position.getColumn());
        if (getBoard().positionExists(p) && canMove(p)) {
        	mat[p.getRow()][p.getColumn()] = true;
        }
        
        //esquerda
        p.setValues(p.getRow(), position.getColumn() + 1);
        if (getBoard().positionExists(p) && canMove(p)) {
        	mat[p.getRow()][p.getColumn()] = true;
        }
        
        //direita
        p.setValues(p.getRow(), position.getColumn() - 1);
        if (getBoard().positionExists(p) && canMove(p)) {
        	mat[p.getRow()][p.getColumn()] = true;
        }
        
        //no
        p.setValues(p.getRow() - 1, position.getColumn() - 1);
        if (getBoard().positionExists(p) && canMove(p)) {
        	mat[p.getRow()][p.getColumn()] = true;
        }
        
        //nd
        p.setValues(p.getRow() - 1, position.getColumn() + 1);
        if (getBoard().positionExists(p) && canMove(p)) {
        	mat[p.getRow()][p.getColumn()] = true;
        }
        
        //nd
        p.setValues(p.getRow() - 1, position.getColumn() + 1);
        if (getBoard().positionExists(p) && canMove(p)) {
        	mat[p.getRow()][p.getColumn()] = true;
        }
        
        //so
        p.setValues(p.getRow() + 1, position.getColumn() - 1);
        if (getBoard().positionExists(p) && canMove(p)) {
        	mat[p.getRow()][p.getColumn()] = true;
        }
        
        //sd
        p.setValues(p.getRow() + 1, position.getColumn() + 1);
        if (getBoard().positionExists(p) && canMove(p)) {
        	mat[p.getRow()][p.getColumn()] = true;
        }
        
        
        
        
        
        
        
		return mat;
	}
}