public class Liste
{
    Listenelement erster;
    public Liste()
    {
        erster = new Abschluss();
    }
    
    public void ausgeben()
    {
        
    }
    
    public void einfügen(String wort, String bedeutung)
    {
        erster.einfügen(wort, bedeutung);
    }
}
