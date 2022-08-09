/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaheranca2;

/**
 *
 * @author luisguilherme
 */
public class Bolsista extends Aluno {
    private float bolsa;
    
    public void RenvarBolsa(){
        System.out.println("Bolsa de " + this.getNome() + " foi paga!");
    }

    @Override
    public void PagarMensal() {
        System.out.println(this.getNome() + " é bolsista! A mensalidade foi paga com desconto.");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    
    
}
