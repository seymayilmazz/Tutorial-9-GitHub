/**
 * Created by Şeyma Yılmaz on 16.2.2017.
 */
public class Kisi {

    private String ad;
    private int yas;
    private String adres;

    public Kisi() {

    }

    public Kisi(String ad, int yas, String adres) {
        this.ad = ad;
        this.yas = yas;
        this.adres = adres;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
}
