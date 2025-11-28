public class AutomorphicNumber {
    public static void main(String[] args) {
        int num = 76;
        int square = num * num;
        String numStr = String.valueOf(num);
        String sqStr = String.valueOf(square);
        if (sqStr.endsWith(numStr))
            System.out.println(num + " is an Automorphic Number.");
        else
            System.out.println(num + " is not an Automorphic Number.");
    }
}

output:
76 is an Automorphic Number.
