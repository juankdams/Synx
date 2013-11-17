import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import org.apache.log4j.Logger;

class aJM extends JPanel
{
  public static final Logger K = Logger.getLogger(aJM.class);
  private static final int ejU = 17;
  private static final int ejV = 17;
  private final ZJ ejW;
  private JButton ejX;
  private JButton ejY;
  private JButton ejZ;
  private bFD eka;
  private boolean ekb = false;

  aJM(ZJ paramZJ)
  {
    super(new FlowLayout(2, 1, 3));

    this.ejW = paramZJ;

    setFocusable(false);
    setBorder(BorderFactory.createEmptyBorder());
    setOpaque(true);
    setDoubleBuffered(true);

    this.ejX = bbn();
    add(this.ejX);
    if (this.ejW != null) {
      this.ejX.addActionListener(new DZ(this));
    }

    this.ejY = bbn();
    add(this.ejY);
    if (this.ejW != null) {
      this.ejY.addActionListener(new Eb(this));
    }

    this.ejZ = bbn();
    add(this.ejZ);
    this.ejZ.addActionListener(new Ea(this));

    Container localContainer = new Container();
    localContainer.setSize(new Dimension(2, 1));
    localContainer.setMinimumSize(new Dimension(2, 1));
    localContainer.setMaximumSize(new Dimension(2, 1));
    localContainer.setPreferredSize(new Dimension(2, 1));
    add(localContainer);

    if (this.ejW != null)
      addMouseListener(new Ec(this));
  }

  public void setMaximized(boolean paramBoolean)
  {
    this.ekb = paramBoolean;
    a(this.eka);
  }

  private JButton bbn() {
    Dimension localDimension = new Dimension(17, 17);
    JButton localJButton = new JButton();
    localJButton.setBorder(BorderFactory.createEmptyBorder());
    localJButton.setBorderPainted(false);
    localJButton.setFocusable(false);
    localJButton.setFocusPainted(false);
    localJButton.setMinimumSize(localDimension);
    localJButton.setSize(localDimension);
    localJButton.setPreferredSize(localDimension);
    localJButton.setMaximumSize(localDimension);
    return localJButton;
  }

  protected void paintComponent(Graphics paramGraphics) {
    if (this.eka == null) {
      return;
    }

    int i = this.eka.bNA().getWidth(null);
    int j = this.eka.bNE().getWidth(null);

    int k = getHeight();
    int m = getWidth();

    paramGraphics.drawImage(this.eka.bNA(), 0, 0, i, k, null);
    paramGraphics.drawImage(this.eka.bNE(), m - j, 0, j, k, null);
    paramGraphics.drawImage(this.eka.bNC(), i, 0, m - i - j, k, null);
  }

  void a(bFD parambFD) {
    this.eka = parambFD;

    if (!this.ekb) {
      this.ejY.setIcon(parambFD.bNT());
      this.ejY.setRolloverIcon(parambFD.bNU());
    } else {
      this.ejY.setIcon(parambFD.bNV());
      this.ejY.setRolloverIcon(parambFD.bNW());
    }

    this.ejX.setIcon(parambFD.bNR());
    this.ejX.setRolloverIcon(parambFD.bNS());

    this.ejZ.setIcon(parambFD.bNP());
    this.ejZ.setRolloverIcon(parambFD.bNQ());
    repaint();
  }

  JButton bbo() {
    return this.ejY;
  }

  JButton bbp() {
    return this.ejX;
  }
}