package br.com.fabiofugi.fluxocaixa.domain.lancamentos

interface PagamentoRepository {
    fun add(pagamento: Pagamento)
}