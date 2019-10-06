/**
 * La clase modela un sencillo pod�metro que registra informaci�n
 * acerca de los pasos, distancia, ..... que una persona (hombre o mujer)
 * ha dado en una semana. 
 * 
 * @author    - Jhoselin Tumiri Quiroz- 
 * 
 */
public class Podometro {
    //indica el sexo de una persona
    static final char HOMBRE = 'H';
    static final char MUJER = 'M';
    //
    static final double ZANCADA_HOMBRE = 0.45;
    static final double ZANCADA_MUJER = 0.41;
    //indica el n� de d�a de la semana
    static final int SABADO = 6;
    static final int DOMINGO = 7;
    //atributos
    //
    private string marca;
    private double altura;
    private char sexo;
    private double longitudZancada;
    //pasos dados
    private int totalPasosLaborables;
    private int totalPasosSabado;
    private int totalPasosDomingo;
    //distancias de recorrids
    private double totalDistanciaSemana;
    private double totalDistanciaFinSemana;
    //tiempos de recorridos
    private int tiempo;
    private int caminatasNoches;
    
    
  
    

    /**
     * Inicializa el pod�metro con la marca indicada por el par�metro.
     * El resto de atributos se ponen a 0 y el sexo, por defecto, es mujer
     */
    public Podometro(string nombreMarca) {
            marca = nombreMarca;
            altura = 0;
            sexo ='M';
            longitudZancada = 0;
            totalPasosLaborables = 0;
            totalPasosSabado = 0;
            totalPasosDomingo = 0;
            totalDistanciaSemana = 0;
            totalDistanciaFinSemana = 0;
            tiempo = 0;
            caminatasNoches = 0;
            
            
            
            
           
            
         
    }

    /**
     * accesor para la marca
     *  
     */
    public getMarca() {
        return marca;
        

    }

    /**
     * Simula la configuraci�n del pod�metro.
     * Recibe como par�metros la altura y el sexo de una persona
     * y asigna estos valores a los atributos correspondiente.
     * Asigna adem�s el valor adecuado al atributo longitudZancada
     * 
     * (leer enunciado)
     *  
     */
    public void configurar(double queAltura, char queSexo) {

        
    }

     /**
     *  Recibe cuatro par�metros que supondremos correctos:
     *    pasos - el n� de pasos caminados
     *    dia - n� de d�a de la semana en que se ha hecho la caminata 
     *              (1 - Lunes, 2 - Martes - .... - 6 - S�bado, 7 - Domingo)
     *    horaInicio � hora de inicio de la caminata
     *    horaFina � hora de fin de la caminata
     *    
     *    A partir de estos par�metros el m�todo debe realizar ciertos c�lculos
     *    y  actualizar� el pod�metro adecuadamente  
     *   
     *   (leer enunciado del ejercicio)
     */
    public void registrarCaminata(int pasos, int dia, int horaInicio,
                            int horaFin) {

        

    }
    
     /**
     * Muestra en pantalla la configuraci�n del pod�metro
     * (altura, sexo y longitud de la zancada)
     * 
     * (ver enunciado)
     *  
     */
    public void printConfiguracion() {

        

    }

    /**
     * Muestra en pantalla informaci�n acerca de la distancia recorrida,
     * pasos, tiempo total caminado, ....
     * 
     * (leer enunciado)
     *  
     */
    public void printEstad�sticas() {

        

    }

   

    /**
     *  Calcula y devuelve un String que representa el nombre del d�a
     *  en el que se ha caminado m�s pasos - "S�BADO"   "DOMINGO" o  "LABORABLES"
     */
    public String diaMayorNumeroPasos() {

        
        

    }

    /**
     * Restablecer los valores iniciales del pod�metro
     * Todos los atributos se ponen a cero salvo el sexo
     * que se establece a MUJER. La marca no var�a
     *  
     */    
    public void reset() {

        

    }

}
