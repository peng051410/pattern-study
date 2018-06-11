package cn.imcompany.abs.game;

/**
 * Created by tomyli on 2018/6/7.
 * Github: https://github.com/peng051410
 */
public class Game {

    private Operation operation;
    private GameInerface gameInerface;

    public Game(Operation operation, GameInerface gameInerface) {
        this.operation = operation;
        this.gameInerface = gameInerface;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public GameInerface getGameInerface() {
        return gameInerface;
    }

    public void setGameInerface(GameInerface gameInerface) {
        this.gameInerface = gameInerface;
    }

    public void startGame() {
        operation.showName();
        gameInerface.showName();
    }

}
