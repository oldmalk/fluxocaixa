package br.com.fabiofugi.fluxocaixa.infrastructure.lancamentos

import br.com.fabiofugi.fluxocaixa.domain.lancamentos.Pagamento
import br.com.fabiofugi.fluxocaixa.domain.lancamentos.PagamentoRepository
import org.springframework.stereotype.Repository

@Repository
class PagamentoRepositoryImpl: PagamentoRepository {
    override fun add(pagamento: Pagamento) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}