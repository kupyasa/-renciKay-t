/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package öğrencikayıt;

import java.util.Objects;

/**
 *
 * @author Yakup
 */
public class Öğrenci implements java.io.Serializable {

    String ad;
    String soyad;
    int öğrenciNo;
    String bölüm;
    String cinsiyet;
    String doğumYeri;
    int yaş;
    String telefonNo;

    public Öğrenci(String ad, String soyad, int öğrenciNo, String bölüm, String cinsiyet, String doğumYeri, int yaş, String telefonNo) {
        this.ad = ad;
        this.soyad = soyad;
        this.öğrenciNo = öğrenciNo;
        this.bölüm = bölüm;
        this.cinsiyet = cinsiyet;
        this.doğumYeri = doğumYeri;
        this.yaş = yaş;
        this.telefonNo = telefonNo;
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

    public int getÖğrenciNo() {
        return öğrenciNo;
    }

    public void setÖğrenciNo(int öğrenciNo) {
        this.öğrenciNo = öğrenciNo;
    }

    public String getBölüm() {
        return bölüm;
    }

    public void setBölüm(String bölüm) {
        this.bölüm = bölüm;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getDoğumYeri() {
        return doğumYeri;
    }

    public void setDoğumYeri(String doğumYeri) {
        this.doğumYeri = doğumYeri;
    }

    public int getYaş() {
        return yaş;
    }

    public void setYaş(int yaş) {
        this.yaş = yaş;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.ad);
        hash = 89 * hash + Objects.hashCode(this.soyad);
        hash = 89 * hash + this.öğrenciNo;
        hash = 89 * hash + Objects.hashCode(this.bölüm);
        hash = 89 * hash + Objects.hashCode(this.cinsiyet);
        hash = 89 * hash + Objects.hashCode(this.doğumYeri);
        hash = 89 * hash + this.yaş;
        hash = 89 * hash + Objects.hashCode(this.telefonNo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Öğrenci other = (Öğrenci) obj;
        if (this.öğrenciNo != other.öğrenciNo) {
            return false;
        }
        if (this.yaş != other.yaş) {
            return false;
        }
        if (!Objects.equals(this.ad, other.ad)) {
            return false;
        }
        if (!Objects.equals(this.soyad, other.soyad)) {
            return false;
        }
        if (!Objects.equals(this.bölüm, other.bölüm)) {
            return false;
        }
        if (!Objects.equals(this.cinsiyet, other.cinsiyet)) {
            return false;
        }
        if (!Objects.equals(this.doğumYeri, other.doğumYeri)) {
            return false;
        }
        if (!Objects.equals(this.telefonNo, other.telefonNo)) {
            return false;
        }
        return true;
    }
    
    

}
