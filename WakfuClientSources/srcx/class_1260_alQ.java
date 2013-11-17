import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.KeyStroke;

public class alQ extends JDialog
{
  private JPanel dnt;
  public JSlider dnu;
  public JLabel dnv;
  public JSlider dnw;
  public JLabel dnx;
  public JCheckBox dny;
  public JSlider dnz;
  public JLabel dnA;
  private ddH dnB;
  private boolean dnC;

  public alQ(ddH paramddH)
  {
    gZ();

    this.dnC = true;

    this.dnB = paramddH;
    setContentPane(this.dnt);

    setDefaultCloseOperation(0);
    addWindowListener(new cbD(this));

    this.dnt.registerKeyboardAction(new cbB(this), KeyStroke.getKeyStroke(27, 0), 1);

    this.dnu.addChangeListener(new bPP(this));

    this.dnw.addChangeListener(new bPO(this));

    this.dnz.addChangeListener(new bPN(this));

    this.dny.addItemListener(new bPM(this));
  }

  private void a(JLabel paramJLabel, float paramFloat)
  {
    paramJLabel.setText(Float.toString(paramFloat));
    paramJLabel.updateUI();
  }

  private static float a(JSlider paramJSlider) {
    return paramJSlider.getValue() / 100.0F;
  }

  private void ayA()
  {
    if (this.dnC)
      dispose();
    else
      setVisible(false);
  }

  public void close()
  {
    ayA();
  }

  public void cs(boolean paramBoolean) {
    this.dnC = paramBoolean;
  }

  public static alQ a(ddH paramddH, boolean paramBoolean)
  {
    alQ localalQ = new alQ(paramddH);
    localalQ.setTitle("Paramètre météo");
    localalQ.cs(paramBoolean);
    localalQ.setModal(paramBoolean);
    localalQ.pack();
    localalQ.setAlwaysOnTop(true);
    localalQ.setVisible(true);
    return localalQ;
  }

  public static void main(String[] paramArrayOfString) {
    a(new dnZ(), true);
    System.exit(0);
  }
}