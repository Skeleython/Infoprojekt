public class Knoten extends Listenelement
{
    Listenelement nächster;
    Datenelement daten;
    public Knoten(Datenelement daten)
    {
        this.daten = daten;
    }
    
    /** Setzt seinen nächsten auf den Returnwert
     *  der Methode ausgeben() im nächsten mit den
     *  Eingabewerten k der übergeben wurde.
     *  anschließend returned sich selber.
     */
    public Listenelement einfügen(Knoten k)
    {
        nächster = nächster.einfügen(k);
        return this;
    }
    
    /** Erhöt den  Zähler i um Eins.
     *  ruft im 
     * 
     */
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
    public void suchenUndAusgeben(String suchbegriff){
        if(daten.equals(suchbegriff)){daten.ausgeben();}
        nächster.suchenUndAusgeben(suchbegriff);
    }
}