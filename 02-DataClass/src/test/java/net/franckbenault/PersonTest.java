package net.franckbenault;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Ignore;
import org.junit.Test;

public class PersonTest {

    @Test
    public void personEqualsContractTest() {
        EqualsVerifier.forClass(Person.class).verify();
    }

    @Test
    @Ignore
    public void person2EqualsContractTest() {
        EqualsVerifier.forClass(Person2.class).verify();
    }
}
