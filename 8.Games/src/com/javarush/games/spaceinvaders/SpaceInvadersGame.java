package com.javarush.games.spaceinvaders;

import com.javarush.engine.cell.*;
import com.javarush.games.spaceinvaders.gameobjects.Bullet;
import com.javarush.games.spaceinvaders.gameobjects.EnemyFleet;
import com.javarush.games.spaceinvaders.gameobjects.PlayerShip;
import com.javarush.games.spaceinvaders.gameobjects.Star;

import java.util.ArrayList;
import java.util.List;


public class SpaceInvadersGame extends Game {
    public static final int WIDTH = 64;
    public static final int HEIGHT = 64;
    private List<Star> stars;
    private EnemyFleet enemyFleet;
    public static final int COMPLEXITY = 5;
    private List<Bullet> enemyBullets;
    private PlayerShip playerShip;
    private boolean isGameStopped;
    private int animationsCount;
    private List<Bullet> playerBullets;
    private static final int PLAYER_BULLETS_MAX = 2;
    private int score;

    @Override
    public void initialize() {
        super.initialize();
        setScreenSize(WIDTH, HEIGHT);
        createGame();
    }

    private void createGame() {
        createStars();
        enemyFleet = new EnemyFleet();
        enemyBullets = new ArrayList<Bullet>();
        playerShip = new PlayerShip();
        isGameStopped = false;
        animationsCount = 0;
        playerBullets = new ArrayList<Bullet>();
        drawScene();
        setTurnTimer(40);
        score = 0;
    }

    private void drawScene() {
        drawField();
        for (Bullet bullets : playerBullets) {
            bullets.draw(this);
        }
        playerShip.draw(this);
        for (Bullet enemyBullets : enemyBullets) {
            enemyBullets.draw(this);
        }
        enemyFleet.draw(this);
    }

    private void drawField() {
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                setCellValueEx(i, j, Color.BLACK, "");
            }
        }
        for (Star stars : stars) {
            stars.draw(this);
        }
    }

    private void createStars() {
        stars = new ArrayList<Star>();
        for (int i = 1; i <= 8; i++) {
            stars.add(new Star(getRandomNumber(WIDTH), getRandomNumber(HEIGHT)));
        }
    }

    @Override
    public void onTurn(int step) {
        moveSpaceObjects();
        check();
        Bullet bullet = enemyFleet.fire(this);
        if (bullet != null) {
            enemyBullets.add(bullet);
        }
        setScore(score);
        drawScene();
    }

    private void moveSpaceObjects() {
        enemyFleet.move();
        for (Bullet enemyBullets : enemyBullets) {
            enemyBullets.move();
        }
        playerShip.move();
        for (Bullet bullets : playerBullets) {
            bullets.move();
        }
    }

    private void removeDeadBullets() {
        for (int i = enemyBullets.size() - 1; i >= 0; i--) {
            if (!enemyBullets.get(i).isAlive || enemyBullets.get(i).y >= HEIGHT - 1) {
                enemyBullets.remove(i);
            }
        }
        for (int i = playerBullets.size() - 1; i >= 0; i--) {
            if (!playerBullets.get(i).isAlive || playerBullets.get(i).y
                    + playerBullets.get(i).height < 0) {
                playerBullets.remove(i);
            }
        }

    }

    private void check() {
        playerShip.verifyHit(enemyBullets);
        score += enemyFleet.verifyHit(playerBullets);
        enemyFleet.verifyHit(playerBullets);
        enemyFleet.deleteHiddenShips();
        removeDeadBullets();
        if (!playerShip.isAlive) {
            stopGameWithDelay();
        }
        if (enemyFleet.getBottomBorder() >= playerShip.y) {
            playerShip.kill();
        }
        if (enemyFleet.getShipsCount() == 0) {
            playerShip.win();
            stopGameWithDelay();
        }
    }

    private void stopGame(boolean isWin) {
        isGameStopped = true;
        stopTurnTimer();
        if (isWin) {
            showMessageDialog(Color.BLACK, "YOU DEFENDED OUR GALAXY!!!" + "\n"
                                         + "WELL DONE!!!"+ "\n" +
                                             "GAME OVER!!!"+ "\n" +
                                             "coded by Valentin" + "\n" +
                                           "thank You for playing :)",
                    Color.GREEN, 20);
        }
        if (!isWin) {
            showMessageDialog(Color.BLACK, "INVADERS CONQUERED OUR GALAXY!!!" + "\n" +
                    "                       SHAME ON YOU" + "\n" +
                    "                        GAME OVER!!!", Color.RED, 20);
        }
    }

    private void stopGameWithDelay() {
        animationsCount += 1;
        if (animationsCount >= 10) {
            stopGame(playerShip.isAlive);
        }
    }

    @Override
    public void onKeyPress(Key key) {

        if (key == Key.SPACE && isGameStopped) {
            createGame();
        }
        if (key == Key.LEFT) {
            playerShip.setDirection(Direction.LEFT);
        }
        if (key == Key.RIGHT) {
            playerShip.setDirection(Direction.RIGHT);
        }
        if (key == Key.SPACE) {
            Bullet bullet = playerShip.fire();
            if (bullet != null && playerBullets.size() < PLAYER_BULLETS_MAX) {
                playerBullets.add(bullet);
            }
        }
    }

    @Override
    public void onKeyReleased(Key key) {
        super.onKeyReleased(key);
        if (playerShip.getDirection() == Direction.LEFT && key == Key.LEFT) {
            playerShip.setDirection(Direction.UP);
        }
        if (playerShip.getDirection() == Direction.RIGHT && key == Key.RIGHT) {
            playerShip.setDirection(Direction.UP);
        }
    }

    @Override
    public void setCellValueEx(int x, int y, Color cellColor, String value) {
        if (x < 0 || x >= WIDTH || y < 0 || y >= HEIGHT) {
            return;
        }
        super.setCellValueEx(x, y, cellColor, value);
    }

}
