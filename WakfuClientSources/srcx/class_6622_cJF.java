import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.KeyboardFocusManager;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public abstract class cJF extends cRd
  implements ZJ, dDJ, WindowListener, WindowStateListener
{
  private bFD iHM;
  private bFD iHN;
  protected JFrame fsi;
  protected JComponent iHO;
  protected JPanel iHP;
  private Tt iHQ;
  private Tt iHR;
  private Tt iHS;
  private Tt iHT;
  private Tt iHU;
  private aJM iHV;
  private aDf iHW;
  private boolean aDl = false;

  public void a(bFD parambFD1, bFD parambFD2)
  {
    this.iHM = parambFD1;
    this.iHN = parambFD2;
  }

  protected JFrame cDE()
  {
    JFrame.setDefaultLookAndFeelDecorated(false);
    this.fsi = new JFrame();
    this.fsi.setUndecorated(true);
    this.fsi.setFocusable(false);

    Container localContainer = this.fsi.getContentPane();
    localContainer.setLayout(new GridBagLayout());

    GridBagConstraints localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.fill = 1;
    localGridBagConstraints.insets = new Insets(0, 0, 0, 0);

    Insets localInsets = this.iHM.getBorderInsets();

    Dimension localDimension = new Dimension(-1, Math.max(1, localInsets.top));

    localGridBagConstraints.weightx = (localGridBagConstraints.weighty = 0.0D);
    localGridBagConstraints.gridy = 0;
    localGridBagConstraints.gridwidth = 3;

    this.iHV = new aJM(this);
    this.iHV.a(this.iHM);
    a(this.iHV, localDimension);
    localContainer.add(this.iHV, localGridBagConstraints);
    localGridBagConstraints.gridwidth = 1;

    this.iHU = new Tt();
    this.iHT = new Tt();
    this.iHS = new Tt();
    this.iHQ = new Tt();
    this.iHR = new Tt();

    localGridBagConstraints.gridy = 1;

    localGridBagConstraints.gridx = 0;
    a(this.iHU, new Dimension(localInsets.left, -1));
    localContainer.add(this.iHU, localGridBagConstraints);

    localGridBagConstraints.gridx = 2;
    a(this.iHS, new Dimension(localInsets.right, -1));
    localContainer.add(this.iHS, localGridBagConstraints);

    localGridBagConstraints.gridy = 2;

    localGridBagConstraints.gridx = 0;
    a(this.iHT, new Dimension(localInsets.left, localInsets.bottom));
    localContainer.add(this.iHT, localGridBagConstraints);

    localGridBagConstraints.gridx = 1;
    a(this.iHQ, new Dimension(-1, localInsets.bottom));
    localContainer.add(this.iHQ, localGridBagConstraints);

    localGridBagConstraints.gridx = 2;
    a(this.iHR, new Dimension(localInsets.right, localInsets.bottom));
    localContainer.add(this.iHR, localGridBagConstraints);

    localGridBagConstraints.fill = 1;
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.gridy = 1;
    localGridBagConstraints.weightx = (localGridBagConstraints.weighty = 1.0D);

    this.iHO = new JPanel(new BorderLayout(), true);
    localContainer.add(this.iHO, localGridBagConstraints);

    this.iHP = new JPanel(new atm(), true);
    cLS localcLS = new cLS(1.0F, 1.0F, (byte)1);
    localcLS.iv(true);
    this.iHP.add(cHy(), localcLS);
    this.iHO.add(this.iHP, "Center");

    cBX localcBX = new cBX(this.fsi, new Component[] { this.iHV });

    this.iHW = new aDf(this.fsi, new Component[] { this.iHQ, this.iHR, this.iHS });
    this.iHW.setMinimumSize(getMinimumSize());
    this.iHW.a(new JComponent[] { this.iHV, this.iHR, this.iHQ, this.iHS, this.iHU, this.iHT });

    this.fsi.addWindowStateListener(this);
    this.fsi.addWindowListener(this);

    rs().a(this, false);

    im(true);

    this.aDl = true;

    return this.fsi;
  }

  private void a(bFD parambFD) {
    this.iHQ.setImage(parambFD.bNK());
    this.iHT.setImage(parambFD.bNI());
    this.iHR.setImage(parambFD.bNM());
    this.iHU.setImage(parambFD.bNG());
    this.iHS.setImage(parambFD.bNO());
    this.iHV.a(parambFD);
    this.fsi.repaint();
  }

  private static void a(Component paramComponent, Dimension paramDimension) {
    paramComponent.setMinimumSize(paramDimension);
    paramComponent.setSize(paramDimension);
    paramComponent.setPreferredSize(paramDimension);
    paramComponent.setMaximumSize(paramDimension);
  }

  private void im(boolean paramBoolean) {
    if (this.iHW == null) {
      return;
    }
    this.iHW.setEnabled(paramBoolean);
    if (paramBoolean) {
      this.iHQ.setCursor(Cursor.getPredefinedCursor(9));
      this.iHS.setCursor(Cursor.getPredefinedCursor(11));
      this.iHR.setCursor(Cursor.getPredefinedCursor(5));
    } else {
      this.iHQ.setCursor(Cursor.getPredefinedCursor(0));
      this.iHS.setCursor(Cursor.getPredefinedCursor(0));
      this.iHR.setCursor(Cursor.getPredefinedCursor(0));
    }
  }

  private void in(boolean paramBoolean)
  {
    for (Component localComponent : this.fsi.getContentPane().getComponents())
      if (localComponent != this.iHO)
        localComponent.setVisible(paramBoolean);
  }

  protected boolean D(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = super.D(paramInt1, paramInt2, paramInt3, paramInt4);
    if (bool) {
      in(false);
    }
    return bool;
  }

  protected void cDF()
  {
    in(false);
    super.cDF();
  }

  protected void em(int paramInt1, int paramInt2)
  {
    in(true);
    super.em(paramInt1, paramInt2);
  }

  public boolean a(FocusEvent paramFocusEvent)
  {
    return false;
  }

  public boolean b(FocusEvent paramFocusEvent)
  {
    if ((cwl.ctP()) && 
      (!paramFocusEvent.isTemporary())) {
      Component localComponent = KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
      if (localComponent != cHy()) {
        cHy().requestFocus();
      }
    }

    return false;
  }

  public void alw()
  {
    close();
  }

  public void alx() {
    this.fsi.setExtendedState(this.fsi.getExtendedState() == 6 ? 0 : 6);
  }

  public void aly()
  {
    int i = this.fsi.getExtendedState() & 0x6;
    this.fsi.setExtendedState(0x1 | i);
  }

  public void b(dJR paramdJR)
  {
    Rectangle localRectangle = new Rectangle(this.fsi.getBounds());
    this.iHO.add(paramdJR, "South");
    paramdJR.setVisible(true);
    this.fsi.pack();
    this.fsi.setBounds(localRectangle);
  }

  public void cDG()
  {
    Rectangle localRectangle = new Rectangle(this.fsi.getBounds());
    for (Component localComponent : this.iHO.getComponents()) {
      if ((localComponent instanceof dJR)) {
        this.iHO.remove(localComponent);
      }
    }
    this.fsi.pack();
    this.fsi.setBounds(localRectangle);
  }

  public void windowStateChanged(WindowEvent paramWindowEvent) {
    int i = paramWindowEvent.getNewState();
    boolean bool = (i & 0x6) != 0;
    this.iHV.setMaximized(bool);
    im(!bool);
  }

  public void windowActivated(WindowEvent paramWindowEvent) {
    if (this.iHM != null)
      a(this.iHM);
  }

  public void windowDeactivated(WindowEvent paramWindowEvent)
  {
    if (this.iHN != null)
      a(this.iHN);
  }

  public void windowOpened(WindowEvent paramWindowEvent)
  {
  }

  public void windowClosing(WindowEvent paramWindowEvent) {
  }

  public void windowClosed(WindowEvent paramWindowEvent) {
  }

  public void windowIconified(WindowEvent paramWindowEvent) {
  }

  public void windowDeiconified(WindowEvent paramWindowEvent) {
  }

  public JPanel cDH() {
    return this.iHP;
  }

  public boolean ais() {
    return this.aDl;
  }

  public void io(boolean paramBoolean)
  {
    super.io(paramBoolean);
    if (!EventQueue.isDispatchThread()) {
      return;
    }
    this.iHP.validate();
  }
}