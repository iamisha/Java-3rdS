
public class NaturalNum {
    public static void main(String[] args) {
        System.out.println("Numbers from 1 to 20 are:-");
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("Condition given output are:-");
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Isha");
            } else if (i % 3 == 0) {
                System.out.println("Three");
            } else if (i % 5 == 0) {
                System.out.println("Five");
            } else {
                System.out.println(i);
            }
        }
    }

}
