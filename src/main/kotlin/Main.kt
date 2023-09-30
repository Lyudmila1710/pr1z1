fun main() {
    println("Введите строку: ")
    val str=readln().toString()
    var result=""
    var amount=1
    var symbol=str[0]
    for ( i in str.substring(1)){
        if(symbol==i){amount++}
        else{
            if (amount>1) {result +="$symbol$amount"}
        else {result+=symbol}
            amount=1
            symbol=i}
    }
    if (amount>1) {result +="$symbol$amount"}/*последний элемент массива*/
    else {result+=symbol}
println("Результат: $result")
}