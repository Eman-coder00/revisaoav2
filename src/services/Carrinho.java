package services;

import models2.Material;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Material> carrinhoEmprestimos = new ArrayList<>();

    public List<Material> getCarrinhoEmprestimos() {
        return carrinhoEmprestimos;
    }

    public boolean addMaterial(Material material) {
        if (carrinhoEmprestimos.size()>5){
            return false;
        }
        if (material.getQuantidade() > 0) {
            carrinhoEmprestimos.add(material);
            return true;
        } else {
            System.out.println("sem estoque");
            return false;
        }
    }

    public void removeMaterial(Material material) {
        carrinhoEmprestimos.remove(material);
    }

    public void verCarrinho() {
        for (Material material : carrinhoEmprestimos) {
            System.out.println(material.getTitulo());
        }
    }

    public boolean finalizarEmprestimo() {
        if (carrinhoEmprestimos.isEmpty()) {
            System.out.println("Erro: Não é possível finalizar um empréstimo com o carrinho vazio.");
            return false;
        }
        for (Material m : carrinhoEmprestimos) {
            if (m.getQuantidade() == 0) {
                System.out.println("Erro ao finalizar: O material '" + m.getTitulo() + "' não possui estoque suficiente.");
                return false;
            }
        }
            System.out.println("\\n=== EMPRÉSTIMO FINALIZADO COM SUCESSO ===");
            // Regra 4 e 5: Baixar estoque e informar prazos usando Polimorfismo
            for (Material m : carrinhoEmprestimos) {
                m.setQuantidade(m.getQuantidade() - 1);
                System.out.println("Material: " + m.getTitulo() + " | Prazo de devolução: " + m.prazoDevolucao() + " dias" + " | Restante em estoque: " + m.getQuantidade());
            }
            carrinhoEmprestimos.clear();
            return true;
        }
    }
