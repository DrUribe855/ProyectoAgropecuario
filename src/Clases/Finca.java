
package Clases;


public class Finca {
    Integer id_finca;
    String nombre_finca;
    
    public Finca(Integer id_finca, String nombre_finca) {
        this.id_finca = id_finca;
        this.nombre_finca = nombre_finca;
    }

    public Integer getId_finca() {
        return id_finca;
    }

    public void setId_fnca(Integer id_finca) {
        this.id_finca = id_finca;
    }

    public String getNombre_finca() {
        return nombre_finca;
    }

    public void setNombre_finca(String nombre_finca) {
        this.nombre_finca = nombre_finca;
    }

    
    
}
