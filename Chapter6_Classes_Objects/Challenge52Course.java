
public class Challenge52Course {

    static int maxCapacity = 2;
    String courseName;
    int noOfEnrolledStudents;
    String[] enrolledStudents;

    Challenge52Course(String courseName) {
        this.courseName = courseName;
        this.noOfEnrolledStudents = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    void setMaxCapacity(int maxCapacity) {
        Challenge52Course.maxCapacity = maxCapacity;
        String[] newEnrolledStudents = new String[maxCapacity];
        for (int i = 0; i < this.enrolledStudents.length; i++) {
            newEnrolledStudents[i] = this.enrolledStudents[i];
        }
        this.enrolledStudents = newEnrolledStudents;
    }

    void enrollStudent(String studentName) {
        if (this.noOfEnrolledStudents < Challenge52Course.maxCapacity) {
            System.out.println(studentName + " Enrolled to course " + this.courseName);
            this.enrolledStudents[this.noOfEnrolledStudents] = studentName;
            this.noOfEnrolledStudents++;

        } else {
            System.out.println("Max Capacity reached!!");
        }
    }

    void unenrollStudent(String studentName) {
        if (isStudentExist(this.enrolledStudents, studentName)) {
            System.out.println(studentName + " Unenrolled to course " + this.courseName);
            studentRemove(this.enrolledStudents, studentName);
            this.noOfEnrolledStudents--;
        } else {
            System.out.println("There are no student named " + studentName);
        }
    }

    boolean isStudentExist(String[] StudentList, String StudentName) {
        int i = 0;
        while (i < StudentList.length && StudentList[i] != null) {
            if (StudentList[i].equals(StudentName)) {
                return true;
            }
            i++;
        }
        return false;
    }

    void studentRemove(String[] StudentList, String StudentName) {
        int i = 0;
        while (i < StudentList.length && StudentList[i] != null) {
            if (StudentList[i].equals(StudentName)) {
                break;
            }
            i++;
        }
        if (i == StudentList.length || StudentList[i] == null) {
            return;
        }
        while (i < StudentList.length - 1 && StudentList[i + 1] != null) {
            StudentList[i] = StudentList[i + 1];
            i++;
        }
        StudentList[i] = null;
    }

    public static void main(String[] args) {
        Challenge52Course java = new Challenge52Course("Java");

        java.enrollStudent("Amrit");
        java.enrollStudent("Ujjwal");
        java.enrollStudent("Vikas");

        for (String enrolledStudent : java.enrolledStudents) {
            System.out.print(enrolledStudent + ", ");
        }
        System.out.println();

        java.setMaxCapacity(3);
        java.enrollStudent("Vikas");

        for (String enrolledStudent : java.enrolledStudents) {
            System.out.print(enrolledStudent + ", ");
        }
        System.out.println();

        java.unenrollStudent("Amrit");
        java.unenrollStudent("Raj");

        for (String enrolledStudent : java.enrolledStudents) {
            System.out.print(enrolledStudent + ", ");
        }
    }

}
