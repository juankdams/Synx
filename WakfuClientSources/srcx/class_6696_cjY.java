import org.apache.log4j.Logger;

public class cjY
{
  private static final Logger K = Logger.getLogger(cjY.class);
  private int dms;
  private int dmt;
  private int dmu;
  private String eOu;
  private String eOv;
  private int hj;
  private static final cjY hKi = new cjY();

  public static cjY clY() {
    return hKi;
  }

  private cjY() {
    reset();
  }

  public int clZ() {
    return this.dms;
  }

  public int cma() {
    return this.dmt;
  }

  public int cmb() {
    return this.dmu;
  }

  public String cmc() {
    return this.eOu;
  }

  public int getSoundId() {
    return this.hj;
  }

  public void vp(int paramInt) {
    this.dms = paramInt;
  }

  public void fm(int paramInt) {
    this.dmt = paramInt;
  }

  public void jc(int paramInt) {
    this.dmu = paramInt;
  }

  public void lh(String paramString) {
    this.eOu = paramString;
  }

  public void setSoundId(int paramInt) {
    this.hj = paramInt;
  }

  public String cmd() {
    return this.eOv;
  }

  public void li(String paramString) {
    this.eOv = paramString;
  }

  public void reset() {
    this.dms = 1000;
    this.dmt = 1000;
    this.dmu = 0;
    this.eOu = null;
    this.eOv = null;
    this.hj = 0;
  }
}