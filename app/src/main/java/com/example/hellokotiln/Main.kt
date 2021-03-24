package com.example.hellokotiln

fun main() {
    // java -> Person p1 = new Person()
    val p1 = Person("name1")        // 이름으로만 생성
    val p2 = Person("이름1", 33)  // 이름, 나이로 생성
}

// 주 생성자
class Person (){
    var name: String = "None"
    var age: Int = -1

    // 부 생성자1
    constructor(nm: String) : this(){
        this.name = nm
    }

    // 부 생성자2
    constructor(name: String, age: Int) : this() {
        this.name = name
        this.age = age
    }

    // 생성자에 의해 객체가 생성된 직후에 실행됨
    init {
        println("이름: [$name] 나이: [$age]")
    }
}

