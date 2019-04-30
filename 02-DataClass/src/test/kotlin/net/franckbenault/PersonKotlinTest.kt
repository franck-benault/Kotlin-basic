package net.franckbenault

import nl.jqno.equalsverifier.EqualsVerifier
import org.junit.Ignore
import org.junit.Test

class PersonKotlinTest {

    @Test
    fun personEqualsContractTest() {
        EqualsVerifier.forClass(Person::class.java).verify()
    }

    @Test
    @Ignore
    fun person2EqualsContractTest() {
        EqualsVerifier.forClass(Person2::class.java).verify()
    }
}