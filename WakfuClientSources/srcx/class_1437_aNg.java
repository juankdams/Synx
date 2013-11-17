import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class aNg
  implements TableCellRenderer
{
  aNd etg = new aNd();

  public aNg() {
    this.etg.setBackground(Color.BLACK);
  }

  public Component getTableCellRendererComponent(JTable paramJTable, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2) {
    if (paramObject == null)
      return null;
    this.etg.a((cEz)paramObject);
    return this.etg;
  }
}