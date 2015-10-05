package ca.mcgill.ecse429.conformancetest.test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import ca.mcgill.ecse429.conformancetest.ccoinbox.CCoinBox;


public class CCoinBoxTest2{
    protected CCoinBox _ctrl;
    enum State { };
    private State state;


    @Test
    public void CCoinBoxTest2method() {    	
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

         _ctrl.returnQtrs();
        assertEquals("Invalid state","empty", _ctrl.getState().name());

        curQtrs = 0;
        assertEquals("Invalid conditions",curQtrs, _ctrl.getCurQtrs());
    }


}
