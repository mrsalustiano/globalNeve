package org.example

import java.io.File

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val filePath = "src\\main\\resources\\Puzzle_03.txt"
    val fileContents = readFileIntoArray(filePath)

    val resultado = mutableListOf<Int>()
    var soma = 0;


    for (values in fileContents) {
        var conteudo = values.split("")

        var meuArray = mutableListOf<Int>()
        var contador = 0;

        for (value in conteudo) {

            var valor = value.toIntOrNull()
            if (valor != null) {
                meuArray.add(contador, valor);
                contador++;
            }
        }
        val concatenado = meuArray.first().toString() + meuArray.last().toString();
        val concatenadoNumber = concatenado.toInt();
        resultado.add(concatenadoNumber);

    }

    for (value in resultado) {
        soma += value

    }
        println("Resultado : $soma")


}

fun readFileIntoArray(filePath: String): Array<String> {
    val file = File(filePath)
    return file.readLines().toTypedArray()
}