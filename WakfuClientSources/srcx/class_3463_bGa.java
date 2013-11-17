import java.awt.Component;
import java.text.NumberFormat;
import java.util.Comparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

public class bGa
  implements TableCellRenderer
{
  private static final TableCellRenderer bDY = new DefaultTableCellRenderer();
  private static final NumberFormat bDZ = NumberFormat.getIntegerInstance();

  public static final Comparator bEa = new ckZ();

  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2)
  {
    if (paramObject == null)
      return null;
    cEz localcEz = (cEz)paramObject;
    cZL localcZL = localcEz.cAe();
    if (localcZL == null) {
      return null;
    }
    int i = localcZL.kNy + localcZL.kNx;
    return bDY.getTableCellRendererComponent(paramJTable, bDZ.format(i), paramBoolean1, paramBoolean2, paramInt1, paramInt2);
  }
}