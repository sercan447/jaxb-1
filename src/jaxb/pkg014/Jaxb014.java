
package jaxb.pkg014;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;


public class Jaxb014 {

    public static void main(String[] args) {
       
        List<String> tel = new ArrayList<String>();
                    tel.add("0544 900 74 92");
                    tel.add("0538 577 55 58");
                    tel.add("0535 079 14 26");
                    
        List<String> posta = new ArrayList<String>();
                     posta.add("sercan.goger@gmail.com");
                     posta.add("sercan.goger@mynet.com");
                     posta.add("q-veba@hotmail.com");
                     
        List<String> adres = new ArrayList<String>();
                     adres.add("Turgut reis");
                     adres.add("Mugla yatagan");
                     adres.add("Mugla Milas");
                     
          Works work = new Works(1,"Android Mobil Uygulamasi","yazılım");           
      HayalKUR hyl = new HayalKUR(48, "Sercan", "Göger", adres, tel, posta,work);
      
      try{
             JAXBContext con = JAXBContext.newInstance(HayalKUR.class);
             Marshaller marshaller = con.createMarshaller();
             marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
             marshaller.marshal(hyl, System.out);
             
      }catch(JAXBException et){
            et.printStackTrace();
      }
       
    }
    
}
