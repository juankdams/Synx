import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import org.apache.log4j.Logger;

public class cif
{
  private static final Logger K = Logger.getLogger(cif.class);
  private JPanel Tb;
  private JTable hGJ;
  public JCheckBox hGK;
  public JCheckBox hGL;
  public JTextField hGM;
  public JToggleButton hGN;
  public JToggleButton hGO;
  private final aHL hGP;
  private final aFo hGQ;
  final cSR hGR;

  public cif(cSR paramcSR)
  {
    gZ();
    this.hGR = paramcSR;

    this.hGQ = new aFo();
    this.hGJ.setColumnModel(this.hGQ);
    this.hGP = new aHL();
    this.hGJ.setModel(this.hGP);
    Object localObject2;
    for (localObject2 : bJl.values()) {
      this.hGP.addColumn(localObject2.getTitle());
    }

    for (localObject2 : bJl.values()) {
      TableColumn localTableColumn = this.hGJ.getColumn(localObject2.getTitle());
      TableCellRenderer localTableCellRenderer = localObject2.bQv();
      localTableColumn.setCellRenderer(localTableCellRenderer);
      if (localObject2.getMaxWidth() > 0) {
        localTableColumn.setMaxWidth(localObject2.getMaxWidth());
      }
      if (!localObject2.bQw()) {
        this.hGQ.a(localTableColumn, false);
      }
    }

    this.hGJ.setRowHeight(22);

    ??? = this.hGJ.getTableHeader();
    ((JTableHeader)???).addMouseListener(new caE(this, (JTableHeader)???));

    this.hGN.addActionListener(new caG(this));

    this.hGO.addActionListener(new caJ(this));
  }

  public JPanel gY()
  {
    return this.Tb;
  }

  public void c(cSR paramcSR)
  {
    Matcher localMatcher = cjS();

    for (dmn localdmn = paramcSR.yF(); localdmn.hasNext(); ) {
      localdmn.fl();
      cEz localcEz = (cEz)localdmn.value();
      cZL localcZL = localcEz.cAe();
      if (localcZL != null)
      {
        int i = -1;
        for (int j = 0; j < this.hGP.getRowCount(); j++) {
          if (localcEz.equals(this.hGP.getValueAt(j, 0))) {
            i = j;
            break;
          }
        }

        boolean bool = localcEz.isEnabled();
        if (localMatcher != null) {
          localMatcher.reset(localcEz.Dh());
        }
        int k = (bool) && ((localMatcher == null) || (localMatcher.find())) ? 1 : 0;

        if ((bool) && (k != 0))
        {
          bJl[] arrayOfbJl;
          if (i == -1) {
            arrayOfbJl = bJl.values();
            Object[] arrayOfObject = new Object[arrayOfbJl.length];
            for (int n = 0; n < arrayOfObject.length; n++) {
              arrayOfObject[n] = localcEz;
            }
            this.hGP.addRow(arrayOfObject);
          } else {
            arrayOfbJl = bJl.values();
            for (int m = 0; m < arrayOfbJl.length; m++) {
              this.hGP.setValueAt(localcEz, i, m);
            }
          }
        }
        else if (i != -1)
        {
          this.hGP.removeRow(i);
        }
      }
    }
    this.hGP.sort();
  }

  private Matcher cjS() {
    String str = this.hGM.getText();
    if (str.length() == 0) {
      return null;
    }
    Matcher localMatcher = null;
    try {
      localMatcher = Pattern.compile(str).matcher("");
    } catch (Exception localException) {
      localMatcher = null;
    }
    return localMatcher;
  }

  public boolean cjT() {
    return this.hGL.isSelected();
  }

  public boolean cjU() {
    return this.hGK.isSelected();
  }

  private void cjV()
  {
  }
}