package sitemaempresa;

import java.util.Scanner;

/** @author Alunos - 12/09/2018  */
public class SitemaEmpresa {

    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);
        Funcionario f[] ;
        f = new Funcionario[3];         //Construindo Funcionarios
        
        for(Integer i = 0; i < 3; i++){     
          f[i] = new Funcionario();
        }
        
        Empresa e = new Empresa();              // Criando/Instânciando Empresa.
        
        e.nome = "Omicron Systems";
        e.cnpj = "07856925681";                 //Simulando Dados da Empresa
        e.folha = 200000.00;
        
        for(Integer i = 0; i < 3; i++){     //simulando método de cadastro
              if(f[i].ativo == false){
                  ent.reset();
                  System.out.println("Digite o nome do funcionário: ");
                  f[i].nome = ent.nextLine();
                  ent.reset();

                  System.out.println("Digite o rg: "); 
                  f[i].rg = ent.nextLine();
                  ent.reset();

                   System.out.println("Digite o salario: ");
                  f[i].salario = ent.nextDouble();
                  ent.reset();

                  f[i].ativo = true;
                  f[i].id = i;

                  System.out.println("Funcionario Cadastrado Com sucesso");
              } 
          }
        
        f[1].demite();  // demitindo funcinario 2
        
        System.out.println("Funcionario Ativos");      //Simulando metodo para funcionarios ativos
       for(Integer i = 0; i < 3; i++){
           if(f[i].ativo == true){
               System.out.println("Funcionario "+ f[i].nome+ "está ativo");
           }
       }
        
    }
 
    public void cadastrar(Funcionario f[]){
        Scanner ent = new Scanner(System.in);
        for(Integer i = 0; i < 3; i++){
            if(f[i].ativo == false){
                System.out.println("Digite o nome do funcionário: ");
                f[i].nome = ent.nextLine();
                ent.reset();

                System.out.println("Digite o rg: ");
                f[i].rg = ent.nextLine();
                ent.reset();

                 System.out.println("Digite o salario: ");
                f[i].salario = ent.nextDouble();
                ent.reset();

                f[i].ativo = true;
                f[i].id = i;

                System.out.println("Funcionario Cadastrado Com sucesso");
            } 
        }
        System.out.println("Todos os Funcionarios ja foram cadastrados");
 }
    
  public void list(Funcionario f[]){
      System.out.println("Funcionario Ativos");
       for(Integer i = 0; i < 3; i++){
           if(f[i].ativo == true){
               System.out.println("Funcionario "+ f[i].nome+ "está ativo");
           }
       }
  }
  
   public void reajustar(Funcionario f){
       Scanner ent = new Scanner(System.in);
       System.out.println("Digite o Novo Salario: ");
       f.salario =  ent.nextDouble();
  }
    public void folha(Empresa e){
       System.out.println("Total de gastos com a folha: "+ e.folha);
  }
}
// Obs: Tive dificuldade com a sintaxe do java