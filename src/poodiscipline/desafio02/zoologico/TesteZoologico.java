package poodiscipline.desafio02.zoologico;

import java.util.Scanner;

public class TesteZoologico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Zoologico zoologico = new Zoologico();
        while(true){
            int op;
            System.out.println("Sistema Zoologico");
            System.out.println("1- Listar animais");
            System.out.println("2- Adicionar animal");
            System.out.println("3- Listar funcionarios");
            System.out.println("4- Adicionar funcionario");
            System.out.println("5- Alterar nome de animal");
            System.out.println("6- Cuidar dos animais");
            System.out.println("0- Sair");
            System.out.print("-->> ");
            op = Integer.parseInt(scanner.nextLine());

            if (op == 0) {
                System.out.println("Saindo...");
                break;
            }
            switch (op) {
                case 1:
                    if (zoologico.animais.size() == 0) {
                        System.out.println("Sem animais cadastrados");
                        break;
                    }
                    zoologico.printAnimais();
                    break;
                case 2:
                    adicionarAnimal(scanner, zoologico);
                    System.out.println("Animal adicionado com sucesso");
                    break;
                case 3:
                    if (zoologico.funcionarios.size() == 0) {
                        System.out.println("Sem funcionarios cadastrados");
                        break;
                    }
                    zoologico.printFuncionarios();
                    break;
                case 4:
                    adicionarFuncionario(scanner, zoologico);
                    System.out.println("Funcionario adicionado com sucesso");
                    break;
                case 5:
                    zoologico.printAnimais();
                    System.out.println("Id do animal a ser alterado: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Novo nome: ");
                    String novoNome = scanner.nextLine();
                    for (Animal animal : zoologico.animais) {
                        if (animal.getId() == id) {
                            zoologico.alterarNomeAnimal(animal, novoNome);
                            break;
                        }
                    }
                    System.out.println("Lista de animais alterada com sucesso");
                    zoologico.printAnimais();
                    break;
                case 6:
                    zoologico.cuidarAnimais();
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }

    static void adicionarAnimal(Scanner scanner, Zoologico zoologico){
        System.out.println("1- Adicionar mamifero");
        System.out.println("2- Adicionar ave");
        System.out.println("3- Adicionar reptil");
        System.out.print("-->> ");
        int op = Integer.parseInt(scanner.nextLine());

        switch (op) {
            case 1:
                Mamifero mamifero = new Mamifero();
                mamifero.setId(Animal.totalAnimais+1);
                Animal.totalAnimais++;
                System.out.println("Nome: ");
                mamifero.setNome(scanner.nextLine());
                System.out.println("Especie: ");
                mamifero.setEspecie(scanner.nextLine());
                System.out.println("Tempo de gestação: ");
                mamifero.setTempoGestacao(Integer.parseInt(scanner.nextLine()));
                zoologico.adicionarAnimal(mamifero);
                break;

            case 2:
                Ave ave = new Ave();
                ave.setId(Animal.totalAnimais+1);
                Animal.totalAnimais++;
                System.out.println("Nome: ");
                ave.setNome(scanner.nextLine());
                System.out.println("Especie: ");
                ave.setEspecie(scanner.nextLine());
                System.out.println("Tipo de penas: ");
                ave.setTipoPenas(scanner.nextLine());
                zoologico.adicionarAnimal(ave);
                break;

            case 3:
                Reptil reptil = new Reptil();
                reptil.setId(Animal.totalAnimais+1);
                Animal.totalAnimais++;
                System.out.println("Nome: ");
                reptil.setNome(scanner.nextLine());
                System.out.println("Especie: ");
                reptil.setEspecie(scanner.nextLine());
                System.out.println("Temperatura corporal: ");
                reptil.setTemperaturaCorporal(Double.parseDouble(scanner.nextLine()));
                zoologico.adicionarAnimal(reptil);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }

    static void adicionarFuncionario(Scanner scanner, Zoologico zoologico){
        Funcionario funcionario = new Funcionario();
        funcionario.setId(Funcionario.totalFuncionarios+1);
        Funcionario.totalFuncionarios++;
        System.out.println("Nome: ");
        funcionario.setNome(scanner.nextLine());
        System.out.println("Especialidade: ");
        funcionario.setEspecialidade(scanner.nextLine());
        zoologico.adicionarFuncionario(funcionario);
    }



}