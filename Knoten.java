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
    public void ausgeben(int i)
    {
        i++;
        nächster.ausgeben(i);
        daten.ausgeben();
    }
    public void nächsterSetzen(Listenelement nächster)
    {
        this.nächster = nächster;
    }
}