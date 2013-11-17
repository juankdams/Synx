import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import org.apache.log4j.Logger;

public class dCA
{
  private static final Logger K = Logger.getLogger(dCA.class);
  private final ahm daS;
  private final String lKS;
  private final String lKT;
  private Anm lKU;
  private Anm lKV;

  private dCA(ahm paramahm, String paramString1, String paramString2)
  {
    this.daS = paramahm;
    this.lKS = paramString1;
    this.lKT = paramString2;
  }

  public void chv() {
    this.daS.e(3, null);
    this.daS.e(4, null);

    if (this.lKU != null) {
      this.daS.aty().b(this.lKU);
      this.lKU = null;
    }
    if (this.lKV != null) {
      this.daS.aty().b(this.lKV);
      this.lKV = null;
    }
  }

  public void a(bNa parambNa1, bNa parambNa2, byte paramByte1, byte paramByte2) {
    this.daS.e(3, parambNa1.bUT());
    this.daS.e(4, parambNa2.bUT());

    int i = 0;
    Anm localAnm1 = a(this.lKS, paramByte1, this.lKU);
    if (localAnm1 != null) {
      i = 1;
      this.lKU = localAnm1;
    }
    Anm localAnm2 = a(this.lKT, paramByte2, this.lKV);
    if (localAnm2 != null) {
      i = 1;
      this.lKV = localAnm2;
    }

    if (i != 0)
      this.daS.asV();
  }

  private Anm a(String paramString, int paramInt, Anm paramAnm) {
    if (paramString == null) {
      return null;
    }
    String str1 = paramString + paramInt;
    try {
      String str2 = ay.bd().getString("ANMEquipmentPath");
      String str3 = String.format(str2, new Object[] { str1 });
      if ((paramAnm != null) && (paramAnm.getFileName().equals(str1))) {
        return null;
      }

      Anm localAnm = ahm.eo(str3);
      if (localAnm == null) {
        K.error("Pas de blason trouvé ID=" + str1);
        return null;
      }
      this.daS.aty().a(localAnm);
      this.daS.asV();
      return localAnm;
    } catch (bdh localbdh) {
      K.error("", localbdh);
    }
    return null;
  }

  public static dCA a(ahm paramahm, bMG parambMG, String paramString1, String paramString2)
  {
    return a(paramahm, parambMG.CH(), paramString1, paramString2);
  }

  public static dCA a(ahm paramahm, long paramLong, String paramString1, String paramString2)
  {
    if (paramLong == 0L)
      return null;
    try
    {
      dbY localdbY = new dbY(paramLong);
      bNa localbNa1 = boJ.byr().db(localdbY.cNK());
      bNa localbNa2 = boJ.byr().db(localdbY.cNM());
      dCA localdCA = new dCA(paramahm, paramString1, paramString2);
      localdCA.a(localbNa1, localbNa2, localdbY.cNL(), localdbY.cNJ());
      return localdCA;
    } catch (Exception localException) {
      K.error("", localException);
    }return null;
  }
}