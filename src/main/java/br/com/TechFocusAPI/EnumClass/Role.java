package br.com.TechFocusAPI.EnumClass;

import jdk.jfr.Description;

public enum Role {
    AJUDANTE_DE_PRODUCAO("Ajudante de Podução"),
    OPERADOR_DE_PRODUCAO("Operador de Produção"),
    OPERADOR_DE_MAQUINA_01("Operador de Máquina Nv1"),
    OPERADOR_DE_MAQUINA_02("Operador de Máquina Nv2"),
    OPERADOR_DE_MAQUINA_03("Operador de Máquina Nv3"),
    ASSISTENTE_DE_MARCENEIRO("Assistente de Marcenaria"),
    MARCENEIRO_01("Marceneiro Nv1"),
    MARCENEIRO_02("Marceneiro Nv2"),
    MARCENEIRO_03("Marceneiro Nv3"),
    ASSISTENTE_DE_RH("Assistente de RH"),
    ANALISTA_DE_RH("Analista de RH"),
    GERENTE_DE_RH("Gerente de RH"),
    AUXILIAR_DE_PROJETOS("Auxiliar de Projetos"),
    PROJETISTA("Projetista"),
    GERENTE_DE_PROJETOS("Gerente de Projetos"),
    ASSISTENTE_DE_VENDAS("Assistente de Vendas"),
    VENDEDOR("Vendedor"),
    ORCAMENTISTA("Orcamentista"),
    RELACIONAMENTO_COM_CLIENTE("Relacionamento com Cliente"),
    POS_VENDAS("Pos Venda"),
    DESENVOLVEDOR_JUNIOR("Desenvolvedor Junior"),
    DESENVOLVEDOR_PLENO("Desenvolvedor Pleno"),
    DESENVOLVEDOR_SENIOR("Desenvolvedor Sênior"),
    GERENTE_DE_TI("Gerente de TI");

    private String role;

    Role(String role) {
        this.role = role;
        System.out.println("Criado " + role);
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
