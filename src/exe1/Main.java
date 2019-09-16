package exe1;

import java.util.Scanner;

/**
 *
 * @author DLT1CA
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Insertion insertion = new Insertion();
        Merge merge = new Merge();
        Bubble1 bubble1 = new Bubble1();
        Funcionario[] fs = new Funcionario[5];

        lerFuncionarios(scanner, fs);
        System.out.println("Selecione o exercício: \n1 - A\n2 - B\n3 - C");
        int opcExe = scanner.nextInt();

        switch (opcExe) {
            case 1:
                //<editor-fold desc="ExeA">
                int opcSortAsc = lerOpc(scanner);

                switch (opcSortAsc) {
                    case 1:
                        insertion.sortAsc(fs);
                        break;
                    case 2:
                        bubble1.sortAsc(fs);
                        break;
                    case 3:
                        merge.mergeAsc(fs, 0, fs.length - 1);
                        break;
                    default:
                        break;

                }
                System.out.println(System.getProperty("line.separator"));
                System.out.println("Todos os funcionários listados de forma crescente pelo salário");
                listarFuncionarios(fs);
                break;
            //</editor-fold>
            case 2:
                //<editor-fold desc="ExeB">
                int opcSortDesc = lerOpc(scanner);

                switch (opcSortDesc) {
                    case 1:
                        insertion.sortDesc(fs);
                        break;
                    case 2:
                        bubble1.sortDesc(fs);
                        break;
                    case 3:
                        merge.mergeDesc(fs, 0, fs.length - 1);
                        break;
                    default:
                        break;

                }
                System.out.println(System.getProperty("line.separator"));
                System.out.println("Todos os funcionários listados de forma decrescente pelo salário");
                listarFuncionarios(fs);
                break;
            //</editor-fold>
            case 3:
                //<editor-fold desc="ExeC">
                int opcSortStr = lerOpc(scanner);

                switch (opcSortStr) {
                    case 1:
                        insertion.sortAscString(fs);
                        break;
                    case 2:
                        bubble1.sortAscString(fs);
                        break;
                    case 3:
                        merge.mergeAscString(fs, 0, fs.length-1);
                        break;
                    default:
                        break;

                }
                System.out.println(System.getProperty("line.separator"));
                System.out.println("Todos os funcionários listados em ordem alfabética");
                listarFuncionarios(fs);
                break;
            //</editor-fold>
        }
    }

    public static int lerOpc(Scanner scanner) {
        System.out.println("Selecione um dos métodos de ordenação");
        System.out.println("1 - INSERT SORT");
        System.out.println("2 - BUBBLE SORT1");
        System.out.println("3 - MERGE SORT");
        int opcSort = scanner.nextInt();
        return opcSort;
    }

    public static void lerFuncionarios(Scanner scanner, Funcionario[] f) {
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + "ºfuncionário");
            Funcionario aux;
            aux = new Funcionario();
            System.out.println("Nome: ");
            aux.setName(scanner.next());
            System.out.println("Salário: ");
            aux.setSalary(scanner.nextDouble());
            System.out.println(System.getProperty("line.separator"));

            f[i] = aux;
        }
    }

    private static void listarFuncionarios(Funcionario[] funcionarios) {
        for (Funcionario f : funcionarios) {
            System.out.print(f.getName() + ", " + f.getSalary());
            System.out.println(System.getProperty("line.separator"));
        }
    }

}
