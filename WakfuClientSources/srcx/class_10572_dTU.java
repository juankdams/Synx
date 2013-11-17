import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.apache.log4j.Logger;

class dTU
{
  private static final Logger K = Logger.getLogger(dTU.class);
  private final cXk[] mrb;
  private final dSC mrc;
  private final String aXp;
  private final bUT mrd;

  dTU(String paramString, int paramInt)
  {
    this.aXp = paramString;
    byte[] arrayOfByte = dtb.readFile(this.aXp);

    ByteBuffer localByteBuffer1 = ByteBuffer.wrap(arrayOfByte);
    localByteBuffer1.order(ByteOrder.LITTLE_ENDIAN);
    int i = localByteBuffer1.getInt() + 756423;

    bUT localbUT = new bUT(localByteBuffer1, paramInt, i);

    int j = localbUT.getInt();
    this.mrb = new cXk[j];
    for (int k = 0; k < j; k++) {
      long l = localbUT.getLong();
      int n = localbUT.getInt();
      int i1 = localbUT.getInt();
      byte b = localbUT.get();
      this.mrb[k] = new cXk(l, n, i1, b);
    }
    k = localbUT.get();
    this.mrc = new dSC(k);
    for (int m = 0; m < k; m++) {
      KA localKA = KA.b(localbUT);
      this.mrc.put(localKA.m_name, localKA);
    }
    ByteBuffer localByteBuffer2 = localByteBuffer1.slice();
    localByteBuffer2.order(localByteBuffer1.order());
    this.mrd = new bUT(localByteBuffer2, paramInt, i);
  }

  public final String getFileName()
  {
    return this.aXp;
  }

  private KA sk(String paramString) {
    return (KA)this.mrc.get(paramString);
  }

  final boolean a(long paramLong, drN paramdrN) {
    try {
      paramdrN.reset();

      KA localKA = (KA)this.mrc.get("id");
      if (localKA.bJ(paramLong) == 0) {
        K.error("Pas de " + paramdrN.getClass().getSimpleName() + " existant. id=" + paramLong, new Exception());
        return false;
      }

      int i = localKA.e(paramLong, 0);
      a(this.mrb[i], paramdrN);
      return true;
    } catch (Exception localException) {
      K.error("Problème  de lecture de " + paramdrN.getClass().getSimpleName() + "id=" + paramLong, localException);
    }
    return false;
  }

  private void a(cXk paramcXk, drN paramdrN)
  {
    int i = paramcXk.gfd;
    this.mrd.y(i, paramcXk.hcj);
    paramdrN.a(this.mrd);

    if (paramcXk.m_size + i != this.mrd.position())
      throw new Exception("Taille de donnée incorrecte ");
  }

  final void a(drN paramdrN, gd paramgd)
  {
    int i = 0; for (int j = this.mrb.length; i < j; i++) {
      cXk localcXk = this.mrb[i];
      paramdrN.reset();
      a(localcXk, paramdrN);
      paramgd.a(paramdrN);
    }
  }

  final void a(drN paramdrN, String paramString, int paramInt, gd paramgd)
  {
    KA localKA = sk(paramString);
    int i = localKA.bJ(paramInt);
    for (int j = 0; j < i; j++)
      try {
        int k = localKA.e(paramInt, j);
        cXk localcXk = this.mrb[k];
        paramdrN.reset();
        a(localcXk, paramdrN);
        paramgd.a(paramdrN);
      } catch (Exception localException) {
        K.error("Problème  de lecture de " + paramdrN.getClass().getSimpleName() + "id=" + paramInt + "item num:" + j, localException);
      }
  }

  public int dtX()
  {
    return this.mrb.length;
  }
}