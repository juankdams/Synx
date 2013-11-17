import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public abstract class EE
  implements apZ
{
  protected final String bJR = "name";
  protected final String bJS = "id";
  protected final String bJT = "category";
  protected final String bJU = "group";
  protected final String bJV = "shortcut";
  protected final String bJW = "consoleCommand";
  protected final String bJX = "rebindAllowed";
  protected final String bJY = "alwaysValid";
  protected final String bJZ = "altKey";
  protected final String bKa = "ctrlKey";
  protected final String bKb = "shiftKey";
  protected final String bKc = "keyCode";
  protected final String bKd = "keyRegExp";
  protected final String bKe = "params";
  protected final String bKf = "onKeyReleased";
  protected static final String bKg = "shortcuts";
  private static final Logger K = Logger.getLogger(EE.class);

  protected final HashMap bKh = new HashMap();
  protected final ArrayList bKi = new ArrayList();
  protected final HashMap bKj = new HashMap();
  protected final aoL bKk = new aoL();

  private boolean bKl = true;
  private int bKm = -1;
  public static final String bKn = "binding";

  public void e(String paramString, boolean paramBoolean)
  {
    if (bB(paramString))
      this.bKh.put(paramString, Boolean.valueOf(paramBoolean));
  }

  public void Nz() {
    for (ckW localckW : this.bKj.values())
      localckW.setEnabled(true);
  }

  public void f(String paramString, boolean paramBoolean)
  {
    ckW localckW = (ckW)this.bKj.get(paramString);
    if (localckW != null)
      localckW.setEnabled(paramBoolean);
  }

  public void g(String paramString, boolean paramBoolean)
  {
    bpA localbpA = bpA.byM();
    bJs localbJs = localbpA.byO();

    localbpA.iy(paramString);
    localbpA.a(localbJs, new cdJ[0]);
    localbpA.close();

    if (paramBoolean) {
      String str = new URL(paramString).getFile();
      a(localbJs, str);
    } else {
      a(localbJs);
    }
  }

  public void a(bJs parambJs) {
    ArrayList localArrayList1 = parambJs.ji("group");
    for (K localK : localArrayList1) {
      if (localK.e("name") == null) {
        K.error("Nom de groupe invalide dans le chargement des raccourcis");
      }
      String str = localK.e("name").getStringValue();
      if (!bB(str)) {
        this.bKh.put(str, Boolean.valueOf(false));
      }

      ArrayList localArrayList2 = localK.c("shortcut");
      if (localArrayList2 != null)
      {
        a(str, localArrayList2, false, null);
      }
    }
  }

  public void a(bJs parambJs, String paramString) { ArrayList localArrayList = parambJs.ji("shortcut");

    if (localArrayList == null) {
      return;
    }
    a(null, localArrayList, true, paramString); }

  private void a(String paramString1, List paramList, boolean paramBoolean, String paramString2)
  {
    HashSet localHashSet1 = new HashSet();
    HashSet localHashSet2 = new HashSet();

    int i = 0; for (int j = paramList.size(); i < j; i++) {
      K localK1 = (K)paramList.get(i);

      K localK2 = localK1.e("consoleCommand");
      K localK3 = localK1.e("id");
      if ((localK2 != null) || (localK3 != null))
      {
        String str1 = localK2 != null ? localK2.getStringValue() : null;

        boolean bool1 = (localK1.e("ctrlKey") != null) && (localK1.e("ctrlKey").getBooleanValue());
        boolean bool2 = (localK1.e("altKey") != null) && (localK1.e("altKey").getBooleanValue());
        boolean bool3 = (localK1.e("shiftKey") != null) && (localK1.e("shiftKey").getBooleanValue());
        boolean bool4 = (localK1.e("alwaysValid") != null) && (localK1.e("alwaysValid").getBooleanValue());
        String str2 = localK1.e("params") != null ? localK1.e("params").getStringValue() : null;
        boolean bool5 = (localK1.e("onKeyReleased") != null) && (localK1.e("onKeyReleased").getBooleanValue());
        int k = localK1.e("keyCode") != null ? localK1.e("keyCode").getIntValue() : -1;

        String str3 = localK3 != null ? localK3.getStringValue() : null;
        ckW localckW;
        Object localObject;
        if (paramBoolean) {
          localckW = bA(str3);
          if (localckW != null)
          {
            localHashSet1.add(localckW);
            localHashSet2.remove(localckW);

            localObject = (ckW)this.bKk.get(X(k, a(bool3, bool2, bool1)));
            if ((localObject != null) && (!localHashSet1.contains(localObject))) {
              localHashSet2.add(localObject);
            }
            a(localckW, k, bool3, bool2, bool1);
          }
        } else { localckW = new ckW(str3, k, str1, bool1, bool2, bool3, bool5, bool4, str2);

          localObject = localK1.e("category");
          String str4 = localObject != null ? ((K)localObject).getStringValue() : null;
          localckW.setCategory(str4);

          c(localckW, paramString1);
        }
      }
    }
    for (Iterator localIterator = localHashSet2.iterator(); localIterator.hasNext(); )
      b((ckW)localIterator.next(), paramString2);
  }

  private void a(ckW paramckW, int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    a(paramckW, paramInt, a(paramBoolean1, paramBoolean2, paramBoolean3));
  }

  private void a(ckW paramckW, int paramInt1, int paramInt2) {
    c(paramckW);

    paramckW.setKeyCode(paramInt1);
    paramckW.vH(paramInt2);

    c(paramckW, paramckW.bwq());
  }

  public boolean b(ckW paramckW) {
    return this.bKj.containsKey(paramckW.getId());
  }

  public ckW bA(String paramString) {
    return (ckW)this.bKj.get(paramString);
  }

  public void b(ckW paramckW, String paramString) {
    try {
      a(paramckW, -1, 0, paramString);
    } catch (Exception localException) {
      K.warn("Problème en désassignant le raccourci", localException);
    }
  }

  public void b(String paramString1, int paramInt1, int paramInt2, String paramString2) {
    a(bA(paramString1), paramInt1, paramInt2, paramString2);
  }

  public void a(ckW paramckW, int paramInt1, int paramInt2, String paramString) {
    if (!b(paramckW)) {
      return;
    }

    a(paramckW, paramInt1, paramInt2);

    bpA localbpA = bpA.byM();
    bwZ localbwZ = localbpA.byN();

    if (!dtb.pU(paramString)) {
      localbpA.iz(paramString);
      localbwZ.b(new CC("shortcuts", null));
      localbpA.a(localbwZ, "");
      localbpA.close();
    }

    localbpA.iy(paramString);
    localbpA.a(localbwZ, new cdJ[0]);
    localbpA.close();

    ArrayList localArrayList = localbwZ.ji("shortcut");
    Object localObject = null;
    if (localArrayList != null) {
      for (K localK : localArrayList)
      {
        if ((localK.e("id") != null) && (localK.e("id").getStringValue().equalsIgnoreCase(paramckW.getId())))
        {
          localObject = localK;
          int i = paramckW.getKeyCode();
          dvw localdvw;
          if (localK.e("keyCode") == null) {
            if (i != -1) {
              localdvw = new dvw("keyCode", String.valueOf(i));
              localK.c(localdvw);
            } else {
              K.warn("Le raccourci trouvé ne possède pas de touche associée");
              break;
            }
          }
          else localK.e("keyCode").e(paramInt1);

          if (paramckW.cmL()) {
            if (localK.e("shiftKey") != null) {
              localK.e("shiftKey").c(true);
            } else {
              localdvw = new dvw("shiftKey", String.valueOf(true));
              localK.c(localdvw);
            }
          } else if (localK.e("shiftKey") != null) {
            localK.d(localK.e("shiftKey"));
          }
          if (paramckW.cmK()) {
            if (localK.e("altKey") != null) {
              localK.e("altKey").c(true);
            } else {
              localdvw = new dvw("altKey", String.valueOf(true));
              localK.c(localdvw);
            }
          } else if (localK.e("altKey") != null) {
            localK.d(localK.e("altKey"));
          }
          if (paramckW.cmJ()) {
            if (localK.e("ctrlKey") != null) {
              localK.e("ctrlKey").c(true);
            } else {
              localdvw = new dvw("ctrlKey", String.valueOf(true));
              localK.c(localdvw);
            }
          } else if (localK.e("ctrlKey") != null)
            localK.d(localK.e("ctrlKey"));
        }
      }
    }
    if (localObject == null) {
      a(paramckW, localbwZ, false, false);
    }

    localbpA.iz(paramString);
    localbpA.b(localbwZ);
    localbpA.close();
  }

  private void c(ckW paramckW, String paramString) {
    paramckW.lo(paramString);

    this.bKi.add(paramckW);
    if (paramckW.getId() != null)
      this.bKj.put(paramckW.getId(), paramckW);
    long l = e(paramckW);
    this.bKk.put(l, paramckW);
  }

  private void c(ckW paramckW) {
    this.bKi.remove(paramckW);
    this.bKj.remove(paramckW.getId());
    long l = e(paramckW);
    if (this.bKk.get(l) == paramckW)
      this.bKk.remove(l);
  }

  public void a(ckW paramckW, String paramString1, String paramString2) {
    if (b(paramckW)) {
      return;
    }

    bpA localbpA = bpA.byM();
    bwZ localbwZ = localbpA.byN();

    if (!dtb.pU(paramString2)) {
      localbpA.iz(paramString2);
      localbwZ.b(new CC("shortcuts", null));
      localbpA.a(localbwZ, "");
      localbpA.close();
    }

    localbpA.iy(paramString2);
    localbpA.a(localbwZ, new cdJ[0]);
    localbpA.close();

    c(paramckW, paramString1);

    a(paramckW, localbwZ, true, true);
    localbpA.iz(paramString2);
    localbpA.b(localbwZ);
    localbpA.close();
  }

  public void d(ckW paramckW, String paramString)
  {
    if (!b(paramckW)) {
      return;
    }

    bpA localbpA = bpA.byM();
    bwZ localbwZ = localbpA.byN();

    if (!dtb.pU(paramString)) {
      localbpA.iz(paramString);
      localbwZ.b(new CC("shortcuts", null));
      localbpA.a(localbwZ, "");
      localbpA.close();
    }

    localbpA.iy(paramString);
    localbpA.a(localbwZ, new cdJ[0]);
    localbpA.close();
    ArrayList localArrayList = localbwZ.ji("shortcut");
    if (localArrayList == null) {
      K.error("impossible de supprimer le raccourci du document " + paramString + "qui semble vide");
      return;
    }
    for (K localK : localArrayList)
    {
      if ((localK.e("id") != null) && (localK.e("id").getStringValue().equalsIgnoreCase(paramckW.getId())))
      {
        localbwZ.bEx().b(localK);
      }
    }
    c(paramckW);

    localbpA.iz(paramString);
    localbpA.b(localbwZ);
    localbpA.close();
  }

  public void a(ckW paramckW, bwZ parambwZ, boolean paramBoolean1, boolean paramBoolean2) {
    CC localCC = new CC("shortcut", null);
    if ((paramckW.getId() != null) && (paramckW.getId().length() > 0)) {
      localCC.c(new dvw("id", paramckW.getId()));
    }
    if (paramBoolean2) {
      if ((paramckW.bwq() != null) && (paramckW.bwq().length() > 0)) {
        localCC.c(new dvw("name", paramckW.bwq()));
      }
      if ((paramckW.cmI() != null) && (paramckW.cmI().length() > 0)) {
        localCC.c(new dvw("consoleCommand", paramckW.cmI()));
      }
    }
    if ((paramBoolean1) && (paramckW.cmP() != null) && (paramckW.cmP().length() > 0)) {
      localCC.c(new dvw("params", paramckW.cmP().replaceAll("\"", "&quot;")));
    }
    if (!paramBoolean1) {
      if (paramckW.cmK()) {
        localCC.c(new dvw("altKey", "true"));
      }
      if (paramckW.cmJ()) {
        localCC.c(new dvw("ctrlKey", "true"));
      }
      if (paramckW.cmL()) {
        localCC.c(new dvw("shiftKey", "true"));
      }
      localCC.c(new dvw("keyCode", String.valueOf(paramckW.getKeyCode())));
    }
    parambwZ.bEx().a(localCC);
  }

  private K a(String paramString, K paramK)
  {
    CC localCC = new CC("group", null);
    if ((paramString != null) && (paramString.length() > 0)) {
      localCC.c(new dvw("name", paramString));
      paramK.a(localCC);
    }
    paramK.a(localCC);
    return localCC;
  }

  public void b(ckW paramckW, String paramString1, String paramString2)
  {
    if (!b(paramckW)) {
      return;
    }

    paramckW.lq(paramString1);

    bpA localbpA = bpA.byM();
    bwZ localbwZ = localbpA.byN();

    if (!dtb.pU(paramString2)) {
      localbpA.iz(paramString2);
      localbwZ.b(new CC("shortcuts", null));
      localbpA.a(localbwZ, "");
      localbpA.close();
    }

    localbpA.iy(paramString2);
    localbpA.a(localbwZ, new cdJ[0]);
    localbpA.close();

    ArrayList localArrayList = localbwZ.bEx().c("shortcut");

    Object localObject = null;
    if (localArrayList != null)
    {
      for (K localK : localArrayList)
      {
        if ((localK.e("id") != null) && (localK.e("id").getStringValue().equalsIgnoreCase(paramckW.getId())))
        {
          localObject = localK;
          if (localK.e("params") == null)
            localK.c(new dvw("params", paramString1));
          else
            localK.e("params").a(paramString1);
        }
      }
    }
    if (localObject == null) {
      a(paramckW, localbwZ, true, false);
    }

    localbpA.iz(paramString2);
    localbpA.b(localbwZ);
  }

  public void ay(boolean paramBoolean) {
    this.bKl = paramBoolean;
  }

  public boolean NA() {
    return this.bKl;
  }

  public void a(String paramString, bVH parambVH) {
    ckW localckW = (ckW)this.bKj.get(paramString);

    if ((localckW != null) && (bC(localckW.bwq())))
      localckW.a(parambVH);
  }

  public boolean a(KeyEvent paramKeyEvent) {
    if ((paramKeyEvent.getKeyCode() == 17) || (paramKeyEvent.getKeyCode() == 16) || (paramKeyEvent.getKeyCode() == 18))
    {
      return false;
    }

    ckW localckW = (ckW)this.bKk.get(e(paramKeyEvent));
    if ((localckW != null) && (bC(localckW.bwq()))) {
      return localckW.cmM();
    }

    return false;
  }

  private boolean d(ckW paramckW) {
    if (paramckW == null) {
      return false;
    }
    if ((!bC(paramckW.bwq())) || (!paramckW.isEnabled())) {
      return false;
    }
    return (this.bKl) || (paramckW.cmM());
  }

  public boolean b(KeyEvent paramKeyEvent) {
    if ((paramKeyEvent.getKeyCode() == 17) || (paramKeyEvent.getKeyCode() == 16) || (paramKeyEvent.getKeyCode() == 18))
    {
      return false;
    }

    this.bKm = -1;

    ckW localckW = (ckW)this.bKk.get(e(paramKeyEvent));
    if ((!d(localckW)) || (!localckW.cmQ())) {
      return false;
    }
    return a(localckW, paramKeyEvent);
  }

  public boolean c(KeyEvent paramKeyEvent) {
    if ((paramKeyEvent.getKeyCode() == 17) || (paramKeyEvent.getKeyCode() == 16) || (paramKeyEvent.getKeyCode() == 18) || (this.bKm == paramKeyEvent.getKeyCode()))
    {
      return false;
    }

    this.bKm = -1;

    ckW localckW = (ckW)this.bKk.get(e(paramKeyEvent));
    if ((!d(localckW)) || (localckW.cmQ())) {
      return false;
    }
    return a(localckW, paramKeyEvent);
  }

  public boolean d(KeyEvent paramKeyEvent) {
    return false;
  }

  public abstract boolean a(ckW paramckW, KeyEvent paramKeyEvent);

  public ckW[] NB() {
    return (ckW[])this.bKi.toArray(new ckW[this.bKi.size()]);
  }

  public boolean bB(String paramString) {
    return this.bKh.containsKey(paramString);
  }

  public boolean bC(String paramString) {
    Boolean localBoolean = (Boolean)this.bKh.get(paramString);
    return (localBoolean != null) && (localBoolean.booleanValue());
  }

  public void eH(int paramInt) {
    this.bKm = paramInt;
  }

  public static long e(KeyEvent paramKeyEvent) {
    int i = paramKeyEvent.getModifiersEx();
    boolean bool1 = (i & 0x40) == 64;
    boolean bool2 = (i & 0x200) == 512;
    boolean bool3 = (i & 0x80) == 128;

    return X(paramKeyEvent.getKeyCode(), a(bool1, bool2, bool3));
  }

  public static long e(ckW paramckW) {
    return X(paramckW.getKeyCode(), paramckW.cmO());
  }

  public static long X(int paramInt1, int paramInt2) {
    return bCO.cM(paramInt1, paramInt2);
  }

  public static int a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    int i = 0;
    if (paramBoolean1)
      i |= 64;
    if (paramBoolean2)
      i |= 512;
    if (paramBoolean3)
      i |= 128;
    return i;
  }
}