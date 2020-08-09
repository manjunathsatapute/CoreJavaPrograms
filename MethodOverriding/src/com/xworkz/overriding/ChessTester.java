package com.xworkz.overriding;

public class ChessTester {

	public static void main(String[] args) {

		Chess chess = new Chess();
		
		chess. name = "Chess";
		chess.numOfPlayers = 2;
		
		chess.playing();
		chess.tie();
		
		
		
	}

}
