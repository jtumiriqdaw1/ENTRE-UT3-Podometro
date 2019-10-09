
/**
 * La clase modela un sencillo pod�metro que registra informaci�n
 * acerca de los pasos, distancia, ..... que una persona (hombre o mujer)
 * ha dado en una semana. 
 * 
 * @author    - Jhoselin Tumiri Quiroz- 
 * 
 */
public class Podometro 
{
    //indica el sexo de una persona
    private final char HOMBRE = 'H';
    private final char MUJER = 'M';
    //
    private final double ZANCADA_HOMBRE = 0.45;
    private final double ZANCADA_MUJER = 0.41;
    //indica el n� de d�a de la semana
    private final int SABADO = 6;
    private final int DOMINGO = 7;
    //atributos
    //
    private String marca;
    private double altura;
    private char sexo;
    private double longitudZancada;
    //pasos dados
    private int totalPasosLaborables;
    private int totalPasosSabado;
    private int totalPasosDomingo;
    //distancias de recorridos
    private double totalDistanciaSemana;
    private double totalDistanciaFinSemana;
    //tiempos de recorridos
    private int tiempo;
    private int caminatasNoches;
    
    
  
    

    /**
     * Inicializa el pod�metro con la marca indicada por el par�metro.
     * El resto de atributos se ponen a 0 y el sexo, por defecto, es mujer
     */
    public Podometro(String nombreMarca) {
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
     * Accesor para la marca
     *  
     */
    public String getMarca(){
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
            altura= queAltura;
            sexo= queSexo;
            longitudZancada = 0;
            if (queSexo == 'M' ) {
                Math.floor (queAltura * ZANCADA_MUJER); 
            }
            else if (queSexo == 'H'){
               Math.ceil (queAltura * ZANCADA_HOMBRE); 
            }
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
           pasos = totalPasosLaborables + totalPasosSabado + totalPasosDomingo; 
          
           int totalPasosSabado;
           switch (dia ){
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:  
            break;
            case 7:  
            break;
            
            
            
            }
          
         
         
            

    }
    
     /**
     * Muestra en pantalla la configuraci�n del pod�metro
     * (altura, sexo y longitud de la zancada)
     * 
     * (ver enunciado)
     *  
     */
    public void printConfiguracion() {
        double alturaMtrs = altura / 100;
        String quesexo;
        double longitudZancadaMtrs = longitudZancada /100; 
         System.out.println("\n Configuraci�n del pod�metro\n ********************************************" + "\n Altura" + ":" + alturaMtrs + "Mtrs" +  
                            "\n Sexo:"  +  sexo + "\n Longitud zancada" + ":"  +  longitudZancadaMtrs + "Mtrs");
        
      

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
        
        return "a";
    
        

    
    } 
   
    
    
    
    /**
     * Restablecer los valores iniciales del pod�metro
     * Todos los atributos se ponen a cero salvo el sexo
     * que se establece a MUJER. La marca no var�a
     *  
     */    
    public void reset(String nombreMarca) {
            marca = nombreMarca;
            altura = 0;
            sexo = MUJER;
            longitudZancada = 0;
            totalPasosLaborables = 0;
            totalPasosSabado = 0;
            totalPasosDomingo = 0;
            totalDistanciaSemana = 0;
            totalDistanciaFinSemana = 0;
            tiempo = 0;
            caminatasNoches = 0;
            
        

    }

}
