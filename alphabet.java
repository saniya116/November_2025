import java.util.Scanner;
class CountCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int vowels = 0, consonants = 0, digits = 0, spaces = 0;
        str = str.toLowerCase(); // convert to lowercase for easy checking
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    vowels++;
                else
                    consonants++;
            } 
            else if (ch >= '0' && ch <= '9')
                digits++;
            else if (ch == ' ')
                spaces++;
        }
        System.out.println("\nNumber of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
        System.out.println("Number of digits: " + digits);
        System.out.println("Number of spaces: " + spaces);
    }
}

output:
Enter a string: Java Programming 2025
Number of vowels: 5
Number of consonants: 11
Number of digits: 4
Number of spaces: 2
