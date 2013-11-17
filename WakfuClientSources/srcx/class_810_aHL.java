import java.util.Collections;
import java.util.Comparator;
import javax.swing.table.DefaultTableModel;

public class aHL extends DefaultTableModel
{
  private bJl efT;
  private boolean efU;

  public aHL()
  {
    this.efT = null;
    this.efU = true;
  }
  public boolean isCellEditable(int paramInt1, int paramInt2) {
    return false;
  }

  public Class getColumnClass(int paramInt) {
    switch (paramInt) {
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
      return cEz.class;
    case 6:
      return aNd.class;
    }
    return super.getColumnClass(paramInt);
  }

  public void a(bJl parambJl)
  {
    if (parambJl == null)
      return;
    if (parambJl == this.efT)
      this.efU = (!this.efU);
    else
      this.efU = true;
    this.efT = parambJl;
    Comparator localComparator = parambJl.getComparator();
    if (localComparator != null)
      Collections.sort(getDataVector(), new WY(localComparator, this.efU, null));
  }

  public void sort() {
    if (this.efT == null)
      return;
    Comparator localComparator = this.efT.getComparator();
    if (localComparator != null)
      Collections.sort(getDataVector(), new WY(localComparator, this.efU, null));
  }
}