import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class aUx extends JPanel
{
  private final JTextField eVm;
  private final JTextField eVn;
  private final JTextField eVo;
  private final JTextField eVp;
  private final JTextField eVq;
  private final JTextField eVr;
  private final JTextField eVs;
  private final JTextField eVt;
  private final JTextField eVu;
  private int dhH;
  private int dhI;
  private short eVv;

  public aUx()
  {
    setLayout(new GridLayout(0, 2));

    add(new JLabel("playerId"));
    this.eVm = new JTextField("-1");
    this.eVm.setEditable(false);
    add(this.eVm);

    add(new JLabel("accountId"));
    this.eVn = new JTextField("-1");
    this.eVn.setEditable(false);
    add(this.eVn);

    add(new JLabel("name"));
    this.eVo = new JTextField("<>");
    this.eVo.setEditable(false);
    add(this.eVo);

    add(new JLabel("level"));
    this.eVp = new JTextField("<>");
    this.eVp.setEditable(false);
    add(this.eVp);

    add(new JLabel("nation"));
    this.eVq = new JTextField("<>");
    this.eVq.setEditable(false);
    add(this.eVq);

    add(new JLabel("game server"));
    this.eVr = new JTextField("<>");
    this.eVr.setEditable(false);
    add(this.eVr);

    add(new JLabel("position"));
    this.eVs = new JTextField("<>");
    this.eVs.setEditable(false);
    add(this.eVs);

    add(new JLabel("respawn"));
    this.eVt = new JTextField("<>");
    this.eVt.setEditable(false);
    add(this.eVt);

    add(new JLabel("subscriber"));
    this.eVu = new JTextField("<>");
    this.eVu.setEditable(false);
    add(this.eVu);
  }

  public void a(long paramLong1, long paramLong2, String paramString1, short paramShort1, int paramInt1, String paramString2, int paramInt2, int paramInt3, short paramShort2, int paramInt4, int paramInt5, short paramShort3, boolean paramBoolean) {
    this.eVm.setText(Long.toString(paramLong1));
    this.eVn.setText(Long.toString(paramLong2));
    this.eVo.setText(paramString1);
    this.eVp.setText(Short.toString(paramShort1));
    this.eVq.setText(Integer.toString(paramInt1));
    this.eVr.setText(paramString2);
    this.eVs.setText("(" + paramInt2 + ", " + paramInt3 + ")@" + paramShort2);
    this.eVt.setText("(" + paramInt4 + ", " + paramInt5 + ")@" + paramShort3);
    this.eVu.setText(Boolean.toString(paramBoolean));

    this.dhH = paramInt2;
    this.dhI = paramInt3;
    this.eVv = paramShort2;
  }

  public int avT() {
    return this.dhH;
  }

  public int avU() {
    return this.dhI;
  }

  public short bjz() {
    return this.eVv;
  }
}