    
package jaxb.pkg014;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement(name="Kendini-BUL")
@XmlType(propOrder = {"id","ad","soyad","adres","telefon","posta","work"})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlSeeAlso(value = {Works.class})
public class HayalKUR {
    
    @XmlAttribute(name="sayi")
    private int id;
    
    @XmlElement(name="isim")
    private String ad;
    
    @XmlElement(name="soyisim")
    private String soyad;
    
    @XmlElementWrapper(name="adresler")
    @XmlElement(name="a-dres")
    private List<String> adres;
    
    @XmlElementWrapper(name="telefonlar")
    @XmlElement(name="t-elefon")
    private List<String> telefon;
    
    @XmlElementWrapper(name="postalar")
    @XmlElement(name="e-posta")
    private List<String> posta;

    private Works work;
    
    public HayalKUR(){}

    public HayalKUR(int id,String ad, String soyad, List<String> adres, List<String> telefon, List<String> posta,Works work) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.adres = adres;
        this.telefon = telefon;
        this.posta = posta;
        this.work = work;
    }
    
   
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public List<String> getAdres() {
        return adres;
    }

    public void setAdres(List<String> adres) {
        this.adres = adres;
    }

    public List<String> getTelefon() {
        return telefon;
    }

    public void setTelefon(List<String> telefon) {
        this.telefon = telefon;
    }

    public List<String> getPosta() {
        return posta;
    }

    public void setPosta(List<String> posta) {
        this.posta = posta;
    }

    public Works getWork() {
        return work;
    }

    public void setWork(Works work) {
        this.work = work;
    }
    
    
    
    
}
