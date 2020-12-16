
public class Abschluss extends Listenelement
{
    public void ausgeben(int i)
    {
        System.out.println(i);
    }
    
    Listenelement einfügen(Knoten k)
    {
        k.nächsterSetzen(this);
        return k;
    }
    
    void suchen(String suchbegriff){}
}