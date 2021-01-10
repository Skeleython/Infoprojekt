public class Wort implements Datenelement
{
    String wort;
    String bedeutung;
    Wort(String wort,String bedeutung){
        this.wort=wort;
        this.bedeutung=bedeutung;
    }
    
    /**
     * Gibt das Wort mit seiner Bedeutung aus.
     */
    public void ausgeben(){
        System.out.println(wort+": " + bedeutung);
    }
    
    /**
     * Überschreibt die equals Mehode von Object um true zu returnen, 
     * wenn es ein Object bekommt, bei der die toString Methode dem Wort
     * oder der Bedeutung entspricht.
     */
    public boolean equals(Object obj){
        if(obj.toString().equals(wort)|obj.toString().equals(bedeutung)){
            return true;
        }
        return false;
    }
    
    /**
     * Überschreibt die toString Methode, damit equals(this) true ist.
     */
    public String toString(Object obj){
        return wort;
    }
}
