import java.nio.ByteBuffer;

public class aln
  implements auY
{
  public static final ccY Sd = new chI();
  private int aQU;

  public aln(int paramInt)
  {
    this.aQU = paramInt;
  }

  private aln() {
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
    return aHB.efy;
  }

  public String toString()
  {
    return "InventoryAddMoneyAction{m_kamas=" + this.aQU + '}';
  }
}