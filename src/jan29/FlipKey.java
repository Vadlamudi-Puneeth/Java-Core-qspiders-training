package jan29;

public class FlipKey {
    public static void main(String[] args) {

        String input = "Aeroplane";

        // Null and length validation
        if (input == null || input.length() < 6) {
            System.out.println("Invalid input");
            return;
        }

        // Space or number validation
        if (input.contains(" ") || input.matches(".*[0-9].*")) {
            System.out.println("Invalid input");
            return;
        }

        // Convert to lowercase
        input = input.toLowerCase();

        // Step 1: Remove characters having even ASCII value
        String temp = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch % 2 != 0) {   // keep only odd ASCII chars
                temp = temp + ch;
            }
        }

        // Step 2: Reverse string manually
        String reversed = "";
        for (int i = temp.length() - 1; i >= 0; i--) {
            reversed = reversed + temp.charAt(i);
        }

        // Step 3: Convert even ASCII characters to uppercase
        char arr[] = reversed.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = Character.toUpperCase(arr[i]);
            }
        }

        String result = new String(arr);

        System.out.println(result);
    }
}