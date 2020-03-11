
fun main() {
    /*
     var Imie: String = "Pawel"                                 //proste testy funkcji
    var wiek: Int = 27
    println("Wypierdalaj $Imie, masz $wiek lat, a ty nic nie potrafisz")
    println("jesteś zerem")
    // podsumowanie życia
    var liczbaInt: Int = 15
    var liczbaLong: Long = 15L
    var wynik = liczbaInt + liczbaLong
    println("$wynik lat i dalej kurwa nic nie będziesz umieć")

    var liczbaByte: Byte = 5
    var liczbaShort: Short = 3
    var rezultat = liczbaByte - liczbaShort
    println(rezultat)
    var zmienna1 = 15
    var zmienna2 = 5
    var mnozenie = zmienna1 * zmienna2
    var dzielenie = zmienna1 / zmienna2
    var koncowka = zmienna1 % zmienna2
    print("wynik mnożenia ($zmienna1, $zmienna2): $mnozenie; ")
    println("wynik dzielenia ($zmienna1, $zmienna2): $dzielenie.$koncowka")
    var test = Math.addExact(2,3)
    println(test)


var czysierusza: String                                         //prosty program
var czypowinnosieruszac: String

println("Czy to się rusza?")

czysierusza = readLine()!!.toUpperCase()

    if (czysierusza == "TAK")
{
        println("A powinno się ruszać?")

        czypowinnosieruszac = readLine()!!.toUpperCase()
        if (czypowinnosieruszac == "NIE")
    {
        println("Użyj taśmy i po problemie.")
    }
    else
        {
        println("To nie było problemu!")
        }

}

else
{
        println("Apowinno się ruszać?")

        czypowinnosieruszac = readLine()!!.toUpperCase()
        if (czypowinnosieruszac == "NIE")
    {
        println("To nie ma problemiku!")
    }
    else
     {
        println("WD40 i po problemie.")
     }
}

    println("Wpisz cyfrę do porównania.")                       \\ stała i program do porównań
    val naszaStala: Long = readLine()!!.toLong()
    println("Wpisz zmienną.")
    var naszaLiczba: Long = readLine()!!.toLong()

    if (naszaLiczba > naszaStala) println("Dana liczba jest większa od $naszaStala")
    else if(naszaLiczba == naszaStala) println("Podana liczba jest równa $naszaStala")
    else if(naszaLiczba % 2L == 0L) println("Podana liczba jest mniejsza od $naszaStala " +
            "oraz jest parzysta")
    else println("Podana liczba jest mniejsza od $naszaStala oraz jest nieparzysta")



    println("Ile czasu chcesz odmierzyć?")      // minutnik - pętla for
    var czas: Int = readLine()!!.toInt()
    for (i in czas downTo 0)                    //for(i in czas downTo 0 step 2)
    {
        if (i != 0)
        {
            print(i)
            print(" ")
            Thread.sleep(1000)
        }
        else
        {
            print("Jebudu!")
        }

    }


    val liczbaStala: Int = 14
    var liczbaProb: Int = 5
    var liczbaPodana: Int

    println("Zagrajmy w grę. Musisz zgadnąć, jaką wymyśliłem liczbę z przedziału 0-25.")

    while (liczbaProb > 0)
    {
        if (liczbaProb > 1)
        {
            println("Liczba pozostałych prób: $liczbaProb")
        }
        else
        {
            println("Masz ostatnią szansę niziołku!")
        }

        liczbaProb--

        print("Podaj liczbę: ")
        liczbaPodana = readLine()!!.toInt()

        if (liczbaPodana == liczbaStala) {
            println("Udało Ci się!")
            break
        }
        else if (liczbaPodana > liczbaStala)
        { println("Podpowiem Ci głupcze, Twoja liczba jest za duża!")
            if (liczbaProb == 0)
            {
                println("game over")
            }
        }
        else
        { println("Podpowiem Ci głupcze, Twoja liczba jest za mała!")
            if (liczbaProb == 0)
            {
                println("game over")
            }

        }
    }

    val login: String = "admin"
    val correctPassword: String = "admin123"
    var userName: String
    var password: String

    while (true)
    {
        print("Podaj login:")
        userName = readLine()!!
        print("Podaj hasło:")
        password = readLine()!!

        if ((login == userName) && (correctPassword == password))
        {
           println("Zalogowano poprawnie.")
            break
        }
        else if ((login == userName) && (correctPassword != password))
        {
            println("Błędne hasło.")
        }
        else if ((login != userName) && (correctPassword == password))
        {
            println("Błędny login")
        }
        else
        {
            println("Błędny login i hasło.")
        }

    }   */

    // ciekawostka pętli
    zewnetrznaPetla@for (i in 1 until 10)    // różnica pętli - zewnętrzna: przedzial otwarty - od 1 do 9!!
    {   println(i)                           // pętla wewnętrzna: przedział domknięty - od 1 do 10!
        for (j in 4..10)
        {    println("Wartość pętli wewnętrznej: $j")
            if (i == 5)
            {
                break@zewnetrznaPetla        //etykieta łamiąca pętle zewnętrzną
            }
        }

    }

















}
