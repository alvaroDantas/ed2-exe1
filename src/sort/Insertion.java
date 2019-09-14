package sort;

/**
 *
 * @author DLT1CA
 */
public class Insertion extends Sort{

    @Override
    Funcionario[] sortAsc(Funcionario[] funcionarios) {
        double eleito = 0;
        int i, j;
        for (i = 1; i < funcionarios.length; i++) {
            eleito = funcionarios[i].getSalary();
            j = i - 1;
            while (j >= 0 && funcionarios[j].getSalary() > eleito) {
                funcionarios[j + 1].setSalary(funcionarios[j].getSalary());
                j--;
            }
            funcionarios[j + 1].setSalary(eleito);
        }
        return funcionarios;
    }

    
    @Override
    Funcionario[] sortDesc(Funcionario[] funcionarios) {
        double eleito = 0;
        int i, j;
        for (i = 1; i < 5; i++) {
            eleito = funcionarios[i].getSalary();
            j = i - 1;
            while (j >= 0 && funcionarios[j].getSalary() < eleito) {
                funcionarios[j + 1].setSalary(funcionarios[j].getSalary());
                j--;
            }
            funcionarios[j + 1].setSalary(eleito);
        }
        return funcionarios;
    }
    
    Funcionario[] sortAscString(Funcionario[] fs) {
        String eleito;
        int i, j;
        for (i = 1; i < 5; i++) {
            eleito = fs[i].getName();
            j = i - 1;
            while (j >= 0 && eleito.compareTo(fs[j].getName()) <0) {
                fs[j + 1].setName(fs[j].getName());
                j--;
            }
            fs[j + 1].setName(eleito);
        }
        return fs;
    }
    
    Funcionario[] sortDescString(Funcionario[] fs) {
        String eleito;
        int i, j;
        for (i = 1; i < 5; i++) {
            eleito = fs[i].getName();
            j = i - 1;
            while (j >= 0 && eleito.compareTo(fs[j].getName()) >0) {
                fs[j + 1].setName(fs[j].getName());
                j--;
            }
            fs[j + 1].setName(eleito);
        }
        return fs;
    }

    public Insertion() {
    }

}
