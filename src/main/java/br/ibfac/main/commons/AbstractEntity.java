package br.ibfac.main.commons;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Objects;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@MappedSuperclass
public abstract class AbstractEntity implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Long id;

  @Override
  public boolean equals(Object o) {

    if (this == o)
      return true;

    if (o == null || getClass() != o.getClass())
      return false;

    AbstractEntity that = (AbstractEntity) o;

    return id != null && Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return id != null ? id.hashCode() : super.hashCode();
  }

}
