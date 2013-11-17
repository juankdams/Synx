import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public abstract class dnp
  implements Eq, awz, dBv
{
  public static final String ePK = "chat.dialogView";
  public static final String ePM = "input";
  public static final String kzc = "history";
  public static final String lmM = "channelsList";
  public static final String lmN = "currentChannel";
  public static final String lmO = "privateName";
  public static final String lmP = "currentChannelName";
  public static final String lmQ = "isPaused";
  public static final String[] bF = { "history", "input", "channelsList", "currentChannel", "privateName", "currentChannelName", "isPaused" };
  private final cSi lmR;
  private int[] lmS;
  private String lmT = "";
  private String lmU = "";
  private static final int lmV = 100;
  private final cSR lmW = new cSR();
  private int lmX;
  private cgv lmY = null;
  private String lmZ = "";
  private boolean dbs;
  private String lna = "";

  protected dnp(int paramInt, int[] paramArrayOfInt) {
    this.lmX = paramInt;
    this.lmR = new cSi(paramArrayOfInt);
    this.lmS = paramArrayOfInt;
  }

  public void cSn()
  {
    ArrayList localArrayList = new ArrayList();

    for (Object localObject1 = this.lmW.yF(); ((dmn)localObject1).hasNext(); ) {
      ((dmn)localObject1).fl();
      localObject2 = (ArrayList)((dmn)localObject1).value();
      for (localObject3 = ((ArrayList)localObject2).iterator(); ((Iterator)localObject3).hasNext(); ) { cgv localcgv = (cgv)((Iterator)localObject3).next();
        if ((AR(localcgv.ciz().getId())) && (localcgv.ciB() == afz.cYt))
          a(localArrayList, localcgv.ciz());
      }
    }
    Object localObject3;
    Collections.sort(localArrayList);

    localObject1 = new StringBuilder();
    for (Object localObject2 = localArrayList.iterator(); ((Iterator)localObject2).hasNext(); ) { localObject3 = (aEe)((Iterator)localObject2).next();
      ((StringBuilder)localObject1).append(j((aEe)localObject3));
    }

    this.lmU = pE(((StringBuilder)localObject1).toString());
    dWe.dvA().a(this, new String[] { "history" });
  }

  public dmn cUL()
  {
    return this.lmW.yF();
  }

  public ArrayList cUM() {
    ArrayList localArrayList = new ArrayList();
    for (dmn localdmn = cUL(); localdmn.hasNext(); ) {
      localdmn.fl();
      for (cgv localcgv : (ArrayList)localdmn.value()) {
        localArrayList.add(localcgv);
      }
    }
    return localArrayList;
  }

  public void a(ArrayList paramArrayList, dab paramdab)
  {
    if (paramdab == null)
      return;
    Iterator localIterator;
    if (paramdab.cMy() != null)
      for (localIterator = paramdab.cMy().iterator(); localIterator.hasNext(); ) { localObject = (aEe)localIterator.next();
        paramArrayList.add(localObject);
      }
    Object localObject;
    if (paramdab.cMA() != null)
      for (localIterator = paramdab.cMA().values().iterator(); localIterator.hasNext(); ) { localObject = (dab)localIterator.next();
        a(paramArrayList, (dab)localObject);
      }
  }

  protected abstract String j(aEe paramaEe);

  public ArrayList cUN()
  {
    ArrayList localArrayList = new ArrayList();
    for (int k : this.lmR.cIf()) {
      dab localdab = CM.LV().ez(k);
      if (localdab.ciC()) {
        float[] arrayOfFloat = localdab.ckE();
        localArrayList.add(new cPG(localdab.getName(), AR(localdab.getId()), new bNa(arrayOfFloat[0], arrayOfFloat[1], arrayOfFloat[2], 1.0F), localdab.getId()));
      }
    }
    Collections.sort(localArrayList, new AK(this));

    return localArrayList;
  }

  public boolean AR(int paramInt) {
    int i = 0; for (int j = this.lmS.length; i < j; i++) {
      if (this.lmS[i] == paramInt) {
        return true;
      }
    }
    return false;
  }

  public void F(int paramInt, boolean paramBoolean)
  {
    int[] arrayOfInt;
    if (paramBoolean) {
      if (AR(paramInt)) {
        return;
      }
      arrayOfInt = new int[this.lmS.length + 1];
      System.arraycopy(this.lmS, 0, arrayOfInt, 0, this.lmS.length);
      arrayOfInt[(arrayOfInt.length - 1)] = paramInt;
      b(CM.LV().ez(paramInt), afz.cYt);
    } else {
      if (!AR(paramInt)) {
        return;
      }
      arrayOfInt = new int[this.lmS.length - 1];
      int i = 0;
      for (int j = 0; j < this.lmS.length; j++) {
        int k = this.lmS[j];
        if (k != paramInt) {
          arrayOfInt[i] = k;
          i++;
        }
      }
      AS(paramInt);
    }
    this.lmS = arrayOfInt;
  }

  public cgv b(dab paramdab, afz paramafz) {
    return a(paramdab, paramafz, null);
  }

  public cgv a(dab paramdab, afz paramafz, coM paramcoM) {
    if (paramafz == afz.cYt) {
      paramdab.a(this);
    }

    ArrayList localArrayList = (ArrayList)this.lmW.get(paramdab.getId());
    if (localArrayList == null) {
      localArrayList = new ArrayList();
    }
    cgv localcgv = new cgv(paramdab, paramdab.getName(), paramafz, paramcoM);
    if (localArrayList.contains(localcgv)) {
      return null;
    }

    localcgv.gU(paramdab.ciC());
    localArrayList.add(localcgv);
    this.lmW.put(paramdab.getId(), localArrayList);
    c(localcgv);

    return localcgv;
  }

  public void nz(int paramInt) {
    ArrayList localArrayList = (ArrayList)this.lmW.get(paramInt);
    for (int i = localArrayList.size() - 1; i > 0; i--) {
      cgv localcgv = (cgv)localArrayList.get(i);
      if (localcgv.ciB() != afz.cYt)
        localArrayList.remove(i);
    }
  }

  protected void AS(int paramInt)
  {
    ArrayList localArrayList = (ArrayList)this.lmW.get(paramInt);
    if (localArrayList == null) {
      return;
    }
    for (cgv localcgv : localArrayList) {
      dab localdab1 = localcgv.ciz();
      localdab1.b(this);
      for (dab localdab2 : localdab1.cMA().values())
        localdab2.b(this);
    }
  }

  public List cUO()
  {
    ArrayList localArrayList1 = new ArrayList();
    for (dmn localdmn = this.lmW.yF(); localdmn.hasNext(); ) {
      localdmn.fl();
      ArrayList localArrayList2 = (ArrayList)localdmn.value();
      for (cgv localcgv : localArrayList2) {
        if (localcgv.ciB() != afz.cYt) {
          localArrayList1.add(localcgv);
        }
      }
    }
    return localArrayList1;
  }

  public cgv a(coM paramcoM, boolean paramBoolean) {
    for (dmn localdmn = this.lmW.yF(); localdmn.hasNext(); ) {
      localdmn.fl();
      for (cgv localcgv : (ArrayList)localdmn.value()) {
        if ((paramcoM.anI().equals(localcgv.getCommand())) && (localcgv.ciB() != afz.cYt)) {
          b(localcgv);
          return localcgv;
        }
      }
    }
    return null;
  }

  private void b(cgv paramcgv)
  {
    if ((paramcgv != this.lmY) && ((paramcgv == null) || (paramcgv.ciB() != afz.cYt))) {
      this.lmY = paramcgv;
      dWe.dvA().a(this.lmY, cgv.bF);
      dWe.dvA().a(this, new String[] { "currentChannel", "currentChannelName" });
    }
  }

  public cgv cUP() {
    return this.lmY;
  }

  private void c(cgv paramcgv) {
    if (paramcgv.ciB() != afz.cYt)
      dWe.dvA().a(this, new String[] { "channelsList" });
  }

  public void c(aEe paramaEe)
  {
    String str = j(paramaEe);
    c("history", str);
    dWe.dvA().a(this, new String[] { "history" });
  }

  public void a(dab paramdab, afz paramafz)
  {
    if (!cSr())
      b(paramdab, paramafz);
  }

  public String[] getFields()
  {
    return bF;
  }

  public int cUQ() {
    return this.lmX;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("input")) {
      return this.lmT;
    }
    if (paramString.equals("history")) {
      return this.lmU;
    }
    if (paramString.equals("channelsList")) {
      return cUO();
    }
    if (paramString.equals("privateName")) {
      return cUR();
    }
    if (paramString.equals("isPaused")) {
      return Boolean.valueOf(this.dbs);
    }
    if (paramString.equals("currentChannel")) {
      return this.lmY;
    }
    if (paramString.equals("currentChannelName")) {
      String str = cUR();
      return this.lmY != null ? this.lmY.ciA() : str != null ? str : null;
    }
    return null;
  }

  public String cUR() {
    if (this.lmZ == null) {
      return null;
    }

    int i = this.lmZ.indexOf(' ') + 1;
    if ((i == 0) || (i > this.lmZ.length() - 1)) {
      return null;
    }
    return this.lmZ.substring(i).replaceAll("\"", "");
  }

  public void a(String paramString, Object paramObject) {
    if (paramString.equals("input"))
      this.lmT = ((String)paramObject);
    else if (paramString.equals("history"))
      this.lmU = pE((String)paramObject);
  }

  public void b(String paramString, Object paramObject)
  {
    if (paramString.equals("input"))
      this.lmT = (paramObject + this.lmT);
  }

  public void c(String paramString, Object paramObject)
  {
    if (paramString.equals("history")) {
      if (this.dbs) {
        if (this.lna.length() == 0)
          this.lna = pE(this.lmU + paramObject);
        else {
          this.lna = pE(this.lna + paramObject);
        }
      }
      else if (this.lna.length() == 0) {
        this.lmU = pE(this.lmU + paramObject);
      } else {
        this.lmU = this.lna;
        this.lna = "";
      }

    }
    else if (paramString.equals("input"))
      this.lmT += paramObject;
  }

  private String pE(String paramString)
  {
    String[] arrayOfString = dzp.c(paramString, '\n');
    int i = 0;
    int j = arrayOfString.length;
    if (j > 100) {
      for (int k = 0; k < j - 100; k++) {
        i += arrayOfString[k].length() + 1;
      }
    }
    return paramString.substring(i);
  }

  public boolean l(String paramString) {
    if (paramString.equals("input")) {
      return true;
    }
    return false;
  }

  public void clear() {
    this.lmU = "";
    this.lna = "";
    this.lmT = "";
    dWe.dvA().a(this, new String[] { "history", "input" });
  }

  public void setPrompt(String paramString) {
  }

  public void err(String paramString) {
  }

  public void log(String paramString) {
  }

  public void trace(String paramString) {
  }

  public String cUS() {
    return this.lmZ;
  }

  public void pF(String paramString) {
    this.lmZ = paramString;
    dWe.dvA().a(this, new String[] { "currentChannelName", "privateName" });
  }

  public void AT(int paramInt) {
    this.lmX = paramInt;
  }

  public void setPaused(boolean paramBoolean) {
    this.dbs = paramBoolean;
    if (!this.dbs) {
      c("history", this.lna);
    }
    dWe.dvA().a(this, new String[] { "history", "isPaused" });
  }

  public boolean isPaused() {
    return this.dbs;
  }

  public void cUT() {
    for (dmn localdmn = this.lmW.yF(); localdmn.hasNext(); ) {
      localdmn.fl();
      ArrayList localArrayList = (ArrayList)localdmn.value();
      for (cgv localcgv : localArrayList) {
        localdab1 = localcgv.ciz();
        localdab1.b(this);
        for (dab localdab2 : localdab1.cMA().values()) {
          localdab2.b(this);
          if (localdab2.cMC())
            localdab1.a(localdab2);
        }
      }
    }
    dab localdab1;
    this.lmW.clear();
  }

  public boolean cSr() {
    return false;
  }

  public int[] cUU() {
    return this.lmS;
  }

  public void aa(int[] paramArrayOfInt) {
    this.lmS = paramArrayOfInt;
  }
}