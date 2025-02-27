/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuariovideo;

/**
 *
 * @author josed
 */
public class Comentario {
    private String comentario;
    public String comentarVideo (String comentario){
        this.comentario=comentario;
        System.out.println("El comentario es: "+comentario);
        return comentario;
    }
}
