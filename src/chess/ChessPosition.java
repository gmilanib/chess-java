package chess;

import boardGame.Position;

public class ChessPosition {
	private char column;
	private int row;
	
	
	public ChessPosition(char columns, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException ("ERROR INSTANTIANTING CHESSPOSITION. VALID VALIES ARE FROM A1 TO H8");	
		}
		this.column = columns;
		this.row = row;
	}


	public char getColumn() {
		return column;
	}


	public int getRow() {
		return row;
	}
	
	
	protected Position toPosition () {
		return new Position (8 - row, column - 'a');
	}
	
	protected ChessPosition fromPosition (Position position) {
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
	}
	
	@Override
	public String toString() {
		return "" + column + row;
	}
	
}
