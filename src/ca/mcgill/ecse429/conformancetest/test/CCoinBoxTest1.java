package ca.mcgill.ecse429.conformancetest.test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import ca.mcgill.ecse429.conformancetest.ccoinbox.CCoinBox;


public class CCoinBoxTest1{
    protected CCoinBox _ctrl;
    enum State { };
    private State state;


    @Test
    public void CCoinBoxTest1method() {    	
        _ctrl = new CCoinBox();

        assertEquals("Invalid state","empty", _ctrl.getState().name());

        int totalQtrs = 0;
        assertEquals("Invalid conditions",totalQtrs, _ctrl.getTotalQtrs());
        int curQtrs = 0;
        assertEquals("Invalid conditions",curQtrs, _ctrl.getCurQtrs());
        boolean allowVend = false;
        assertEquals("Invalid conditions",allowVend, _ctrl.getAllowVend());

         _ctrl.reset();
        assertEquals("Invalid state","empty", _ctrl.getState().name());

        totalQtrs = 0;
        assertEquals("Invalid conditions",totalQtrs, _ctrl.getTotalQtrs());
    }


}
