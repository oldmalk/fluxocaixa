package br.com.fabiofugi.fluxocaixa.api.controllers

import br.com.fabiofugi.fluxocaixa.api.model.Payment
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/pagamentos")
class PagamentosController {

    @PostMapping
    fun addPayment(@RequestBody payment: Payment): ResponseEntity<Payment> {

        return ResponseEntity
            .status(HttpStatus.NO_CONTENT)
            .body(Payment())
    }
}