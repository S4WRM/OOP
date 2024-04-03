package fracccion;


public class Fracccion {

    private int numerador;
    private int denominador;

    public Fracccion(int numerador, int denominador) {
        this.setNumerador(numerador);
        this.denominador=1;
        this.setDenominador(denominador);
    }
    public Fracccion(){
       setNumerador(0); 
       setDenominador(1);
    }

    public int getNumerador() {
        return numerador;
        
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }
    
    public Fracccion(int numerador){
        setNumerador(numerador);
        setDenominador(1);
    
    }

   
    public int getDenominador() {
       
        return denominador;
    }

    private void setDenominador(int denominador) {
         if (denominador !=0){
        this.denominador=denominador;
        }
         else {
             System.out.println("denominador no puede ser 0");
                    
         }
    }

    @Override
    public String toString() {
        return "{" + numerador + "/" + denominador + '}';
    }
    
    public Fracccion multiplicar(Fracccion otra){
        int n = getNumerador() * otra.getNumerador();
        int d =  getDenominador() * otra.getDenominador();
        return new Fracccion(n,d);
   
    }
   // public Fracccion multiplicar(Fracccion a, Fracccion b){
    //return new Fracccion (get)
    
    public Fracccion dividir (Fracccion div){
         int f = getNumerador() * div.getDenominador();
         int g =  getDenominador() * div.getNumerador();
        return new Fracccion(f,g);
}
    public Fracccion sumar(Fracccion sum){
        int x = (getNumerador() * sum.getDenominador()) + (getDenominador() * sum.getNumerador());
        int y = getDenominador() * sum.getDenominador();
        return new Fracccion (x,y);
    }
  public Fracccion resta (Fracccion rest){
        int z = (getNumerador() * rest.getDenominador()) - (getDenominador() * rest.getNumerador());
        int w = getDenominador() * rest.getDenominador();
        return new Fracccion (z,w);
    }
   public double toDecimal(){
       return (double)getNumerador()/getDenominador();
   
   }
}
  
