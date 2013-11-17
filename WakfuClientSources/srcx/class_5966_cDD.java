import java.io.IOException;
import org.apache.log4j.Logger;

public class cDD
  implements ccc
{
  private static final Logger K = Logger.getLogger(cDD.class);
  private cPV gTp;
  private btb gTq;
  private bMp gTr;
  private String iwW;
  private String iwX;
  private final dDL iwY = new dDL();
  private final dDL iwZ = new dDL();

  private static final cDD ixa = new cDD();

  public static cDD czz() {
    return ixa;
  }

  public void a(cPV paramcPV, btb parambtb, bMp parambMp)
  {
    this.gTp = paramcPV;
    this.gTq = parambtb;
    this.gTr = parambMp;
  }

  public boolean Q(short paramShort1, short paramShort2) {
    return this.iwY.ff(paramShort1, paramShort2);
  }

  public void P(short paramShort1, short paramShort2) {
    cwO.L(paramShort1, paramShort2);
    try {
      this.gTr.L(paramShort1, paramShort2);
    } catch (IOException localIOException1) {
      K.warn("Light map " + paramShort1 + ' ' + paramShort2, localIOException1);
    }
    try
    {
      this.gTp.L(paramShort1, paramShort2);
    } catch (IOException localIOException2) {
      K.warn("Environnement map doesn't exists " + paramShort1 + ' ' + paramShort2, localIOException2);
    }
  }

  public void cX(short paramShort) {
    if ((!bB) && (this.iwW == null)) throw new AssertionError("D'abord appler setValidMapsCoordFile");
    this.iwY.aa(this.iwW, paramShort);
    this.iwZ.aa(this.iwX, paramShort);

    this.gTq.a(new crO(), this.iwZ);
    LC.We().fK(paramShort);
  }

  public void clear() {
    this.iwY.clear();
    this.iwZ.clear();
  }

  public dDL xx(int paramInt) {
    dDL localdDL = new dDL();
    localdDL.aa(this.iwX, paramInt);
    return localdDL;
  }

  public void ao(String paramString1, String paramString2) {
    this.iwW = paramString1;
    this.iwX = paramString2;
    this.gTq.a(this.iwZ);
  }

  public void cY(short paramShort) {
    bGc.bOn().sH(paramShort);
    bGc.bOn().load();
  }
}