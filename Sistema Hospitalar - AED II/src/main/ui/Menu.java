import java.util.Scanner;
public class Menu{
    Scanner scanner = new Scanner(System.in);
    public void iniciar(){
        int opcao;
        do{
            System.out.println("1. Inserir paciente");
            System.out.println("2. Atender paciente");
            opcao = scanner.nextInt();

            switch(opcao){
                case 1:
                    sistema.inserirPaciente();
                    break;

                case 2:
                    sistema.atenderPaciente();
                    break;

            }
        }while(opcao != 0);
    }
}