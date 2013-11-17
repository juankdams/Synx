import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.apache.log4j.Logger;

public final class cNY
{
  public static final cNY ktX = new cNY();

  protected static final Logger K = Logger.getLogger(cNY.class);

  private static final Comparator ktY = new bAV();

  private final List ktZ = new ArrayList();
  private final List kua = new ArrayList();

  private final List kub = new ArrayList();

  static cNY b(dNt paramdNt)
  {
    cNY localcNY = new cNY();
    localcNY.c(paramdNt);
    return localcNY;
  }

  final void c(dNt paramdNt)
  {
    this.ktZ.add(paramdNt);
    if (paramdNt.hasValue())
      this.kua.add((boq)paramdNt);
    else
      this.kub.add((bLQ)paramdNt);
  }

  final void s(Collection paramCollection)
  {
    for (dNt localdNt : paramCollection)
      c(localdNt);
  }

  final void d(dNt paramdNt)
  {
    this.ktZ.remove(paramdNt);
    if (paramdNt.hasValue())
      this.kua.remove(paramdNt);
    else
      this.kub.remove(paramdNt);
  }

  public final int size()
  {
    return this.ktZ.size();
  }

  public List iD(boolean paramBoolean) {
    if (paramBoolean)
      Collections.sort(this.ktZ, ktY);
    return this.ktZ;
  }

  public List cGc() {
    return iD(false);
  }

  public List iE(boolean paramBoolean) {
    if (paramBoolean)
      Collections.sort(this.kua, ktY);
    return this.kua;
  }

  public List cGd() {
    return iE(false);
  }

  public List cGe() {
    return this.kub;
  }

  public boolean isEmpty() {
    return this.ktZ.isEmpty();
  }

  public boolean cGf() {
    int i = 0; for (int j = this.ktZ.size(); i < j; i++) {
      dNt localdNt = (dNt)this.ktZ.get(i);
      if (localdNt.isDirty()) {
        return true;
      }
    }
    return false;
  }

  public void clear() {
    this.ktZ.clear();
    this.kua.clear();
    this.kub.clear();
  }

  public final byte[] cGg() {
    int i = 2;
    int j = 0; for (int k = this.kua.size(); j < k; j++) {
      boq localboq1 = (boq)this.kua.get(j);
      i += 2 + localboq1.dpW().length + 8;
    }
    ByteBuffer localByteBuffer = ByteBuffer.allocate(i);
    localByteBuffer.putShort((short)this.kua.size());
    k = 0; for (int m = this.kua.size(); k < m; k++) {
      boq localboq2 = (boq)this.kua.get(k);
      byte[] arrayOfByte = localboq2.dpW();
      localByteBuffer.putShort((short)arrayOfByte.length);
      localByteBuffer.put(arrayOfByte);
      localByteBuffer.putLong(localboq2.getValue());
    }
    if ((!bB) && (localByteBuffer.remaining() != 0)) throw new AssertionError("Buffer non-rempli totalement");
    return localByteBuffer.array();
  }

  public final List yI(int paramInt)
  {
    int i = 2;

    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();

    int j = 0; for (int k = this.kua.size(); j < k; j++) {
      boq localboq = (boq)this.kua.get(j);
      int m = 2 + localboq.dpW().length + 8;

      if (i + m >= paramInt) {
        byte[] arrayOfByte2 = d(localArrayList1, i);
        localArrayList2.add(arrayOfByte2);
        localArrayList1.clear();
        i = 2;
      }
      i += m;
      localArrayList1.add(localboq);
    }

    if (!localArrayList1.isEmpty()) {
      byte[] arrayOfByte1 = d(localArrayList1, i);
      localArrayList2.add(arrayOfByte1);
    }

    return localArrayList2;
  }

  private byte[] d(List paramList, int paramInt) {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(paramInt);
    localByteBuffer.putShort((short)paramList.size());
    int i = 0; for (int j = paramList.size(); i < j; i++) {
      boq localboq = (boq)paramList.get(i);
      byte[] arrayOfByte = localboq.dpW();
      localByteBuffer.putShort((short)arrayOfByte.length);
      localByteBuffer.put(arrayOfByte);
      localByteBuffer.putLong(localboq.getValue());
    }

    if ((!bB) && (localByteBuffer.remaining() != 0)) throw new AssertionError("Buffer non-rempli totalement");
    return localByteBuffer.array();
  }
}