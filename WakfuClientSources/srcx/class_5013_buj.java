import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class buj
  implements bnm, dBv
{
  public static final String gdy = "tutorials";
  public static final String fIh = "oneActivated";
  private static final Logger K = Logger.getLogger(buj.class);
  private static final buj gdz = new buj();
  private static final String gdA = "tutorials";
  private static final String gdB = "tutorial";
  private static final String gdC = "part";
  private static final String bJR = "name";
  private static final String gdD = "activated";
  private static final String gdE = "eventId";
  private static final String bJS = "id";
  private final String[] bF = { "tutorials", "oneActivated" };

  private final bPu gdF = new bPu();

  private final adz gdG = new adz();

  private boolean bur = true;
  private static final boolean gdH = false;
  private int gdI;
  private String fvo;

  public static buj bCk()
  {
    return gdz;
  }

  public static int z(short paramShort1, short paramShort2) {
    StringBuilder localStringBuilder1 = new StringBuilder("2");
    String str1 = String.valueOf(paramShort1);
    String str2 = String.valueOf(paramShort2);

    StringBuilder localStringBuilder2 = new StringBuilder("000");
    localStringBuilder2.replace(localStringBuilder2.length() - str1.length(), localStringBuilder2.length(), str1);
    localStringBuilder1.append(localStringBuilder2);

    StringBuilder localStringBuilder3 = new StringBuilder("0000");
    localStringBuilder3.replace(localStringBuilder3.length() - str2.length(), localStringBuilder3.length(), str2);
    localStringBuilder1.append(localStringBuilder3);

    return Integer.valueOf(localStringBuilder1.toString()).intValue();
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("tutorials"))
      return this.gdF.getValues();
    if (paramString.equals("oneActivated")) {
      return Boolean.valueOf(!bCm());
    }
    return null;
  }

  public void a(String paramString, Object paramObject) {
  }

  public void b(String paramString, Object paramObject) {
  }

  public void c(String paramString, Object paramObject) {
  }

  public boolean l(String paramString) {
    return false;
  }

  public void ca(short paramShort) {
    dLu localdLu = (dLu)this.gdF.cx(paramShort);
    localdLu.cz(!localdLu.apR());
    try {
      iP(new URL(ay.bd().getString("tutorialFile")).getFile());
    } catch (Exception localException) {
      K.error("Exception", localException);
    }
    dLE.doY().a(this, getFields());
  }

  public void iP(String paramString)
  {
    bpA localbpA = bpA.byM();
    bwZ localbwZ = localbpA.byN();
    localbwZ.b(new CC("tutorials", null));

    for (bM localbM1 = this.gdF.bVW(); localbM1.hasNext(); ) {
      localbM1.fl();
      dLu localdLu = (dLu)localbM1.value();
      localCC1 = new CC("tutorial", null);
      localbwZ.bEx().a(localCC1);
      localCC1.c(new dvw("name", localdLu.getName()));
      localCC1.c(new dvw("id", String.valueOf(localdLu.nc())));
      for (localbM2 = localdLu.doQ(); localbM2.hasNext(); ) {
        localbM2.fl();
        cAe localcAe = (cAe)localbM2.value();
        CC localCC2 = new CC("part", null);
        localCC1.a(localCC2);
        localCC2.c(new dvw("id", String.valueOf(localcAe.nc())));
        localCC2.c(new dvw("name", localcAe.getName()));
        localCC2.c(new dvw("activated", String.valueOf(localcAe.apR())));
        localCC2.c(new dvw("eventId", String.valueOf(localcAe.cxa())));
      }
    }
    CC localCC1;
    bM localbM2;
    localbpA.iz(paramString);
    localbpA.b(localbwZ);
  }

  public String[] getFields() {
    return this.bF;
  }

  public void A(short paramShort1, short paramShort2) {
    dLu localdLu = (dLu)this.gdF.cx(paramShort1);
    cAe localcAe = localdLu.eI(paramShort2);
    localcAe.cz(!localcAe.apR());
    if (B(localdLu.nc(), localcAe.nc()))
      bCk().C(localdLu.nc(), localcAe.nc());
    try {
      iP(new URL(ay.bd().getString("tutorialFile")).getFile());
    } catch (Exception localException) {
      K.error("Exception", localException);
    }
    dLE.doY().a(this, getFields());
  }

  public void bCl() {
    boolean bool = bCm();
    for (bM localbM = this.gdF.bVW(); localbM.hasNext(); ) {
      localbM.fl();
      dLu localdLu = (dLu)localbM.value();
      localdLu.cz(bool);
      iP(new URL(ay.bd().getString("tutorialFile")).getFile());
    }
    dLE.doY().a(this, getFields());
  }

  private boolean bCm() {
    for (bM localbM = this.gdF.bVW(); localbM.hasNext(); ) {
      localbM.fl();
      if (!((dLu)localbM.value()).apR())
        return true;
    }
    return false;
  }

  public void a(String paramString, buj parambuj)
  {
    bpA localbpA = bpA.byM();
    bwZ localbwZ = (bwZ)localbpA.byO();

    localbpA.iy(paramString);
    localbpA.a(localbwZ, new cdJ[0]);
    localbpA.close();

    int i = 0;

    for (bM localbM = parambuj.gdF.bVW(); localbM.hasNext(); ) {
      localbM.fl();
      dLu localdLu = (dLu)localbM.value();
      ArrayList localArrayList = localbwZ.ji("tutorial");
      localObject1 = null;
      j = 0;

      for (localObject2 = localArrayList.iterator(); ((Iterator)localObject2).hasNext(); ) { localObject3 = (K)((Iterator)localObject2).next();
        if (((K)localObject3).e("name") == null) {
          K.error("Nom de tutorial invalide dans le chargement des tutoriaux");
        }
        localObject4 = ((K)localObject3).e("name").getStringValue();
        if (localdLu.getName().equals(localObject4)) {
          localObject1 = localObject3;
          j = 1;
          break;
        }
      }

      if (localObject1 == null) {
        i = 1;
        localObject1 = new CC("tutorial", null);
        ((K)localObject1).c(new dvw("name", localdLu.getName()));
        ((K)localObject1).c(new dvw("id", String.valueOf(localdLu.nc())));
        localArrayList.add(localObject1);
        localbwZ.bEx().a((K)localObject1);
      }

      for (localObject2 = localdLu.doQ(); ((bM)localObject2).hasNext(); ) {
        ((bM)localObject2).fl();
        localObject3 = (cAe)((bM)localObject2).value();

        if (j != 0) {
          localObject4 = ((K)localObject1).c("part");

          int k = 0;
          for (K localK : (ArrayList)localObject4) {
            if (((cAe)localObject3).nc() == localK.e("id").getIntValue()) {
              k = 1;
              break;
            }
          }
          if (k == 0) {
            i = 1;
            a((cAe)localObject3, (K)localObject1);
          }
        } else {
          a((cAe)localObject3, (K)localObject1);
        }
      }
    }
    Object localObject1;
    int j;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    if (i != 0) {
      localbpA.iz(paramString);
      localbpA.d(localbwZ);
    }
  }

  private void a(cAe paramcAe, K paramK)
  {
    CC localCC = new CC("part", null);
    localCC.c(new dvw("id", String.valueOf(paramcAe.nc())));
    paramK.a(localCC);
    if ((paramcAe.getName() != null) && (paramcAe.getName().length() > 0)) {
      localCC.c(new dvw("name", paramcAe.getName()));
      paramK.a(localCC);
    }
    localCC.c(new dvw("activated", "true"));
    paramK.a(localCC);
    localCC.c(new dvw("eventId", String.valueOf(paramcAe.cxa())));
    paramK.a(localCC);
  }

  public void a(cED paramcED, String paramString) {
    if (this.bur);
  }

  public void bCn()
  {
  }

  public void iQ(String paramString)
  {
    bpA localbpA = bpA.byM();
    bwZ localbwZ = localbpA.byN();

    localbpA.iy(paramString);
    localbpA.a(localbwZ, new cdJ[0]);
    localbpA.close();

    ArrayList localArrayList1 = localbwZ.ji("tutorial");
    if (localArrayList1 == null)
      return;
    for (K localK1 : localArrayList1)
      if (localK1.e("name") == null) {
        K.error("Nom de tutorial invalide dans le chargement des tutoriaux");
      }
      else
      {
        String str = localK1.e("name").getStringValue();
        int i = localK1.e("id").getIntValue();

        ArrayList localArrayList2 = localK1.d("part");
        bPu localbPu = new bPu();
        for (int j = 0; j < localArrayList2.size(); j++) {
          K localK2 = (K)localArrayList2.get(j);
          K localK3 = localK2.e("name");
          K localK4 = localK2.e("activated");
          K localK5 = localK2.e("eventId");
          K localK6 = localK2.e("id");
          if ((localK3 == null) || (localK4 == null) || (localK5 == null) || (localK6 == null)) {
            K.error("Step incorrecte dans le XML de tutorial " + str);
          }
          else {
            localbPu.c((short)localK6.getIntValue(), new cAe((short)localK6.getIntValue(), localK3.getStringValue(), localK4.getBooleanValue(), localK5.af()));
          }
        }
        dLu localdLu = (dLu)this.gdF.cx((short)i);
        if (localdLu == null) {
          localdLu = new dLu((short)i, str, localbPu);
          this.gdF.c((short)i, localdLu);
        }
      }
  }

  public boolean B(short paramShort1, short paramShort2) {
    return this.gdG.contains(bCO.G(paramShort1, paramShort2));
  }

  public void C(short paramShort1, short paramShort2) {
    this.gdI = -1;
    if (!this.gdG.remove(bCO.G(paramShort1, paramShort2)))
      K.error("[TUTORIAL] On essaye de supprimer un TutorialAction des launchedTutorial alors que celui-ci n'y est pas.");
  }

  public void setEnabled(boolean paramBoolean)
  {
    this.bur = paramBoolean;
  }

  public void i(String paramString) {
    if ((paramString != null) && (paramString.equals(this.fvo)))
      bCn();
  }

  public String toString()
  {
    return "EmbeddedTutorialManager{m_tutorialsCount=" + this.gdF.size() + ", m_enabled=" + this.bur + ", m_launchedActionId=" + this.gdI + ", m_linkedDialogId='" + this.fvo + '\'' + ", m_launchedTutorialsCount=" + this.gdG.size() + '}';
  }
}