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
public class Merge{
    public void mergeAsc(Funcionario fs[], int inicio, int fim){
        int meio;
        if (inicio < fim) {
            meio = (inicio + fim) / 2;
            mergeAsc(fs, inicio, meio);
            mergeAsc(fs, meio + 1, fim);
            intercalaAsc(fs, inicio, fim, meio);
        }
    }
    public Funcionario[] intercalaAsc(Funcionario fs[], int inicio, int fim, int meio) {
        int inicioVet1 = inicio, inicioVet2 = meio + 1, i;
        Funcionario[] aux = new Funcionario[fs.length];
        int indiceVetorAux = inicio;

        while (inicioVet1 <= meio && inicioVet2 <= fim) {
            if (fs[inicioVet1].getSalary() <= fs[inicioVet2].getSalary()) {
                aux[indiceVetorAux] = fs[inicioVet1];
                inicioVet1++;
            } else {
                aux[indiceVetorAux] = fs[inicioVet2];
                inicioVet2++;
            }
            indiceVetorAux++;
        }

        for (i = inicioVet1; i <= meio; i++) {
            aux[indiceVetorAux] = fs[i];
            indiceVetorAux++;
        }

        for (i = inicioVet2; i <= fim; i++) {
            aux[indiceVetorAux] = fs[i];
            indiceVetorAux++;
        }
        
        for (i = inicio; i <= fim; i++) {
            fs[i] = aux[i];
        }

        return aux;
    }
    
    public void mergeDesc(Funcionario fs[], int inicio, int fim){
        int meio;
        if (inicio < fim) {
            meio = (inicio + fim) / 2;
            mergeDesc(fs, inicio, meio);
            mergeDesc(fs, meio + 1, fim);
            intercalaDesc(fs, inicio, fim, meio);
        }
    }
    public Funcionario[] intercalaDesc(Funcionario fs[], int inicio, int fim, int meio) {
        int inicioVet1 = inicio, inicioVet2 = meio + 1, i;
        Funcionario[] aux = new Funcionario[fs.length];
        int indiceVetorAux = inicio;

        while (inicioVet1 <= meio && inicioVet2 <= fim) {
            if (fs[inicioVet1].getSalary() >= fs[inicioVet2].getSalary()) {
                aux[indiceVetorAux] = fs[inicioVet1];
                inicioVet1++;
            } else {
                aux[indiceVetorAux] = fs[inicioVet2];
                inicioVet2++;
            }
            indiceVetorAux++;
        }

        for (i = inicioVet1; i <= meio; i++) {
            aux[indiceVetorAux] = fs[i];
            indiceVetorAux++;
        }

        for (i = inicioVet2; i <= fim; i++) {
            aux[indiceVetorAux] = fs[i];
            indiceVetorAux++;
        }
        
        for (i = inicio; i <= fim; i++) {
            fs[i] = aux[i];
        }

        return fs;
    }
    
    public void mergeDescString(Funcionario fs[], int inicio, int fim){
        int meio;
        if (inicio < fim) {
            meio = (inicio + fim) / 2;
            mergeDescString(fs, inicio, meio);
            mergeDescString(fs, meio + 1, fim);
            intercalaDescString(fs, inicio, fim, meio);
        }
    }
    
    public Funcionario[] intercalaDescString(Funcionario fs[], int inicio, int fim, int meio) {
        int inicioVet1 = inicio, inicioVet2 = meio + 1, i;
        Funcionario[] aux = new Funcionario[fs.length];
        int indiceVetorAux = inicio;

        while (inicioVet1 <= meio && inicioVet2 <= fim) {
            if (fs[inicioVet1].getName().compareTo(fs[inicioVet2].getName())>=0) {
                aux[indiceVetorAux] = fs[inicioVet1];
                inicioVet1++;
            } else {
                aux[indiceVetorAux] = fs[inicioVet2];
                inicioVet2++;
            }
            indiceVetorAux++;
        }

        for (i = inicioVet1; i <= meio; i++) {
            aux[indiceVetorAux] = fs[i];
            indiceVetorAux++;
        }

        for (i = inicioVet2; i <= fim; i++) {
            aux[indiceVetorAux] = fs[i];
            indiceVetorAux++;
        }
        
        for (i = inicio; i <= fim; i++) {
            fs[i] = aux[i];
        }

        return fs;
    }
    
    public void mergeAscString(Funcionario fs[], int inicio, int fim){
        int meio;
        if (inicio < fim) {
            meio = (inicio + fim) / 2;
            mergeAscString(fs, inicio, meio);
            mergeAscString(fs, meio + 1, fim);
            intercalaAscString(fs, inicio, fim, meio);
        }
    }
    
    public Funcionario[] intercalaAscString(Funcionario fs[], int inicio, int fim, int meio) {
        int inicioVet1 = inicio, inicioVet2 = meio + 1, i;
        Funcionario[] aux = new Funcionario[fs.length];
        int indiceVetorAux = inicio;

        while (inicioVet1 <= meio && inicioVet2 <= fim) {
            if (fs[inicioVet1].getName().compareTo(fs[inicioVet2].getName())<=0) {
                aux[indiceVetorAux] = fs[inicioVet1];
                inicioVet1++;
            } else {
                aux[indiceVetorAux] = fs[inicioVet2];
                inicioVet2++;
            }
            indiceVetorAux++;
        }

        for (i = inicioVet1; i <= meio; i++) {
            aux[indiceVetorAux] = fs[i];
            indiceVetorAux++;
        }

        for (i = inicioVet2; i <= fim; i++) {
            aux[indiceVetorAux] = fs[i];
            indiceVetorAux++;
        }
        
        for (i = inicio; i <= fim; i++) {
            fs[i] = aux[i];
        }

        return fs;
    }
}
