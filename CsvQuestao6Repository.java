
package br.com.projeto.repository;

import br.com.projeto.model.CsvQuestao6;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CsvQuestao6Repository extends CrudRepository<CsvQuestao6, Integer> {
}
