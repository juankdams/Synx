import java.nio.ByteBuffer;

public class mx
  implements auY
{
  public static final ccY Sd = new dkf();
  private int aQU;

  public mx(int paramInt)
  {
    this.aQU = paramInt;
  }

  private mx() {
  }

  public int ul() {
    return this.aQU;
  }

  public int O() {
    return 4;
  }

  public void v(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putInt(this.aQU);
  }

  public void w(ByteBuffer paramByteBuffer) {
    this.aQU = paramByteBuffer.getInt();
  }

  public aHB um() {
    return aHB.efz;
  }

  public String toString()
  {
    return "InventoryRemoveMoneyAction{m_kamas=" + this.aQU + '}';
  }
}