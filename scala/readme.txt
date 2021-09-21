下划线的用法：

1. 可以声明变量，但是不能使用

   val _ = "zhangsan"

2. 将函数作为对象来使用

   val f = test _

3. 匿名函数中，可以代替参数

   test(_+_)

4. 导入类时，代替星号
   import java.util._

5. 属性的默认值初始化

   var name : String = _

6. 模式匹配中，作为任意值进行匹配，类似于java中switch中的default操作

    case _ => xxxxx

7. 泛型中，下划线表示任意类型