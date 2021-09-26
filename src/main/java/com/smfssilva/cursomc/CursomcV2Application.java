package com.smfssilva.cursomc;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.smfssilva.cursomc.domain.Categoria;
import com.smfssilva.cursomc.domain.Cidade;
import com.smfssilva.cursomc.domain.Cliente;
import com.smfssilva.cursomc.domain.Endereco;
import com.smfssilva.cursomc.domain.Estado;
import com.smfssilva.cursomc.domain.ItemPedido;
import com.smfssilva.cursomc.domain.Pagamento;
import com.smfssilva.cursomc.domain.PagamentoComBoleto;
import com.smfssilva.cursomc.domain.PagamentoComCartao;
import com.smfssilva.cursomc.domain.Pedido;
import com.smfssilva.cursomc.domain.Produto;
import com.smfssilva.cursomc.domain.enums.EstadoPagamento;
import com.smfssilva.cursomc.domain.enums.TipoCliente;
import com.smfssilva.cursomc.repositories.CategoriaRepository;
import com.smfssilva.cursomc.repositories.CidadeRepository;
import com.smfssilva.cursomc.repositories.ClienteRepository;
import com.smfssilva.cursomc.repositories.EnderecoRepository;
import com.smfssilva.cursomc.repositories.EstadoRepository;
import com.smfssilva.cursomc.repositories.ItemPedidoRepository;
import com.smfssilva.cursomc.repositories.PagamentoRepository;
import com.smfssilva.cursomc.repositories.PedidoRepository;
import com.smfssilva.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcV2Application implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(CursomcV2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}

}
