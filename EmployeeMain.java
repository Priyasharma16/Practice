class Employee
   {
int employeeId; 
String employeeName;
float salary ;
static String employerName ="Niit Ltd";
void setDetails(int id,String name,float sal)
   {
employeeId=id;
employeeName=name;
salary= sal;
 }

void displayDetails()
 {
System.out.println("\n =======Employee Details======");
System.out.println("Id :"+employeeId);
System.out.println("Name :"+employeeName);
System.out.println("Salary :"+salary);
System.out.println("Employer :"+employerName);
 }
}
class EmployeeMain
 {
public static void main(String[] args)
 {
Employee emp1= new Employee();
emp1.setDetails(101,"Priya",20000);
emp1.displayDetails();
  
Employee emp2= new Employee();
emp2.setDetails(102,"Divya",30000);
emp2.displayDetails();
 }
}