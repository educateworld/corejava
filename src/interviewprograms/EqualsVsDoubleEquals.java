package interviewprograms;
public class EqualsVsDoubleEquals {

    Integer empid;
    String name;
    Double salary;
    
 public EqualsVsDoubleEquals(Integer empid, String name, Double salary) {
  super();
  this.empid = empid;
  this.name = name;
  this.salary = salary;
 }

 @Override
 public String toString() {
  return "Employee [empid=" + empid + ", name=" + name + ", salary="
    + salary + "]";
 }

 @Override
 public boolean equals(Object obj) {
  if (this == obj)
   return true;
  if (obj == null)
   return false;
  if (getClass() != obj.getClass())
   return false;
  EqualsVsDoubleEquals other = (EqualsVsDoubleEquals) obj;
  if (empid == null) {
   if (other.empid != null)
    return false;
  } else if (!empid.equals(other.empid))
   return false;
  if (name == null) {
   if (other.name != null)
    return false;
  } else if (!name.equals(other.name))
   return false;
  if (salary == null) {
   if (other.salary != null)
    return false;
  } else if (!salary.equals(other.salary))
   return false;
  return true;
 }
 public static void main(String[] args) {
	  EqualsVsDoubleEquals employee1 = new EqualsVsDoubleEquals(100, "Dinesh", 5000.0);
	  EqualsVsDoubleEquals employee2 = new EqualsVsDoubleEquals(100, "Dinesh", 5000.0);
	  EqualsVsDoubleEquals employee3 = new EqualsVsDoubleEquals(101, "Arnav", 6000.0);
	  
	  System.out.println("employee1 == employee2: " + (employee1 == employee2));
	  System.out.println("employee1.equals(employee2): " + (employee1.equals(employee2)));
	  System.out.println("employee2.equals(employee3): " + (employee2.equals(employee3)));
	 }
    
}