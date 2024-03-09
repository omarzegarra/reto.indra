package reto.indra.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reto.indra.rest.model.Monto;
import reto.indra.rest.service.MontoService;

import java.math.BigDecimal;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/tipo-cambio")
public class MontoController {
    @Autowired
    MontoService montoService;


    @GetMapping("/realizar-cambio/{monto}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<Monto> findExchangeRate(@RequestBody Monto m, @PathVariable("monto") BigDecimal monto) {
        return montoService.findDExchangeRate(monto,  m);
    }

    @GetMapping("/tipos-de-cambio")
    @ResponseStatus(HttpStatus.OK)
    public Flux<Monto> getAllExChangeRate() {
            return montoService.findAll();
    }

    @PostMapping("/crear-tipo-cambio")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Monto> createMonto(@RequestBody Monto mo) {
        return montoService.save(new Monto( mo.getTipoCambio(), mo.getMonedaOrigen(), mo.getMonedaDestino()));
    }



}
