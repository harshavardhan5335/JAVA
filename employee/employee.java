
class Employe{
    int Id;
    String  Name ; 
    
    String  Dept;
    double Salary ; 
    public  void add_info(int Id , String Name , String Dept , double Salary )
        {
            this.Id=Id;
            this.Name= Name; 
            this.Dept = Dept;
            this.Salary = Salary  ;
        }
        
        
          public void display(){
            System.out.println(Id);
            System.out.println(Name);
            System.out.println(Dept);
            System.out.println(Salary);
        }
        }



         class harsha {
             int height  ; 
             int weight ; 
             
             
            public void weight_info(int weight, int height) 
            {
            this.weight = weight;
            this.height = height ; 
            }
                public void display(){
                    System.out.println(weight);
                        System.out.println(height);
                            }

        }
class employee {
    public static void main(String[] args) { 
    
        Employe e1 = new Employe();
        e1.add_info(22105034,"Logesh","CSE",25_00_000); 
        e1.display();
        harsha e2 = new harsha();
        e2.weight_info(60, 6);
        e2.display();
    }

}