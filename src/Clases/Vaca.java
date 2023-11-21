 package Clases;

public class Vaca {
    int id_vaca;
    int id_finca;
    String alias;
    String descripcion;
    String estado;

    public Vaca(int id_vaca, int id_finca, String alias, String descripcion, String estado) {
        this.id_vaca = id_vaca;
        this.id_finca = id_finca;
        this.alias = alias;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getId_vaca() {
        return id_vaca;
    }

    public void setId_vaca(int id_vaca) {
        this.id_vaca = id_vaca;
    }

    public int getId_finca() {
        return id_finca;
    }

    public void setId_finca(int id_finca) {
        this.id_finca = id_finca;
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
