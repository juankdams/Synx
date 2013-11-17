import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class bXb
{
  protected static final Logger K = Logger.getLogger(bXb.class);

  private static final bXb hlv = new bXb();

  private final ArrayList hlw = new ArrayList();
  private final cYR hlx = new cYR();
  private Su hly;
  private Comparator cwp = new afp(this);
  private Su hlz;

  public static bXb cci()
  {
    return hlv;
  }

  public void clear() {
    this.hlw.clear();
    this.hlx.clear();
    this.hly = null;
  }

  public static int n(Object paramObject1, Object paramObject2)
  {
    if (((paramObject1 instanceof Su)) && ((paramObject2 instanceof Su))) {
      if (((Su)paramObject1).getId() - ((Su)paramObject2).getId() > 0L)
        return 1;
      if (((Su)paramObject1).getId() - ((Su)paramObject2).getId() < 0L) {
        return -1;
      }
    }
    return 0;
  }

  public void N(ArrayList paramArrayList)
  {
    for (Su localSu : this.hlw) {
      localSu.release();
    }
    this.hlw.clear();
    for (int i = 0; i < paramArrayList.size(); i++) {
      b((byte[])paramArrayList.get(i), false);
    }

    Collections.sort(this.hlw, this.cwp);
    gI(true);
    aVQ.blh().eh(true);
  }

  public final bKm ap(byte[] paramArrayOfByte)
  {
    return b(paramArrayOfByte, true);
  }

  private bKm b(byte[] paramArrayOfByte, boolean paramBoolean) {
    bKm localbKm = new bKm();
    this.hlw.add(localbKm);
    try {
      localbKm.q(paramArrayOfByte);
    }
    catch (Exception localException) {
      localbKm.bSi().a(localbKm.bSi().aQJ(), paramArrayOfByte);
      K.error("Erreur durant la déSerialization d'un personnage : ", localException);
    }
    if (paramBoolean)
      gI(true);
    return localbKm;
  }

  public void a(bKm parambKm, int paramInt) {
    if (!this.hlw.contains(parambKm))
      throw new IllegalArgumentException("Impossible de rajouter des informations de nation sur un character non-existant : " + parambKm);
    this.hlx.i(parambKm, paramInt);
  }

  public int aL(Su paramSu) {
    return this.hlx.get(paramSu);
  }

  public void he(long paramLong)
  {
    for (int i = this.hlw.size() - 1; i >= 0; i--) {
      Su localSu1 = (Su)this.hlw.get(i);
      if (localSu1.getId() == paramLong)
      {
        Su localSu2 = (Su)this.hlw.remove(i);
        this.hlx.bh(localSu2);
        gI(true);

        if ((this.hly != null) && (this.hly.getId() == paramLong)) {
          if (this.hlw.size() > 0)
            aM((Su)this.hlw.get(i == 0 ? 0 : i - 1));
          else {
            aM(null);
          }
        }
        localSu1.release();
        return;
      }
    }
  }

  public final void ccj()
  {
    if (this.hlw == null) {
      return;
    }
    for (Su localSu : this.hlw) {
      cew localcew = localSu.aeL();
      if (localcew != null)
      {
        localcew.dispose();
        localSu.release();
      }
    }
    this.hlw.clear();
    this.hlx.clear();
    aM(null);
    gI(false);
  }

  public final void aM(Su paramSu)
  {
    if (this.hlw.contains(paramSu))
      this.hly = paramSu;
    else {
      this.hly = null;
    }
    dLE.doY().t("characterChoice.selectedCharacter", this.hly);
  }

  public final Su cck()
  {
    return this.hly;
  }

  public final int ccl()
  {
    return this.hlw.size();
  }

  public final Su ccm() {
    if (this.hlz == null)
      return null;
    for (Su localSu : this.hlw) {
      if (localSu.getName().equals(this.hlz.getName()))
        return localSu;
    }
    return null;
  }

  public final Su ccn() {
    if ((this.hlw == null) || (this.hlw.size() == 0)) {
      return null;
    }
    return (Su)this.hlw.get(0);
  }

  public ArrayList cco() {
    return this.hlw;
  }

  private final void gI(boolean paramBoolean)
  {
    if (paramBoolean) {
      localObject1 = bmz.fEb;
      aIH localaIH = WakfuClientInstance.awy().awB();
      Object localObject2 = localaIH.f((dEn)localObject1);
      int i = byv.bFN().bFP().getId();
      String str1 = "(" + i + ":[0-9]+;)";
      String str2 = i + ":" + this.hlw.size() + ";";
      if (localObject2 == null) {
        localObject2 = str2;
      }
      else if (((String)localObject2).matches(str1))
        localObject2 = ((String)localObject2).replaceAll(str1, str2);
      else {
        localObject2 = (String)localObject2 + str2;
      }

      localaIH.c((dEn)localObject1, (String)localObject2);
    }
    Object localObject1 = dLE.doY().getProperty("characterChoice.characterInfosList");
    if (localObject1 != null)
      ((bbo)localObject1).bpE();
  }

  public void ccp()
  {
    ArrayList localArrayList = new ArrayList();
    for (Object localObject1 = this.hlw.iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (Su)((Iterator)localObject1).next();
      localArrayList.add(((Su)localObject2).getName());
    }
    Object localObject2;
    localObject1 = new File(duB.dai().das());
    if (!((File)localObject1).exists())
      return;
    for (File localFile : ((File)localObject1).listFiles(new afo(this)))
    {
      if (!localArrayList.contains(localFile.getName()))
        dtb.ac(localFile);
    }
  }

  public void aN(Su paramSu) {
    this.hlz = paramSu;
  }

  public Su hf(long paramLong) {
    for (Su localSu : this.hlw) {
      if (localSu.getId() == paramLong)
        return localSu;
    }
    return null;
  }

  public Su kB(String paramString) {
    for (Su localSu : this.hlw) {
      if (localSu.getName().equals(paramString))
        return localSu;
    }
    return null;
  }
}