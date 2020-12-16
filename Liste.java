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
<<<<<<< HEAD

     *  der durch die Liste durchgegeben wird. 
    **/
=======
    der durch die Liste durchgegeben wird. **/
>>>>>>> ebc210ac7a3e275e1428be6a465a4af7b1e37ef8
    public void einfügen(String wort, String bedeutung)
    {
        Wort w=new Wort(wort,bedeutung);
        Knoten k=new Knoten(w);
        erster=erster.einfügen(k);
    }
}
