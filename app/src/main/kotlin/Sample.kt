/**
 * Created by apple on 2016. 12. 23..
 */

package AddModule_package

///////////////////////
//fun formatMessage(name:String):String = "Hello, $name" //파라미터로 name값을 입력받아 출력.함수 출력의 간략문//
///////////////////////
fun get_result_print():String{
    //변수에 '?'가 있으면 null을 허용한다는 의미//
    val a  = 100
    val b = 200

    val result = a + b

    return "result: $result ."
} //파라미터로 name값을 입력받아 출력//
///////////////////////
//함수작성(자료형을 정의해주면 해당 타입으로만 제한, 자료형이 없으면 자동 타입 캐스팅)//
fun add_value(a:Int,b:Int) : Int{
    val result = a + b

    return result
}
////////////////////////
//반환할 값이 없으면 Unit로 정의//
fun print_message(): Unit{
    println("void return fun")
}
////////////////////////
//함수를 인자로 받는 함수 - 람다관련//
fun rambdaFunction(argFunc:(Int, Int) -> Int, a:Int, b:Int): Int{
    var result:Int = argFunc.invoke(a,b) //인자로 받은 함수를 실행할 때 invoke()사용//
    
    return result
}

fun get_return(input_a:Int, input_b:Int) : String{
    //위의 선언한 함수를 밖에서 구현하여 인자로 넘길 수 있다.//
    var result = rambdaFunction({x,y -> x*y}, input_a, input_b)
    
    return ""+result
}
////////////////////////
fun compare_func(input_a:Int){
    var print_str:String = ""

    if(input_a > 10){
        print_str = "10보다 큼"
    }

    else{
        print_str = "10보다 작음"
    }

    println("result: " + print_str)
}
//////////////////////////

