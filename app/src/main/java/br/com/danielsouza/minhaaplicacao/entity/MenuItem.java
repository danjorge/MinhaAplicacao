package br.com.danielsouza.minhaaplicacao.entity;

/**
 * Created by daniel.souza on 16/12/2015.
 */
public class MenuItem {

    private int icon;
    private String nome;
    private boolean selected;

    public MenuItem(int icon, String nome) {
        this.icon = icon;
        this.nome = nome;
        this.selected = false;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}