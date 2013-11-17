public class cet extends aRw
{
  private long kD;
  private int hY;
  private int hZ;
  private short aOl;
  private boolean hyJ = false;
  private int hyK = 2;
  private boolean hyL = true;
  private byte hyM = 1;
  private cYk hyN = null;
  private int[] hyO = null;
  private cYk hyP;
  private cYk hyQ;

  public byte[] encode()
  {
    cXr localcXr = new cXr();

    localcXr.jn(this.kD);
    localcXr.putInt(this.hY);
    localcXr.putInt(this.hZ);
    localcXr.dT(this.aOl);
    localcXr.eL((byte)(this.hyJ ? 1 : 0));
    localcXr.putInt(this.hyK);
    localcXr.eL((byte)(this.hyL ? 1 : 0));
    localcXr.eL(this.hyM);
    if (this.hyN == null) {
      localcXr.eL((byte)0);
    } else {
      localcXr.eL((byte)1);
      localcXr.putInt(this.hyN.getX());
      localcXr.putInt(this.hyN.getY());
      localcXr.dT(this.hyN.IB());
    }
    if (this.hyO == null) {
      localcXr.eL((byte)0);
    } else {
      localcXr.eL((byte)this.hyO.length);
      for (int i = 0; i < this.hyO.length; i = (byte)(i + 1)) {
        localcXr.putInt(this.hyO[i]);
      }
    }
    if (this.hyP == null) {
      localcXr.eL((byte)0);
    } else {
      localcXr.eL((byte)1);
      localcXr.putInt(this.hyP.getX());
      localcXr.putInt(this.hyP.getY());
      localcXr.dT(this.hyP.IB());
    }
    if (this.hyQ == null) {
      localcXr.eL((byte)0);
    } else {
      localcXr.eL((byte)1);
      localcXr.putInt(this.hyQ.getX());
      localcXr.putInt(this.hyQ.getY());
      localcXr.dT(this.hyQ.IB());
    }

    return a((byte)3, localcXr.toArray());
  }

  public int getId()
  {
    return 8007;
  }

  public void O(long paramLong)
  {
    this.kD = paramLong;
  }

  public void h(int paramInt1, int paramInt2, short paramShort) {
    this.hY = paramInt1;
    this.hZ = paramInt2;
    this.aOl = paramShort;
  }

  public void O(cYk paramcYk) {
    this.hyN = paramcYk;
  }

  public void dH(byte paramByte) {
    this.hyM = paramByte;
  }

  public void L(int[] paramArrayOfInt) {
    this.hyO = paramArrayOfInt;
  }

  public void uZ(int paramInt) {
    this.hyK = paramInt;
  }

  public void gP(boolean paramBoolean) {
    this.hyJ = paramBoolean;
  }

  public void gQ(boolean paramBoolean) {
    this.hyL = paramBoolean;
  }

  public cYk cgO() {
    return this.hyP;
  }

  public void P(cYk paramcYk) {
    this.hyP = paramcYk;
  }

  public cYk cgP() {
    return this.hyQ;
  }

  public void Q(cYk paramcYk) {
    this.hyQ = paramcYk;
  }
}