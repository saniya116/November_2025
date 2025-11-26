public class VowelCheck{
    public static void main(String[] args) {
        char ch = 'A';
        ch = Character.toLowerCase(ch);

        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }
}

output:
Vowel
