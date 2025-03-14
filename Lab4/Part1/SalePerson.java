public class SalePerson implements Comparable {
  private String firstName;
  private String lastName;
  private int totalSales;

  public SalePerson(String firstName, String lastName, int totalSales) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.totalSales = totalSales;
  }

  public String toString() {
    return lastName + ", " + firstName + " : " + totalSales;
  }

  public boolean equals(Object o) {
    SalePerson s = (SalePerson)o;
    return s.firstName == firstName && s.lastName == lastName;
  }

  public int compareTo(Object o) {
    SalePerson s = (SalePerson)o;
    int d = totalSales - s.totalSales;
    if (d != 0) return d;
    return s.lastName.compareTo(lastName);
  }

  public String getFirstName() { return firstName; }

  public String getLastName() { return lastName; }

  public int getTotalSales() { return totalSales; }
}
