/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usuariovideo;

import java.util.Scanner;

/**
 *
 * @author josed
 */
public class UsuarioVideo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Usuario usuario= new Usuario("JOSE DANIEL", "daniel@gmail.com");
        Video video = new Video("Monky Flyp", 3600);
        usuario.verVideo(video);
        Comentario comentario= new Comentario();
        video.detener();
        //Comentario
        String com;
        System.out.println("Añade un comentario");
        com= s.next();
        comentario.comentarVideo(com);
        
      
        
        
    }
    
}
