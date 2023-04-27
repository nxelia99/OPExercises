public class ClasD extends ClasB implements InterA, InterB{
    private final int atr1_clasD = 3;
    private double atr2_clasD;
    private String atr3_clasD;
    public ClasD(EnumA enum1, int atr1_clasA, String atr2_clasA, int atr1_clasD, double atr2_clasD, String atr3_clasD) {
        super(enum1, atr1_clasA, atr2_clasA);
        this.atr2_clasD = atr2_clasD;
        this.atr3_clasD = atr3_clasD;
    }

    public int getAtr1_clasD(){
        return atr1_clasD;
    }

    public double getAtr2_clasD(){
        return atr2_clasD;
    }
    public void setAtr2_clasD(double atr2_clasD){
        this.atr2_clasA = atr2_clasA;
    }
    public String getAtr3_clasD(){
        return atr3_clasD;
    }
    public void setAtr3_clasD(String atr3_clasD){
        this.atr3_clasD = atr3_clasD;
    }

    @Override
    public double metodoAbsClasB(int numero) {
        return numero * 0.76;
    }

    @Override
    public String toString(){
        return super.toString() + ", ClasD [atr1_clasD=" + atr1_clasD + ", atr2_clasD=" + atr2_clasD + ", atr3_clasD=" + atr3_clasD;
    }
    public void print1(String text){
        System.out.println("método de la interfaz B en la clase D");
    }
}
