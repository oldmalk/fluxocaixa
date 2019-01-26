package br.com.fabiofugi.fluxocaixa.api.controllers

import br.com.fabiofugi.fluxocaixa.application.pagamentos.Pagamento
import br.com.fabiofugi.fluxocaixa.application.pagamentos.PagamentoService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/pagamentos")
class PagamentosController(
    private val pagamentoService: PagamentoService
) {

    @PostMapping
    fun addPayment(@RequestBody payment: Pagamento): ResponseEntity<Pagamento> {

        pagamentoService.add()

        return ResponseEntity
            .status(HttpStatus.NO_CONTENT)
            .body(Pagamento())
    }
}