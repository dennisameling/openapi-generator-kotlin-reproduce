import com.example.openapigenerator.models.Animal
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue

fun main() {
    val objectMapper = jacksonObjectMapper()
    val input = """
        {
            "type": "dog",
            "name": "Fido",
            "breed": "Golden Retriever"
        }
    """.trimIndent()
    val model = objectMapper.readValue<Animal>(input)
    println(model)
}
