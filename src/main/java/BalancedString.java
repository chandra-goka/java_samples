import java.util.*;

public class BalancedString {
    private char smallOpen = '(';
    private char smallClose = ')';

    private char midOpen = '[';
    private char midClose = ']';

    private char bigOpen = '{';
    private char bigClose = '}';

    List<Character> openList = Arrays.asList(smallOpen, midOpen, bigOpen);
    Map<Character, Character> open_closeMap = new HashMap<>();

    {
        open_closeMap.put(smallOpen, smallClose);
        open_closeMap.put(midOpen, midClose);
        open_closeMap.put(bigOpen, bigClose);
    }

    public static void main(String[] args) {
        BalancedString balancedString = new BalancedString();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String..");
        String s = sc.nextLine();
        System.out.println(balancedString.isBalanced(s) ? "Given string is Balanced" : "Given string is Not Balanced");
    }

    public boolean isBalanced(String str) {
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (openList.contains(c)) {
                deque.push(c);
            } else {
                if (deque.isEmpty()) {
                    return false;
                }
                char pop = deque.pop();
                if (open_closeMap.get(pop) != c) {
                    return false;
                }
            }
        }
        return deque.isEmpty();
    }
}
