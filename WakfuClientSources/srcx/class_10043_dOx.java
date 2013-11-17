import java.nio.ByteBuffer;

public class dOx extends cCA
  implements cMC
{
  private int aDe;
  private short goO;
  private dnm lVh;
  private wz aFk;
  private long mgf;
  private short mgg;
  private boolean mgh;

  public dOx(int paramInt, short paramShort1, dnm paramdnm, long paramLong, short paramShort2)
  {
    this.aDe = paramInt;
    this.goO = paramShort1;
    this.lVh = paramdnm;
    this.mgf = paramLong;
    this.mgg = paramShort2;
  }

  public dOx() {
  }

  public int tc() {
    return this.aDe;
  }

  public short K() {
    return this.goO;
  }

  public long bgh() {
    return this.mgf;
  }

  public short dqq() {
    return this.mgg;
  }

  public dnm diS() {
    return this.lVh;
  }

  public byte L()
  {
    return 0;
  }

  public void a(short paramShort) {
    this.goO = paramShort;
  }

  public boolean M() {
    return this.mgh;
  }

  public void b(boolean paramBoolean) {
    this.mgh = paramBoolean;
  }

  public wz oq() {
    return this.aFk;
  }

  public void a(wz paramwz) {
    this.aFk = paramwz;
  }

  public void a(cXr paramcXr)
  {
    paramcXr.putInt(this.aDe);
    paramcXr.dT(this.goO);
    paramcXr.jn(this.mgf);
    paramcXr.dT(this.mgg);
    ByteBuffer localByteBuffer = ByteBuffer.allocate(this.lVh.O());
    this.lVh.b(localByteBuffer);
    paramcXr.eL(this.lVh.xH());
    paramcXr.aD(localByteBuffer.array());
    paramcXr.eL((byte)(this.aFk == null ? 0 : 1));
    if (this.aFk != null) {
      kH localkH = new kH();
      this.aFk.a(localkH);
      localByteBuffer = ByteBuffer.allocate(localkH.O());
      localkH.g(localByteBuffer);
      paramcXr.aD(localByteBuffer.array());
    }
  }

  public void a(ByteBuffer paramByteBuffer)
  {
    this.aDe = paramByteBuffer.getInt();
    this.goO = paramByteBuffer.getShort();
    this.mgf = paramByteBuffer.getLong();
    this.mgg = paramByteBuffer.getShort();
    this.lVh = dIi.fK(paramByteBuffer.get()).Ri();
    this.lVh.a(paramByteBuffer);
    if (paramByteBuffer.get() == 1) {
      kH localkH = new kH();
      localkH.h(paramByteBuffer);
      this.aFk = bYs.c(localkH);
    }
  }

  public String toString()
  {
    return "AddItemOperation{refId=" + this.aDe + ", qty=" + this.goO + ", m_optionalInfo=" + this.lVh + ", m_rentInfo=" + this.aFk + ", bagId=" + this.mgf + ", posInBag=" + this.mgg + ", insideMove=" + this.mgh + '}';
  }
}