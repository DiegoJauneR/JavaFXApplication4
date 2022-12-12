
package Model;

public class Boleta {
    private int id;
    private int sala;
    private String horario;
    private int costo;
    private String fecha;
    private String asiento;

    public Boleta(int id, int sala, int costo, String horario ,String fecha, String asiento) {
        this.id = id;
        this.sala = sala;
        this.costo = costo;
        this.horario=horario;
        this.fecha = fecha;
        this.asiento = asiento;
        
    }

    public int getSala() {
        return sala;
    }
    
    public int getId() {
        return id;
    }
    
    public int getCosto() {
        return costo;
    }
    

    @Override
    public String toString() {
        return "\n--BOLETA--\n" 
                + "Id=" + id + 
                "\nSala=" + sala +
                "\nHorario=" + horario + 
                "\nCosto=" + costo + 
                "\nFecha=" + fecha+ 
                "\nAsiento=" + asiento;
    }
    
    
}
