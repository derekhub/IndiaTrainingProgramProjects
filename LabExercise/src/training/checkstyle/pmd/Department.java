package training.checkstyle.pmd;

public class Department {

  private String deptName;
  private Student[] studs;
  
  /**
   * Department class.
   * @param deptName String of the name of department.
   * @param studs list of students
   */
  public Department(String deptName, Student[] studs) {
    super();
    this.deptName = deptName;
    this.studs = studs;
  }

  public Department() {
  super();

  }

  public String getDeptName() {
    return deptName;
  }

  public void setDeptName(String deptName) {
    this.deptName = deptName;
  }

  public Student[] getStuds() {
    return studs;
  }

  public void setStuds(Student[] studs) {
    this.studs = studs;
  }

  private void printLine() {
    System.out.println("=====================================");
  }
  
  /**
   * Prints the list of students.
   */
  public void printStudentList() {
    printLine();
    System.out.println("=== " + deptName + " ======");
    printLine();

    for (Student stud:studs) {
      System.out.println(stud);
    }

    printLine();

  }



}
