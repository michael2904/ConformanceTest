package ca.mcgill.ecse429.conformancetest.statemodel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import ca.mcgill.ecse429.conformancetest.ccoinbox.CCoinBox;


public class GeneratedTestCCoinBox{
    protected CCoinBox _ctrl;
    enum State { };
    private State state;


    @Test
    public void GeneratedTestCCoinBox0method() {    	
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
    public void GeneratedTestCCoinBox1method() {    	
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
    public void GeneratedTestCCoinBox2method() {    	
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
    public void GeneratedTestCCoinBox3method() {    	
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
    public void GeneratedTestCCoinBox4method() {    	
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
    public void GeneratedTestCCoinBox5method() {    	
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
    public void GeneratedTestCCoinBox6method() {    	
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
    public void GeneratedTestCCoinBox7method() {    	
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
    public void GeneratedTestCCoinBox8method() {    	
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
    public void GeneratedTestCCoinBox9method() {    	
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
