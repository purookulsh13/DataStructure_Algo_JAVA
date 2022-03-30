import java.util.*;

class Bowling {
    HashMap<String, Integer> players;

    Bowling() {
        players = new HashMap<String, Integer>();
    }

    public void addPlayer(String name, int p) {
        players.put(name, p);
    }

    // your code goes here
    public void getWinner() {
        int max = Collections.max(players.values());
        List<String> keys = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : players.entrySet()) {
            if (entry.getValue() == max) {
                keys.add(entry.getKey());
            }
        }

    }

}

class Program {
    public static void main(String[] args) {
        Bowling game = new Bowling();
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < 3; i++) {
                String input = sc.nextLine();
                String[] values = input.split(" ");
                String name = values[0];
                int points = Integer.parseInt(values[1]);
                game.addPlayer(name, points);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        game.getWinner();
    }
}