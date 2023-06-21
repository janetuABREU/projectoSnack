/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snack;
 import java.util.Objects;

public class Cliente {


    private String cliente_nome;
    private String contacto;
    private String endereco;
    private int cliente_codigo;
    private Integer id_cliente;

    public Cliente() {

    }

    public String getCliente_nome() {
        return cliente_nome;
    }

    public void setCliente_nome(String cliente_nome) {
        this.cliente_nome = cliente_nome;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getCliente_codigo() {
        return cliente_codigo;
    }

    public void setCliente_codigo(Integer cliente_codigo) {
        this.cliente_codigo = cliente_codigo;
    }

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Cliente(String cliente_nome, String contacto, String endereco, Integer cliente_codigo, Integer id_cliente) {
        this.cliente_nome = cliente_nome;
        this.contacto = contacto;
        this.endereco = endereco;
        this.cliente_codigo = cliente_codigo;
        this.id_cliente = id_cliente;
    }
    public Cliente(String cliente_nome, int cliente_codigo, String contacto, String endereco ) {
        this.cliente_nome = cliente_nome;
        this.contacto = contacto;
        this.endereco = endereco;
        this.cliente_codigo = cliente_codigo;
    }
}

