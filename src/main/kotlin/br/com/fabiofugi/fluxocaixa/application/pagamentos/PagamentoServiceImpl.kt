package br.com.fabiofugi.fluxocaixa.application.pagamentos

import br.com.fabiofugi.fluxocaixa.domain.lancamentos.PagamentoRepository
import org.springframework.stereotype.Component

@Component
class PagamentoServiceImpl(
    private val pagamentoRepository: PagamentoRepository
): PagamentoService {

    override fun add() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}