public abstract class ClasA {
    protected int atr1_clasA;
    protected String atr2_clasA;
    protected static int contadorA = 0;

    public ClasA(int atr1_clasA, String atr2_clasA) {
        super();
        this.atr1_clasA = atr1_clasA;
        this.atr2_clasA = atr2_clasA;
        contadorA++;
    }

    public int getAtr1_clasA() {
        return atr1_clasA;
    }

    public void setAtr1_clasA(int atr1_clasA) {
        this.atr1_clasA = atr1_clasA;
    }

    public String getAtr2_clasA() {
        return atr2_clasA;
    }

    public void setAtr2_clasA(String atr2ClasA) {
        this.atr2_clasA = atr2ClasA;
    }

    public static int getContadorA() {
        return contadorA;
    }
    public static void setContadorA(int contadorA){
        ClasA.contadorA = contadorA;
    }

    @Override
    public String toString() {
        return "ClasA: " + "atr1_clasA: " + atr1_clasA + ", atr2_clasA: " + atr2_clasA + " de tipo String en objC";
    }
}

