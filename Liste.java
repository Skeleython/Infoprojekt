public class Liste
{
    Listenelement erster;
    public Liste()
    {
        erster = new Abschluss();
    }
    
    public void ausgeben()
    {
        erster.ausgeben(0);
    }
    
    /** Erstellt einen neuen Knoten mit dem Wort als Datenelement,
    der durch die Liste durchgegeben wird. **/
    public void einfügen(String wort, String bedeutung)
    {
        Wort w=new Wort(wort,bedeutung);
        Knoten k=new Knoten(w);
        erster=erster.einfügen(k);
    }
}
