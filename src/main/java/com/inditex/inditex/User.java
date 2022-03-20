package com.inditex.inditex;

public class User {
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getMail() {
        return mail;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getPassword() {
        return password;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String nombre;
    private String apellido;
    private String mail;
    private String direccion;
    private String password;

    public User(String nombre, String apellido, String mail, String direccion, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.direccion = direccion;
        this.password = password;
    }
    @Override
    public boolean equals(Object obj){
        boolean d=false;
        if(obj instanceof User){
            User a = (User) obj;
            if(a.password.equals(this.password) && a.mail.equals(this.mail)){
                d=true;
            }
        }
        return d;
    }
    @Override
    public String toString(){
        return "Nombre de usuario: "+this.nombre+" con email: "+this.mail+" y con contraseña: "+this.password;
    }
}
