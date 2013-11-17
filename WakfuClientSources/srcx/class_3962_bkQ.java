import java.nio.ByteBuffer;

public class bkQ
{
  private final int aw;
  private aYr bwL;
  private int aTy;
  private float fBh;
  private float fBi;
  private int fBj;
  private final int fBk;
  private boolean fBl;
  private String fBm;

  protected bkQ(int paramInt1, aYr paramaYr, boolean paramBoolean, int paramInt2, float paramFloat1, float paramFloat2, int paramInt3, int paramInt4)
  {
    this(paramInt1, paramaYr, paramBoolean, paramInt2, paramFloat1, paramFloat2, paramInt3, paramInt4, null);
  }

  protected bkQ(int paramInt1, aYr paramaYr, boolean paramBoolean, int paramInt2, float paramFloat1, float paramFloat2, int paramInt3, int paramInt4, String paramString) {
    this.aw = paramInt1;
    this.bwL = paramaYr;
    this.fBl = paramBoolean;
    this.aTy = paramInt2;
    this.fBh = paramFloat1;
    this.fBi = paramFloat2;
    this.fBj = paramInt3;
    this.fBk = paramInt4;
    this.fBm = paramString;
  }

  public int getId() {
    return this.aw;
  }

  public aYr UI() {
    return this.bwL;
  }

  public int bP() {
    return this.bwL.bP();
  }

  public void m(aYr paramaYr) {
    this.bwL = paramaYr;
  }

  public boolean CC() {
    return this.fBl;
  }

  public void k(boolean paramBoolean) {
    this.fBl = paramBoolean;
  }

  public int aAM() {
    return this.aTy;
  }

  public void qa(int paramInt) {
    this.aTy += paramInt;
  }

  public void qb(int paramInt) {
    this.fBj = paramInt;
  }

  public float bvx() {
    return this.fBh;
  }

  public float bvy() {
    return this.fBi;
  }

  public void b(cVE paramcVE, float paramFloat) {
    switch (dyF.bMj[paramcVE.ordinal()]) {
    case 1:
      this.fBh = paramFloat;
      break;
    case 2:
      this.fBi = paramFloat;
      break;
    default:
      throw new UnsupportedOperationException("Context de taxe non géré : " + paramcVE);
    }
  }

  public int aAQ() {
    return this.fBj;
  }

  public int aAO() {
    return this.fBk;
  }

  public String bvz() {
    return this.fBm;
  }

  public String toString() {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("NationProtectorInfo");
    localStringBuilder.append("{m_id=").append(this.aw);
    localStringBuilder.append(", m_nation=").append(this.bwL);
    localStringBuilder.append(", m_isChaos=").append(this.fBl);
    localStringBuilder.append(", m_cash=").append(this.aTy);
    localStringBuilder.append(", m_fleaTaxValue=").append(this.fBh);
    localStringBuilder.append(", m_marketTaxValue=").append(this.fBi);
    localStringBuilder.append(", m_currentSatisfaction=").append(this.fBj).append(" / ").append(this.fBk);
    localStringBuilder.append(", m_serverIdString=").append(this.fBm);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }

  public void b(ByteBuffer paramByteBuffer) {
    paramByteBuffer.putInt(this.aw);
    paramByteBuffer.putInt(this.bwL.bP());
    paramByteBuffer.put((byte)(this.fBl ? 1 : 0));
    paramByteBuffer.putInt(this.aTy);
    paramByteBuffer.putFloat(this.fBh);
    paramByteBuffer.putFloat(this.fBi);
    paramByteBuffer.putInt(this.fBj);
    paramByteBuffer.putInt(this.fBk);
  }

  public static bkQ as(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getInt();
    aYr localaYr = dsh.luB.BA(paramByteBuffer.getInt());
    return new bkQ(i, localaYr, paramByteBuffer.get() != 0, paramByteBuffer.getInt(), paramByteBuffer.getFloat(), paramByteBuffer.getFloat(), paramByteBuffer.getInt(), paramByteBuffer.getInt());
  }

  public static int O() {
    return 29;
  }
}