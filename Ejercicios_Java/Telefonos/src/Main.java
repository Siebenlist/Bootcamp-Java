public class Main {
    public static void main(String[] args) {
        Galaxy s8 = new Galaxy("S8", 99, "Thomas", "Ring ring ringgg!!!!!");
        IPhone iphone10 = new IPhone("X", 70, "Juan", "Zipppppppppppt");

        s8.displayInfo();
        System.out.println(s8.ring());
        System.out.println(s8.unlock());

        iphone10.displayInfo();
        System.out.println(iphone10.ring());
        System.out.println(iphone10.unlock());
    }
}