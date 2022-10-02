package customerinformation;

public class MedicineInformation 
{
    // declare local variables for Medicine Information
        
    int mQuantity ;
    double mPricePerUnit, mBill ;
    String mType, mName ;
    
    static void MedicineInformation (String mType, String mName)
    {
        System.out.println ("Sila masukkan jenis ubat: " + mType) ;
        System.out.println ("Sila masukkan nama ubat: " + mName) ;
    }
    
    static void MedicineInformation (int mQuantity, double mPricePerUnit, double mBill)
    {
        System.out.println ("Sila masukkan kuantiti ubat: " + mQuantity) ;
        System.out.println ("Sila masukkan harga ubat seunit: " + mPricePerUnit) ;
        System.out.println ("Sila masukkan total harga: " + mBill) ;
    }
    
    static void toDisplayMedicine()
    {   
    }
    
    static void toDisplayBill()
    {
    }
}
