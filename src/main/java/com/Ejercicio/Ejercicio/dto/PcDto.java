package com.Ejercicio.Ejercicio.dto;



public class PcDto {
    private Long id;
    private  String Grafica;
    private String Procesador;
    private String Ram;
    private  String Almacenamiento;
    public PcDto (Long Id, String Grafica, String Procesador, String Ram, String Almacenamiento){
        this.id=id;
        this.Grafica=Grafica;
        this.Procesador=Procesador;
        this.Ram=Ram;
        this.Almacenamiento=Almacenamiento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAlmacenamiento() {
        return Almacenamiento;
    }

    public void setAlmacenamiento(String almacenamiento) {
        Almacenamiento = almacenamiento;
    }

    public String getProcesador() {
        return Procesador;
    }

    public void setProcesador(String procesador) {
        Procesador = procesador;
    }

    public String getGrafica() {
        return Grafica;
    }

    public void setGrafica(String grafica) {
        Grafica = grafica;
    }

    public String getRam() {
        return Ram;
    }

    public void setRam(String ram) {
        Ram = ram;
    }
}
