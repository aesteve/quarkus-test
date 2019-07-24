package quarkus.test

import io.quarkus.runtime.annotations.RegisterForReflection

@RegisterForReflection
data class Greeting(val s: String)
