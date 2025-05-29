import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class SnakeGame extends JPanel implements ActionListener, KeyListener {
    private final int TILE_SIZE = 25;
    private final int WIDTH = 600;
    private final int HEIGHT = 600;

    private ArrayList<Point> snake;
    private Point food;
    private char direction = 'R';
    private boolean gameOver = false;
    private Timer timer;
    private int score = 0;

    private JButton restartButton;

    public SnakeGame() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.DARK_GRAY);
        setFocusable(true);
        addKeyListener(this);

        setLayout(null);
        setupRestartButton();

        initGame();
    }

    private void setupRestartButton() {
        restartButton = new JButton("Restart");
        restartButton.setBounds(WIDTH / 2 - 60, HEIGHT / 2 + 30, 120, 40);
        restartButton.setFont(new Font("Arial", Font.BOLD, 18));
        restartButton.setVisible(false);
        restartButton.addActionListener(e -> resetGame());
        add(restartButton);
    }

    private void initGame() {
        snake = new ArrayList<>();
        snake.add(new Point(5, 5));

        direction = 'R';
        score = 0;
        gameOver = false;

        spawnFood();

        if (timer != null) timer.stop();
        timer = new Timer(200, this);
        timer.start();

        restartButton.setVisible(false);
    }

    private void spawnFood() {
        Random rand = new Random();
        while (true) {
            food = new Point(rand.nextInt(WIDTH / TILE_SIZE), rand.nextInt(HEIGHT / TILE_SIZE));
            if (!snake.contains(food)) break;
        }
    }

    private void resetGame() {
        initGame();
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw food
        g.setColor(Color.RED);
        g.fillOval(food.x * TILE_SIZE, food.y * TILE_SIZE, TILE_SIZE, TILE_SIZE);

        // Draw snake with gradient style
        for (int i = 0; i < snake.size(); i++) {
            Point p = snake.get(i);
            if (i == 0) g.setColor(new Color(0, 255, 0)); // head
            else g.setColor(new Color(0, 180, 0));
            g.fillRoundRect(p.x * TILE_SIZE, p.y * TILE_SIZE, TILE_SIZE, TILE_SIZE, 10, 10);
        }

        // Draw grid (optional)
        g.setColor(Color.GRAY);
        for (int x = 0; x < WIDTH; x += TILE_SIZE)
            g.drawLine(x, 0, x, HEIGHT);
        for (int y = 0; y < HEIGHT; y += TILE_SIZE)
            g.drawLine(0, y, WIDTH, y);

        // Score
        g.setColor(Color.WHITE);
        g.setFont(new Font("Courier New", Font.BOLD, 20));
        g.drawString("Score: " + score, 10, 25);

        // Game Over
        if (gameOver) {
            g.setColor(Color.WHITE);
            g.setFont(new Font("Arial", Font.BOLD, 40));
            g.drawString("GAME OVER", WIDTH / 2 - 140, HEIGHT / 2 - 20);
            restartButton.setVisible(true);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!gameOver) {
            move();
            checkCollision();
            repaint();
        }
    }

    private void move() {
        Point head = new Point(snake.get(0));
        switch (direction) {
            case 'U': head.y -= 1; break;
            case 'D': head.y += 1; break;
            case 'L': head.x -= 1; break;
            case 'R': head.x += 1; break;
        }

        if (head.equals(food)) {
            snake.add(0, head);
            score += 10;
            spawnFood();
        } else {
            snake.add(0, head);
            snake.remove(snake.size() - 1);
        }
    }

    private void checkCollision() {
        Point head = snake.get(0);
        if (head.x < 0 || head.y < 0 || head.x >= WIDTH / TILE_SIZE || head.y >= HEIGHT / TILE_SIZE) {
            gameOver = true;
        }

        for (int i = 1; i < snake.size(); i++) {
            if (head.equals(snake.get(i))) {
                gameOver = true;
                break;
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (!gameOver) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_UP:    if (direction != 'D') direction = 'U'; break;
                case KeyEvent.VK_DOWN:  if (direction != 'U') direction = 'D'; break;
                case KeyEvent.VK_LEFT:  if (direction != 'R') direction = 'L'; break;
                case KeyEvent.VK_RIGHT: if (direction != 'L') direction = 'R'; break;
            }
        }
    }

    @Override public void keyReleased(KeyEvent e) {}
    @Override public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake Game");
        SnakeGame gamePanel = new SnakeGame();
        frame.add(gamePanel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

