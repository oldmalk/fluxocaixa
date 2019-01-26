package br.com.fabiofugi.fluxocaixa.domain.lancamentos

import br.com.fabiofugi.fluxocaixa.domain.AggregationRoot
import java.util.*

data class Recebimento (
    val descricao: String,
    val contaDestino: Conta,
    val documento: String,
    val valor: String,
    val data: Date
) : AggregationRoot