
package bac1;


public class Bac2 extends Bac1 {
    private float hs2;
    public Bac2(){
        super();
        hs2 = 0;
    }
    public Bac2(float a, float b, float c){
        super(b,c);
        hs2 = a;
    }

    public float getHs2() {
        return hs2;
    }

    public void setHs2(float hs2) {
        this.hs2 = hs2;
    }

    
    public String toString() {
        String s;
        s = hs2 + "x^2" + ((hs1>=0)?"+":"" + super.toString());
        return s;
    }
    
    public String giai(){
        String s ="";
        if(hs2==0) s = super.giai();
        else{
            float d = hs1*hs1-4*hs2*hs0;
            if(d<0) s = "Vô nghiệm";
            if(d==0) s ="x1 = x2 = " + hs1/2/hs2;
            if(d>0){
                float x1 = (hs1-(float)Math.sqrt(d))/2/hs2;
                float x2 = (hs1+(float)Math.sqrt(d))/2/hs2;
                s = "\nx1 = " + x1 + "\nx2 = " + x2;
            }
        }
        return s;
    }
    
    
}
