package ca.mcgill.ecse429.conformancetest.test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import ca.mcgill.ecse429.conformancetest.legislation.Legislation;


public class LegislationTest1{
    protected Legislation _ctrl;
    enum State { };
    private State state;


    @Test
    public void LegislationTest1method() {    	
        _ctrl = new Legislation();

        assertEquals("Invalid state","inPreparation", _ctrl.getState().name());

        boolean isCommonsBill = true;
        assertEquals("Invalid conditions",isCommonsBill, _ctrl.getIsCommonsBill());

         _ctrl.introduceInSenate();
        assertEquals("Invalid state","inSenate", _ctrl.getState().name());

        isCommonsBill = false;
        assertEquals("Invalid conditions",isCommonsBill, _ctrl.getIsCommonsBill());
        if(!_ctrl.getIsCommonsBill()){

         _ctrl.votePasses();
        assertEquals("Invalid state","inHouseOfCommons", _ctrl.getState().name());


        }
    }


}
