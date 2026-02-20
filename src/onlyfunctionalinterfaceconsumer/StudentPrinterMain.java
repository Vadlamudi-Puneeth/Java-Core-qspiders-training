package onlyfunctionalinterfaceconsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class StudentPrinterMain {

    public static void main(String[] args) {

        StudentPrinterUtil util = new StudentPrinterUtil();

        List<StudentPrinter> students = new ArrayList<>();

        students.add(new StudentPrinter("Arjun", 98, "it"));
        students.add(new StudentPrinter("Priya", 88, "hr"));
        students.add(new StudentPrinter("Rahul", 76, "it"));

        Consumer<StudentPrinter> printer = util.printStudent();

        util.applyConsumer(students, printer);
    }
}
