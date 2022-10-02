package customerinformation;

import java.util.Scanner ;

public class CustomerInformation
{
    static void toShow (String cName, String cZone) 
    {
        // declare Scanner
        
        Scanner scanner = new Scanner (System.in) ;
        
        System.out.print ("Sila masukkan nama: ") ;
        
        cName = scanner.nextLine() ;
        
        System.out.print ("Sila masukkan zon: ") ;
        
        cZone = scanner.nextLine() ;
    }
    
    static void toShow (String cICNumber, char cGender)
    {
        // declare Scanner
        
        Scanner scanner = new Scanner (System.in) ;
        
        System.out.println ("Sila masukkan nombor IC: " + cICNumber) ;
        System.out.println ("Sila masukkan jantina: " + cGender) ;
    }
            
    public static void main(String[] args) 
    {
        // declare local variables for Customer Information
        
        String cName, cZone, cICNumber ;
        char cGender ;
        
        
        // declare local variables for Medicine Information
        
        int mQuantity ;
        double mPricePerUnit, mBill ;
        String mType, mName ;
        
        
        // create objects to use methods
        
        CustomerInformation Customer = new CustomerInformation() ;
        MedicineInformation Medicine = new MedicineInformation() ;
        
        CustomerInformation.toShow(cName = "Hashbie", cZone = "Bintulu") ;
        CustomerInformation.toShow(cICNumber = "981104136211", cGender = 'L');
        
        System.out.println ("") ;
        
        MedicineInformation.MedicineInformation(mType = "Ubat", mName = "Paracetamol");
        MedicineInformation.MedicineInformation(mQuantity = 5, mPricePerUnit = 10.00, mBill = 50.00) ;
       
        System.out.println ("") ;
        
    }   
}
