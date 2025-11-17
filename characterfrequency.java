mport java.util.HashMap;
import java.util.Scanner;
public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (ch != ' ') {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }
        System.out.println("Character frequencies:");
        for (char key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }
    }
}

output:
Enter a string: programming
Character frequencies:
p = 1
r = 2
o = 1
g = 2
r = 2
a = 1
m = 2
i = 1
n = 1
