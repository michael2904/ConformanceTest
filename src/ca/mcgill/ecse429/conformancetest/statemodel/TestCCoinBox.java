package ca.mcgill.ecse429.conformancetest.statemodel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import ca.mcgill.ecse429.conformancetest.ccoinbox.CCoinBox;


public class TestCCoinBox{
    protected CCoinBox _ctrl;
    enum State { };
    private State state;


    @Test
    public void TestCCoinBox0method() {    	
        _ctrl = new CCoinBox();

        assertEquals("Invalid state","empty", _ctrl.getState().name());

        int totalQtrs = 0;
        assertEquals("Invalid conditions",totalQtrs, _ctrl.getTotalQtrs());
        int curQtrs = 0;
        assertEquals("Invalid conditions",curQtrs, _ctrl.getCurQtrs());
        boolean allowVend = false;
        assertEquals("Invalid conditions",allowVend, _ctrl.getAllowVend());

         _ctrl.returnQtrs();
        assertEquals("Invalid state","empty", _ctrl.getState().name());

    }

    @Test
    public void TestCCoinBox1method() {    	
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

    @Test
    public void TestCCoinBox2method() {    	
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

    @Test
    public void TestCCoinBox3method() {    	
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

         _ctrl.reset();
        assertEquals("Invalid state","empty", _ctrl.getState().name());

        totalQtrs = 0;
        assertEquals("Invalid conditions",totalQtrs, _ctrl.getTotalQtrs());
        curQtrs = 0;
        assertEquals("Invalid conditions",curQtrs, _ctrl.getCurQtrs());
    }

    @Test
    public void TestCCoinBox4method() {    	
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

         _ctrl.returnQtrs();
        assertEquals("Invalid state","empty", _ctrl.getState().name());

        curQtrs = 0;
        assertEquals("Invalid conditions",curQtrs, _ctrl.getCurQtrs());
        allowVend = false;
        assertEquals("Invalid conditions",allowVend, _ctrl.getAllowVend());
    }

    @Test
    public void TestCCoinBox5method() {    	
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

    @Test
    public void TestCCoinBox6method() {    	
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

         _ctrl.addQtr();
        assertEquals("Invalid state","allowed", _ctrl.getState().name());

        curQtrs = curQtrs + 1;
        assertEquals("Invalid conditions",curQtrs, _ctrl.getCurQtrs());
    }

    @Test
    public void TestCCoinBox7method() {    	
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
        if(curQtrs == 2){

         _ctrl.vend();
        assertEquals("Invalid state","empty", _ctrl.getState().name());

        totalQtrs = totalQtrs + 2;
        assertEquals("Invalid conditions",totalQtrs, _ctrl.getTotalQtrs());
        curQtrs = 0;
        assertEquals("Invalid conditions",curQtrs, _ctrl.getCurQtrs());
        allowVend = false;
        assertEquals("Invalid conditions",allowVend, _ctrl.getAllowVend());

        }
    }

    @Test
    public void TestCCoinBox8method() {    	
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
        if(curQtrs == 3){

         _ctrl.vend();
        assertEquals("Invalid state","notAllowed", _ctrl.getState().name());

        totalQtrs = totalQtrs + 2;
        assertEquals("Invalid conditions",totalQtrs, _ctrl.getTotalQtrs());
        curQtrs = 1;
        assertEquals("Invalid conditions",curQtrs, _ctrl.getCurQtrs());
        allowVend = false;
        assertEquals("Invalid conditions",allowVend, _ctrl.getAllowVend());

        }
    }

    @Test
    public void TestCCoinBox9method() {    	
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
        if(curQtrs > 3){

         _ctrl.vend();
        assertEquals("Invalid state","allowed", _ctrl.getState().name());

        totalQtrs = totalQtrs + 2;
        assertEquals("Invalid conditions",totalQtrs, _ctrl.getTotalQtrs());
        curQtrs = curQtrs - 2;
        assertEquals("Invalid conditions",curQtrs, _ctrl.getCurQtrs());

        }
    }


}
