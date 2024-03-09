package reto.indra.rest.repository;

import org.reactivestreams.Publisher;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reto.indra.rest.model.Monto;

import java.util.function.Function;

@Repository
public interface MontoRepository extends R2dbcRepository<Monto, Integer>{
   // Mono<Monto> findDExchangeRate(Integer monto,Integer tipoCambio, String monedaOrigen, String monedaDestino);

}
