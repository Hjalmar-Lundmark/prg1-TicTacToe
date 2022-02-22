import javax.swing.*;

public class TicTacToe {
    public static void main(String[] args) {
        String p1X;
        String p2O;
        char[] spelplan = new char[9];
        for (int j = 0; j < spelplan.length; j++){
            spelplan[j] = ' ';
        }



        visaSpelplan(spelplan);
        for (int i = 0; i < 69; i++){
            if (i == 0 || i == 2 ||i == 4 ||i == 6 ||i == 8 ||i == 10){
                p1Move(spelplan);
            } else {
                if (i == 1 || i == 3 || i == 5 || i == 7 || i == 9) {
                    p2Move(spelplan);
                }
            }
            visaSpelplan(spelplan);

            if (kollaVinstX(spelplan)){
                System.out.println("X vann");
                break;
            }

        }
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
        return false;
    }

    public static void p2Move(char[] spelplan) {
        String p2O;
        p2O = JOptionPane.showInputDialog("Spelare X: " + "Vilken ruta?(0-8)");
        char p2Oc = p2O.charAt(0);
        int p2Oi = Integer.parseInt(p2O);
        for (int p = 0; p < spelplan.length; p++) {
            if (p2Oi == spelplan[p]) {
                if (spelplan[p] == ' ') {
                    spelplan[p] = p2Oc;
                }
            }
        }
    }

    public static void p1Move(char[] spelplan) {
        String p1X;
        p1X = JOptionPane.showInputDialog("Spelare X: " + "Vilken ruta?(0-8)");
        char p1Xc = p1X.charAt(0);
        int p1Xi = Integer.parseInt(p1X);
        for (int o = 0; o < spelplan.length; o++){
            if (p1Xi == spelplan[o]){
                if (spelplan[o] == ' ') {
                    spelplan[o] = p1Xc;
                }
            }
        }
    }

    public static void visaSpelplan(char[] spelplan) {
        System.out.println("_______");
        System.out.println("|" + spelplan[0] + "|" + spelplan[1] +"|" + spelplan[2] + "|");
        System.out.println("-------");
        System.out.println("|" + spelplan[3] + "|" + spelplan[4] +"|" + spelplan[5] + "|");
        System.out.println("-------");
        System.out.println("|" + spelplan[6] + "|" + spelplan[7] +"|" + spelplan[8] + "|");
        System.out.println("-------");
    }
}
