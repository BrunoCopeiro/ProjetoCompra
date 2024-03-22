package br.ulbra.entity;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Compra {

    public ArrayList compras;

    public Compra() {
        compras = new ArrayList();
    }

    // create - Salvar add
    public void salvar(String item) {
        compras.add(item);
        JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
    }

    // read - Listar
    public String listar() {
        String res = "";
        if (!compras.isEmpty()) {
            for (int i = 0; i < compras.size(); i++) {
                res += (i + 1) + " - " + compras.get(i) + " \n ";
            }
        } else {
            res = " Lista Vazia! ";
        }
        return res;
    }

    // delete
    public void Excluir(int indice) {
        if (!compras.isEmpty()) {
            if (indice > 0 && indice <= compras.size()) {
                compras.remove(indice - 1);
            
            JOptionPane.showMessageDialog(null, " Excluido ");

        } else {
            JOptionPane.showMessageDialog(null, " Código não existe!");
        }
    }  else {
  JOptionPane.showMessageDialog(null, " Impossivel excluir, a lista está vazia!");

    }
    }
        public void Alterar ( int indice, String elemento){
            if (!compras.isEmpty()) {
            if (indice > 0 && indice <= compras.size()) {
                compras.set(indice - 1, elemento);
                  JOptionPane.showMessageDialog(null, " Alterado ");

        } else {
            JOptionPane.showMessageDialog(null, " Código não existe!");
        }
    }  else {
          JOptionPane.showMessageDialog(null, " Impossivel excluir, a lista está vazia!");
        }
    }
}