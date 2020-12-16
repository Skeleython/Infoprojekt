public class Knoten extends Listenelement
{
    Listenelement nächster;
    Datenelement daten;
    public Knoten(Datenelement daten)
    {
        this.daten = daten;
    }
    public Listenelement einfügen(Knoten k)
    {
        nächster = nächster.einfügen(k);
        return this;
    }
    public int ausgeben(int i)
    {
        i++;
        daten.ausgeben();
        return nächster.ausgeben(i);
    }
    public void nächsterSetzen(Listenelement nächster)
    {
        this.nächster = nächster;
    }
}
