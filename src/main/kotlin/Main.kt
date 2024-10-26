package org.example

import kotlin.math.max

fun main() {
    val amount = 100
    val percent  = 0.75
    val minCommission = 35

    val commission = max(minCommission.toDouble(), amount / 100 * percent)

    println(commission)
}