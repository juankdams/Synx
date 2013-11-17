import java.awt.Color;
import java.awt.Component;
import java.text.NumberFormat;
import java.util.Comparator;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

public class BN
  implements TableCellRenderer
{
  private static final Color bDV = null;
  private static final Color bDW = Color.GREEN;
  private static final Color bDX = Color.RED;

  private static final TableCellRenderer bDY = new DefaultTableCellRenderer();
  private static final NumberFormat bDZ = NumberFormat.getIntegerInstance();

  public static final Comparator bEa = new abg();

  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2)
  {
    if (paramObject == null)
      return null;
    cEz localcEz = (cEz)paramObject;
    cZL localcZL = localcEz.cAe();
    if (localcZL == null) {
      return null;
    }

    int i = localcZL.hasMark() ? localcZL.azq() : localcZL.kNy;
    int j = localcZL.kNy - i;
    int k;
    if (j == 0)
      k = 0;
    else if (localcZL.azq() == 0)
      k = 999999;
    else
      k = j * 100 / i;
    StringBuilder localStringBuilder1 = new StringBuilder();
    if (j > 0)
      localStringBuilder1.append('+');
    localStringBuilder1.append(bDZ.format(j));

    localStringBuilder1.append(" (");
    if (k > 0)
      localStringBuilder1.append('+');
    localStringBuilder1.append(bDZ.format(k)).append("%)");

    String str = localStringBuilder1.toString();

    Color localColor = j > 0 ? bDX : j == 0 ? bDV : bDW;

    Component localComponent = bDY.getTableCellRendererComponent(paramJTable, str, paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    localComponent.setBackground(localColor);
    if ((localComponent instanceof JComponent))
    {
      StringBuilder localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append("Current : ").append(localcZL.kNy).append(" Marked : ").append(i).append(" = > ").append(str);
      ((JComponent)localComponent).setToolTipText(localStringBuilder2.toString());
    }
    return localComponent;
  }

  static
  {
    bDZ.setGroupingUsed(true);
  }
}