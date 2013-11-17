import java.nio.ByteBuffer;
import java.util.ArrayList;

final class aPN
{
  private final ArrayList brr = new ArrayList(0);

  private aPN(aNv paramaNv) {  } 
  public void z() { this.ayq.brr.clear();
    this.ayq.brr.ensureCapacity(this.brr.size());
    this.ayq.brr.addAll(this.brr); }

  private boolean A(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.brr.clear();
    this.brr.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      cKu localcKu = new cKu();
      boolean bool = localcKu.b(paramByteBuffer, 10021);
      if (!bool)
        return false;
      this.brr.add(localcKu);
    }
    return true;
  }

  public void HH() {
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 10021)
    {
      return false;
    }if (paramInt < 10028001) {
      boolean bool = A(paramByteBuffer);
      if (bool) {
        HH();
        return true;
      }
      return false;
    }

    return false;
  }
}