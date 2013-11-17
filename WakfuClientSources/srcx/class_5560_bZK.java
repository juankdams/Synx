import java.util.ArrayList;

public class bZK
{
  private ArrayList cm;
  private ArrayList hqr;
  private int hie;
  private int hid;

  public bZK(ArrayList paramArrayList1, ArrayList paramArrayList2, int paramInt1, int paramInt2)
  {
    this.hie = paramInt1;
    this.hid = paramInt2;
    this.cm = paramArrayList1;
    this.hqr = paramArrayList2;
  }

  public ArrayList getItems()
  {
    return this.cm;
  }

  public void g(ArrayList paramArrayList)
  {
    this.cm = paramArrayList;
  }

  public int getRowCount()
  {
    return this.hie;
  }

  public void setRowCount(int paramInt)
  {
    this.hie = paramInt;
  }

  public int getColumnCount()
  {
    return this.hid;
  }

  public void setColumnCount(int paramInt)
  {
    this.hid = paramInt;
  }

  public ArrayList ceo()
  {
    return this.hqr;
  }

  public void P(ArrayList paramArrayList)
  {
    this.hqr = paramArrayList;
  }
}