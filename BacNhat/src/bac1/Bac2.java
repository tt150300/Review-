
package bac1;


public class Bac2 extends Bac1 {
    private float numberC;
    public Bac2(){
        super();
        numberC = 0;
    }
    public Bac2(float a, float b, float c){
        super(b,c);
        numberC = a;
    }

    public float getHs2() {
        return numberC;
    }

    public void setHs2(float hs2) {
        this.numberC = hs2;
    }

    
    public String toString() {
        String s;
        s = numberC + "x^2" + ((numberA>=0)?"+":"" + super.toString());
        return s;
    }
    
    public String giai(){
        String s ="";
        if(numberC==0) s = super.giai();
        else{
            float d = numberA*numberB-4*numberC*numberA;
            if(d<0) s = "Vô nghiệm";
            if(d==0) s ="x1 = x2 = " + numberA/2/numberC;
            if(d>0){
                float x1 = (numberB-(float)Math.sqrt(d))/2/numberC;
                float x2 = (numberB+(float)Math.sqrt(d))/2/numberC;
                s = "\nx1 = " + x1 + "\nx2 = " + x2;
            }
        }
        return s;
    }
    
    
}
