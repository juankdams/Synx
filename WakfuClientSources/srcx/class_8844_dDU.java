import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.apache.log4j.Logger;

public class dDU
{
  private static final Logger K = Logger.getLogger(dDU.class);
  private static final ArrayList lMC = new ArrayList();
  private int aw;
  private final ArrayList lMD = new ArrayList();
  private final HashMap lME = new HashMap();
  private final ArrayList cLh = new ArrayList();
  private ArrayList lMF = null;
  private short hTV;
  private short hTX = 0;
  private short hTY = -1;
  private int biu;
  private dxL lMG;
  private aF fAP;
  private cXa lMH;
  private boolean lMI;
  private byte dpP = 0;
  private final bZA lMJ;
  private final bZA lMK;
  private final boolean lML;
  private final ArrayList fHL;

  public dDU(int paramInt, byte paramByte1, byte paramByte2, short paramShort1, boolean paramBoolean1, dxL paramdxL, short paramShort2, short paramShort3, String paramString1, String paramString2, boolean paramBoolean2, String paramString3)
  {
    this.aw = paramInt;
    this.fAP = aF.c(paramByte1);
    this.lMH = cXa.eK(paramByte2);
    this.hTV = paramShort1;
    this.lMI = paramBoolean1;
    this.lMG = paramdxL;
    this.hTX = paramShort2;
    this.hTY = paramShort2;
    this.lML = paramBoolean2;
    this.lMJ = qT(paramString1);
    this.lMK = qT(paramString2);
    this.fHL = (paramString3 == null ? lMC : cnR.ly(paramString3));
  }

  private bZA qT(String paramString) {
    bZA localbZA = null;
    if ((paramString != null) && (paramString.length() != 0)) {
      try {
        localbZA = aVj.hn(paramString);
      } catch (Exception localException) {
        K.warn("Impossible de charger le criterion " + paramString + " pour le challenge " + this.aw);
      }
    }
    return localbZA;
  }

  public byte qU(String paramString) {
    Byte localByte = (Byte)this.lME.get(paramString);
    if (localByte != null) {
      return localByte.byteValue();
    }
    return 0;
  }

  public boolean azC() {
    return this.lML;
  }

  public String dfP() {
    return "";
  }

  public void l(byte paramByte, String paramString) {
    this.lME.put(paramString, Byte.valueOf(paramByte));
  }

  public void b(dNR paramdNR) {
    this.lMD.add(paramdNR);
  }

  public String dfQ() {
    return bU.fH().b(26, this.aw, new Object[0]);
  }

  public String dfR() {
    return bU.fH().b(28, this.aw, new Object[0]);
  }

  public String dfS() {
    return bU.fH().b(24, this.aw, new Object[0]);
  }

  public String dfT() {
    return bU.fH().b(29, this.aw, new Object[0]);
  }

  public int getId() {
    return this.aw;
  }

  public aF EH() {
    return this.fAP;
  }

  public cXa EI() {
    return this.lMH;
  }

  public short azI() {
    return this.hTV;
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, short paramShort, int paramInt4, int paramInt5, String paramString, byte paramByte) {
    this.cLh.add(new Aa(paramInt1, paramInt2, paramInt3, paramShort, paramInt4, paramInt5, paramString, true, paramByte));
    Collections.sort(this.cLh);
  }

  public void b(int paramInt1, int paramInt2, int paramInt3, short paramShort, int paramInt4, int paramInt5, String paramString, byte paramByte) {
    if (this.lMF == null)
      this.lMF = new ArrayList();
    this.lMF.add(new Aa(paramInt1, paramInt2, paramInt3, paramShort, paramInt4, paramInt5, paramString, false, paramByte));
  }

  public ArrayList cfd() {
    return this.cLh;
  }

  public ArrayList dfU() {
    return this.lMF;
  }

  public void bg(byte paramByte) {
    this.dpP = paramByte;
  }

  public byte azu() {
    return this.dpP;
  }

  public dxL dfV()
  {
    return this.lMG;
  }

  public short cnZ() {
    return this.hTX;
  }

  public short coa() {
    return this.hTY;
  }

  public boolean dfW() {
    return this.lMI;
  }

  public ArrayList aLj() {
    return this.lMD;
  }

  public dNR Cy(int paramInt) {
    int i = 0; for (int j = this.lMD.size(); i < j; i++) {
      dNR localdNR = (dNR)this.lMD.get(i);
      if (localdNR.getId() == paramInt) {
        return localdNR;
      }
    }
    return null;
  }

  public bZA dfX() {
    return this.lMJ;
  }

  public bZA dfY() {
    return this.lMK;
  }

  public ArrayList bCI() {
    return this.fHL;
  }

  public String fJ() {
    try {
      return String.format(ay.bd().getString("challengeCategoryIconsPath"), new Object[] { Byte.valueOf(this.fAP.bJ()) });
    } catch (bdh localbdh) {
      K.error("Exception", localbdh);
    }

    return null;
  }
}