/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelMS;

import java.util.Scanner;

public class PackageDetails 
{
    /**
     * this method is used to display details of the packages available.
     */
    public void details()
    {
        System.out.println("1.Manali"
                + "  Starting from Rs.5,500");
        System.out.println("2.Andaman"
                + "  Starting from Rs.20,500");
        System.out.println("3.Goa"
                + "  Starting from Rs.5,999");
        System.out.println("4.Ooty"
                + "  Starting from Rs.8,499");
        System.out.println("5.Ladakh"
                + "  Starting from Rs.15,500");
     
        System.out.println("NOTE: All the packages are for 2 members!!");
    }
    
    /**
     * this method is used to display the details of the traveling mode.
     */
    public void travelMode()
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Press corresponding key to know the travel mode details:");
        int ch= inp.nextInt();
        
        switch(ch)
        {
            case 1: {
                      System.out.println("Travelling by:");
                      System.out.println("Bus- Starting from Rs.3,500");
                      System.out.println("Train- Starting from Rs.1,800");
                      System.out.println("Flight- Starting from Rs.10,000");
                      break;
                     }
            
            case 2: {
                      System.out.println("Travelling by:");
                      System.out.println("Bus- Starting from Rs.5,500");
                      System.out.println("Train- Starting from Rs.3,800");
                      System.out.println("Flight- Starting from Rs.12,000");
                      break;
                     }
            
            case 3: {
                      System.out.println("Travelling by:");
                      System.out.println("Bus- Starting from Rs.3,000");
                      System.out.println("Train- Starting from Rs.2,000");
                      System.out.println("Flight- Starting from Rs.5,000");
                      break;
                     }
            
            case 4: {
                      System.out.println("Travelling by:");
                      System.out.println("Bus- Starting from Rs.4,500");
                      System.out.println("Train- Starting from Rs.2,800");
                      System.out.println("Flight- Starting from Rs.8,499");
                      break;
                     }
            
            case 5: {
                      System.out.println("Travelling by:");
                      System.out.println("Bus- Starting from Rs.8,000");
                      System.out.println("Train- Starting from Rs.4,500");
                      System.out.println("Flight- Starting from Rs.12,000");
                      break;
                    }
            default:
                System.out.println("Invalid choice!!");
        }
        
    }
}