import java.util.Comparator;
import javax.swing.table.TableCellRenderer;

public enum bJl
{
  private final String hh;
  private final TableCellRenderer gKi;
  private final Comparator cwp;
  private final boolean gKj;
  private final int gKk;

  private bJl(String paramComparator, TableCellRenderer paramBoolean, Comparator paramInt, boolean arg6, int arg7)
  {
    this.hh = paramComparator;
    this.gKi = paramBoolean;
    this.cwp = paramInt;
    boolean bool;
    this.gKj = bool;
    int i;
    this.gKk = i;
  }

  public String getTitle() {
    return this.hh;
  }

  public Comparator getComparator() {
    return this.cwp;
  }

  public TableCellRenderer bQv() {
    return this.gKi;
  }

  public int getMaxWidth() {
    return this.gKk;
  }

  public boolean bQw() {
    return this.gKj;
  }

  public static bJl aL(Object paramObject)
  {
    for (bJl localbJl : values())
      if (localbJl.getTitle().equals(paramObject))
        return localbJl;
    return null;
  }
}