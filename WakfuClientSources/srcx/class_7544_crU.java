import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class crU
{
  protected int csY = -1;
  private byte ibA;
  private final LinkedList ibB = new LinkedList();

  public byte cql() {
    return this.ibA;
  }

  public void dS(byte paramByte) {
    this.ibA = paramByte;
  }

  public boolean isLocked()
  {
    return this.ibB.size() > 0;
  }

  public void W(ArrayList paramArrayList)
  {
    this.ibB.addLast(paramArrayList);
  }

  public void cqm()
  {
    this.ibB.clear();
  }

  public void cqn()
  {
    if (isLocked())
      this.ibB.removeFirst();
  }

  public ArrayList cqo()
  {
    if ((this.ibB != null) && (!this.ibB.isEmpty()))
      return (ArrayList)this.ibB.getFirst();
    return null;
  }

  public void cqp()
  {
    if (this.ibA != -1) {
      cqn();
      if ((isLocked()) && (this.ibA + 1 < 3))
        this.ibA = ((byte)(this.ibA + 1));
      else
        this.ibA = -1;
    }
  }

  protected List cqq() {
    return this.ibB;
  }

  public abstract long getId();

  public abstract void a(long paramLong);

  public abstract gA getItem();

  public int aeR()
  {
    return this.csY;
  }

  public void wk(int paramInt) {
    this.csY = paramInt;
  }
}