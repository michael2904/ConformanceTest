package ca.mcgill.ecse429.conformancetest.statemodel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import ca.mcgill.ecse429.conformancetest.legislation.Legislation;


public class GeneratedTestLegislation{
    protected Legislation _ctrl;
    enum State { };
    private State state;


    @Test
    public void GeneratedTestLegislation0method() {    	
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
    public void GeneratedTestLegislation1method() {    	
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
    public void GeneratedTestLegislation2method() {    	
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
    public void GeneratedTestLegislation3method() {    	
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
    public void GeneratedTestLegislation4method() {    	
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
    public void GeneratedTestLegislation5method() {    	
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
    public void GeneratedTestLegislation6method() {    	
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
    public void GeneratedTestLegislation7method() {    	
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
