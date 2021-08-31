
package bac1;


public class Bac1{
    protected float numberA, numberB;
    public Bac1(){
        numberA = numberB = 0;
    }
    public Bac1(float a, float b){
        numberB = a; numberA = b;
    }

    public float getHs0() {
        return numberA;
    }

    public float getHs1() {
        return numberB;
    }

    public void setHs0(float hs0) {
        this.numberA = hs0;
    }

    public void setHs1(float hs1) {
        this.numberB = hs1;
    }

   
    public String toString() {
        return numberB + "x" + ((numberA>=0)?" + ":"") + numberA + " = 0";  
    }
    public String giai(){
        if(numberB==0)
            if(numberA==0) return "vô số nghiệm.";
            else return "vô nghiệm.";
        else return "\n x = " + -numberA/numberB;
    }
    
    
    
}





    
    

