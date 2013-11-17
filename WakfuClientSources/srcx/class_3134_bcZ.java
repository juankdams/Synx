import javax.swing.JFrame;
import javax.swing.JPanel;

class bcZ
  implements Runnable
{
  bcZ(cwz paramcwz)
  {
  }

  public void run()
  {
    cwz.a(this.fnw, new JFrame("Debug ANM"));
    cwz.a(this.fnw).setContentPane(new JPanel());
    cwz.a(this.fnw).setDefaultCloseOperation(3);
    cwz.a(this.fnw).setSize(640, 480);
    cwz.a(this.fnw).setVisible(true);
  }
}