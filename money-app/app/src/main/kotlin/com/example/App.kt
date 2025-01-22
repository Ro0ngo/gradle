package com.example

import com.example.Money

class App {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Hello world!")
            var g = Greeter(3)
            g.greet()
            var m1 = Money(30, "USD");
            var m2 = Money(50, "USD");
            var result = m1.add(m2);
            println("$30 + $50 = $" + result.getAmount())
        }
    }
}