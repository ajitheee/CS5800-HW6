package question4;

public class AggregationDriver {

    public static void main(String[] args) {

        // First Instructor
        Instructor instructor1 =
                new Instructor(
                        "Nima",
                        "Davarpanah",
                        "3-2636"
                );

        // Second Instructor
        Instructor instructor2 =
                new Instructor(
                        "John",
                        "Smith",
                        "3-2637"
                );

        // First Textbook
        TextBook book1 =
                new TextBook(
                        "Clean Code",
                        "Robert C. Martin",
                        "Prentice Hall"
                );

        // Second Textbook
        TextBook book2 =
                new TextBook(
                        "Effective Java",
                        "Joshua Bloch",
                        "Addison-Wesley"
                );

        Instructor[] instructors = {
                instructor1,
                instructor2
        };

        TextBook[] books = {
                book1,
                book2
        };

        Course course =
                new Course(
                        "CS 5800",
                        instructors,
                        books
                );

        System.out.println("COURSE INFORMATION");
        System.out.println("==================");
        System.out.println();

        course.print();
    }
}