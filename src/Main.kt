import java.io.File

fun main() {

    //Задача 1
    val file1 = createFile("C://Urban/task1.txt", "Задача 1")
    println("Пример выполнения решения задачи 1:")
    readFile(file1)

    //Задача 2
    val file2 = createFile("C://Urban/", "task2.txt", 5)
    println("Пример выполнения решения задачи 2:")
    readFile(file2)

    //Задача 3
    val file3 = createFile("C://Urban/task3.txt", "1 2 3 4 5")
    println("Пример выполнения решения задачи 3:")
    readFile(file3, " ")
}

//Функции для задачи 1
fun createFile(path: String, text: String): File {
    val file = File(path)
    file.writeText(text)
    return file
}

fun readFile(file: File) {
    println(file.readText())
}

//Функция для задачи 2
fun createFile(path: String, fileName: String, number: Int): File {
    val file = File("$path$fileName")
    file.writeText("")
    for (i in 2..(2 * number) step 2) {
        file.appendText("$i ")
    }
    return file
}

//Функция для задачи 3
fun readFile(file: File, delimiter: String) {
    val numbers = file.readText().split(delimiter)
    println("${numbers[0]} ${numbers[1]} ${numbers[numbers.lastIndex - 1]} ${numbers.last()}")
}