/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

/**
 *
 * @author DLT1CA
 */
public class Funcionario{

    private double salary;
    private String name;

    //<editor-fold defaultstate="collapsed" desc="Getters and setters">
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //</editor-fold>

    public Funcionario() {
    }

    public Funcionario(double salary, String name) {
        this.salary = salary;
        this.name = name;
    }
    
    
    
    public double[] obterSalarios(Funcionario[] f) {
        double salarios[] = new double[5];
        for (int i = 0; i < 5; i++) {
            salarios[i] = f[i].salary;
        }
        return salarios;
    }
}
