
/**
 * This is a basic model class for a car.
 * 
 * @author (SamuelRivas) 
 * @version (1.0)
 */
public class Carro
{
    // instance variables - replace the example below with your own
    private String color; //cadena de texto
    private double galones; //este tipo de dato puede ser decimal
    private boolean encedido; //puede tener solo dos valores cierto o falso

    /**
     * Constructor for objects of class Carro
     */
    public Carro()
    {
        // initialise instance variables
        this.color = "Negro"; //palabra reservada this, que hace referencia a misma clase que se este trabajando.
        this.galones = 30.5;
        this.encedido = false;
    }

    public Carro(String newColor, double newGalones, boolean newArrancado)
    {
        // initialise instance variables
        this.color = newColor; //palabra reservada this, que hace referencia a misma clase que se este trabajando.
        this.galones = newGalones;
        this.encedido = newArrancado;
    }
}
