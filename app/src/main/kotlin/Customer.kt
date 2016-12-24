/**
 * Created by apple on 2016. 12. 24..
 */
@file:JvmName("Customer_class") //Rename annotation//

package Customer_package

import android.support.v7.app.AppCompatActivity
import android.widget.Toast

/** 코틀린에서는 모든 클래스를 기본적으로 final이기 때문에 상속이 되질 않는다. 클래스 상속이 필요 시 open class로 선언 **/
/** 인터페이스나 추상클래스 모두 기본적인 객체지향에서와 동일 **/
class Customer{
    //필드(입력값으로 초기화)//
    var customer_name:String = ""
    var customer_phone:String = ""

    //초기화//
    init {
        println("Customer 초기화")
    }

    //생성자//
    constructor(name:String, phone:String){
        this.customer_name = name + " customer"
        this.customer_phone = phone + " number"
    }

    //메소드//
    fun print_customer():String{
        val return_str = "customer name: " + this.customer_name + "/ customer phone: " + this.customer_phone

        println("customer name: " + this.customer_name + "/ customer phone: " + this.customer_phone)

        return return_str
    }



    //Toast메시지 띄우기//
    fun AppCompatActivity.toast(message:String, duration:Int = Toast.LENGTH_SHORT){
        Toast.makeText(this, message, duration).show();
    }
}