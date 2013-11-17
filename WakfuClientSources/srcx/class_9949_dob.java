import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class dob extends JPanel
{
  private final JTextField loo;
  private final JTextField lop;

  private dob()
  {
    super(new GridBagLayout(), true);

    this.loo = W("perso", 0);
    this.lop = W("souris", 1);
  }

  private JTextField W(String paramString, int paramInt) {
    JTextField localJTextField = new JTextField();
    localJTextField.setEnabled(false);
    localJTextField.setDisabledTextColor(Color.BLACK);
    localJTextField.setHorizontalAlignment(2);
    localJTextField.setPreferredSize(new Dimension(130, 18));

    GridBagConstraints localGridBagConstraints = new GridBagConstraints();
    localGridBagConstraints.fill = 2;
    localGridBagConstraints.gridx = 0;
    localGridBagConstraints.gridy = paramInt;
    localGridBagConstraints.weightx = 0.0D;
    add(new JLabel(paramString), localGridBagConstraints);
    localGridBagConstraints.gridx = 1;
    localGridBagConstraints.weightx = 1.0D;
    add(localJTextField, localGridBagConstraints);
    return localJTextField;
  }

  private void a(JTextField paramJTextField, cYk paramcYk, Integer paramInteger) {
    if (paramcYk == null) {
      paramJTextField.setText("null");
    } else {
      String str = paramcYk.getX() + ", " + paramcYk.getY() + ", " + paramcYk.IB();
      if (paramInteger != null) {
        str = str + " @" + paramInteger;
      }
      paramJTextField.setText(str);
    }
  }

  void b(cYk paramcYk, int paramInt) {
    a(this.loo, paramcYk, Integer.valueOf(paramInt));
  }

  void aj(cYk paramcYk) {
    a(this.lop, paramcYk, null);
  }
}