package C.Code.Code.TotenProject.Model;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Builder
@Entity 
public class Lanche implements Serializable{

	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "valor", nullable = false)
	private Double valor;
	
	  @Column(name = "data_venda")
	  @CreationTimestamp
	  private Date dataVenda;

}
