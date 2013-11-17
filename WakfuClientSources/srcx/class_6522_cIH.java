import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class cIH extends JPanel
  implements dwL
{
  private long kM;
  private long bkK;
  private String m_name;
  private aUx iGw;
  private JPanel iGx;
  private ib iGy;
  private JTextField iGz;
  private JTextField iGA;

  public cIH(long paramLong)
  {
    this.kM = paramLong;
    this.bkK = 0L;
    this.m_name = "<unkwnown>";

    setLayout(new BorderLayout());

    cCO();

    cCT();
  }

  public void b(long paramLong1, long paramLong2, String paramString1, short paramShort1, int paramInt1, String paramString2, int paramInt2, int paramInt3, short paramShort2, int paramInt4, int paramInt5, short paramShort3, boolean paramBoolean) {
    this.kM = paramLong1;
    this.bkK = paramLong2;
    this.m_name = paramString1;

    this.iGw.a(paramLong1, paramLong2, paramString1, paramShort1, paramInt1, paramString2, paramInt2, paramInt3, paramShort2, paramInt4, paramInt5, paramShort3, paramBoolean);

    WakfuClientInstance.awy().awZ().log("player " + this.kM + " (" + this.m_name + ") information update");
  }

  private void cCO() {
    this.iGw = new aUx();
    add(this.iGw, "North");
  }

  public void cCP() {
    aIG localaIG = new aIG();
    localaIG.bf((short)110);
    localaIG.dU(this.kM);
    localaIG.bM((byte)2);
    WakfuClientInstance.awy().awz().aJK().d(localaIG);

    WakfuClientInstance.awy().awZ().log("player " + this.kM + " (" + this.m_name + ") information request");
  }

  public void cCQ() {
    aIG localaIG = new aIG();
    localaIG.bf((short)111);
    localaIG.dU(this.kM);
    localaIG.bM((byte)2);
    WakfuClientInstance.awy().awz().aJK().d(localaIG);

    WakfuClientInstance.awy().awZ().log("player " + this.kM + " (" + this.m_name + ") kick request");
  }

  private void cCR() {
    aIG localaIG = new aIG();
    localaIG.bf((short)22);
    localaIG.mH(this.iGw.avT());
    localaIG.mH(this.iGw.avU());
    localaIG.bg(this.iGw.bjz());
    localaIG.bM((byte)3);
    WakfuClientInstance.awy().awz().aJK().d(localaIG);

    WakfuClientInstance.awy().awZ().log("player " + this.kM + " (" + this.m_name + ") kick request");
  }

  public void cCS() {
    dQI.rN("https://nala.ankama.com/fr/account/account.html?id=" + this.bkK);
  }

  private void cCT() {
    this.iGx = new JPanel();
    this.iGx.setLayout(new GridLayout(0, 1));
    add(this.iGx, "South");

    cDa();
    cCY();
    cDb();
    cDc();
    cCU();
    cCW();
    cCZ();
  }

  private void cCU() {
    JPanel localJPanel = new JPanel();
    localJPanel.setLayout(new GridLayout(-1, 2));
    JButton localJButton = new JButton(new bpO(this));

    localJButton.setText("ban");

    this.iGz = new JTextField();

    localJPanel.add(this.iGz);
    localJPanel.add(localJButton);
    this.iGx.add(localJPanel);
  }

  private void cCV() {
    String str = this.iGz.getText();
    try {
      int i = Integer.parseInt(str);

      aIG localaIG = new aIG();
      localaIG.bf((short)49);
      localaIG.dU(this.bkK);
      localaIG.dt(true);
      localaIG.mH(i);
      localaIG.bM((byte)1);
      WakfuClientInstance.awy().awz().aJK().d(localaIG);

      WakfuClientInstance.awy().awZ().log("player " + this.kM + " (" + this.m_name + ") ban for " + i + " minutes");
    } catch (NumberFormatException localNumberFormatException) {
    }
  }

  private void cCW() {
    JPanel localJPanel = new JPanel();
    localJPanel.setLayout(new GridLayout(-1, 2));
    JButton localJButton = new JButton(new bpN(this));

    localJButton.setText("mute");

    this.iGA = new JTextField();

    localJPanel.add(this.iGA);
    localJPanel.add(localJButton);
    this.iGx.add(localJPanel);
  }

  private void cCX() {
    String str = this.iGA.getText();
    try {
      int i = Integer.parseInt(str);

      aIG localaIG = new aIG();
      localaIG.bM((byte)2);
      localaIG.bf((short)140);
      localaIG.dU(this.bkK);
      localaIG.mH(i);
      WakfuClientInstance.awy().awz().aJK().d(localaIG);

      WakfuClientInstance.awy().awZ().log("player " + this.kM + " (" + this.m_name + ") muted for " + i + " minutes");
    } catch (NumberFormatException localNumberFormatException) {
    }
  }

  private void cCY() {
    JButton localJButton = new JButton(new bpW(this));

    localJButton.setText("teleport to");
    this.iGx.add(localJButton);
  }

  private void cCZ() {
    this.iGy = new ib("ban request", this);
    this.iGx.add(this.iGy);
  }

  private void cDa() {
    JButton localJButton = new JButton(new bpV(this));

    localJButton.setText("update");
    this.iGx.add(localJButton);
  }

  private void cDb() {
    JButton localJButton = new JButton(new bpT(this));

    localJButton.setText("nala");
    this.iGx.add(localJButton);
  }

  private void cDc() {
    JButton localJButton = new JButton(new bpR(this));

    localJButton.setText("kick");
    this.iGx.add(localJButton);
  }

  public void ii(boolean paramBoolean) {
    WakfuClientInstance.awy().awZ().log("player " + this.kM + " (" + this.m_name + ") kicked : " + paramBoolean);
  }

  public void pN() {
    this.iGy.pN();
  }

  public long eW() {
    return this.kM;
  }

  public long Ea() {
    return this.bkK;
  }

  public String Eb() {
    return this.m_name;
  }

  public void cDd() {
    WakfuClientInstance.awy().awZ().log("player " + this.kM + " (" + this.m_name + ") ban request successful");
  }

  public void ns(String paramString) {
    WakfuClientInstance.awy().awZ().log(paramString);
  }
}