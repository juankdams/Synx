import java.awt.Component;
import java.text.NumberFormat;
import java.util.Comparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

public class aGW
  implements TableCellRenderer
{
  private static final TableCellRenderer bDY = new DefaultTableCellRenderer();
  private static final NumberFormat bDZ = NumberFormat.getIntegerInstance();

  public static final Comparator bEa = new drK();

  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2)
  {
    if (paramObject == null)
      return null;
    cEz localcEz = (cEz)paramObject;
    int i = localcEz.cAb();
    return bDY.getTableCellRendererComponent(paramJTable, bDZ.format(i), paramBoolean1, paramBoolean2, paramInt1, paramInt2);
  }
}