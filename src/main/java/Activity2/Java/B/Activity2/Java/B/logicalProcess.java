/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity2.Java.B.Activity2.Java.B;

/**
 *
 * @author ASUS
 */
public class logicalProcess {
    
    public double jumlahAwal(String jumlahBeli, String hargaSayur)
    {
         Double hargaKg = Double.valueOf(hargaSayur);
         Double jumlah = Double.valueOf(jumlahBeli);
         Double jumlahbayar = jumlah * hargaKg;
         return jumlahbayar;
    }
    
    public String totaldiskon(Double jumlahbayar)
    {
       String diskon = null;
       if(jumlahbayar < 16000)
       {
           diskon = "0";
       }
       else if (jumlahbayar > 16000 && jumlahbayar < 25000)
       {
           diskon = "10%";
       }
       else if (jumlahbayar > 25000)
       {
           diskon = "15%";
       }
              
      return diskon;
    }
    
    public double totalpotongan(Double jumlahbayar)
    {
        Double potonganHarga = null;
        
        if(jumlahbayar < 16000)
        {
            potonganHarga = jumlahbayar*0/100;
        }
        else if(jumlahbayar > 16000 && jumlahbayar < 25000)
        {
            potonganHarga = jumlahbayar*10/100;
        }
        else if (jumlahbayar > 25000)
        {
            potonganHarga = jumlahbayar*15/100;
        }
        
        return potonganHarga;
    }
    
    public Double jumlahbayar2(Double jumlahbayar, Double potonganHarga)            
    {
       
          Double totalbayar = jumlahbayar - potonganHarga;
          return totalbayar;
    }
   
    public String kembalian (String bayar, Double totalbayar)
    {
        Double jmlBayar = Double.valueOf(bayar);
        Double kurang = totalbayar - jmlBayar;
        String notif = "";
        
        if (jmlBayar > totalbayar)
        {
            notif = "Change " + (jmlBayar - totalbayar);
        }
        else if (jmlBayar < totalbayar)
        {
            notif = "Your money is less  " + kurang;
        }
        else 
        {
            notif = "Your money is enough";
        }
        return notif;
    }
   
}
