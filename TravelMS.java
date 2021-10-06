package travelMS;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * this is method which contains main function
 * @author User
 */
public class TravelMS
{
      private static DecimalFormat df2 = new DecimalFormat(".##");
      public static void main(String[] args)
      {
         int i,count;
         double GST_cal = 0;
         double total_package=0,rate=0,GST=0;  
        BookPackage[] B= new BookPackage[10];
        for(i=0; i<B.length; i++)
        {
             B[i]=new BookPackage();
        }

         Billing[] bill=new Billing[10];
         for(i=0; i<bill.length; i++)
        {
             bill[i]=new Billing();
        }
        Scanner inp=new Scanner(System.in);
        PackageDetails P = new PackageDetails();
        int choice;
     
      exit:
      while(true)
      {
          System.out.println("Enter 1.View tour package details. 2.Book a package. 3.Exit");
          choice=inp.nextInt();
          switch(choice)
          {
              /**
               * this case is used to view the details of the packages.
               */
              case 1: {
                        P.details();
                        P.travelMode();
                        break;
                       }
              /**
               * this case is used to book a package.
               */
               case 2:{
                        //System.out.println("Enter the number of packages you want to book(only one at a time)");
                        //count=inp.nextInt();
                        count=1;
                        for(i=0;i<count;i++)
                        {
                            total_package=B[i].customerDetails();
                            GST_cal = bill[i].GST_calculate(total_package,rate,GST);
                            System.out.println("The GST amount = "+df2.format(GST_cal));
                        }
                        break;
                        
                     }
                      
                 /**
                  * this case is used to terminate from the program.
                  */   
               case 3:
               break exit;
          
               
              default:System.out.println("Invalid choice entered!!!!");
              
          }
      }
    }
}