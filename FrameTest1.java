import java.awt.Frame;
import java.awt.Button;
import java.awt.Panel;
import java.awt.TextField;

 
public class FrameTest1 
{
    // 메인 
    public static void main(String args[])
    {
        Frame f= new Frame();
        Panel p = new Panel();

        Button b1 = new Button();
        Button b2 = new Button();
        Button b3 = new Button();
        Button b4 = new Button();

        TextField tf = new TextField(20);

        b1.setLabel("1");
        b2.setLabel("2");
        b3.setLabel("3");
        b4.setLabel("4");
        
        p.add(tf);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);

        f.add(p);

        f.setTitle("첫 번째 프레임 입니다.");
        f.setBounds(500, 500, 300, 300);
        f.setVisible(true);
    }
}
 
