public class Breakwithlabels {
 public static void main(String[] args) { 
        
        int i =1 ; 
        outer:while (i<4){
        
            int j = 1 ;
            inner:while(j<6){
                
                
                if ( j==4){
                    break inner ;
                    
                }
            
            
                System.out.println("inside inner " + j + " ");
            j++;}
      
      
        i++;  
    System.out.println("Outside inner ");}
    System.out.println("End of the Loop");
    System.out.println("OUT OF EVERTHING ");    
    }
    


}
