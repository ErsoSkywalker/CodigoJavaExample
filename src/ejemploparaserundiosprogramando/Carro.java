
package ejemploparaserundiosprogramando;

public class Carro implements vehiculo{
    
    protected String Color;
    private int numeroPuertas;
    
    
    //Carro(String,int)
    public Carro(String Color, int numeroPuertas){
        this.Color = Color;
        this.numeroPuertas = numeroPuertas;
    }
    
    
    

    /**
     * @return the Color
     */
    public String getColor() {
        return Color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * @return the numeroPuertas
     */
    public int getNumeroPuertas() {
        return numeroPuertas;
    }
    
    /**
     * @param numeroPuertas the numeroPuertas to set
     */
    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void avanzar() {
        System.out.println("Avanzar a madres");
    }
    
}


