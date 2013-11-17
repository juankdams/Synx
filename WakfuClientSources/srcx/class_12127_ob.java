import org.apache.log4j.Logger;

public abstract class ob extends dCb
  implements aNA, abc
{
  public static final short aTe = -32768;
  private boolean aTf = false;
  private static final String aTg = "AnimTrans_";
  private static final String aTh = "AnimStatique_";
  private static final String aTi = "Func_";
  private static final String aTj = "End";
  private bOO bf;
  protected dWu aTk;
  private int aTl;
  private int aTm;
  protected short aTn = -32768;
  private boolean aTo;

  protected void a(bOO parambOO)
  {
    this.bf = parambOO;
  }

  public long getId()
  {
    return this.aTk.getId();
  }

  public int vH()
  {
    return this.aTl;
  }

  public void bP(int paramInt)
  {
    this.aTl = paramInt;
  }

  public int vI() {
    return this.aTm;
  }

  public void bQ(int paramInt) {
    this.aTm = paramInt;
  }

  public void setColor(int paramInt) {
    bNa localbNa = new bNa(paramInt);
    this.bRQ[0] = localbNa.QE();
    this.bRQ[1] = localbNa.QD();
    this.bRQ[2] = localbNa.QC();
    this.dcx = (this.dcw = this.bRQ[3] = localbNa.getAlpha());
  }

  public byte vJ() {
    return (byte)BC();
  }

  public void y(byte paramByte) {
    ax((short)paramByte);
  }

  public void H(boolean paramBoolean) {
    dLw localdLw = paramBoolean ? dLw.mbe : dLw.mbe;
    id(localdLw.asR());
  }

  public void bc()
  {
    this.aTl = 0;
    this.aTm = 0;
    this.aTk = null;
    this.bf = null;
    this.aTn = -32768;
    this.aTf = false;
    dispose();
  }

  public void aJ()
  {
    this.aTo = true;
  }

  public void release()
  {
    if (this.bf != null)
      try {
        this.bf.y(this);
      } catch (Exception localException) {
        K.error("Exception levée du retour d'un objet dans son pool : ", localException);
      }
    else
      K.error("L'objet ne peut retourner dans un pool, il n'a pas été initialisé");
  }

  public dWu vK()
  {
    return this.aTk;
  }

  public void a(dWu paramdWu)
  {
    this.aTk = paramdWu;
  }

  protected void a(byte paramByte, boolean paramBoolean, XV paramXV, CG paramCG)
  {
    boolean bool = this.aTn != paramByte;
    int i = this.ax != paramCG ? 1 : 0;
    String str;
    if ((!bool) && (i == 0) && (paramXV != XV.cIy)) {
      str = ata();
      if ((str != null) && (!str.equals("AnimStatique"))) {
        return;
      }
    }

    c(paramCG);

    if (((!bool) && (i != 0)) || (paramXV == XV.cIz))
    {
      str = "AnimStatique_";
    }
    else str = d(paramBoolean, bool);

    if (str != null) {
      eq(str + paramByte);
    }
    es("AnimStatique_" + paramByte);
    asZ();
  }

  private String d(boolean paramBoolean1, boolean paramBoolean2) {
    if (this.aTn == -32768) {
      return "AnimStatique_";
    }
    if (!paramBoolean1) {
      return "AnimTrans_";
    }
    if (!paramBoolean2) {
      return null;
    }
    return "AnimTrans_" + this.aTn + "_";
  }

  public boolean vL() {
    return this.aTf;
  }

  public void I(boolean paramBoolean) {
    this.aTf = paramBoolean;
  }

  public void a(ahm paramahm) {
    this.aTk.a(this);
  }

  public boolean bZ() {
    return this.aTo;
  }

  public void J(boolean paramBoolean) {
    this.aTo = paramBoolean;
  }

  public abstract hQ[] vM();
}