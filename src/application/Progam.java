package application;

import chess.ChessMatch;

public class Progam {
	public static void main (String[]args) {
		
		char b = 'a';
		
		if(b < 'a') {
			System.out.print("Alo galera");
		}
		
		ChessMatch chessMatch = new ChessMatch();
		
		UI.printBoard(chessMatch.getPieces());
		
	}
}
 