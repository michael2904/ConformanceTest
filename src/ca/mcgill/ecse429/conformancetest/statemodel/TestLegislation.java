package ca.mcgill.ecse429.conformancetest.statemodel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import ca.mcgill.ecse429.conformancetest.legislation.Legislation;


public class TestLegislation{
    protected Legislation _ctrl;
    enum State { };
    private State state;


    @Test
    public void TestLegislation0method() {    	
        _ctrl = new Legislation();

        assertEquals("Invalid state","inPreparation", _ctrl.getState().name());

        boolean isCommonsBill = true;
        assertEquals("Invalid conditions",isCommonsBill, _ctrl.getIsCommonsBill());

         _ctrl.introduceInSenate();
        assertEquals("Invalid state","inSenate", _ctrl.getState().name());

        isCommonsBill = false;
        assertEquals("Invalid conditions",isCommonsBill, _ctrl.getIsCommonsBill());

         _ctrl.voteFails();
        assertEquals("Invalid state","inPreparation", _ctrl.getState().name());

    }

    @Test
    public void TestLegislation1method() {    	
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

    @Test
    public void TestLegislation2method() {    	
        _ctrl = new Legislation();

        assertEquals("Invalid state","inPreparation", _ctrl.getState().name());

        boolean isCommonsBill = true;
        assertEquals("Invalid conditions",isCommonsBill, _ctrl.getIsCommonsBill());

         _ctrl.introduceInSenate();
        assertEquals("Invalid state","inSenate", _ctrl.getState().name());

        isCommonsBill = false;
        assertEquals("Invalid conditions",isCommonsBill, _ctrl.getIsCommonsBill());
        if(_ctrl.getIsCommonsBill()){

         _ctrl.votePasses();
        assertEquals("Invalid state","finalized", _ctrl.getState().name());


        }
    }

    @Test
    public void TestLegislation3method() {    	
        _ctrl = new Legislation();

        assertEquals("Invalid state","inPreparation", _ctrl.getState().name());

        boolean isCommonsBill = true;
        assertEquals("Invalid conditions",isCommonsBill, _ctrl.getIsCommonsBill());

         _ctrl.introduceInHouse();
        assertEquals("Invalid state","inHouseOfCommons", _ctrl.getState().name());


         _ctrl.voteFails();
        assertEquals("Invalid state","inPreparation", _ctrl.getState().name());

    }

    @Test
    public void TestLegislation4method() {    	
        _ctrl = new Legislation();

        assertEquals("Invalid state","inPreparation", _ctrl.getState().name());

        boolean isCommonsBill = true;
        assertEquals("Invalid conditions",isCommonsBill, _ctrl.getIsCommonsBill());

         _ctrl.introduceInHouse();
        assertEquals("Invalid state","inHouseOfCommons", _ctrl.getState().name());

        if(!_ctrl.getIsCommonsBill()){

         _ctrl.votePasses();
        assertEquals("Invalid state","finalized", _ctrl.getState().name());


        }
    }

    @Test
    public void TestLegislation5method() {    	
        _ctrl = new Legislation();

        assertEquals("Invalid state","inPreparation", _ctrl.getState().name());

        boolean isCommonsBill = true;
        assertEquals("Invalid conditions",isCommonsBill, _ctrl.getIsCommonsBill());

         _ctrl.introduceInHouse();
        assertEquals("Invalid state","inHouseOfCommons", _ctrl.getState().name());

        if(_ctrl.getIsCommonsBill()){

         _ctrl.votePasses();
        assertEquals("Invalid state","inSenate", _ctrl.getState().name());


        }

         _ctrl.voteFails();
        assertEquals("Invalid state","inPreparation", _ctrl.getState().name());

    }

    @Test
    public void TestLegislation6method() {    	
        _ctrl = new Legislation();

        assertEquals("Invalid state","inPreparation", _ctrl.getState().name());

        boolean isCommonsBill = true;
        assertEquals("Invalid conditions",isCommonsBill, _ctrl.getIsCommonsBill());

         _ctrl.introduceInHouse();
        assertEquals("Invalid state","inHouseOfCommons", _ctrl.getState().name());

        if(_ctrl.getIsCommonsBill()){

         _ctrl.votePasses();
        assertEquals("Invalid state","inSenate", _ctrl.getState().name());


        }
        if(!_ctrl.getIsCommonsBill()){

         _ctrl.votePasses();
        assertEquals("Invalid state","inHouseOfCommons", _ctrl.getState().name());


        }
    }

    @Test
    public void TestLegislation7method() {    	
        _ctrl = new Legislation();

        assertEquals("Invalid state","inPreparation", _ctrl.getState().name());

        boolean isCommonsBill = true;
        assertEquals("Invalid conditions",isCommonsBill, _ctrl.getIsCommonsBill());

         _ctrl.introduceInHouse();
        assertEquals("Invalid state","inHouseOfCommons", _ctrl.getState().name());

        if(_ctrl.getIsCommonsBill()){

         _ctrl.votePasses();
        assertEquals("Invalid state","inSenate", _ctrl.getState().name());


        }
        if(_ctrl.getIsCommonsBill()){

         _ctrl.votePasses();
        assertEquals("Invalid state","finalized", _ctrl.getState().name());


        }
    }


}
