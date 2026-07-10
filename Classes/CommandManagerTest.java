package unisa.diem.swproject;


import org.junit.jupiter.api.Test;
import unisa.diem.swproject.model.CommandManager;

import static org.junit.jupiter.api.Assertions.*;

public class CommandManagerTest {
    private final CommandManager cm = new CommandManager();
    private final CommandSample cs = new CommandSample();

    @Test
    public void testExecute() {
        assertNull(cm.lastExecutedCommand());
        cm.execute(cs);
        assertEquals(1, CommandSample.count);
        assert cm.lastExecutedCommand().equals(cs);
    }

    @Test
    public void testRollBack() {
        assertNull(cm.lastUndoneCommand());
        assertNull(cm.lastExecutedCommand());
        cm.rollback();
        assertEquals(0, CommandSample.count);
        assert cm.lastUndoneCommand().equals(cs);
        assertNull(cm.lastExecutedCommand());
    }
}
