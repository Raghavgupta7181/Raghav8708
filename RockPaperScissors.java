import java.util.Scanner;

public class RockPaperScissors {
    public static String computerChoice() {
        int r = (int)(Math.random()*3);
        return r==0?"Rock":(r==1?"Paper":"Scissors");
    }

    public static String winner(String user, String comp) {
        if (user.equalsIgnoreCase(comp)) return "Draw";
        user = user.toLowerCase(); comp = comp.toLowerCase();
        if (user.equals("rock") && comp.equals("scissors")) return "User";
        if (user.equals("paper") && comp.equals("rock")) return "User";
        if (user.equals("scissors") && comp.equals("paper")) return "User";
        return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        int userWins=0, compWins=0, draws=0;
        String[][] rounds = new String[n+1][4];
        rounds[0] = new String[]{"Game","User","Comp","Winner"};
        for (int i=1;i<=n;i++) {
            System.out.print("Enter choice (Rock/Paper/Scissors): ");
            String user = sc.next();
            String comp = computerChoice();
            String win = winner(user, comp);
            if (win.equals("User")) userWins++;
            else if (win.equals("Computer")) compWins++;
            else draws++;
            rounds[i] = new String[]{String.valueOf(i), user, comp, win};
        }
        System.out.println("Game\tUser\tComp\tWinner");
        for (int i=1;i<=n;i++) {
            System.out.println(rounds[i][0] + "\t" + rounds[i][1] + "\t" + rounds[i][2] + "\t" + rounds[i][3]);
        }
        System.out.println("User Wins: " + userWins + ", Comp Wins: " + compWins + ", Draws: " + draws);
        System.out.printf("User Win%%: %.2f, Comp Win%%: %.2f\n", userWins*100.0/n, compWins*100.0/n);
        sc.close();
    }
}
