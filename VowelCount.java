public class VowelCount {
    public static void main(String[] args) {
        String str = "Hello Saniya";
        int count = 0;

        str = str.toLowerCase(); // convert to lowercase

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Input String : " + str);
        System.out.println("Number of vowels : " + count);
    }
}

output:
Input String : hello saniya
Number of vowels : 6
