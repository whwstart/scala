package com.atguigu.bigdata.scala.bean

class Task extends Serializable {
    var start : Int = 0
    var end : Int = 0
    var logic : (Int)=>Unit = null
    def run(): Unit = {
        for ( i <- start to end ) {
            logic(i)
        }
    }
}
