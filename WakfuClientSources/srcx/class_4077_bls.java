import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class bls extends agY
{
  private long aTz;
  private aSu fCr;
  private gA aUe = new gA();

  private boolean aYZ = true;
  private long fCs;

  public long getId()
  {
    return this.aTz;
  }

  public void a(long paramLong) {
    this.aTz = paramLong;
  }

  public gA getItem() {
    return this.aUe;
  }

  public void C(byte[] paramArrayOfByte) {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.aTz = localByteBuffer.getLong();

    wk(localByteBuffer.getInt());
    fE(localByteBuffer.getLong());
    dGD localdGD = new dGD();
    localdGD.h(localByteBuffer);
    this.aUe.b(localdGD);
    int i = localByteBuffer.get();
    for (int j = 0; j < i; j++) {
      int k = localByteBuffer.get();
      ArrayList localArrayList = new ArrayList(k);
      for (int m = 0; m < k; m++) {
        localArrayList.add(Long.valueOf(localByteBuffer.getLong()));
      }
      cqq().add(localArrayList);
    }
    dS(localByteBuffer.get());
    cK(localByteBuffer.getLong());
    j = localByteBuffer.get() == 1 ? 1 : 0;
    if (j != 0) {
      short[] arrayOfShort = new short[3];
      arrayOfShort[0] = localByteBuffer.getShort();
      arrayOfShort[1] = localByteBuffer.getShort();
      arrayOfShort[2] = localByteBuffer.getShort();
      d(arrayOfShort);
    }
    aw(localByteBuffer.getShort());
  }

  public void bwt()
  {
    this.fCr.e(this);
    if (this.fCr.big().size() <= 0)
      ayg.aJQ().e(this.fCr);
  }

  public aSu bwu()
  {
    return this.fCr;
  }

  public void f(aSu paramaSu) {
    this.fCr = paramaSu;
  }

  public void setVisible(boolean paramBoolean) {
    this.aYZ = paramBoolean;
  }

  public boolean isVisible() {
    return this.aYZ;
  }

  public long bwv() {
    return this.fCs;
  }

  public void fE(long paramLong) {
    this.fCs = paramLong;
  }

  public int oe() {
    return this.aUe.oe();
  }
}