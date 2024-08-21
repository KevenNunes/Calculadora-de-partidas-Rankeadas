fun main() {
    statusHeroi("Keven", 500, 370)

}

fun statusHeroi(nomeHeroi: String, numVitorias: Int, numDerrotas: Int) {

    val saldoVitorias = numVitorias - numDerrotas

    val nivel = when(saldoVitorias) {

        in 0..10 -> "Ferro"
        in 11..20 -> "Bronze"
        in 21..50 -> "Prata"
        in 51..80 -> "Ouro"
        in 81..90 -> "Diamante"
        in 91..100 -> "Lendário"
        else -> "Imortal"
    }
    println("O Herói ${nomeHeroi} tem de saldo de ${saldoVitorias} Vitórias e está no nível ${nivel}")
}
