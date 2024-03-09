package reto.indra.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reto.indra.rest.model.Monto;
import reto.indra.rest.repository.MontoRepository;

import java.math.BigDecimal;
import java.util.Optional;

@Service
public class MontoService {

    @Autowired
    MontoRepository montoRepository;


/*
    public Mono<Monto> findDExchangeRate(Integer monto, Integer tipoCambio, String monedaOrigen, String monedaDestino) {
        return montoRepository.findDExchangeRate(monto,tipoCambio,monedaOrigen, monedaDestino);
    }
*/
    public Mono<Monto> save(Monto mo) {
        return montoRepository.save(mo);
    }

    public Flux<Monto> findAll() {
        return montoRepository.findAll();
    }

    public Mono<Monto> findDExchangeRate(BigDecimal mont, Monto monto) {
        return montoRepository.findById(1)//.map(Optional::of).defaultIfEmpty(Optional.empty())
                .flatMap(optionalTutorial -> {
                  //  if (optionalTutorial.isPresent()) {

                    optionalTutorial.setMonto(optionalTutorial.getTipoCambio().multiply(mont));
                        return montoRepository.save(optionalTutorial);
                  //  }
                   // return Mono.empty();
                });
    }

    private Monto calculateValue(Monto data) {
        return null;
    }


}
