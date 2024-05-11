package waypoint;

import java.awt.Cursor;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ButtonWayPoint extends JButton{
    
    public ButtonWayPoint(){
        setContentAreaFilled(false);
        setIcon(new ImageIcon(getClass().getResource("/imagenes/parada-de-autobus.png")));
        setCursor( new Cursor(Cursor.HAND_CURSOR));
        setSize( new Dimension(24,30));
        
    }
    
}
