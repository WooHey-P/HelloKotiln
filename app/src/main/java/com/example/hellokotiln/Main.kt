package com.example.hellokotiln

fun main() {
    // 코틀린은 자바의 에러를 줄이기 위해 만든 것.
    // 따라서 특별한 경우가 아니라면 변수 var보다 상수 val로 선언

    // 배열
    val _arrayitems = arrayOf(1, 2, 3, 4, 5)
    // 리스트  원소 추가 등 변경 불가
    val _listitems = listOf(1, 2, 3, 4, 5)
    
    print("$_arrayitems\n")      // [Ljava.lang.Integer;@4617c264
    print("$_listitems \n")     // [1, 2, 3, 4, 5]

    // arrayList 원소 추가 등 변경 가능
    val _arrlist = arrayListOf(1, 2, 3)
    
}
