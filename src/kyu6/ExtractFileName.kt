package kyu6

fun main() {
    println(FileNameExtractor.extractFileName("1231231223123131_FILE_NAME.EXTENSION.OTHEREXTENSION"))
    println(FileNameExtractor.extractFileName("1_FILE_NAME.EXTENSION.OTHEREXTENSIONadasdassdassds34"))
}

object FileNameExtractor {
    fun extractFileName(dirtyFileName: String): String = dirtyFileName.substringAfter("_").substringBeforeLast(".")
}