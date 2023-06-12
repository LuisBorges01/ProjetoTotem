package br.ibfac.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.ibfac.main.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    @Query("SELECT SUM(v.valor) FROM Pedido v")
    public Double findValoresTotais();
}
