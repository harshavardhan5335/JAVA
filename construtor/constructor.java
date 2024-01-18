package JAVA.construtor;
class construtor {
    
    
    
    //constructor With Two parameters
    String n1 ; int n2 ;
construtor(String name,int age){
    n1=name;
    n2=age;
    System.out.println("Name : " + n1 + "Age"  + age);
}



//constructor With Three parameters but starting with int so it is different from other
int weight ;
int height ; 
String ID  ; 

construtor( int weight ,int  height ,String ID ){

    this.weight= weight;
    this.height=height;
    this.ID = ID ; 

System.out.println("\nWeight : "  + weight  +"\nHeight : "  +  height + "\nID : " + ID );
}


//constructor With Three parameters but starting with string so it is different from other
String name1 ;
int marks ;
int age1;  
construtor(String name1 ,int  marks ,int  age1 ){
    System.out.println("Name : "+ name1 +"\nMarks : " + marks + "\nAge : " + age1 );
}


//default 
construtor(){
System.out.println("Im Default coonstructor ");
}
}
class consEg{
public static void main(String [] args ){
    construtor s1  = new construtor("paari " , 21 ); 
    construtor s2  = new construtor();
    construtor s3 =  new construtor(56,156 ,"22105020");
    construtor s4 = new construtor("nadeem",0 , 16 ); 
}
} 

    

