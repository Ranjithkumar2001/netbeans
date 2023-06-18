/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalearning1;

//First see the technical note
//object access by class
/*class Employee
{
    int empno;
    String name;
    float sal;

    void display()
  {
    System.out.println(empno);
    System.out.println(name);
    System.out.println(sal);
   
  }
}

public class oops {
    public static void main(String[] args)
    {
      Employee emp1=new Employee();  
      Employee emp2=new Employee();  
      emp1.empno=100;
      emp1.name="kamal";
      emp1.sal=20000;
      emp1.display();
      emp2.empno=101;
      emp2.name="gokul";
      emp2.sal=20000;
      emp2.display();
    }
    
}*/

class Employee
{
    int empno;
    String name;
    float sal;
    String email;
    float raise_amt = 0.05f;
    Employee()
    {
       //empty constructor 
    }
   /*  Employee(int empno,String name)
    {
       this.empno=empno;//this. is differenciate the variable
        this.name=name;
        
        this.email=name+"@abc.com";
    }
    Employee(int empno,String name,float sal)
    {
       this.empno=empno;//this. is differenciate the variable
        this.name=name;
        this.sal=sal;
        this.email=name+"@abc.com";
    }*/
    
      //OR
    // constructor chaning
    Employee(int empno,String name)
    {
       this.empno=empno;//this. is differenciate the variable
        this.name=name;
        
        this.email=name+"@abc.com";
    }
    Employee(int empno,String name,float sal)
    {
        this(empno,name);
        this.sal=sal;
       
    }
    float apply_raise(float sal)
    {
      float pay = sal+(sal*raise_amt);
      return pay;
    }
    
    void display()
  {
    System.out.println(empno);
    System.out.println(name);
    System.out.println(sal);
    System.out.println(email);
    System.out.println();
   
  }
}

public class oops {
    public static void main(String[] args)
    {
      Employee emp1=new Employee(100,"kamal",25000);  
      Employee emp2=new Employee(100,"gokul",20000);  
      Employee emp3=new Employee();//constructor is already defined so error varum  .  error solve by to create empty employee constructor.
      Employee emp4=new Employee(100,"suriya");  
      emp1.sal=emp1.apply_raise(emp1.sal);
      
      emp1.display();
      emp2.display();
      emp3.display();
      emp4.display();
    }
    
}
