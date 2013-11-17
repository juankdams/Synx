import java.nio.ByteBuffer;
import java.util.ArrayList;

public final class bfh
{
  private final int aw;
  private cdR[] fsu;
  private ArrayList fsv = new ArrayList();

  public bfh(int paramInt) {
    this.aw = paramInt;
  }

  public final int getId() {
    return this.aw;
  }

  public final void a(ByteBuffer paramByteBuffer, ckq paramckq) {
    this.fsv.clear();
    int i = paramByteBuffer.getShort() & 0xFFFF;

    this.fsu = new cdR[i];
    for (int j = 0; j < i; j++) {
      int k = paramByteBuffer.getShort() & 0xFFFF;
      cdR localcdR2 = paramckq.b(k, paramByteBuffer);
      this.fsu[j] = localcdR2;
      if (localcdR2.adi() == sF.bbM)
        this.fsv.add((cwG)localcdR2);
    }
    this.fsv.trimToSize();
    int n;
    for (j = 0; j < this.fsu.length; j++) {
      cdR localcdR1 = this.fsu[j];
      n = localcdR1.asp();
      if (n != 0)
      {
        aYH[] arrayOfaYH = new aYH[n];
        for (int i2 = 0; i2 < arrayOfaYH.length; i2++) {
          int i3 = paramByteBuffer.getShort() & 0xFFFF;
          arrayOfaYH[i2] = ((aYH)this.fsu[i3]);
        }
        localcdR1.a(arrayOfaYH);
      }
    }

    j = paramByteBuffer.getShort() & 0xFFFF;
    for (int m = 0; m < j; m++) {
      n = paramByteBuffer.getShort() & 0xFFFF;
      int i1 = paramByteBuffer.getShort() & 0xFFFF;
      cwG localcwG = (cwG)this.fsu[n];
      localcwG.b((aYH)this.fsu[i1]);
    }
  }

  public final void update(int paramInt)
  {
    for (int i = 0; i < this.fsu.length; i++) {
      this.fsu[i].update(paramInt);
    }

    for (i = 0; i < this.fsv.size(); i++)
      ((cwG)this.fsv.get(i)).Qk();
  }

  ArrayList bsF()
  {
    return this.fsv;
  }
}