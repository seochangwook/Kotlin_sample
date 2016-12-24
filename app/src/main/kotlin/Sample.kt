/**
 * Created by apple on 2016. 12. 23..
 */
@file:JvmName("Sample") // 'Sample' 라는 이름으로 자바에서 접근할 수 있도록 함
/** 코틀린 기본 문법 - val, var
 * val : 변할 수 없는 상수 Java : final, C/C++등에서는 const
 * var : 일반적인 변수(변경가능)
 */
package AddModule_package //패키지 정의//

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
fun add_value(a:Int,b:Int):Int{
    val result = a + b

    return result
}
////////////////////////
//반환할 값이 없으면 Unit로 정의//
fun print_message():Unit{
    println("void return fun")
}
////////////////////////
//함수를 인자로 받는 함수 - 람다관련//
fun rambdaFunction(argFunc:(Int, Int) -> Int, a:Int, b:Int):Int{
    var result:Int = argFunc.invoke(a,b) //인자로 받은 함수를 실행할 때 invoke()사용//

    return result
}

fun get_return(input_a:Int, input_b:Int):String{
    //위의 선언한 함수를 밖에서 구현하여 인자로 넘길 수 있다.//
    var result = rambdaFunction({x,y -> x*y}, input_a, input_b)
    
    return ""+result
}
////////////////////////
fun compare_func(input_a:Int):Unit{
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
fun condition_check(input_name:String):String{
    var return_name:String = ""

    if(input_name.equals("seochangwook")){
        println("string is seo chang wook")

        return_name = "string is seo chang wook"
    }

    //kotlin에서 switch-case -> when - ->//
    when(input_name){
        "seo" -> {
            println("seo")

            return_name = "seo"
        }

        "chang" -> {
            println("chang")

            return_name = "chang"
        }

        "wook" -> {
            println("wook")

            return_name = "wook"
        }

        else -> {
            println("default")

            return_name = "seochangwook jjang!!"
        }
    }

    return return_name
}
/////////////////////////
//인자의 타입이 Any인 경우 모든 타입을 대입할 수 있기 때문에 매우 유연//
fun condition_check_2(obj:Any):Unit{
    when(obj){
        1 -> println("1")
        "Hello" -> println("hello str")
        is Long -> print("Long")
        is String -> println("Not a string")
        else -> println("Unknown")
    }
}
/////////////////////////
fun loop_sample(input_num:Int, input_num2:Int, input_num3:Int):Int{
    var arr:Array<Int> = arrayOf(input_num, input_num2, input_num3) //배열을 생성//
    var sum:Int = 0

    //인덱스의 요소를 뽑기 위해서 indices사용. 만약 이를 사용하지 않을 시 에러//
    for(i in arr.indices){
        sum = sum + arr[i]

        println(sum)
    }

    println("num1: " + input_num + "/ num2: " + input_num2 + "/ num3: " + input_num3 + "/ sum: " + sum)

    //continue & break 라벨//
    for(i in arr.indices){
        if(i == 1) {
            break
        }

        println("break: " + arr[i])
    }

    return sum
}
///////////////////////////
fun exception_sample():Unit{
    var result = try{
        //count() //count()에서 예외가 발생 시 처리//
    }

    catch(e:Exception){
        -1
    }
}