/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaheranca2;

/**
 *
 * @author luisguilherme
 */
public class Tecnico extends Aluno {
    private int registroProfi;
       
    public void pratricar(){
        System.out.println( this.getNome() + " está exercendo sua função de técnico, o seu registro é: " + this.registroProfi);
    }

    public int getRegistroProfi() {
        return registroProfi;
    }

    public void setRegistroProfi(int registroProfi) {
        this.registroProfi = registroProfi;
    }
    
    
}
