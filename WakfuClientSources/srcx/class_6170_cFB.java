import java.nio.ByteBuffer;

public class cFB
{
  public final bUq[] iAc;
  public final int fqF;
  public final int eRe;

  public cFB(bUq[] paramArrayOfbUq, int paramInt1, int paramInt2)
  {
    this.iAc = paramArrayOfbUq;
    this.fqF = paramInt1;
    this.eRe = paramInt2;

    brV();
  }

  public cFB(ByteBuffer paramByteBuffer) {
    this.eRe = (paramByteBuffer.getShort() & 0xFFFF);
    this.fqF = (paramByteBuffer.getShort() & 0xFFFF);
    int i = paramByteBuffer.get() & 0xFF;
    this.iAc = new bUq[i];
    for (int j = 0; j < i; j++) {
      int k = paramByteBuffer.getInt();
      int m = paramByteBuffer.getInt();
      int n = paramByteBuffer.getInt();
      this.iAc[j] = new bUq(k, m, n);
    }
  }

  public bUq xE(int paramInt)
  {
    for (bUq localbUq : this.iAc) {
      if (localbUq.aw == paramInt)
        return localbUq;
    }
    return null;
  }

  public void a(dSw paramdSw) {
    paramdSw.writeShort((short)this.eRe);
    paramdSw.writeShort((short)this.fqF);
    paramdSw.writeByte((byte)this.iAc.length);
    for (int i = 0; i < this.iAc.length; i++) {
      paramdSw.writeInt(this.iAc[i].aw);
      paramdSw.writeInt(this.iAc[i].hgo);
      paramdSw.writeInt(this.iAc[i].eRe);
    }
  }

  public dRW Mt() {
    dRW localdRW1 = new dRW("monsterBalancing");
    localdRW1.bu("max_quantity", String.valueOf(this.eRe));
    localdRW1.bu("stasis_threshold", String.valueOf(this.fqF));
    for (int i = 0; i < this.iAc.length; i++) {
      dRW localdRW2 = this.iAc[i].ku("monsterFamily");
      localdRW1.e(localdRW2);
    }
    return localdRW1;
  }

  private void brV()
  {
    int i = 0;
    for (bUq localbUq : this.iAc) {
      i += localbUq.eRe;
    }
    if (i > this.eRe) {
      throw new cJ("le nombre max de monstres dépasse la quantité max");
    }
    if (this.fqF > this.eRe)
      throw new cJ("le seuil est supérieur à la quantité max de monstres");
  }
}