package question4;

public class Course {

    private String courseName;
    private Instructor[] instructors;
    private TextBook[] textBooks;

    public Course(String courseName,
                  Instructor[] instructors,
                  TextBook[] textBooks) {

        this.courseName = courseName;
        this.instructors = instructors;
        this.textBooks = textBooks;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Instructor[] getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructor[] instructors) {
        this.instructors = instructors;
    }

    public TextBook[] getTextBooks() {
        return textBooks;
    }

    public void setTextBooks(TextBook[] textBooks) {
        this.textBooks = textBooks;
    }

    public void print() {

        System.out.println("Course Name: " + courseName);

        System.out.println();
        System.out.println("INSTRUCTORS");
        System.out.println("-----------");

        for (Instructor instructor : instructors) {
            System.out.println(
                    "Name: "
                            + instructor.getFirstName()
                            + " "
                            + instructor.getLastName()
            );

            System.out.println(
                    "Office: "
                            + instructor.getOfficeNumber()
            );

            System.out.println();
        }

        System.out.println("TEXTBOOKS");
        System.out.println("---------");

        for (TextBook book : textBooks) {
            System.out.println(
                    "Title: " + book.getTitle()
            );

            System.out.println(
                    "Author: " + book.getAuthor()
            );

            System.out.println(
                    "Publisher: " + book.getPublisher()
            );

            System.out.println();
        }
    }
}