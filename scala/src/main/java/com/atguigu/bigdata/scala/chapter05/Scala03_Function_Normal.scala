package com.atguigu.bigdata.scala.chapter05

object Scala03_Function_Normal {

    def main(args: Array[String]): Unit = {

        // TODO 函数式编程
        // 1. 多参到底是多少个参数？
        //    个数没有限制， 没有22限制
        //    函数声明时没有参数个数的限制，但是将函数作为对象使用的时候，有参数22个限制
        //    22是马丁的幸运数字
        def test(
                i:Int,
                i1:Int,
                i2222:Int,
                i3:Int,
                i4:Int,
                i43432:Int,
                i21:Int,
                i22:Int,
                i23:Int,
                i24:Int,
                i333:Int,
                i31:Int,
                i32:Int,
                i33:Int,
                i34:Int,
                i4444:Int,
                i41:Int,
                i42:Int,
                i43:Int,
                i44:Int,
                i5:Int,
                i51:Int
                ): Unit = {
            println("xxxxxx")
        }

        //test(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2)

        // scala是一个完全面向对象的语言，所以万物皆对象
        //val i = 1
        //val f = test _

        // TODO 2. 参数不确定，可能有一个参数，有多个参数
        //         如果参数不确定，并且参数之间含义相同，可以使用可变参数
        //         参数类型的后面使用星号表示可变参数，调用时，参数可以传递，也可以不传
//        def fun2( name:String* ): Unit = {
//            println(name)
//        }

        // 没有参数和不传参数
        //fun2 (X)
//        fun2() // 如果可变参数调用时，没有传值，那么获取的结果是空集合
//        fun2("zhangsan")
//        fun2("zhangsan", "lisi", "wangwu")

        // 可变参数必须放置在参数列表的最后
//        def fun22( name:Any*, age:Int ): Unit = {
//            println(name + ", age = " + age)
//        }
//        fun22("zhangsan", "lisi", 30)

        // TODO 3. 函数的参数默认情况下不允许修改，类似于使用val修饰
        //        scala中参数可以设定默认值，如果调用时不传递这个参数，那么会自动使用默认值
        //        在声明参数时直接进行初始化操作即可
        //        参数默认值在编译时其实会编译为一个方法，如果调用时不传递参数，那么编译器会自动调用这个方法传值。
//        def regUser( password:String = "000000" ): Unit = {
//            println(password)
//        }

        // 如果参数有默认值，那么可以调用时不用传递
        //regUser() //
        // 如果参数有默认值，那么调用时如果传递参数，默认值不起作用
        //regUser("123123")

        def regUser1( password:String = "000000", name:String  ): Unit = {
            println(name + ", " +password)
        }

        // 参数传值的时候，是按照顺序匹配，第一个值匹配第一个参数，依此类推
        // TODO 4. 如果想改变传值顺序，可以使用带名参数
        // password - 0
        // name - 1
        regUser1(name="zhangsan")

        // TODO 5. 可变参数和参数默认值不能联合使用
//        def regUser2( password:String = "00000", name:String*  ): Unit = {
//            println(name + ", " +password)
//        }
//
//        regUser2(name="zhangsan","wangwu")

    }


}
