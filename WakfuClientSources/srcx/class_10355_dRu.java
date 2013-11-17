import java.util.BitSet;
import org.apache.log4j.Logger;

public class dRu extends cOt
{
  private static final aee bx = new bOO(new alX());

  private static final qM by = new dzQ(new ec[] { new dLx("Interdit", new dmb[0]) });

  private boolean mmE = false;
  private boolean mmF = false;

  public dRu() {
    aH();
  }

  public dRu dsn()
  {
    dRu localdRu;
    try {
      localdRu = (dRu)bx.Mm();
      localdRu.aOr = bx;
    } catch (Exception localException) {
      localdRu = new dRu();
      localdRu.eXg = false;
      localdRu.aOr = null;
      K.error("Erreur lors d'un newInstance sur un ActionCost : " + localException.getMessage());
    }
    return localdRu;
  }

  public static dRu a(cOE paramcOE, bPk parambPk, dle paramdle) {
    dRu localdRu;
    try {
      localdRu = (dRu)bx.Mm();
      localdRu.aOr = bx;
    } catch (Exception localException) {
      localdRu = new dRu();
      localdRu.eXg = false;
      localdRu.aOr = null;
      K.error("Erreur lors d'un checkOut sur un ActionCost : " + localException.getMessage());
    }
    localdRu.aw = bsj.fOX.getId();
    localdRu.eWQ = ((doA)bsj.fOX.getObject()).DU();

    byte b1 = parambPk.j(eu.ayN);
    byte b2 = parambPk.j(eu.ayO);
    byte b3 = parambPk.j(eu.ayP);
    byte b4 = parambPk.j(eu.azE);

    localdRu.f(b1, b2, b3, b4);
    localdRu.aH();
    localdRu.evp = paramdle;
    localdRu.eWS = -1;
    localdRu.ejP = paramcOE;
    return localdRu;
  }

  public qM aF() {
    return by;
  }

  private void f(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4)
  {
    this.cxl = (paramByte4 << 24 | paramByte3 << 16 | paramByte2 << 8 | paramByte1);
  }

  public byte dso() {
    return (byte)((this.cxl & 0xFF0000) >> 16);
  }

  public byte dsp() {
    return (byte)((this.cxl & 0xFF00) >> 8);
  }

  public byte dsq() {
    return (byte)(this.cxl & 0xFF);
  }

  public byte dsr() {
    return (byte)((this.cxl & 0xFF000000) >> 24);
  }

  public void aH()
  {
    super.aH();
    if (dsq() > 0)
      this.eWR.set(55);
    if (dsp() > 0)
      this.eWR.set(65);
    if (dso() > 0)
      this.eWR.set(60);
    if (dsr() > 0)
      this.eWR.set(73);
    if (this.mmE)
      this.eWR.set(74);
    if ((this.mmF) && 
      (dsp() > 0))
      this.eWR.set(2188);
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    byte b1 = a(dsq(), eu.ayN);
    byte b2 = a(dsp(), eu.ayO);
    byte b3 = a(dso(), eu.ayP);
    byte b4 = a(dsr(), eu.azE);

    f(b1, b2, b3, b4);

    if ((b2 == 0) && (b1 == 0) && (b3 == 0))
      jJ(true);
  }

  private byte a(byte paramByte, dSc paramdSc) {
    if ((this.evp != null) && (paramByte > 0) && (this.evp.b(paramdSc))) {
      int i = (byte)this.evp.e(paramdSc);
      this.evp.a(paramdSc).gw(paramByte);
      return (byte)(i - this.evp.e(paramdSc));
    }
    return 0;
  }

  public void a(aVc paramaVc)
  {
  }

  public boolean aL()
  {
    return false;
  }

  public boolean aM()
  {
    return true;
  }

  public boolean aN()
  {
    return false;
  }

  public boolean bkM()
  {
    return false;
  }

  public void bc()
  {
    super.bc();
    this.mmE = false;
    this.mmF = false;
  }

  public void gv(boolean paramBoolean) {
    this.mmE = paramBoolean;
  }

  public void lo(boolean paramBoolean) {
    this.mmF = paramBoolean;
  }
}