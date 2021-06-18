
/**
 * This is a basic model class for a car.
 * 
 * @author (SamuelRivas) 
 * @version (1.0)
 */
public class Carro
{
    // instance variables - replace the example below with your own
    private static final double MAX_GALONES = 20;
    
    private String color; //cadena de texto
    private double galones; //este tipo de dato puede ser decimal
    private boolean encendido; //puede tener solo dos valores cierto o falso
    private char asientos[];

    /**
     * Constructor for objects of class Carro
     */
    public Carro()
    {
        // initialise instance variables
        this.color = "Negro"; //palabra reservada this, que hace referencia a misma clase que se este trabajando.
        this.galones = 30.5;
        this.encendido = false;
        this.asientos = new char[]{'-','-','-','-'};
    }

    public Carro(String newColor, double newGalones, boolean newArrancado)
    {
        // initialise instance variables
        this.color = newColor; //palabra reservada this, que hace referencia a la misma clase donde se esta trabajando.
        //this.galones = newGalones;
        if(newGalones < MAX_GALONES){
            this.galones = newGalones;
        }else{
            this.galones = 0.0;
        }
        this.encendido = newArrancado;
    }
    
    
    //metodo para asignar el valor de la propiedad a la clase carro (getters and setters)
    public void setColor(String newColor){
        this.color = newColor;
    }
    
    public void setGalones(double newGalones){
        if(newGalones < MAX_GALONES){
            this.galones = newGalones;
        }else{
            this.galones = 0.0;
        }
    }
    
    public void setEncendido(boolean newArrancado){
        this.encendido = newArrancado;
    }
    
    // metodos para obtener los valores de las propiedades de la clase
    public String getColor(){
        return this.color;
    }
    
    public double getGalones(){
        return this.galones;
    }
    
    public boolean getEncendido(){
        return this.encendido;
    }
    
    public String toString(){
        String cad = "";
        
        cad +="El carro tiene lo siguientes atributos: ";
        cad +="\t-El Color es: " + getColor() + "\n";
        cad +="\t Tiene en el tanque: " + getGalones() + "\n";
        
        if(getEncendido() == true){
            cad +="\t-El estado del carro es Encendido";
        }else{
            cad +="\t-El estado del carro es Apagado";
        }
        
        System.out.println(cad);
        return cad;
    }
    
    public void ocuparLugar(int pos){
        this.asientos[pos] = 'x'; 
    }
    
}
