package third;
import javax.swing.*;
public class DriveUI {

    public static void main(String[] args)
    {
        ICreateDocument createDocument = new CreateTextDocument();
        JFrame.setDefaultLookAndFeelDecorated(true);
        new FrameUI(createDocument);

    }
}
