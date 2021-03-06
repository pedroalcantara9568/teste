package com.example.demo.dominio.comercio.cucumber.dominio;

import com.example.demo.dominio.comercio.Carrinho;
import com.example.demo.dominio.inventario.Produto;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class MeuPassosCarrinho {

    private Produto produto;
    private Carrinho carrinho;

    @Dado("um produto com o valor {double}")
    public void umProdutoComValor (double valor){
        this.produto = new Produto(10);
    }

    @E("um carrinho com o preço {double}")
    public void umCarrinhoComoPreco(double preco){
        this.carrinho = new Carrinho(0.0);
    }

    @Quando("o produto for adicionado ao carrinho")
    public void oProdutoForAdicionadoAoCarrinho(){
        this.carrinho.adicionaProdutoAoCarrinho(produto);
    }


    @Quando("os produtos forem adicionados ao carrinho")
    public void osProdutosForemAdicionadosAoCarrinho() {
        this.carrinho.adicionaProdutoAoCarrinho(this.produto);
        this.carrinho.adicionaProdutoAoCarrinho(this.produto);
    }

    @Então("o numero de produtos no carrinho será {int}")
    public void oNumeroDeProdutosNoCarrinhoSerá(int tamanhoDoCenario) {
        assert  this.carrinho.getProdutos().size() == tamanhoDoCenario;
    }

    @E("um outro produto com o valor {double}")
    public void umOutroProdutoComOValor(double valorDoCenario) {
        this.produto = new Produto(valorDoCenario);
    }

    @Então("o preço do carrinho será {double}")
    public void oPreçoDoCarrinhoSerá(double valorDoCenario) {
        this.carrinho.getPrecoCarrinho().equals(valorDoCenario);
    }

    @Então("o preço do carrinho será o mesmo do produto")
    public void oPreçoDoCarrinhoSeráOMesmoDoProduto() {
        this.carrinho.getPrecoCarrinho().equals(this.produto.getValor());
    }
}
