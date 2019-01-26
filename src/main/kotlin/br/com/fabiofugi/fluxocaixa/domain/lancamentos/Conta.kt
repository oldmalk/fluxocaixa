package br.com.fabiofugi.fluxocaixa.domain.lancamentos

data class Conta(
    val numero: String,
    val banco: String,
    val tipo: TipoConta
)