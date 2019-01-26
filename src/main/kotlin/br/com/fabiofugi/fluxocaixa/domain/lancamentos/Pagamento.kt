package br.com.fabiofugi.fluxocaixa.domain.lancamentos

import br.com.fabiofugi.fluxocaixa.domain.AggregationRoot
import java.util.*

data class Pagamento (
    val descricao: String,
    val contaDestino: Conta,
    val documento: String,
    val valor: String,
    val encargos: String,
    val data: Date
) : AggregationRoot