import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

class caE extends MouseAdapter
{
  caE(cif paramcif, JTableHeader paramJTableHeader)
  {
  }

  public void mouseClicked(MouseEvent paramMouseEvent)
  {
    if (this.hrr.getColumnModel() == null) {
      return;
    }
    int i = cif.a(this.hrs).getColumnIndexAtX(paramMouseEvent.getX());
    TableColumn localTableColumn = cif.a(this.hrs).getColumn(i);
    if (localTableColumn == null) {
      return;
    }
    bJl localbJl = bJl.aL(localTableColumn.getIdentifier());
    if (localbJl == null) {
      return;
    }
    cif.b(this.hrs).a(localbJl);
  }
}