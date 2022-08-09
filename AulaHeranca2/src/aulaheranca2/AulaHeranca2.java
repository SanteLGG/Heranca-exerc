/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulaheranca2;

/**
 *
 * @author luisguilherme
 */
public class AulaHeranca2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Aluno a1 = new Aluno();
    a1.setNome("Sante");
    a1.setIdade(22);
    a1.setSexo("M");
    a1.setMatricula(0001);

    
    Bolsista b1 = new Bolsista();
    b1.setNome("Adriana");
    b1.setIdade(23);
    b1.setSexo("F");
    b1.setMatricula(0002);
    b1.setBolsa(12.5f);
   
    
    Visitante v1 = new Visitante();
    v1.setNome("Cavalo");
    v1.setIdade(19);
    v1.setSexo("M");
    
    Professor p1 = new Professor();
    p1.setNome("Cachorro");
    p1.setIdade(21);
    p1.setSexo("M");
    p1.setEspecialidade("DEV");
    p1.setSalario(1234.4f);
    
    
    Tecnico t1 = new Tecnico();
    t1.setNome("Harry Potter");
    t1.setIdade(30);
    t1.setSexo("M");
    t1.setMatricula(0003);
    t1.setCurso("Java POO");
    t1.setRegistroProfi(12345);
    
    System.out.println(a1.toString());
    System.out.println(b1.toString());
    System.out.println(v1.toString());
    System.out.println(p1.toString());
        /*
         *System.out.println(p1.getSalario());
         *p1.receberAumento(100);               // teste para funcionalidade de aum. professor
         *System.out.println(p1.getSalario());
         */
        
    System.out.println(t1.toString());
    
    }
    
    
}
