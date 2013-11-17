import java.awt.Component;
import java.util.Comparator;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableCellRenderer;

public class aMW
  implements TableCellRenderer
{
  private JProgressBar esw = new JProgressBar();

  public static final Comparator bEa = new dNm();

  public aMW()
  {
    this.esw.setBorder(new EmptyBorder(0, 0, 0, 0));
    this.esw.setBorderPainted(true);
    this.esw.setStringPainted(true);
  }

  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    if (paramObject == null)
      return null;
    cEz localcEz = (cEz)paramObject;
    cZL localcZL = localcEz.cAe();
    if (localcZL == null)
      return null;
    this.esw.setMinimum(0);
    this.esw.setMaximum(localcZL.kNx + localcZL.kNy);
    this.esw.setValue(localcZL.kNy);
    return this.esw;
  }
}