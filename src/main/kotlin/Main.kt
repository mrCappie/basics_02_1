package org.example

import kotlin.math.max

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val amount = 100
    val percent  = 0.75
    val minCommission = 35

    val commission = max(minCommission.toDouble(), amount / 100 * percent)

    println(commission)
}