package com.gft.structuraltest.testconference;

import com.gft.structuraltest.testconference.ContactDetails;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.*;
import static org.junit.Assert.*;

/**
 * Created by jokrojek on 14/10/2015.
 */
@RunWith(JUnitParamsRunner.class)
public class ContactDetailsTest {

    @Test
    @Parameters({
            "jacek@wp.pl,false",
            ",false",
            "aaaaaaaaaaaaaaaaaaaaa,false",
            "@,false",
            "[,false",
            "`,false",
            "},false",
            "SELECT*,false",
            "1, false",
            "*,false",
            ".+,false",
            "?,false",
            "\n,false",
            "\\n,false",
            " ,false",
            "<script/>,false",
            
            "jacek,true",
            "aaaaaaaaaaaaaaaaaaaa,true",
            "a,true",
            "ZółśćńźąężŁÓŚĆŃĄĘŻŹ,true",
            "Aa,true"
            
            
            
    })
    public void shouldReturnTrueIfFirstNameIsValid(String firstName, boolean result)  {
        assertEquals(ContactDetails.validateFirstName(firstName), result);
    }
}

