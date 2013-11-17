import java.nio.ByteBuffer;

public class dVl extends hk
{
  private byte[] izh = null;

  public dVl(aic paramaic) {  } 
  void dvn() { this.izh = null; }


  public void c(ByteBuffer paramByteBuffer, int paramInt)
  {
    this.muc.auS();

    int i = paramByteBuffer.getShort();
    cSi localcSi = new cSi();
    for (int j = 0; j < i; j++) {
      k = paramByteBuffer.getInt();
      int m = paramByteBuffer.getInt();
      int[] arrayOfInt = new int[m];
      for (int n = 0; n < m; n++) {
        arrayOfInt[n] = paramByteBuffer.getInt();
      }
      crV localcrV = (crV)aic.a(this.muc).get(k);

      if ((localcrV == null) || (!aic.a(this.muc, arrayOfInt, localcrV)))
      {
        aic.a(this.muc).remove(k);
        this.muc.e(k, arrayOfInt);
        if (!localcSi.contains(k)) {
          localcSi.add(k);
        }
      }
    }
    this.muc.auT();
    j = 0; for (int k = localcSi.size(); j < k; j++)
      this.muc.iv(localcSi.wm(j));
  }

  public void b(ByteBuffer paramByteBuffer)
  {
    if (this.izh != null)
    {
      if ((!bB) && (paramByteBuffer.remaining() < this.izh.length)) throw new AssertionError("Problème à la sérialisation : on veut mettre des data sérialisées d'une taille de " + this.izh.length + " dans un buffer ou il ne reste que " + paramByteBuffer.remaining() + " octets");

      paramByteBuffer.put(this.izh);
      return;
    }

    this.izh = new byte[O()];
    ByteBuffer localByteBuffer = ByteBuffer.wrap(this.izh);

    localByteBuffer.putShort((short)aic.a(this.muc).size());

    dmn localdmn = aic.a(this.muc).yF();
    while (localdmn.hasNext()) {
      localdmn.fl();
      localByteBuffer.putInt(localdmn.zY());
      crV localcrV = (crV)localdmn.value();
      int i = localcrV.size();
      localByteBuffer.putInt(i);
      for (int j = 0; j < i; j++) {
        localByteBuffer.putInt(localcrV.wm(j));
      }
    }
    localByteBuffer.flip();
    paramByteBuffer.put(localByteBuffer);
  }

  public int O()
  {
    if (this.izh != null) {
      return this.izh.length;
    }
    int i = 2 + aic.a(this.muc).size() * 8;

    dmn localdmn = aic.a(this.muc).yF();
    while (localdmn.hasNext()) {
      localdmn.fl();
      crV localcrV = (crV)localdmn.value();
      i += 4 * localcrV.size();
    }
    return i;
  }
}