package com.javarush.games.snake;

import com.javarush.engine.cell.*;

import java.util.ArrayList;
import java.util.List;

public class Snake extends GameObject {

    private List<GameObject> snakeParts = new ArrayList<>();
    private static final String HEAD_SIGN = "\uD83D\uDC7E";
    private static final String BODY_SIGN = "\u26AB";
    public boolean isAlive = true;
    private Direction direction = Direction.LEFT;

    public void setDirection(Direction direction) {
        if ((direction == Direction.RIGHT
                || snakeParts.get(0).x == snakeParts.get(1).x)
                && this.direction == Direction.LEFT)
            return;
        if ((direction == Direction.LEFT
                || snakeParts.get(0).x == snakeParts.get(1).x)
                && this.direction == Direction.RIGHT)
            return;
        if ((direction == Direction.DOWN
                || snakeParts.get(0).y == snakeParts.get(1).y)
                && this.direction == Direction.UP)
            return;
        if ((direction == Direction.UP
                || snakeParts.get(0).y == snakeParts.get(1).y)
                && this.direction == Direction.DOWN)
            return;
        this.direction = direction;


    }

    public Snake(int x, int y) {
        super(x, y);
        GameObject first = new GameObject(x, y);
        GameObject second = new GameObject(x + 1, y);
        GameObject third = new GameObject(x + 2, y);

        snakeParts.add(first);
        snakeParts.add(second);
        snakeParts.add(third);
    }

    public void draw(Game game) {
        for (int i = 0; i < snakeParts.size(); i++) {
            x = snakeParts.get(i).x;
            y = snakeParts.get(i).y;
            if (isAlive) {
                if (i == 0) {
                    game.setCellValueEx(x, y, Color.NONE, HEAD_SIGN, Color.BLACK, 75);
                } else {
                    game.setCellValueEx(x, y, Color.NONE, BODY_SIGN, Color.BLACK, 75);
                }
            } else {
                if (i == 0) {
                    game.setCellValueEx(x, y, Color.NONE, HEAD_SIGN, Color.RED, 75);
                } else {
                    game.setCellValueEx(x, y, Color.NONE, BODY_SIGN, Color.RED, 75);
                }
            }
        }
    }

    public void move(Apple apple) {
        GameObject newHead = createNewHead();
        if (newHead.x < 0
                || newHead.y < 0
                || newHead.x >= SnakeGame.HEIGHT
                || newHead.y >= SnakeGame.HEIGHT) {
            isAlive = false;
            return;
        } else {
            if (checkCollision(newHead)) {
                isAlive = false;
                return;
            }
            if (newHead.x == apple.x && newHead.y == apple.y) {
                apple.isAlive = false;
                snakeParts.add(0, newHead);
            } else {
                snakeParts.add(0, newHead);
                removeTail();
            }
        }
    }

    public GameObject createNewHead() {
        GameObject snake = null;
        if (direction == Direction.LEFT) {
            snake = new GameObject(snakeParts.get(0).x - 1, snakeParts.get(0).y);
        }
        if (direction == Direction.RIGHT) {
            snake = new GameObject(snakeParts.get(0).x + 1, snakeParts.get(0).y);
        }
        if (direction == Direction.DOWN) {
            snake = new GameObject(snakeParts.get(0).x, snakeParts.get(0).y + 1);
        }
        if (direction == Direction.UP) {
            snake = new GameObject(snakeParts.get(0).x, snakeParts.get(0).y - 1);
        }
        return snake;
    }

    public void removeTail() {
        snakeParts.remove(snakeParts.size() - 1);
    }

    public boolean checkCollision(GameObject gameObject) {
        for (GameObject obj : snakeParts)
            if (gameObject.x == obj.x && gameObject.y == obj.y) {
                isAlive = false;
                return true;
            }
        return false;
    }

    public int getLength() {
        return snakeParts.size();
    }
}
