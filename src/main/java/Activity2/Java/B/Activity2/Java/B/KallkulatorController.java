/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity2.Java.B.Activity2.Java.B;


import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ASUS
 */
@Controller
public class KallkulatorController {
    logicalProcess lp = new logicalProcess();
    @RequestMapping("/inputpesanan")
    public String inputpesanan(HttpServletRequest order, Model model)
    {     
       ArrayList<List<String>> tabel = new ArrayList<>();
       
       String namaSayur = order.getParameter("var_nama");
       model.addAttribute("namasayur", namaSayur);
 
       String hargaSayur = order.getParameter("var_harga");
       model.addAttribute("harga", hargaSayur);
       
       String jumlahBeli = order.getParameter("var_jumlah");
       model.addAttribute("Jumlah", jumlahBeli);
       
       String bayar = order.getParameter("var_masuk");
       model.addAttribute("UangMasuk", bayar);
       
      
      Double jumlahbayar = lp.jumlahAwal(jumlahBeli, hargaSayur);
      String diskon = lp.totaldiskon(jumlahbayar);
      Double potonganHarga = lp.totalpotongan(jumlahbayar);
      Double totalBayar = lp.jumlahbayar2(jumlahbayar, potonganHarga);
      String tampilKembalian = lp.kembalian(bayar, totalBayar);
      
      
      
       model.addAttribute("jumlahawal", jumlahbayar);
       model.addAttribute("diskon", diskon);
       model.addAttribute("totalpotongan", potonganHarga);
       model.addAttribute("totalbayar", totalBayar);
       model.addAttribute("Kembalian", tampilKembalian);

       
       return "responseView";
    }  
}
