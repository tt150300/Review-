
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
        s = numberC + "x^2" + ((hs1>=0)?"+":"" + super.toString());
        return s;
    }
    
    public String giai(){
        String s ="";
        if(numberC==0) s = super.giai();
        else{
            float d = hs1*hs1-4*numberC*hs0;
            if(d<0) s = "Vô nghiệm";
            if(d==0) s ="x1 = x2 = " + hs1/2/numberC;
            if(d>0){
                float x1 = (hs1-(float)Math.sqrt(d))/2/numberC;
                float x2 = (hs1+(float)Math.sqrt(d))/2/numberC;
                s = "\nx1 = " + x1 + "\nx2 = " + x2;
            }
        }
        return s;
    }
    
    
}
