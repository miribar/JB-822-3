package src.ameedf.jb8223.assignments.TicTacToe;

public class TicTacToe {
    private final char[][] gameBoard = new char[3][3];

    TicTacToe() {
        for (int i=0 ; i<3 ; i++) {
            for (int j=0 ; j<3 ; j++) {
                gameBoard[i][j] = ' ';
            }
        }
    }

    boolean tickGameBoard(byte row, byte column, char playerMark) {
        if (this.gameBoard[row][column] == ' ') {
            gameBoard[row][column] = playerMark;
            return true;
        }
            System.out.print("This cell has already been selected, please select another cell: ");
            return false;
    }

    public String toString() {
        String border = "\n+---+---+---+";
        String lineFormat = "\n| %C | %C | %C |";
        String result = border;
        for (char[] row : gameBoard) {
            result += String.format(lineFormat, row[0], row[1], row[2]);
        }
        result += border;
        return result;
    }

    Player switchPlayers(Player playerX, Player playerO) {
        if (!playerX.getNextPlayer()) {
            playerX.setNextPlayer(true);
            playerO.setNextPlayer(false);
            return playerX;
        }
        else {
            playerO.setNextPlayer(true);
            playerX.setNextPlayer(false);
            return playerO;
        }
    }

    boolean checkIfGameWon() {
        return (checkRows() || checkColumns() || checkDiagonals());
    }

    private boolean checkRows() {
        for (int i=0 ; i<3 ; i++) {
            if (checkCellValue(gameBoard[i][0], gameBoard[i][1], gameBoard[i][2]))
                return true;
        }
        return false;
    }

    private boolean checkColumns() {
        for (int i=0 ; i<3 ; i++) {
            if (checkCellValue(gameBoard[0][i], gameBoard[1][i], gameBoard[2][i]))
                return true;
        }
        return false;
    }

    private boolean checkDiagonals() {
        return checkCellValue(gameBoard[0][0], gameBoard[1][1], gameBoard[2][2]) ||
                checkCellValue(gameBoard[0][2], gameBoard[1][1], gameBoard[2][0]);
    }

    private boolean checkCellValue(char cell1, char cell2, char cell3) {
        return ((cell1 != ' ') && (cell1 == cell2) && (cell2 == cell3));
    }
}
