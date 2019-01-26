package br.com.fabiofugi.fluxocaixa.api.model

class Payment(
    val descricao: String = "",
    val conta_destino: String = "",
    val banco_destino: String = "",
    val tipo_de_conta: String = "",
    val cpf_cnpj_destino: String = "",
    val valor_do_lancamento: String = "",
    val encargos: String = "",
    val data_de_lancamento: String = ""
)