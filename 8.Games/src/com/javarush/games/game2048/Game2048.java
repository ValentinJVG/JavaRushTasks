package com.javarush.games.game2048;

import com.javarush.engine.cell.*;

public class Game2048 extends Game {
    private static final int SIDE = 4;
    private int[][] gameField = new int[SIDE][SIDE];
    private boolean isGameStopped = false;
    private int score;

    private void createGame() {
        gameField = new int[SIDE][SIDE];
        createNewNumber();
        createNewNumber();
    }

    private void drawScene() {
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField.length; j++) {
                int value = gameField[i][j];
                setCellColoredNumber(j, i, value);
            }
        }
    }

    private void createNewNumber() {
        if (getMaxTileValue() == 2048) {
            win();
        }
        int x, y, randomNumber;
        do {
            x = getRandomNumber(SIDE);
            y = getRandomNumber(SIDE);
            randomNumber = getRandomNumber(10);
        }
        while (gameField[y][x] != 0);
        {
            if (randomNumber == 9) {
                gameField[y][x] = 4;
            } else {
                gameField[y][x] = 2;
            }
        }
    }

    @Override
    public void initialize() {
        super.initialize();
        setScreenSize(SIDE, SIDE);
        createGame();
        drawScene();
    }

    private Color getColorByValue(int value) {
        Color color = null;

        if (value == 2) {
            color = Color.ORANGE;
        }
        if (value == 4) {
            color = Color.GREEN;
        }
        if (value == 8) {
            color = Color.LIGHTPINK;
        }
        if (value == 16) {
            color = Color.CHOCOLATE;
        }
        if (value == 32) {
            color = Color.ALICEBLUE;
        }
        if (value == 64) {
            color = Color.ANTIQUEWHITE;
        }
        if (value == 128) {
            color = Color.AQUA;
        }
        if (value == 256) {
            color = Color.BISQUE;
        }
        if (value == 512) {
            color = Color.CADETBLUE;
        }
        if (value == 1024) {
            color = Color.GOLD;
        }
        if (value == 2048) {
            color = Color.NAVY;
        }
        if (value == 0) {
            color = Color.WHITE;
        }
        return color;
    }

    private void setCellColoredNumber(int x, int y, int value) {
        Color color = getColorByValue(gameField[y][x]);
        String value1 = String.valueOf(value);
        if (value == 0) {
            setCellValueEx(x, y, color, "");
        } else {
            setCellValueEx(x, y, color, value1);
        }
    }

    private boolean compressRow(int[] row) {
        boolean isMoved = false;
        for (int i = 0; i < row.length - 1; i++) {
            if (row[i] == 0 && row[i] != row[i + 1]) {
                isMoved = true;
                row[i] = row[i + 1];
                row[i + 1] = 0;
            }
        }
        if (isMoved) {
            compressRow(row);
        }
        return isMoved;
    }

    private boolean mergeRow(int[] row) {
        boolean isJoined = false;
        for (int i = 0; i < row.length - 1; i++) {
            if (row[i] == row[i + 1] && row[i] != 0) {
                row[i] *= 2;
                row[i + 1] = 0;
                score += row[i] + row[i + 1];
                setScore(score);
                isJoined = true;
            }
        }
        return isJoined;
    }

    @Override
    public void onKeyPress(Key key) {
        if (!isGameStopped) {
            if (!canUserMove()) {
                gameOver();
                return;
            }
            if (key == Key.LEFT) {
                moveLeft();
                drawScene();
            } else if (key == Key.RIGHT) {
                moveRight();
                drawScene();
            } else if (key == Key.UP) {
                moveUp();
                drawScene();
            } else if (key == Key.DOWN) {
                moveDown();
                drawScene();
            }
        } else {
            if (key == Key.SPACE) {
                isGameStopped = false;
                createGame();
                drawScene();
                score = 0;
                setScore(score);
            }
        }

    }

    private void moveLeft() {
        boolean isNewTileCreated = false;
        for (int i = 0; i < SIDE; i++) {
            if (compressRow(gameField[i])) isNewTileCreated = true;
            if (mergeRow(gameField[i])) isNewTileCreated = true;
            if (compressRow(gameField[i])) isNewTileCreated = true;
        }
        if (isNewTileCreated) createNewNumber();
    }

    private void moveRight() {
        rotateClockwise();
        rotateClockwise();
        moveLeft();
        rotateClockwise();
        rotateClockwise();
    }

    private void moveUp() {
        rotateClockwise();
        rotateClockwise();
        rotateClockwise();
        moveLeft();
        rotateClockwise();
    }

    private void moveDown() {
        rotateClockwise();
        moveLeft();
        rotateClockwise();
        rotateClockwise();
        rotateClockwise();
    }

    private void rotateClockwise() {
        // first rotation
        // with respect to main diagonal
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < i; j++) {
                int temp = gameField[i][j];
                gameField[i][j] = gameField[j][i];
                gameField[j][i] = temp;
            }
        }
        // Second rotation
        // with respect to middle column
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE / 2; j++) {
                int temp = gameField[i][j];
                gameField[i][j] = gameField[i][SIDE - j - 1];
                gameField[i][SIDE - j - 1] = temp;
            }
        }
    }

    private int getMaxTileValue() {
        int max = Integer.MIN_VALUE;
        for (int[] ints : gameField) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }

    private void win() {
        isGameStopped = true;
        showMessageDialog(Color.GREEN, "You made it!!!", Color.WHITE, 15);
    }

    private boolean canUserMove() {
        boolean isEmptyOrCanJoin = false;
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++) {
                if (gameField[i][j] == 0) {
                    isEmptyOrCanJoin = true;
                    break;
                }
                if (i < SIDE - 1 && gameField[j][i + 1] == gameField[j][i]) { // up
                    isEmptyOrCanJoin = true;
                    break;
                }
                if (j >= 1 && gameField[j - 1][i] == gameField[j][i]) { // right
                    isEmptyOrCanJoin = true;
                    break;
                }
                if (j < SIDE - 1 && gameField[j + 1][i] == gameField[j][i]) { // left
                    isEmptyOrCanJoin = true;
                    break;
                }
                if (i >= 1 && gameField[j][i - 1] == gameField[j][i]) {  // down
                    isEmptyOrCanJoin = true;
                    break;
                }
            }
        }
        return isEmptyOrCanJoin;
    }

    private void gameOver() {
        isGameStopped = true;
        showMessageDialog(Color.GREEN, "LOOSER!!! To restart, press SPACE", Color.WHEAT, 20);
    }
}

