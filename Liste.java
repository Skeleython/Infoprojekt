public class Liste
{
    Listenelement erster;
    public Liste()
    {
        erster = new Abschluss();
    }
    
    /** Ruft die methode einfügen im ersten Knoten/Abschluss auf 
     *  und übergibt als Startwert für den zähler 0. 
    **/
    public void ausgeben()
    {
        erster.ausgeben(0);
    }
    
    /** Erstellt einen neuen Knoten mit dem Wort als Datenelement,

     *  der durch die Liste durchgegeben wird. 
    **/
    public void einfügen(String wort, String bedeutung)
    {
        Wort w=new Wort(wort,bedeutung);
        Knoten k=new Knoten(w);
        erster=erster.einfügen(k);
    }
}
