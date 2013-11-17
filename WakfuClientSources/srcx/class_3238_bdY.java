import java.nio.ByteBuffer;

public class bdY
{
  public final bUq[] fqE;
  public final int fqF;
  public final int eRe;

  public bdY(bUq[] paramArrayOfbUq, int paramInt1, int paramInt2)
  {
    this.fqE = paramArrayOfbUq;
    this.fqF = paramInt1;
    this.eRe = paramInt2;

    brV();
  }

  public bdY(ByteBuffer paramByteBuffer) {
    this.eRe = (paramByteBuffer.getShort() & 0xFFFF);
    this.fqF = (paramByteBuffer.getShort() & 0xFFFF);
    int i = paramByteBuffer.get() & 0xFF;
    this.fqE = new bUq[i];
    for (int j = 0; j < i; j++) {
      int k = paramByteBuffer.getInt();
      int m = paramByteBuffer.getInt();
      int n = paramByteBuffer.getInt();
      this.fqE[j] = new bUq(k, m, n);
    }
  }

  public bUq pb(int paramInt) {
    for (bUq localbUq : this.fqE) {
      if (localbUq.aw == paramInt)
        return localbUq;
    }
    return null;
  }

  public void a(dSw paramdSw)
  {
    paramdSw.writeShort((short)this.eRe);
    paramdSw.writeShort((short)this.fqF);
    paramdSw.writeByte((byte)this.fqE.length);
    for (int i = 0; i < this.fqE.length; i++) {
      paramdSw.writeInt(this.fqE[i].aw);
      paramdSw.writeInt(this.fqE[i].hgo);
      paramdSw.writeInt(this.fqE[i].eRe);
    }
  }

  public dRW Mt() {
    dRW localdRW1 = new dRW("resourceBalancing");
    localdRW1.bu("max_quantity", String.valueOf(this.eRe));
    localdRW1.bu("stasis_threshold", String.valueOf(this.fqF));
    for (int i = 0; i < this.fqE.length; i++) {
      dRW localdRW2 = this.fqE[i].ku("resourceFamily");
      localdRW1.e(localdRW2);
    }
    return localdRW1;
  }

  private void brV()
  {
    int i = 0;
    for (bUq localbUq : this.fqE) {
      i += localbUq.eRe;
    }
    if (i > this.eRe) {
      throw new cJ("le nombre max de monstres dépasse la quantité max");
    }
    if (this.fqF > this.eRe)
      throw new cJ("le seuil est supérieur à la quantité max de monstres");
  }
}