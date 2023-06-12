package br.ibfac.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ibfac.main.exceptions.LancheException;
import br.ibfac.main.model.Lanche;
import br.ibfac.main.model.Pedido;
import br.ibfac.main.repository.LancheRepository;
import br.ibfac.main.repository.PedidoRepository;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Service
public class ResponsavelService {
	

    @Autowired
    private LancheRepository lancheRepository;

    @Autowired
    private PedidoRepository pedidoRepository;
    
	public Boolean cantinaFinalzada = null;

	/*ResponsavelController
	 * CRIAÇÃO DO LANCHE - REGISTRO DO RESPONSÁVEL*/
    public Lanche adicionar(Lanche lanche) throws LancheException {
        try {
            return lancheRepository.save(lanche);
        } catch (Exception e) {
            throw new LancheException("Erro ao adicionar lanche: " + e.getMessage(), e);
        }
    }
    
    /*ResponsavelController
     * MÉTODO EM ANÁLISE
     * TOTAL VALOR CANTINA(Botão)*/
    public Double totalCantina() {
    	if(cantinaFinalzada == null) {
    		System.out.println("É necessário a cantina ser FINALIZADA para obter o valor total");
    	}
    	return pedidoRepository.findValoresTotais();    		
    }
    
	/*ResponsavelController
	 *RELATÓRIO PEDIDOS*/
    public List<Pedido> todosPedidos() {
    	return pedidoRepository.findAll();
    }
}
