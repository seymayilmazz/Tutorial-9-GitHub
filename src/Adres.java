/**
 * Created by Burak Köken on 17.2.2017.
 */
public class Adres {

    private String mahalle;
    private String sehir;
    private String postaKodu;

    public Adres() {
    }

    public Adres(String mahalle, String sehir, String postaKodu) {
        this.mahalle = mahalle;
        this.sehir = sehir;
        this.postaKodu = postaKodu;
    }

    public String getMahalle() {
        return mahalle;
    }

    public void setMahalle(String mahalle) {
        this.mahalle = mahalle;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public String getPostaKodu() {
        return postaKodu;
    }

    public void setPostaKodu(String postaKodu) {
        this.postaKodu = postaKodu;
    }
}
