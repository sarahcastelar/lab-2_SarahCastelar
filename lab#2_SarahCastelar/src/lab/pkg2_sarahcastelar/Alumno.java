package lab.pkg2_sarahcastelar;


public class Alumno {
    
    private String nombre;
    private String NoCuenta;
    private String fechaNacimiento;
    private String edad;
    private String ciudad;
    private String nacionalidad;
    private String ID;
    private String user;
    private String password;
    private String notas;

    public Alumno() {
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    
    
    public Alumno(String nombre, String NoCuenta, String fechaNacimiento, String edad, String ciudad, String nacionalidad, String ID, String user, String password) {
        this.nombre = nombre;
        this.NoCuenta = NoCuenta;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.ciudad = ciudad;
        this.nacionalidad = nacionalidad;
        this.ID = ID;
        this.user = user;
        this.password = password;
        //this.notas = notas; AGREGAR NOTAS EN PARAMETRO
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNoCuenta() {
        return NoCuenta;
    }

    public void setNoCuenta(String NoCuenta) {
        this.NoCuenta = NoCuenta;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Info. Alumno: \n" 
                + "Nombre: " + nombre + "\n"
                + "NoCuenta: " + NoCuenta + "\n"
                + "Fecha de Nacimiento: " + fechaNacimiento + "\n"
                + "Edad: " + edad + "\n"
                + "Ciudad:" + ciudad + "\n"
                + "Nacionalidad:" + nacionalidad + "\n"
                + "ID:" + ID + "\n"
                + "User:" + user + "\n"
                +"Notas:" + notas + "\n" ;
    }
    
    
    
    
}
