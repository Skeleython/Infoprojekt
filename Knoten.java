<<<<<<< HEAD

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
        nächster.ausgeben(i);
        daten.ausgeben();
    }
    public void nächsterSetzen(Listenelement nächster)
    {
        this.nächster = nächster;
    }

}
=======
public class Knoten extends Listenelement{
    
}
>>>>>>> ebc210ac7a3e275e1428be6a465a4af7b1e37ef8
