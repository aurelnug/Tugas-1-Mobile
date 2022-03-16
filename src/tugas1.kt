import java.util.Scanner;

fun main(args: Array<String>){
    val input = Scanner(System.`in`)

    print("Masukkan X1: ")
    var x1 = input.nextInt()
    print("Masukkan Y1: ")
    var y1 = input.nextInt()
    print("Masukkan X2: ")
    var x2 = input.nextInt()
    print("Masukkan Y2: ")
    var y2 = input.nextInt()
    print("Titik 1 = $x1,$y1 \n")
    print("Titik 2 = $x2,$y2 \n")

    var jarak = ((x2-x1)*2+(y2-y1)*2)
    print("Jarak dari titik 1 ke titik 2 adalah $jarak")
}