package services;

import models2.Material;

import java.util.ArrayList;
import java.util.List;

public class Carrinho2 {
    private List<Material> carrinho = new ArrayList<>();

    public List<Material> getCarrinho() {
        return carrinho;
    }
    public void addMaterial(Material material){
        if (carrinho.size()>5){
            System.out.println("limite atingido de itens");
        } else if (material.getQuantidade()<=0) {
            System.out.println("produto indisponivel");
        }
        else {
            carrinho.add(material);
            System.out.println("material adicionado");
            System.out.println(material.getTitulo());
        }
    }
    public void removeMaterial(Material material){
        carrinho.remove(material);
    }
    public void finalizarCarrinho(){
        if (carrinho.isEmpty()){
            System.out.println("caarinho vazio");
            return;
        }
        for (Material m : carrinho){
            m.setQuantidade(m.getQuantidade()-1);
            System.out.println(m.getTitulo());
            System.out.println("prazo: "+m.prazoDevolucao());
        }
        System.out.println("operacao feita");
        carrinho.clear();
    }
}
