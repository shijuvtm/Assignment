import java.util.*;
class Employees
{
    int Emp_id;
    String Emp_name;
    double Emp_salary;

 
    Employees(int id,String name,double salary){
        Emp_id=id;
        Emp_name=name;
        Emp_salary=salary;

        
    }
    void Display(){
        System.out.println("Employee Detail");
        System.out.println("-----------------------------");
        System.out.println("Employee id is:"+Emp_id);
        System.out.println("Employee Name is:"+Emp_name);
        System.out.println("Employee salary is:"+Emp_salary);
        System.out.println("-----------------------------");
        


    }
  

}
public class Employee{
    public static void main(String args[]){

        List<Employees> empList=new ArrayList<Employees>();
        
        empList.add(new Employees(1,"Rahul",10000));
        empList.add(new Employees(2,"Raj",20000));
        empList.add(new Employees(3,"Ravi",30000));
        empList.add(new Employees(4,"Rahul",40000));
        
        for(Employees emp : empList)
        {
            emp.Display();
        }


    }
}