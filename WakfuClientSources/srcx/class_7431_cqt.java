import java.util.ArrayList;

public abstract class cqt extends cGF
{
  protected final int hY;
  protected final int hZ;
  protected final short aOl;
  protected final short az;
  protected final short iab;
  protected final boolean iac;
  protected final boolean iad;
  protected final boolean fft;
  protected final boolean iae;
  protected final byte boN;
  protected final short fgF;
  protected final ArrayList iaf = new ArrayList();
  protected final String fgH;
  protected final int bxi;
  protected final int[] bdS;
  private final cCH iag = cpD();

  private final cCH iah = new dJq(this);

  private final cCH iai = cCH.ivi;
  private final cCH iaj = cCH.ivi;
  private final cCH[] iak = { this.iag, this.iah, this.iai, this.iaj };

  protected abstract cCH cpD();

  public cCH[] tn() { return this.iak; }

  public byte[] j()
  {
    return a(new cCH[] { this.iag, this.iah });
  }

  public cqt(short paramShort1, int paramInt1, int paramInt2, short paramShort2, short paramShort3, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, byte paramByte, short paramShort4, ArrayList paramArrayList, String paramString, int[] paramArrayOfInt, int paramInt3)
  {
    this.az = paramShort1;
    this.hY = paramInt1;
    this.hZ = paramInt2;
    this.aOl = paramShort2;
    this.iab = paramShort3;
    this.iac = paramBoolean1;
    this.iad = paramBoolean2;
    this.fft = paramBoolean3;
    this.iae = paramBoolean4;
    this.boN = paramByte;
    this.fgF = paramShort4;

    this.iaf.addAll(paramArrayList);

    this.fgH = paramString;
    this.bdS = paramArrayOfInt;

    this.bxi = paramInt3;
  }
}