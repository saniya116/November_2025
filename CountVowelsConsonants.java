public class CountVowelsConsonants {
    public static void main(String[] args) {
        String input = "Java Programming";  ng
        int vowels = 0, consonants = 0;
        for (char ch : input.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Input String: " + input);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}

output:

Input String: Java Programming
Vowels: 5
Consonants: 10
