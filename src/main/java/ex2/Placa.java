package ex2;
enum Orientare{
    LUNGIME,
    LATIME,
    ORICARE
}
/**
 * Class representing a Placa entity.
 *
 * A Placa is described by its dimensions, orientation, and edge characteristics,
 * along with the number of pieces.
 */
public class Placa {
    private String descriere;
    private int lungime;
    private int latime;
    private Orientare orientare;
    private boolean[] canturi=new boolean[4];
    private int nr_bucati;
    public Placa() {}
    public Placa(String descriere, int lungime, int latime, Orientare orientare, boolean[] canturi,int nr_bucati)
    {
        this.descriere = descriere;
        this.lungime = lungime;
        this.latime = latime;
        this.orientare = orientare;
        this.canturi = canturi;
        this.nr_bucati = nr_bucati;
    }
    public String getDescriere()
    {
        return descriere;
    }
    public void setDescriere(String descriere)
    {
        this.descriere = descriere;
    }
    public int getLungime()
    {
        return lungime;
    }
    public void setLungime(int lungime)
    {
        this.lungime = lungime;
    }
    public int getLatime()
    {
        return latime;
    }
    public void setLatime(int latime)
    {
        this.latime = latime;
    }
    public Orientare getOrientare()
    {
        return orientare;
    }
    public void setOrientare(Orientare orientare)
    {
        this.orientare = orientare;
    }
    public boolean[] getCanturi()
    {
        return canturi;
    }
    public void setCanturi(boolean[] canturi)
    {
        this.canturi = canturi;
    }
    public int getNr_bucati()
    {
        return nr_bucati;
    }
    public void setNr_bucati(int nr_bucati)
    {
        this.nr_bucati = nr_bucati;
    }
    @Override
    public String toString()
    {
        return "\nDescriere: "+descriere+"\n"+"Lungime: "+lungime+"\n"+"Latime: "+latime+"\n"+"Orientare: "+orientare.toString()+"\n"+"Canturi: "+canturi[0]+" "+canturi[1]+" "+canturi[2]+" "+canturi[3]+"\n"+"Nr_buc: "+nr_bucati+"\n";
    }

}
