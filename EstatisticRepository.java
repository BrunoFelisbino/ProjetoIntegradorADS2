package br.com.projeto.repository;

import br.com.projeto.model.CsvQuestao6;
import br.com.projeto.model.Estatistic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstatisticRepository extends CrudRepository<Estatistic, Integer> {

}
