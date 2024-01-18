 class Employe{
    int Id;
    String  Name ; 
    double ContactNumber;
    int PerDaySalary;
    int  WorkingDays ;
    int Salary;
        public  void add_info(int Id , String Name , int PerDaySalary , int WorkingDays )
{
    this.Id=Id;
this.Name= Name; ; 
  this.PerDaySalary = PerDaySalary;
   this.WorkingDays = WorkingDays  ;
Salary= PerDaySalary * WorkingDays ;
   }
           void display(){
            System.out.println("ID of the Employee              : "+ Id);
            System.out.println("Name of the Employee            : "+ Name);
            System.out.println("Working days                    : "+ WorkingDays);
            System.out.println("Per day salary                  : "+ PerDaySalary);
            System.out.println("One month Salary in doge        : "+ Salary);
        }
        }       
class EmployeeDetails {
    public static void main(String[] args) { 
    
        Employe e1 = new Employe();
        e1.add_info(22105020, "MUSK 𝕩 ", 6942,10);
        e1.display();

    }

}