package chess.pieces;

import boardGame.Board;
import chess.ChessPiece;

public class King extends ChessPiece {

	public King(Board board, chess.color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "K";
	}

}
