public class AdapterPatternDemo {
    public static void main(String[] args) {
        SchoolManagementApp attendance =
                new AttendanceSystemAdapter(new AttendanceSystem());
        SchoolManagementApp grading =
                new GradingSystemAdapter(new GradingSystem());
        SchoolManagementApp library =
                new LibrarySystemAdapter(new LibrarySystem());

        attendance.integrateSystem();
        grading.integrateSystem();
        library.integrateSystem();
    }
}
