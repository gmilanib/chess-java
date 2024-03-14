package chess;

import boardGame.Board;
import boardGame.Piece;

public class ChessPiece extends Piece {
	
	private color color;

	public ChessPiece(Board board, chess.color color) {
		super(board);
		this.color = color;
	}

	public color getColor() {
		return color;
	}

	

}
