import java.awt.Component;
import java.util.Comparator;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

public class DS
  implements TableCellRenderer
{
  private static final TableCellRenderer bDY = new DefaultTableCellRenderer();

  public static final Comparator bEa = new arb();

  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2)
  {
    if (paramObject == null)
      return null;
    cEz localcEz = (cEz)paramObject;

    Component localComponent = bDY.getTableCellRendererComponent(paramJTable, localcEz.Dh(), paramBoolean1, paramBoolean2, paramInt1, paramInt2);
    if ((localComponent instanceof JComponent))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Class ").append(localcEz.Di());
      ((JComponent)localComponent).setToolTipText(localStringBuilder.toString());
    }
    return localComponent;
  }
}