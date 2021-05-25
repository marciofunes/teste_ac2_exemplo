
package ac2_exemplo;

import java.util.Scanner;

public class AC2_exemplo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String cpf, senha;
        int escolha;
        System.out.println("Olá, seja muito bem-vindo ao banco X");
        //Colher a informação do CPF
        System.out.println("Digite seu CPD: ");
        cpf = ler.nextLine();
        
        if(cpf == "123.456.789.00"){
            //colher informação de senha
            System.out.println("Digite sua senha: ");
            senha = ler.nextLine();
            
            if(senha == "123456"){
                               
                System.out.println("1 - Saldo");
                System.out.println("2 - Depósito");
                System.out.println("3 - Saque");
                System.out.println("0 - Sair");
                System.out.print("Digite uma opção: ");
                escolha = ler.nextInt();
                
                switch(escolha){
                    case 1:
                    break;
                    
                    case 2:
                    break;
                }
                
                
            } else{
                System.out.println("Senha incorreta");
            }
            
        } else{
            System.out.println("CPF incorreto, acesso negado!!");
        }
    }
    
}
