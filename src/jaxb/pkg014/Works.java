
package jaxb.pkg014;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="calisilan-isler")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Works {
    
    private int id;
    private String is_ismi;
    private String turu;
    
    

    public Works() {
    }

    public Works(int id, String is_ismi, String turu) {
        this.id = id;
        this.is_ismi = is_ismi;
        this.turu = turu;
    }

    
    
    @XmlAttribute(name="is-no")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @XmlElement(name="is-ismi")
    public String getIs_ismi() {
        return is_ismi;
    }

    public void setIs_ismi(String is_ismi) {
        this.is_ismi = is_ismi;
    }

    @XmlTransient
    public String getTuru() {
        return turu;
    }

    public void setTuru(String turu) {
        this.turu = turu;
    }
    
    
    
    
}
