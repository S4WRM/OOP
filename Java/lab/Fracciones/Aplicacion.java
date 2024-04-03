package fracccion;


public class Aplicacion {
    
    public static void main(String[] args){
    Fracccion a = new Fracccion(3,5);
    Fracccion b = new Fracccion(7,6);
    Fracccion c = new Fracccion(8,11);
    System.out.println(a.toString()+ " = " + a.toDecimal());
    System.out.println(b.toString()+ " = " + b.toDecimal());
    System.out.println(c.toString()+ " = " + c.toDecimal());
    Fracccion m1 = a.multiplicar(b);
    Fracccion m2 = b.multiplicar(c);
    Fracccion m3 = c.multiplicar(a);
    System.out.println(a.toString()+"*"+b.toString()+"=" + m1.toString()+ " = " + m1.toDecimal());
    System.out.println(b.toString()+"*"+c.toString()+"=" +m2.toString()+ " = " + m2.toDecimal());
    System.out.println(c.toString()+"*"+a.toString()+"=" +m3.toString()+ " = " + m3.toDecimal());
    Fracccion d1 = a.dividir(b);
    Fracccion d2 = b.dividir(c);
    Fracccion d3 = c.dividir(a);
    System.out.println(a.toString()+"/"+b.toString()+"=" +d1.toString()+ " = " + d1.toDecimal());
    System.out.println(b.toString()+"/"+c.toString()+"=" +d2.toString()+ " = " + d2.toDecimal());
    System.out.println(c.toString()+"/"+a.toString()+"=" +d3.toString()+ " = " + d3.toDecimal());
    Fracccion s1 = a.sumar(b);
    Fracccion s2 = b.sumar(c);
    Fracccion s3 = c.sumar(a);
    System.out.println(s1.toString()+ " = " + s1.toDecimal());
    System.out.println(s2.toString()+ " = " + s2.toDecimal());
    System.out.println(s3.toString()+ " = " + s3.toDecimal());
    Fracccion r1 = a.resta(b);
    Fracccion r2 = b.resta(c);
    Fracccion r3 = c.resta(a);
    System.out.println(r1.toString()+ " = " + r1.toDecimal());
    System.out.println(r2.toString()+ " = " + r2.toDecimal());
    System.out.println(r3.toString()+ " = " + r3.toDecimal());
    }
    
}
