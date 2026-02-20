package onlyfunctionaliinterfacefunction;

import java.util.function.Function;

public class StudentMain {
    public static void main(String[] args) {

        StudentUtil util = new StudentUtil();

        Student s = new Student("Arjun", 85, "CSE");

        Function<Student,String> nameFunc = util.getNameFunction();
        Function<Student,String> gradeFunc = util.gradeFunction();

        System.out.println("Name: " + nameFunc.apply(s));
        System.out.println("Grade: " + gradeFunc.apply(s));
    }
}

/*
 * | Interface | Call method   | Meaning                      |
| --------- | ------------- | ---------------------------- |
| Function  | `apply(obj)`  | transform object             |
| Predicate | `test(obj)`   | check condition → true/false |
| Consumer  | `accept(obj)` | use object, return nothing   |
| Supplier  | `get()`       | produce value (no input)     |

 * 
 */

