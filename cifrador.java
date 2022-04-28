import java.util.Scanner;

public class cifrador {

    public static void main(String args[]){

        Scanner s = new Scanner(System.in);

        // menu inicial
        System.out.println("Bem vindo ao programa cifrador!");
        System.out.println("Selecione a opção desejada ");
        System.out.println("1. Cifrar \n2. Decifrar \n3. Sair");
        System.out.print("Digite uma opção: ");
        
        String opcao = s.nextLine();
        boolean parar = false;

       while (parar == false){
            switch(opcao){
                case "1":
                    System.out.print("Digite o texto: ");
                    String cifrar = s.nextLine();
                    System.out.print("Texto cifrado: ");
                    for (int i = 0; i < cifrar.length(); i++) {
                        if(cifrar.charAt(i) == ' '){
                            System.out.print(" ");
                        }else{
                            System.out.print("p" + cifrar.charAt(i));
                        }
                    }
                    break;
                case "2":
                    System.out.print("Digite o texto: ");
                    String decifrar = s.nextLine();
                    System.out.print("Texto decifrado: ");
                    for (int i = 0; i < decifrar.length(); i++) {
                        if(decifrar.charAt(i) == ' '){
                            System.out.print(" ");
                        }else if(decifrar.charAt(i) == 'p'){ // verificar quando é ppp
                            if((decifrar.charAt(i+1) != 'p')){
                                System.out.print(decifrar.charAt(i + 1)); 
                            }else{
                                System.out.print(decifrar.charAt(i));
                            }
                        }
                    }
                    break;  
                case "3":
                    System.out.println("Saindo...");
                    parar = true;
                    break;
                default: 
                    System.out.println("Opção inválida!");
                    break;
                }

            if(parar == false){
                System.out.println("\n\nSelecione a opção desejada ");
                System.out.println("1. Cifrar \n2. Decifrar \n3. Sair");
                System.out.print("Digite uma opção: ");
            
                opcao = s.nextLine();
            }  
        }
}}