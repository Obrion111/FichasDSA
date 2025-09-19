/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficha0_dsa;

/**
 *
 * @author Diogo
 */
public class Complexo {
    
    private double real;
    private double imaginario;
    
    
    
    
    public Complexo(){
        this.real = 0;
        this.imaginario = 0;
    }
    
    public Complexo(double real, double imaginario){
       
        this.real = real;
        this.imaginario = imaginario;
        
        
        
    }
    
    
    
    public double getParteReal(){
        
        return real;
    }
    
    
    public double getParteImaginaria(){
        
        
        return imaginario;
    }
    
    
    public static Complexo somar(Complexo c1, Complexo c2){
        
        
       
       
       
       double somaReal = c1.getParteReal() + c2.getParteReal();
       double somaImaginaria = c1.getParteImaginaria() + c2.getParteImaginaria();
      
       return new Complexo(somaReal, somaImaginaria);
       
    }
    
    
    
    public static Complexo subtrair(Complexo c1, Complexo c2){
        
        
        
        double subtracaoReal = c1.getParteReal() - c2.getParteReal();
        double subtracaoImaginaria = c1.getParteImaginaria() - c2.getParteImaginaria();
        
        
        
        return new Complexo(subtracaoReal, subtracaoImaginaria);
        
    }
    
    
    
    public static Complexo multiplicar(Complexo c1, Complexo c2){
        
        
        
        double real = c1.getParteReal() * c2.getParteReal() - c1.getParteImaginaria() * c2.getParteImaginaria();
        double imaginaria = c1.getParteReal() * c2.getParteImaginaria() + c1.getParteImaginaria() * c2.getParteReal();
        
        
        return new Complexo(real, imaginaria);
        
        
        
    }
    
    
    
    public static Complexo dividir(Complexo c1, Complexo c2){
        
        
        double a = c1.getParteReal();
        double b = c1.getParteImaginaria();
        double c = c2.getParteReal();
        double d = c2.getParteImaginaria();
        
        double denominador = c * c + d * d;
        
        
        
        double real = (a*c + b*d) / denominador;
        
        double imaginaria = (b*c - a*d) / denominador;
        
        
        
        return new Complexo(real,imaginaria);
        
                
        
        
        
        
    }
    
   
    
    
    
    
    
    public static Complexo conjugado(Complexo c){
        
        
        
        
        return new Complexo(c.getParteReal(), -c.getParteImaginaria());
    }
    
    
    
    
    public String toString(){
        
        
        return real + "+" + imaginario + "i";
        
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Complexo other = (Complexo) obj;
        if (Double.doubleToLongBits(this.real) != Double.doubleToLongBits(other.real)) {
            return false;
        }
        return Double.doubleToLongBits(this.imaginario) == Double.doubleToLongBits(other.imaginario);
    }
    
    
    
 
    
    
    public Object clone() throws CloneNotSupportedException{
        
        
        return new Complexo(real,imaginario);
    }
    
    
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
