package usuariovideo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author josed
 */
public class Usuario {
    private String nombre;
    private String correo;
    
    
    public Usuario(String nombre, String correo){
        this.nombre=nombre;
        this.correo=correo;
    }
    
    public void verVideo(Video video){
        System.out.println(nombre + "Esta viendo el video: "+video.getTitulo());
        video.reproducir();
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
}
