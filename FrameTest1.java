import java.awt.Frame;
 
public class FrameTest1 
{
    // 메인 
    public static void main(String args[])
    {
        Frame f= new Frame();
        f.setTitle("첫 번째 프레임 입니다.");
        f.setBounds(500, 500, 300, 300);
        f.setVisible(true);
    }
}
 
