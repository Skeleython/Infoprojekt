public class Knoten extends Listenelement
{
    Listenelement nächster;
    Datenelement daten;
    public Knoten(Datenelement daten)
    {
        this.daten = daten;
    }
    /** Setzt den 
     **/
    public Listenelement einfügen(Knoten k)
    {
        nächster = nächster.einfügen(k);
        return this;
    }
    public void ausgeben(int i)
    {
        i++;
        daten.ausgeben();
        nächster.ausgeben(i);
    }
    public void nächsterSetzen(Listenelement nächster)
    {
        this.nächster = nächster;
    }
    public void suchen(String suchbegriff){
        if(daten.equals(suchbegriff)){daten.ausgeben();}
        nächster.suchen(suchbegriff);
    }
}