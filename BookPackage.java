package travelMS;
import java.util.Scanner;
public class BookPackage 
{
     public double pamt;        //package amount
     public double tamt;        // travel mode amount
     public String name;        //to store name of the customer
     public int age;
     public double total_package; // to store the total amount of the package and travel mode booked.
     public long phone;
    
    /**
     * this method is used to book Manali package.
     * @param amt this is the amount to book Manali package.
     * @return 
     */
    public double bookManali(double amt)
    {
        pamt=pamt+amt;
        return pamt;
    }
    
    /**
     * this method is used to  book Andaman package.
     * @param amt this is the amount to book Andaman package.
     * @return 
     */
    public double bookAndaman(double amt)
    {
        pamt=pamt+amt;
        return pamt;
    }
    
    /**
     * this method is used to  book Goa package.
     * @param amt this is the amount to book Goa package.
     * @return 
     */
    public double bookGoa(double amt)
    {
        pamt=pamt+amt;
        return pamt;
    }
    
    /**
     * this method is used to book Ooty package.
     * @param amt this is the amount to book Ooty package.
     * @return 
     */
    public double bookOoty(double amt)
    {
        pamt=pamt+amt;
        return pamt;
    }
    
    /**
     * this method is used to book Ladakh package.
     * @param amt this is the amount to book Ladakh package.
     * @return 
     */
    public double bookLadakh(double amt)
    {
        pamt=pamt+amt;
        return pamt;
    }
 
    /**
     * this method is used to book bus as a traveling mode.
     * @param bamt this is the amount to book bus.
     * @return 
     */
    public double bookBus(double bamt)
    {
        tamt=tamt+bamt;
        return tamt;
    }
    
    /**
     * this method is used to book train as a traveling mode.
     * @param tramt this is the amount to book train.
     * @return 
     */
     public double bookTrain(double tramt)
    {
        tamt=tamt+tramt;
        return tamt;
    }
      
     /**
      * this method is used to book flight as a traveling mode.
      * @param famt this is the amount to book flight.
      * @return 
      */
     public double bookFlight(double famt)
    {
        tamt=tamt+famt;
        return tamt;
    }
     
     /**
      * this method is used to select the  traveling mode.
      * @param bamt this is the amount to book bus.
      * @param tramt this is the amount to book train.
      * @param famt this is the amount to book flight.
      * @return 
      */
    public double bookTravelMode(double bamt,double tramt,double famt)
    {   
        int mode;
        do
        {
          
          System.out.println("Ënter the travel mode : 1.Bus\t 2.Train\t 3.Flight");
          Scanner inp=new Scanner(System.in);
           mode=inp.nextInt();
          
          if(mode==1)
              return bookBus(bamt);
          else if(mode==2)
                return bookTrain(tramt);
          else if(mode==3)
               return bookFlight(famt);
          
        }while(mode>3);
         return 0;
              
    }
    
    
    /**
     * this method is used to select the tour packages and add calculate the total package amount.
     * @return 
     */
    public double customerDetails()
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the package you want to book: 1.Manali 2.Andaman 3.Goa 4.Ooty 5.Ladakh ");

       
        System.out.println("Enter the package you want to book:");
        int ch= inp.nextInt();
       
        System.out.println("Enter the name:");
        name=inp.next();
        System.out.println("Enter the age:");
        age=inp.nextInt();
        System.out.println("Enter the contact number :");
        phone=inp.nextLong();     

        switch(ch)
        {
            case 1: {
                        total_package=bookTravelMode(3500,1800,10000)+bookManali(5500);
                        return total_package;
                    }
           
            case 2: {
                        total_package=bookTravelMode(5500,3800,12000)+bookAndaman(20500);
                        return total_package;
                        
                    }
            case 3: {
                        total_package=bookTravelMode(3000,2000,5000)+bookGoa(5999);
                        return total_package;
                    }
            case 4: {
                        total_package=bookTravelMode(4500,2800,8499)+bookOoty(8499);
                        return total_package;
                    }
            case 5: {
                        total_package= bookTravelMode(8000,4500,12000)+bookLadakh(15500);
                        return total_package;
                    }
            default:return 0;
           
        }
    }
    
}