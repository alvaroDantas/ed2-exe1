package exe1;

/**
 *
 * @author DLT1CA
 */
public class Bubble1 extends Sort{
    @Override
    Funcionario[] sortAsc(Funcionario fs[]) {
        int i, j;
        double aux;
        for (i = 0; i < fs.length; i++) {
            for (j = 0; j < fs.length - 1; j++) {
                if (fs[j].getSalary() > fs[j + 1].getSalary()) {
                    aux = fs[j].getSalary();
                    fs[j].setSalary(fs[j + 1].getSalary()); 
                    fs[j + 1].setSalary(aux);
                }
            }
        }

        return fs;
    }
    @Override
    Funcionario[] sortDesc(Funcionario fs[]) {
        int i, j;
        double aux;
        for (i = 0; i < fs.length; i++) {
            for (j = 0; j < fs.length - 1; j++) {
                if (fs[j].getSalary() > fs[j + 1].getSalary()) {
                    aux = fs[j].getSalary();
                    fs[j].setSalary(fs[j + 1].getSalary()); 
                    fs[j + 1].setSalary(aux);
                }
            }
        }

        return fs;
    }
    
    Funcionario[] sortDescString(Funcionario fs[]) {
        int i, j;
        String aux;
        for (i = 0; i < fs.length; i++) {
            for (j = 0; j < fs.length - 1; j++) {
                if (fs[j].getName().compareTo(fs[j + 1].getName()) < 0 ) {
                    aux = fs[j].getName();
                    fs[j].setName(fs[j + 1].getName()); 
                    fs[j + 1].setName(aux);
                }
            }
        }

        return fs;
    }
    
    Funcionario[] sortAscString(Funcionario fs[]) {
        int i, j;
        String aux;
        for (i = 0; i < fs.length; i++) {
            for (j = 0; j < fs.length - 1; j++) {
                if (fs[j].getName().compareTo(fs[j + 1].getName()) > 0 ) {
                    aux = fs[j].getName();
                    fs[j].setName(fs[j + 1].getName()); 
                    fs[j + 1].setName(aux);
                }
            }
        }

        return fs;
    }
}
