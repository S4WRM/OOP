package NewBank;

public class StakeHolder {
    
    private String name;
    private int nuip;
    private String address;
    private String mail;
    private double money;

    public StakeHolder(String name, int nuip, String address, String mail, double money) {
        this.name = name;
        this.nuip = nuip;
        this.address = address;
        this.mail = mail;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getNuip() {
        return nuip;
    }

    public String getAddress() {
        return address;
    }

    public String getMail() {
        return mail;
    }

    public double getMoney() {
        return money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setMoney(double money) {
        this.money = money;
    }
             
   
    
    public static void main(String[] args) {

         List<Integer> funds = new ArrayList<Integer>();
        funds.add(100);
        funds.add(900);
        funds.add(300);
        funds.add(800);
        funds.add(90);
        
       // funds.add(0, 750);
        for (Integer fund : funds) {
           System.out.println(fund);
        }
        
        System.out.println("*************"); 
       funds.remove(2);
       //lista actualizada 
        for (Integer fund : funds) {
           System.out.println(fund);
        }
        
        int suma=0;
         for (Integer fund : funds) {
             suma=suma+fund;
             
            System.out.println("los fondos son de:" +suma);
             
         }
  
    }
        
        
    }
    



