public class Wort implements Datenelement
{
    String wort;
    String bedeutung;
    Wort(String wort,String bedeutung){
        this.wort=wort;
        this.bedeutung=bedeutung;
    }
    
    public void ausgeben(){
        System.out.println(wort+": " + bedeutung);
    }
}
