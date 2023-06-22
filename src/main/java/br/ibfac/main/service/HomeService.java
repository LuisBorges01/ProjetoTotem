package br.ibfac.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ibfac.main.exceptions.LancheException;
import br.ibfac.main.model.Lanche;
import br.ibfac.main.model.Pedido;
import br.ibfac.main.repository.LancheRepository;
import br.ibfac.main.repository.PedidoRepository;
import lombok.Data;

@Data
@Service
public class HomeService {

    @Autowired
    private LancheRepository lancheRepository;
    
    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Lanche> listaCliente() {
        return lancheRepository.findAll();
    }
    
    
    /* HomeController
     * Retorno do Nome e Valor 
     * PARA SET NA TELA*/
	public List<Pedido> informacoesLanche() {
		//lancheRepository.findFirstByOrderByClValorAsc(); 
		return pedidoRepository.findAll();
	}
	
	/*HomeController
	 *CRIAÇÃO DO PEDIDO - PEDIDO*/
    public Pedido adicionarPedido(Pedido pedido) throws LancheException {
        try {
            return pedidoRepository.save(pedido);
        } catch (Exception e) {
            throw new LancheException("Erro ao adicionar lanche: " + e.getMessage(), e);
        }
    }

}