
package sitemaempresa;

/** @author Alunos - $date  */

public class Funcionario {
    
   Integer id;
   String departamento;
   String nome;                    // atributos
   Double salario;
   String dataEntrada;
   String rg;
   Boolean ativo;
   
   public Funcionario(){                // Método Construtor
       ativo = false;
   }
   
   void bonifica(Double valor){        // método para aumentar salário
       this.salario = this.salario + valor; 
   }
   
   void demite(){                   // Metodo para demitir
       if(this.ativo == true){
        this.ativo = false;
           System.out.println("Demitido com sucesso");
       } else {
           System.out.println("Este funcionario já não trabalha mais aqui");
       }
   }
   
}
