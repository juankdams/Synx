import java.util.Enumeration;
import java.util.Vector;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;

public class aFo extends DefaultTableColumnModel
{
  protected Vector ebq = new Vector();

  public void a(Object paramObject, boolean paramBoolean)
  {
    int i = b(paramObject, false);
    TableColumn localTableColumn = p(i, false);
    a(localTableColumn, paramBoolean);
  }

  public void a(TableColumn paramTableColumn, boolean paramBoolean)
  {
    if (!paramBoolean) {
      super.removeColumn(paramTableColumn);
    }
    else
    {
      int i = this.tableColumns.size();
      int j = this.ebq.size();
      int k = 0;

      for (int m = 0; m < j; m++) {
        Object localObject = k < i ? (TableColumn)this.tableColumns.get(k) : null;
        TableColumn localTableColumn = (TableColumn)this.ebq.get(m);

        if (localTableColumn == paramTableColumn) {
          if (localObject != paramTableColumn) {
            super.addColumn(paramTableColumn);
            super.moveColumn(this.tableColumns.size() - 1, k);
          }
          return;
        }
        if (localTableColumn == localObject)
          k++;
      }
    }
  }

  public void aRH()
  {
    int i = this.ebq.size();

    for (int j = 0; j < i; j++) {
      Object localObject = j < this.tableColumns.size() ? (TableColumn)this.tableColumns.get(j) : null;
      TableColumn localTableColumn = (TableColumn)this.ebq.get(j);

      if (localObject != localTableColumn) {
        super.addColumn(localTableColumn);
        super.moveColumn(this.tableColumns.size() - 1, j);
      }
    }
  }

  public TableColumn mp(int paramInt)
  {
    for (int i = 0; i < this.ebq.size(); i++) {
      TableColumn localTableColumn = (TableColumn)this.ebq.elementAt(i);
      if (localTableColumn.getModelIndex() == paramInt) {
        return localTableColumn;
      }
    }
    return null;
  }

  public boolean a(TableColumn paramTableColumn)
  {
    return this.tableColumns.indexOf(paramTableColumn) >= 0;
  }

  public void addColumn(TableColumn paramTableColumn)
  {
    this.ebq.addElement(paramTableColumn);
    super.addColumn(paramTableColumn);
  }

  public void removeColumn(TableColumn paramTableColumn)
  {
    int i = this.ebq.indexOf(paramTableColumn);
    if (i != -1) {
      this.ebq.removeElementAt(i);
    }
    super.removeColumn(paramTableColumn);
  }

  public void moveColumn(int paramInt1, int paramInt2)
  {
    if ((paramInt1 < 0) || (paramInt1 >= getColumnCount()) || (paramInt2 < 0) || (paramInt2 >= getColumnCount()))
    {
      throw new IllegalArgumentException("moveColumn() - Index out of range");
    }
    TableColumn localTableColumn1 = (TableColumn)this.tableColumns.get(paramInt1);
    TableColumn localTableColumn2 = (TableColumn)this.tableColumns.get(paramInt2);

    int i = this.ebq.indexOf(localTableColumn1);
    int j = this.ebq.indexOf(localTableColumn2);

    if (paramInt1 != paramInt2) {
      this.ebq.removeElementAt(i);
      this.ebq.insertElementAt(localTableColumn1, j);
    }

    super.moveColumn(paramInt1, paramInt2);
  }

  public int jdMethod_do(boolean paramBoolean)
  {
    Vector localVector = paramBoolean ? this.tableColumns : this.ebq;
    return localVector.size();
  }

  public Enumeration dp(boolean paramBoolean)
  {
    Vector localVector = paramBoolean ? this.tableColumns : this.ebq;

    return localVector.elements();
  }

  public int b(Object paramObject, boolean paramBoolean)
  {
    if (paramObject == null) {
      throw new IllegalArgumentException("Identifier is null");
    }

    Vector localVector = paramBoolean ? this.tableColumns : this.ebq;
    int i = localVector.size();

    for (int j = 0; j < i; j++) {
      TableColumn localTableColumn = (TableColumn)localVector.get(j);

      if (paramObject.equals(localTableColumn.getIdentifier())) {
        return j;
      }
    }
    throw new IllegalArgumentException("Identifier not found");
  }

  public TableColumn p(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean) {
      return (TableColumn)this.tableColumns.elementAt(paramInt);
    }
    return (TableColumn)this.ebq.elementAt(paramInt);
  }
}