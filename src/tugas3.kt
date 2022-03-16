class Barang(var namaBarang: String = "Laptop",
             var hargaBarang: Int = 20000000,
             var jumlahBarang: Int = 2,
             var diskonHarga: Int = 30){

    fun tampil(){
        println("Nama Barang: $namaBarang")
        println("Harga Barang: Rp $hargaBarang")
        println("Jumlah Barang: $jumlahBarang")
        println("Diskon Harga: $diskonHarga%")
    }

    fun hitungTotal(): Int {
        val hitung = jumlahBarang*hargaBarang*diskonHarga/100
        println("Total harga barang adalah Rp $hitung")
        return 0
    }
}

fun main(args: Array<String>){
    val laptop = Barang()
    laptop.tampil()
    laptop.hitungTotal()
}