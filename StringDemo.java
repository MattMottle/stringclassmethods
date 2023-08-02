public class StringDemo {
    public static void main(String[] args) {
        String samurai = "Coding Dojo is so very awesome!";
        int length = samurai.length();
        System.out.println( "String Length is : " + length);

        String string1 = "My name is ";
        String string2 = "Michael";
        String string3 = string1.concat(string2);
        System.out.println(string3);

        String ninja = String.format("Hi %s, you owe me $%.2f !", "Jack", 25.0);
        System.out.println(ninja);
        // %s is expecting a string, %.2f is expecting a float number with 2 decimals (%.3f would be 3 or .001) input values on the end.

        String karate = "Welcome to Coding Dojo";
        int a = karate.indexOf("Coding");
        // a is 11 because Coding begins at index 11 (12th letter starting at 0)
        int b = karate.indexOf("co");
        // b is 3 because index 3 of the string is where co is seen the first time.
        int c = karate.indexOf("pizza"); 
        // pizza is not found so you get a value of -1

        String sentence = "   spaces everywhere!   ";
        System.out.println(sentence.trim());

        String d = "HELLO";
        String e = "world";
        System.out.println(d.toLowerCase());
        System.out.println(e.toUpperCase());

    }
}