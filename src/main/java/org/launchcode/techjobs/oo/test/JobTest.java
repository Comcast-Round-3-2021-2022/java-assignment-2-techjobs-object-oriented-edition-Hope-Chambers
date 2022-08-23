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
    public void testSettingJobId() {

        Job jobNumberOne = new Job();
        Job jobNumberTwo = new Job();
        assertNotEquals(jobNumberOne.getId(), jobNumberTwo.getId());

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
        String makingStrings=jobNumberSix.toString();
        char actual=makingStrings.charAt(0);
        char expected='\n';
        assertEquals(actual,expected);
        char endingActual=makingStrings.charAt(makingStrings.length()-1);
        assertEquals(endingActual,expected);
    }

     @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job jobNumberSeven= new Job("Product Tester",
                new Employer("ACME"),
                new Location("Dessert"),
                new PositionType("Quality Control"),
                new CoreCompetency("Persistence"));
       String actual=jobNumberSeven.toString();
         String expected ="\nID: " + jobNumberSeven.getId() +"\n"+
                 "Name: Product Tester\n"+
                 "Employer: ACME\n"+
                 "Location: Dessert\n"+
                 "Position Type: Quality Control\n"+
                 "Core Competency: Persistence\n";
         assertEquals(expected,actual);

    }
    @Test
    public void testToStringHandlesEmptyField(){
        Job jobNumberEight= new Job("",
                new Employer(""),
                new Location(""),
                new PositionType(""),
                new CoreCompetency(""));
        String actual=jobNumberEight.toString();
        String expected="\nID: " + jobNumberEight.getId() +"\n"+
                "Name: Data not available\n"+
                "Employer: Data not available\n"+
                "Location: Data not available\n"+
                "Position Type: Data not available\n"+
                "Core Competency: Data not available\n";
        assertEquals(expected,actual);


    }
}



