import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class aLq extends JPanel
{
  private JTextField epE;
  private JTextField epF;
  private JList epG;

  public aLq()
  {
    setLayout(new BorderLayout());

    bcS();
    bcR();
  }

  private void bcR() {
    this.epG = new JList();
    this.epG.setSelectionMode(1);
    this.epG.setLayoutOrientation(2);
    this.epG.setVisibleRowCount(-1);
    this.epG.addMouseListener(new diI(this, null));
    add(new JScrollPane(this.epG), "Center");
  }

  private void bcS() {
    JPanel localJPanel = new JPanel();
    localJPanel.setLayout(new GridLayout(0, 3));
    add(localJPanel, "North");

    localJPanel.add(new Label("name"));
    this.epE = new JTextField();
    localJPanel.add(this.epE);
    JButton localJButton1 = new JButton(new acE(this));

    localJButton1.setText("search");
    localJPanel.add(localJButton1);

    localJPanel.add(new Label("account id"));
    this.epF = new JTextField();
    localJPanel.add(this.epF);
    JButton localJButton2 = new JButton(new acG(this));

    localJButton2.setText("search");
    localJPanel.add(localJButton2);
  }

  private void bcT()
  {
  }

  private void bcU() {
    aIG localaIG = new aIG();
    localaIG.bf((short)114);
    localaIG.gC(this.epE.getText());
    localaIG.bM((byte)2);
    WakfuClientInstance.awy().awz().aJK().d(localaIG);

    WakfuClientInstance.awy().awZ().log("name search request " + this.epE.getText());
  }

  public void a(boolean paramBoolean, ArrayList paramArrayList) {
    this.epG.clearSelection();
    this.epG.removeAll();

    this.epG.setListData(paramArrayList.toArray());
    WakfuClientInstance.awy().awZ().log("name search result  : " + paramArrayList.size() + " results");
  }
}