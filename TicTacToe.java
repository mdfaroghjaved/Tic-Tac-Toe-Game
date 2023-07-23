import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe {
    private JPanel TicTacToe;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btnExit;
    private JButton btnReset;
    private JLabel lblPlayer0;
    private JLabel lblPlayerX;
    private JTextField countO;
    private JTextField countX;

    private int xCount = 0;
    private int oCount = 0;
    private String startGame = "X";
    private int b1 = 10;
    private int b2 = 10;
    private int b3 = 10;
    private int b4 = 10;
    private int b5 = 10;
    private int b6 = 10;
    private int b7 = 10;
    private int b8 = 10;
    private int b9 = 10;
    private int i = 0;


    public TicTacToe() {
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn1.setText(null);
                btn2.setText(null);
                btn3.setText(null);
                btn4.setText(null);
                btn5.setText(null);
                btn6.setText(null);
                btn7.setText(null);
                btn8.setText(null);
                btn9.setText(null);
                b1 = 10;
                b2 = 10;
                b3 = 10;
                b4 = 10;
                b5 = 10;
                b6 = 10;
                b7 = 10;
                b8 = 10;
                b9 = 10;
                i = 0;
            }
        });
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("EXIT");
                if(JOptionPane.showConfirmDialog(frame, "Confirm You Want To Exit ?", "Tic Tac Toe", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
                    System.exit(0);
                }
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn1.setText(startGame);
                if(startGame.equalsIgnoreCase("X")){
                    btn1.setForeground(Color.RED);
                    b1 = 1;
                    i++;
                }
                else{
                    btn1.setForeground(Color.BLUE);
                    b1 = 0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn2.setText(startGame);
                if(startGame.equalsIgnoreCase("X")){
                    btn2.setForeground(Color.RED);
                    b2 = 1;
                    i++;
                }
                else{
                    btn2.setForeground(Color.BLUE);
                    b2 = 0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn3.setText(startGame);
                if(startGame.equalsIgnoreCase("X")){
                    btn3.setForeground(Color.RED);
                    b3 = 1;
                    i++;
                }
                else{
                    btn3.setForeground(Color.BLUE);
                    b3 = 0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn4.setText(startGame);
                if(startGame.equalsIgnoreCase("X")){
                    btn4.setForeground(Color.RED);
                    b4 = 1;
                    i++;
                }
                else{
                    btn4.setForeground(Color.BLUE);
                    b4 = 0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn5.setText(startGame);
                if(startGame.equalsIgnoreCase("X")){
                    btn5.setForeground(Color.RED);
                    b5 = 1;
                    i++;
                }
                else{
                    btn5.setForeground(Color.BLUE);
                    b5 = 0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn6.setText(startGame);
                if(startGame.equalsIgnoreCase("X")){
                    btn6.setForeground(Color.RED);
                    b6 = 1;
                    i++;
                }
                else{
                    btn6.setForeground(Color.BLUE);
                    b6 = 0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn7.setText(startGame);
                if(startGame.equalsIgnoreCase("X")){
                    btn7.setForeground(Color.RED);
                    b7 = 1;
                    i++;
                }
                else{
                    btn7.setForeground(Color.BLUE);
                    b7 = 0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn8.setText(startGame);
                if(startGame.equalsIgnoreCase("X")){
                    btn8.setForeground(Color.RED);
                    b8 = 1;
                    i++;
                }
                else{
                    btn8.setForeground(Color.BLUE);
                    b8 = 0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn9.setText(startGame);
                if(startGame.equalsIgnoreCase("X")){
                    btn9.setForeground(Color.RED);
                    b9 = 1;
                    i++;
                }
                else{
                    btn9.setForeground(Color.BLUE);
                    b9 = 0;
                    i++;
                }
                choosePlayer();
                winningGame();
            }
        });
    }

    private void choosePlayer(){
        if(startGame.equalsIgnoreCase("X")){
            startGame = "O";
        }
        else{
            startGame = "X";
        }
    }

    public void winningGame(){
        JFrame frame = new JFrame("WIN");
        // For Player X
        if(b1 == 1 && b2 == 1 && b3 == 1){
            JOptionPane.showMessageDialog(frame,"Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            countX.setText(String.valueOf("    " +xCount));
        }

        else if(b4 == 1 && b5 == 1 && b6 == 1){
            JOptionPane.showMessageDialog(frame,"Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            countX.setText(String.valueOf("    " +xCount));
        }

        else if(b7 == 1 && b8 == 1 && b9 == 1){
            JOptionPane.showMessageDialog(frame,"Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            countX.setText(String.valueOf("    " +xCount));
        }

        else if(b1 == 1 && b4 == 1 && b7 == 1){
            JOptionPane.showMessageDialog(frame,"Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            countX.setText(String.valueOf("    " +xCount));
        }

        else if(b2 == 1 && b5 == 1 && b8 == 1){
            JOptionPane.showMessageDialog(frame,"Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            countX.setText(String.valueOf("    " +xCount));
        }

        else if(b3 == 1 && b6 == 1 && b9 == 1){
            JOptionPane.showMessageDialog(frame,"Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            countX.setText(String.valueOf("    " +xCount));
        }

        else if(b1 == 1 && b5 == 1 && b9 == 1){
            JOptionPane.showMessageDialog(frame,"Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            countX.setText(String.valueOf("    " +xCount));
        }

        else if(b3 == 1 && b5 == 1 && b7 == 1){
            JOptionPane.showMessageDialog(frame,"Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            countX.setText(String.valueOf("    " +xCount));
        }

        // For Player O
        else if(b1 == 0 && b2 == 0 && b3 == 0){
            JOptionPane.showMessageDialog(frame,"Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            countO.setText(String.valueOf("    " +oCount));
        }

        else if(b4 == 0 && b5 == 0 && b6 == 0){
            JOptionPane.showMessageDialog(frame,"Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            countO.setText(String.valueOf("    " +oCount));
        }

        else if(b7 == 0 && b8 == 0 && b9 == 0){
            JOptionPane.showMessageDialog(frame,"Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            countO.setText(String.valueOf("    " +oCount));
        }

        else if(b1 == 0 && b4 == 0 && b7 == 0){
            JOptionPane.showMessageDialog(frame,"Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            countO.setText(String.valueOf("    " +oCount));
        }

        else if(b2 == 0 && b5 == 0 && b8 == 0){
            JOptionPane.showMessageDialog(frame,"Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            countO.setText(String.valueOf("    " +oCount));
        }

        else if(b3 == 0 && b6 == 0 && b9 == 0){
            JOptionPane.showMessageDialog(frame,"Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            countO.setText(String.valueOf("    " +oCount));
        }

        else if(b1 == 0 && b5 == 0 && b9 == 0){
            JOptionPane.showMessageDialog(frame,"Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            countO.setText(String.valueOf("    " +oCount));
        }

        else if(b3 == 0 && b5 == 0 && b7 == 0){
            JOptionPane.showMessageDialog(frame,"Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            countO.setText(String.valueOf("    " +oCount));
        }

        else if(i == 9){
            JOptionPane.showMessageDialog(frame,"No Player Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("TicTacToe");
        frame.setContentPane(new TicTacToe().TicTacToe);
        frame.setSize(700, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
