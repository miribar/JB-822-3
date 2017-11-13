package TicTacToe;

import java.util.Scanner;

class TicTacToeApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte numOfTurns = 0;

        System.out.println("*** Welcome to the grand TicTacToe challenge! ***");

        System.out.println("Please enter the name for 'X' player: ");
        Player playerX = new Player('X', input.next());
        System.out.println("Please enter the name for 'O' player: ");
        Player playerO = new Player('O', input.next());

        TicTacToe game = new TicTacToe();
        Player nextPlayer = playerX;
        playerX.setNextPlayer(true);

        while (numOfTurns < 9) {
            playTurn(input, nextPlayer, game);
            numOfTurns++;
            if (game.checkIfGameWon()) {
                System.out.println("The winner is " + nextPlayer.getPlayerName() + "! Congrats!");
                System.exit(0);
            }
            nextPlayer = game.switchPlayers(playerX, playerO);
        }
        System.out.println("Nobody wins this time, try again!");
    }

    private static void playTurn(Scanner input, Player player, TicTacToe game) {
        byte row;
        byte column;

        System.out.print(player.getPlayerName() + ", enter place to tick [row: 0-2, <enter>, col: 0-2]: ");
        do {
            row = checkInputValidity(input);
            column = checkInputValidity(input);
        }
        while (!game.tickGameBoard(row, column, player.getPlayerMark()));
        System.out.println(game);
    }

    private static byte checkInputValidity(Scanner input) {
        byte valueEntered = input.nextByte();

        while (valueEntered < 0 || valueEntered > 2) {
            System.out.println("Please enter a valid value");
            valueEntered = input.nextByte();
        }
        return valueEntered;
    }
}
