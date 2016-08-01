package training.checkstyle.pmd;

import java.util.Arrays;

/**
 * college class.
 * @author dchoi3
 *
 */
public class College {

  /**
   * code of college.
   */
  private int collegeCode;
  /**
   * name of college.
   */
  private String collegeName;
  /**
   * list of departments in college.
   */
  private Department[] depts;

  /**
   * College constructor.
   */
  public College() {
  super();

  }
  
  /**
   * college constructor.
   * @param collegeCode code of college
   * @param collegeName name of college
   * @param depts departments of college
   */
  public College(final int collegeCode, final String collegeName, final Department... depts) {
    super();
    this.collegeCode = collegeCode;
    this.collegeName = collegeName;
    this.depts = depts;
  }


  /**
   * get code of college.
   * @return collegeCode
   */
  public int getCollegeCode() {
    return collegeCode;
  }

  /**
   * set code of college.
   * @param collegeCode code of college
   */
  public void setCollegeCode(final int collegeCode) {
    this.collegeCode = collegeCode;
  }

  /**
   * get name of college.
   * @return collegeName name of college
   */
  public String getCollegeName() {
    return collegeName;
  }

  /**
   * set name of college.
   * @param collegeName name of college
   */
  public void setCollegeName(final String collegeName) {
    this.collegeName = collegeName;
  }

  /**
   * get departments in college.
   * @return departments within college
   */
  public Department[] getDepts() {
    return depts.clone();
  }

  /**
   * set departments in college.
   * @param depts departments in college
   */
  public void setDepts(final Department... depts) {
    this.depts = depts;
  }

  @Override
  /**
   * dept toString method.
   */
  public String toString() {
    return  Arrays.toString(depts) ;
  }

  /**
   * Prints departments.
   */
  public void printDepartments() {

    for (final Department dept:depts) {
      dept.printStudentList();
    }

  }


}
