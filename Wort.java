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
    
    public boolean equals(Object obj){
        if(obj.toString().equals(wort)|obj.toString().equals(bedeutung)){
            return true;
        }
        return false;
    }
}
