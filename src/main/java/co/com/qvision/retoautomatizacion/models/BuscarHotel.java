package co.com.qvision.retoautomatizacion.models;

public class BuscarHotel {

    private String ciudad;
    private String fechaInicio;
    private String fechaFin;
    private String habitaciones;
    private String numeroAdultos;
    private String numeroNinos;

    public BuscarHotel(String ciudad, String fechaInicio, String fechaFin, String habitaciones,
                       String numeroAdultos, String numeroNinos) {
        this.ciudad = ciudad;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.habitaciones = habitaciones;
        this.numeroAdultos = numeroAdultos;
        this.numeroNinos = numeroNinos;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(String habitaciones) {
        this.habitaciones = habitaciones;
    }

    public String getNumeroAdultos() {
        return numeroAdultos;
    }

    public void setNumeroAdultos(String numeroAdultos) {
        this.numeroAdultos = numeroAdultos;
    }

    public String getNumeroNinos() {
        return numeroNinos;
    }

    public void setNumeroNinos(String numeroNinos) {
        this.numeroNinos = numeroNinos;
    }
}
