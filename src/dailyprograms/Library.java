package dailyprograms;

public class Library {

    // 1️⃣ one-argument constructor
    Library(int a) {
        System.out.println(a);
    }

    // 2️⃣ two-argument constructor
    Library(int a, int b) {
        this(a);              // calls Library(int a)
        System.out.println(a + b);
    }

    // 3️⃣ three-argument constructor
    Library(int a, int b, int c) {
        this(a, b);           // calls Library(int a, int b)
        System.out.println(a + b + c);
    }
}
