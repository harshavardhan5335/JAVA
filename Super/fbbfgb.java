class person
{
    double height ;
    double weight;
    int aadharid;
}    
class student extends person
{
    int id ; 
    void BMIcalc()
    {
        double BMI=weight/height*height;
    }
    void eligibleforbd()
    {
        if(BMI >69)
        {
            System.out.println("Eligible ");
        }   

        else {
            System.out.println("not Elihg");
        }
    }
}





public class fbbfgb {

    

}
