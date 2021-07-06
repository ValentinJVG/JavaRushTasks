package com.javarush.games.spaceinvaders.gameobjects;

import com.javarush.engine.cell.*;
import com.javarush.games.spaceinvaders.Direction;
import com.javarush.games.spaceinvaders.ShapeMatrix;
import com.javarush.games.spaceinvaders.SpaceInvadersGame;

import java.util.ArrayList;
import java.util.List;

public class EnemyFleet {
    private static final int ROWS_COUNT = 3;
    private static final int COLUMNS_COUNT = 10;
    private static final int STEP = ShapeMatrix.ENEMY.length + 1;
    private List<EnemyShip> ships;
    private Direction direction = Direction.RIGHT;

    private void createShips() {
        ships = new ArrayList<EnemyShip>();
        for (int i = 0; i < COLUMNS_COUNT; i++) {
            for (int j = 0; j < ROWS_COUNT; j++) {
                ships.add(new EnemyShip(i * STEP, j * STEP + 12));
            }
        }
        ships.add(new Boss(STEP * COLUMNS_COUNT / 2 - ShapeMatrix.BOSS_ANIMATION_FIRST.length / 2 - 1,
                5));
    }

    public EnemyFleet() {
        createShips();
    }

    public void draw(Game game) {
        for (Ship ships : ships) {
            ships.draw(game);
        }
    }

    private double getLeftBorder() {
        double minimumX = Integer.MAX_VALUE;
        for (Ship ships : ships) {
            if (minimumX > ships.x) {
                minimumX = ships.x;
            }
        }
        return minimumX;
    }

    private double getRightBorder() {
        double maximumX = 0;
        for (Ship ships : ships) {
            if (maximumX < ships.x + ships.width) {
                maximumX = ships.x + ships.width;
            }
        }
        return maximumX;
    }

    private double getSpeed() {
        return Math.min(2.0, 3.0 / ships.size());
    }

    public void move() {
        boolean flag = false;
        if (ships.size() == 0) {
            return;
        }
        if (direction == Direction.LEFT && getLeftBorder() < 0) {
            direction = Direction.RIGHT;
            flag = true;
        }
        if (direction == Direction.RIGHT && getRightBorder() > SpaceInvadersGame.WIDTH) {
            direction = Direction.LEFT;
            flag = true;
        }
        getSpeed();
        if (flag) {
            for (EnemyShip ship : ships) {
                ship.move(Direction.DOWN, getSpeed());
            }
        } else {
            for (EnemyShip ship : ships) {
                ship.move(direction, getSpeed());
            }
        }
    }

    public Bullet fire(Game game) {
        if (ships.size() == 0) {
            return null;
        }
        if (game.getRandomNumber(100 / SpaceInvadersGame.COMPLEXITY) > 0) {
            return null;
        }
        return ships.get(game.getRandomNumber(ships.size())).fire();
    }

    public int verifyHit(List<Bullet> bullets) {
        int totalScore = 0;
        if (bullets.size() == 0) {
            return 0;
        }
        for (Bullet bullet : bullets) {
            for (EnemyShip enemyShip : ships) {
                if (enemyShip.isCollision(bullet) && enemyShip.isAlive && bullet.isAlive) {
                    enemyShip.kill();
                    bullet.kill();
                    totalScore += enemyShip.score;
                }
            }
        }
        return totalScore;
    }

    public void deleteHiddenShips() {
        ships.removeIf(enemyShip -> !enemyShip.isVisible());
    }

    public double getBottomBorder() {
        double maxValue = Double.MIN_VALUE;
        for (EnemyShip enemyShip : ships) {
            if (maxValue < (enemyShip.y + enemyShip.height)) {
                maxValue = enemyShip.y + enemyShip.height;
            }
        }
        return maxValue;
    }

    public  int getShipsCount() {
        return ships.size();
    }

}
