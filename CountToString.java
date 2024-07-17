public class CountToString {
    public static void main(String[] args) {
        String input = "a4b3c2d1";

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) 
        {
            char c = input.charAt(i);

            if (Character.isLetter(c)) 
            {
                char nextChar = input.charAt(i + 1);
                int count = Character.getNumericValue(nextChar);

                for (int j = 0; j < count; j++) {
                    output.append(c);
                }
            }
        }

        System.out.println(output);
    }
}
