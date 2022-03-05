import javax.swing.*;
import java.util.Arrays;

public class TicTacToe {
    public static void main(String[] args) {
        String p1X;
        String p2O;
        char[] spelplan = new char[9];
        int ai = JOptionPane.showConfirmDialog(null, "Solo mode mot ''ai'' eller 1v1 mot person i rummet? (klicka på ja för solo mode)", "Solo mode?", JOptionPane.YES_NO_OPTION);

        for (int j = 0; j < 10; j++) {
            Arrays.fill(spelplan, ' ');

            visaSpelplan(spelplan);
            for (int i = 0; i < 69; i++) {
                if (i == 0 || i == 2 || i == 4 || i == 6 || i == 8 || i == 10 || i == 12 || i == 14) {
                    p1X = JOptionPane.showInputDialog("Spelare X: " + "\nVilken ruta?(1-9)");
                    int p1Xi = Integer.parseInt(p1X);
                    p1Xi = p1Xi - 1;
                    if (spelplan[p1Xi] == ' ') {
                        spelplan[p1Xi] = 'X';
                    }
                } else {
                    if (i == 1 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11 || i == 13) {
                        if (ai == 1) {
                            p2O = JOptionPane.showInputDialog("Spelare O: " + "\nVilken ruta?(1-9)");
                            int p2Oi = Integer.parseInt(p2O);
                            p2Oi = p2Oi - 1;
                            if (spelplan[p2Oi] == ' ') {
                                spelplan[p2Oi] = 'O';
                            }
                        }
                        else {
                            while (true) {
                                int random = (int) (Math.random() * 9);
                                if (spelplan[random] == ' ') {
                                    spelplan[random] = 'O';
                                    break;
                                }
                            }
                        }
                    }
                }
                visaSpelplan(spelplan);

                if (kollaVinstX(spelplan)) {
                    System.out.println("X vinner");
                    break;
                }
                if (kollaVinstO(spelplan)) {
                    System.out.println("O vinner");
                    break;
                }
                if (kollaOavgjort(spelplan)) {
                    System.out.println("Oavgjort");
                    break;
                }


            }
            int igen = JOptionPane.showConfirmDialog(null, "Vill du spela igen?", "Spela igen?", JOptionPane.YES_NO_OPTION);
            if (igen == 1){
                break;
            }
        }
    }

    public static boolean kollaOavgjort(char[] spelplan) {
        if ((spelplan[0] == 'X' || spelplan[0] == 'O') && (spelplan[1] == 'X' || spelplan[1] == 'O') && (spelplan[2] == 'X' || spelplan[2] == 'O') && (spelplan[3] == 'X' || spelplan[3] == 'O') && (spelplan[4] == 'X' || spelplan[4] == 'O') && (spelplan[5] == 'X' || spelplan[5] == 'O') && (spelplan[6] == 'X' || spelplan[6] == 'O') && (spelplan[7] == 'X' || spelplan[7] == 'O') && (spelplan[8] == 'X' || spelplan[8] == 'O') ) {
            return true;
        }
        return false;
    }

    public static boolean kollaVinstX(char[] spelplan) {
        if (spelplan[0] == 'X' && spelplan[1] == 'X' && spelplan[2] == 'X') {
            return true;
        }
        if (spelplan[3] == 'X' && spelplan[4] == 'X' && spelplan[5] == 'X') {
            return true;
        }
        if (spelplan[6] == 'X' && spelplan[7] == 'X' && spelplan[8] == 'X') {
            return true;
        }
        if (spelplan[0] == 'X' && spelplan[3] == 'X' && spelplan[6] == 'X') {
            return true;
        }
        if (spelplan[1] == 'X' && spelplan[4] == 'X' && spelplan[7] == 'X') {
            return true;
        }
        if (spelplan[2] == 'X' && spelplan[5] == 'X' && spelplan[8] == 'X') {
            return true;
        }
        if (spelplan[0] == 'X' && spelplan[4] == 'X' && spelplan[8] == 'X') {
            return true;
        }
        if (spelplan[2] == 'X' && spelplan[4] == 'X' && spelplan[6] == 'X') {
            return true;
        }
        return false;
    }

    public static boolean kollaVinstO(char[] spelplan) {
        if (spelplan[0] == 'O' && spelplan[1] == 'O' && spelplan[2] == 'O') {
            return true;
        }
        if (spelplan[3] == 'O' && spelplan[4] == 'O' && spelplan[5] == 'O') {
            return true;
        }
        if (spelplan[6] == 'O' && spelplan[7] == 'O' && spelplan[8] == 'O') {
            return true;
        }
        if (spelplan[0] == 'O' && spelplan[3] == 'O' && spelplan[6] == 'O') {
            return true;
        }
        if (spelplan[1] == 'O' && spelplan[4] == 'O' && spelplan[7] == 'O') {
            return true;
        }
        if (spelplan[2] == 'O' && spelplan[5] == 'O' && spelplan[8] == 'O') {
            return true;
        }
        if (spelplan[0] == 'O' && spelplan[4] == 'O' && spelplan[8] == 'O') {
            return true;
        }
        if (spelplan[2] == 'O' && spelplan[4] == 'O' && spelplan[6] == 'O') {
            return true;
        }
        return false;
    }

    public static void visaSpelplan(char[] spelplan) {
        System.out.println(' ');
        System.out.println("_______");
        System.out.println("|" + spelplan[0] + "|" + spelplan[1] +"|" + spelplan[2] + "|");
        System.out.println("-------");
        System.out.println("|" + spelplan[3] + "|" + spelplan[4] +"|" + spelplan[5] + "|");
        System.out.println("-------");
        System.out.println("|" + spelplan[6] + "|" + spelplan[7] +"|" + spelplan[8] + "|");
        System.out.println("-------");
    }
}
