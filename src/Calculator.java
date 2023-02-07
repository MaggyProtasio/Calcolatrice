public class Calculator {
    private Integer n1;
    private Integer n2;
    private String operatore;
    public int Somma(int a, int b) {
        return n1+n2;
    }
    public int Sottrazione(int a, int b) {
        return n1-n2;
    }

    public int getN2() {
        return n2;
    }

    public int getN1() {
        return n1;
    }

    public void setN(int n) {
        if(this.n1.equals(null)) {
            this.n1 = n;
        }else{
            this.n2 = n;
        }
    }

    public String getOperatore() {
        return operatore;
    }

    public void setOperatore(String operatore) {
        this.operatore = operatore;
    }

    public int uguale (){
        int risultato = 0;
        switch(operatore){
            case "+":
                risultato = Somma(n1,n2);
                break;
            case "-":
                risultato = Sottrazione(n1,n2);
                break;
        }
        this.n1 = null;
        this.n2 = null;
        return risultato;
    }
}
