
package bac1;


public class Bac1{
    protected float hs0, hs1;
    public Bac1(){
        hs0 = hs1 = 0;
    }
    public Bac1(float a, float b){
        hs1 = a; hs0 = b;
    }

    public float getHs0() {
        return hs0;
    }

    public float getHs1() {
        return hs1;
    }

    public void setHs0(float hs0) {
        this.hs0 = hs0;
    }

    public void setHs1(float hs1) {
        this.hs1 = hs1;
    }

   
    public String toString() {
        return hs1 + "x" + ((hs0>=0)?" + ":"") + hs0 + " = 0";  
    }
    public String giai(){
        if(hs1==0)
            if(hs0==0) return "vô số nghiệm.";
            else return "vô nghiệm.";
        else return "\n x = " + -hs0/hs1;
    }
    
    
    
}





    
    

