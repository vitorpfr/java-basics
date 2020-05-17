public class Logic {
    public static void main(String[] args) {
        String one = "ab";
        String two = "ab";
        String three = "cd";

        System.out.println(one.equals(two)); // true
        System.out.println(one.equals(three)); // false

        String name = "John Doe";

        System.out.println(name.startsWith("Joh")); // true
        System.out.println(name.contains("Doe")); // true
        System.out.println(name.contains("Adam")); // false

        if (name.contains("Doe")) {
            System.out.println("Name contains Doe");
        } else {
            System.out.println("Name does not contain Doe");
        }

        int temperature = 40;

        if (temperature > 70) {
            System.out.println("No coat required");
        } else if (temperature > 50) {
            System.out.println("Wear a jacket");
        } else if (temperature > 20) {
            System.out.println("Wear a warm coat");
        } else {
            System.out.println("Stay inside!");
        }

        int pressure = 2;

        if (temperature > 20 && pressure > 1) {
            System.out.println("Case matched");
        }
    }
}
