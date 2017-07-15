package su.snx.kotlin.jsbindings

external val Template7: Template7Type

external interface Template7Type {
    fun compile(template: String): (values: Any) -> String
}

