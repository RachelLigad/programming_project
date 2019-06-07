package comprog;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import utils.DB;

/**
 *
 * @author Rachel Ann Ligad
 */
public class Student {

    private static final String tableName = "student_info";

    private int id;
    private String idnum;
    private String studentName;
    private String course;
    private String date;
    private String timeIn;
    private String timeOut;
    private String student;

    public Student(int id, String idnum, String studentName, String course, String date, String timeIn, String timeOut) {

        this.id = id;
        this.idnum = idnum;
        this.studentName = studentName;
        this.course = course;
        this.date = date;
        this.timeIn = timeIn;
        this.timeOut = timeOut;

    }

    public Student(String idnum, String studentName, String course, String date, String timeIn, String timeOut) {
        this(0, idnum, studentName, course, date, timeIn, timeOut);
    }

    public Student() {
        this("", "", "", "", "", "");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdnum() {
        return idnum;
    }

    public void setIdnum(String idnum) {
        this.idnum = idnum;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(String timeIn) {
        this.timeIn = timeIn;
    }

    public String getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(String timeOut) {
        this.timeOut = timeOut;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public void insertStudent() throws SQLException {
        String q = String.format("INSERT INTO %s VALUES(NULL,%s,%s,%s,%s,%s,%s,%s)", tableName, id, idnum, studentName, course, date, timeIn, timeOut);
        DB.query(q, true);
    }

    public static Student searchStudentThruIdnum(String Values) throws Exception {
        String q = String.format("SELECT * FROM %s WHERE id  = %d", tableName, Values);
        ResultSet rs = DB.query(q);
        if (!rs.next()) {
            throw new Exception("Student with ID NUMBER " + Values + " not found!");
        }

        Student stud = Student.getStudentFromResultSet(rs);
        return stud;
    }

    public static ArrayList<Student> getStudentThruIdnum(String s) throws SQLException {
        ArrayList<Student> student_info = new ArrayList<>();
        String q = String.format("SELECT * from %s WHERE date LIKE \"%%%s%%\"", tableName, s);

        ResultSet rs = DB.query(q);
        while (rs.next()) {
            System.out.print("Query found.");
            Student stud = getStudentFromResultSet(rs);
            System.out.println(stud);
            student_info.add(stud);
        }
        return student_info;
    }

    public String toString() {
        return String.format(
                "==================\n"
                + "ID: %s\n"
                + "ID number: %s\n"
                + "Name: %s\n"
                + "Course: %s\n"
                + "Date: %s\n"
                + "Time In: %s\n"
                + "Time Out: %s\n", id, idnum, studentName, course, date, timeIn, timeOut);

    }

    private static Student getStudentFromResultSet(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        String idnum = rs.getString("id_number");
        String studentName = rs.getString("student");
        String course = rs.getString("course");
        String date = rs.getString("date");
        String timeIn = rs.getString("time_in");
        String timeOut = rs.getString("time_out");

        Student stud = new Student(id, idnum, studentName, course, date, timeIn, timeOut);

        return stud;
    }

    public static String[][] arraylistTo2dArray(ArrayList<Student> as) {
        int rowSize = as.size();
        int colSize = 7;
        String[][] sz = new String[rowSize][colSize];
        for (int i = 0; i < rowSize; i++) {
            Student a = as.get(i);
            sz[i][0] = a.getId() + "";
            sz[i][1] = a.getIdnum();
            sz[i][2] = a.getStudentName();
            sz[i][3] = a.getCourse();
            sz[i][4] = a.getDate();
            sz[i][5] = a.getTimeIn();
            sz[i][6] = a.getTimeOut();

        }
        return sz;
    }
}
