package ca.mcgill.ecse429.conformancetest.test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import ca.mcgill.ecse429.conformancetest.ccoinbox.CCoinBox;


public class CCoinBoxTest5{
    protected CCoinBox _ctrl;
    enum State { };
    private State state;


    @Test
    public void CCoinBoxTest5method() {    	
        _ctrl = new CCoinBox();

        assertEquals("Invalid state","empty", _ctrl.getState().name());

        int totalQtrs = 0;
        assertEquals("Invalid conditions",totalQtrs, _ctrl.getTotalQtrs());
        int curQtrs = 0;
        assertEquals("Invalid conditions",curQtrs, _ctrl.getCurQtrs());
        boolean allowVend = false;
        assertEquals("Invalid conditions",allowVend, _ctrl.getAllowVend());

         _ctrl.addQtr();
        assertEquals("Invalid state","notAllowed", _ctrl.getState().name());

        curQtrs = curQtrs + 1;
        assertEquals("Invalid conditions",curQtrs, _ctrl.getCurQtrs());

         _ctrl.addQtr();
        assertEquals("Invalid state","allowed", _ctrl.getState().name());

        curQtrs = curQtrs + 1;
        assertEquals("Invalid conditions",curQtrs, _ctrl.getCurQtrs());
        allowVend = true;
        assertEquals("Invalid conditions",allowVend, _ctrl.getAllowVend());

         _ctrl.reset();
        assertEquals("Invalid state","empty", _ctrl.getState().name());

        totalQtrs = 0;
        assertEquals("Invalid conditions",totalQtrs, _ctrl.getTotalQtrs());
        curQtrs = 0;
        assertEquals("Invalid conditions",curQtrs, _ctrl.getCurQtrs());
        allowVend = false;
        assertEquals("Invalid conditions",allowVend, _ctrl.getAllowVend());
    }


}
