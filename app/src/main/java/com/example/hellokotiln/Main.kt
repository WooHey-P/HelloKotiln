package com.example.hellokotiln

fun main() {
    var x1 = 10          // 타입 미지정 변수
    var x2: Int = 10     // int형 변수 (변경 가능)
    var isMarried = true        // 선언과 동시에 값 초기화하기

    var a: Int = 10
    // int, float, double ... 등등은 kotlin에서는 첫 문자가 대문자로 바뀜

    val b = 10      // 상수 const (변경 불가)
//    b = 20        // 불가

    var s = "hello"
    print("$s 월드")      // 변수s를 넣음

    print(myfun_return(10, 20))
}

fun myfun_return(a: Int, b: Int): Int = a + b;
