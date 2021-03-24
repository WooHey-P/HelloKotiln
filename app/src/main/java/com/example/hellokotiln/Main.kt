package com.example.hellokotiln

fun main() {
    // 코틀린 만의 특별한

    // if 식 (if 문)
    val x = 2;
    val isEven = if (x % 2 == 0) "짝수" else "홀수"

    // for-loop
    for (i in 0..9) {
        // 0 부터 9 까지 출력
        println(i)
    }

    // switch문 코틀린에서는 when 문
    val y = 1
    // switch 문에 대한 결과값을 상수에 대입 가능
    val ss = when (x) {
        1-> println("1")
        2-> println("2")
        3, 4, 5 -> println("3, 4, 5임")
        in 6..20 -> print("6부터 20 사이임")             // in 을 사용해서 해당 범위에 속한다면 실행
        !in 8..10 -> println("8부터 10이 아님")
        else -> print("default")
    }
}
