package TicTacToe;

class Player {

    private final char playerMark;
    private final String playerName;
    private boolean isNextPlayer;

    Player(char playerMark, String playerName) {
        this.playerMark = playerMark;
        this.playerName = playerName;
    }

    char getPlayerMark() {
        return playerMark;
    }

    String getPlayerName() {
        return playerName;
    }

    boolean getNextPlayer() {
        return isNextPlayer;
    }

    void setNextPlayer(boolean nextPlayer) {
        this.isNextPlayer = nextPlayer;
    }
}
