 package Clases;

public class Vaca {
    
    int id_vaca;
    String nombre_finca;
    String alias;
    String descripcion;
    String estado;

   
    public Vaca(int id_vaca, String nombre_finca, String alias, String descripcion, String estado) {
        this.id_vaca = id_vaca;
        this.nombre_finca = nombre_finca;
        this.alias = alias;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public String getNombre_finca() {
        return nombre_finca;
    }

    public void setNombre_finca(String nombre_finca) {
        this.nombre_finca = nombre_finca;
    }

    public int getId_vaca() {
        return id_vaca;
    }

    public void setId_vaca(int id_vaca) {
        this.id_vaca = id_vaca;
    }


    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
