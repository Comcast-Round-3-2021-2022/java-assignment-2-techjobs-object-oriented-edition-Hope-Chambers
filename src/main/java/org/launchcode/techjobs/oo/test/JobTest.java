package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import javax.swing.text.Position;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {


    @Test
    public void testSettingJobID() {

        Job jobNumberOne = new Job();
        Job jobNumberTwo = new Job();
        assertNotEquals(jobNumberOne, jobNumberTwo);

    }
    @Test
    public void testJobConstructorSetsAllFields(){
       Job jobNumberThree = new Job("Product Tester",
        new Employer("ACME"),
        new Location("Dessert"),
        new PositionType("Quality Control"),
        new CoreCompetency("Persistence"));

        assertTrue(jobNumberThree.getName()instanceof String );
        assertEquals(jobNumberThree.getName(),"Product Tester");
        assertTrue(jobNumberThree.getEmployer() instanceof Employer );
        assertEquals(jobNumberThree.getEmployer().getValue(),"ACME");
        assertTrue(jobNumberThree.getLocation() instanceof Location );
        assertEquals(jobNumberThree.getLocation().getValue(), "Dessert");
        assertTrue(jobNumberThree.getPositionType() instanceof PositionType);
        assertEquals(jobNumberThree.getPositionType().getValue(), "Quality Control");
        assertTrue(jobNumberThree.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(jobNumberThree.getCoreCompetency().getValue(), "Persistence");

    }
    @Test
   public void testJobsForEquality(){

        Job jobNumberFour = new Job("Product Tester",
                new Employer("ACME"),
                new Location("Dessert"),
                new PositionType("Quality Control"),
                new CoreCompetency("Persistence"));
        Job jobNumberFive = new Job("Product Tester",
                new Employer("ACME"),
                new Location("Dessert"),
                new PositionType("Quality Control"),
                new CoreCompetency("Persistence"));
        assertFalse(jobNumberFour.equals(jobNumberFive));



     }
     @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job jobNumberSix= new Job("Product Tester",
                new Employer("ACME"),
                new Location("Dessert"),
                new PositionType("Quality Control"),
                new CoreCompetency("Persistence"));
       // create a job object w/non-empty values in the fields.
       public String toString(){
           return
         }
       //call toString on the object, starting return value in a variable
       // build up an "expected" string
       // compare with assertEquals
    }
}


