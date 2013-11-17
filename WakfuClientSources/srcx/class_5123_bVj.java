import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Display;

final class bVj
  implements Runnable
{
  public void run()
  {
    System.setProperty("sun.awt.xembedserver", "true");
    System.setProperty("org.eclipse.swt.browser.XULRunnerPath", "/Users/jderveeuw/dev/wakfu_trunk/libraries/natives/macosx/universal/xulrunner");
    System.setProperty("MOZ_PLUGIN_PATH", "/Users/jderveeuw/dev/wakfu_trunk/libraries/natives/macosx/universal/xulrunner/plugins");

    Canvas localCanvas = new Canvas();
    localCanvas.setBackground(Color.RED);
    localCanvas.setPreferredSize(new Dimension(800, 600));
    JPanel localJPanel = new JPanel(new BorderLayout());
    localJPanel.add(localCanvas, "Center");
    localJPanel.add(new Button("################# TEST ###################"), "North");
    JFrame localJFrame = new JFrame("My SWT Browser");
    localJFrame.setDefaultCloseOperation(2);
    localJFrame.setContentPane(localJPanel);
    localJFrame.pack();
    localJFrame.setVisible(true);

    dqy localdqy = new dqy();

    localdqy.a(Display.getCurrent(), localCanvas);
    localdqy.setUrl("http://arena-game.ankama.lan/arena/dev/arena-client/index-wakfu.html");

    localdqy.getBrowser().addProgressListener(new JX(this));
  }
}