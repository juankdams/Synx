import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public class dLB extends ctU
  implements dBv
{
  private static final Logger K = Logger.getLogger(dLB.class);
  public static final String bC = "name";
  public static final String mbD = "nameUnderline";
  public static final String bHJ = "id";
  public static final String kTA = "items";
  public static final String mbE = "nameAndNumber";
  public static final String mbF = "itemNumber";
  public static final String mbG = "bonusThreshold";
  public static final String mbH = "condition";
  public static final String mbI = "bonusByItem";
  public static final String mbJ = "allBonuses";
  public static final String ipa = "requirement";
  public static final String ioQ = "isEquipable";
  public static final String ioR = "isPreviewable";
  public static final String RI = "description";
  public static final String[] bF = { "name", "nameUnderline", "nameAndNumber", "items", "itemNumber", "bonusThreshold", "condition", "requirement", "isEquipable", "isPreviewable", "allBonuses", "bonusByItem", "description", "id" };
  private ArrayList mbK;
  private Object[] mbL;

  public dLB(short paramShort, int paramInt, List paramList)
  {
    super(paramShort, paramInt, paramList);
  }

  public String getName() {
    return bU.fH().b(20, nc(), new Object[0]);
  }

  public String getDescription() {
    return bU.fH().b(21, nc(), new Object[0]);
  }

  public void doS() {
    ArrayList localArrayList = new ArrayList();
    List localList = csv();
    for (int i = 0; i < localList.size(); i++) {
      bVw localbVw = (bVw)localList.get(i);
      localArrayList.add(localbVw.a(Aq.bvQ));
    }
    this.mbK = daj.ae(localArrayList);
  }

  private byte doT() {
    byte b = 0;

    bZH localbZH = byv.bFN().bFO().ayJ();

    for (bVw localbVw : this) {
      if (localbZH.hg(localbVw.getId())) {
        b = (byte)(b + 1);
      }
    }

    return b;
  }

  public String CS(int paramInt)
  {
    ArrayList localArrayList = wJ(paramInt);
    if (localArrayList == null) {
      return "";
    }
    return am(localArrayList);
  }

  public Object[] doU()
  {
    if (this.mbL != null) {
      return this.mbL;
    }
    List localList = csv();
    cSi localcSi = new cSi();
    cSR localcSR = new cSR();

    for (int i = 0; i < localList.size(); i++) {
      bVw localbVw = (bVw)localList.get(i);
      int j = localbVw.getId();
      Object localObject1 = null;
      int k = -1;
      int m = -1;
      Object localObject2;
      if ((localbVw instanceof QM)) {
        localObject2 = (QM)localbVw;
        m = ((QM)localObject2).acv().getId();
        k = localcSi.contains(m) ? m : -1;
      }
      if (localObject1 == null) {
        localObject2 = byv.bFN().bFO().bGP().cEg();
        while (((cHu)localObject2).hasNext()) {
          ((cHu)localObject2).fl();
          cRs localcRs = (cRs)((cHu)localObject2).value();
          for (gA localgA : localcRs) {
            if (localgA.ok() == j) {
              localObject1 = localgA;
              break;
            }
          }
          if (localObject1 != null)
          {
            break;
          }
        }
      }
      if (localObject1 != null)
        localcSR.put(m == -1 ? j : m, localObject1);
      else if (k == -1) {
        localcSR.put(m == -1 ? j : m, localbVw);
      }
      if (m != -1) {
        localcSi.add(m);
      }
    }
    this.mbL = new Object[localcSR.size()];
    localcSR.d(this.mbL);
    return this.mbL;
  }

  public static String am(ArrayList paramArrayList)
  {
    Collections.sort(paramArrayList, cOJ.kxr);

    bFd localbFd = new bFd(paramArrayList);
    ArrayList localArrayList = localbFd.cAK();
    return localArrayList.isEmpty() ? "" : (String)localArrayList.get(0);
  }

  public Object getFieldValue(String paramString) {
    if (paramString == null)
      return null;
    if (paramString.equalsIgnoreCase("name"))
      return getName();
    if (paramString.equalsIgnoreCase("nameUnderline"))
      return "<u>" + getName() + "</u>";
    if (paramString.equals("id"))
      return Short.valueOf(nc());
    Object localObject2;
    if (paramString.equals("nameAndNumber")) {
      int i = doT();
      localObject2 = new lZ();
      int m = csw();
      if (i == m) {
        ((lZ)localObject2).tI().am(new bNa(0.0F, 0.7F, 0.0F, 1.0F).bUV());
      }
      ((lZ)localObject2).a(getName()).a(" (").v(i).a("/").bw(m).a(")");
      return ((lZ)localObject2).tP();
    }
    Object localObject3;
    if (paramString.equals("isEquipable"))
    {
      cHu localcHu = byv.bFN().bFO().bGP().cEg();
      while (localcHu.hasNext()) {
        localcHu.fl();
        localObject2 = (cRs)localcHu.value();
        for (localObject3 = iterator(); ((Iterator)localObject3).hasNext(); ) { bVw localbVw = (bVw)((Iterator)localObject3).next();
          if (((cRs)localObject2).hg(localbVw.getId())) {
            return Boolean.valueOf(true);
          }
        }
      }
      return Boolean.valueOf(false);
    }if (paramString.equals("isPreviewable"))
      return Boolean.valueOf(true);
    if (paramString.equals("itemNumber")) {
      int j = doT();
      return "(" + j + "/" + csw() + ")";
    }
    Object localObject1;
    if (paramString.equals("bonusThreshold"))
    {
      if (!this.bel.isEmpty()) {
        localObject1 = new Integer[this.bel.size()];
        int k = 0;
        for (int i2 : this.bel.qe()) {
          localObject1[(k++)] = Integer.valueOf(i2);
        }
        Arrays.sort((Object[])localObject1);
        return localObject1;
      }
      return null;
    }
    if (paramString.equals("items"))
      return doU();
    if (paramString.equals("bonusByItem"))
      return doV();
    if (paramString.equals("allBonuses"))
      return CS(csw());
    if (paramString.equals("description"))
      return getDescription();
    if (paramString.equalsIgnoreCase("requirement")) {
      localObject1 = "";
      Iterator localIterator;
      if (this.mbK != null) {
        for (localIterator = this.mbK.iterator(); localIterator.hasNext(); ) { localObject3 = (String)localIterator.next();
          localObject1 = (String)localObject1 + (String)localObject3 + "\n";
        }
      }
      return localObject1;
    }
    return null;
  }

  public int csw()
  {
    return doU().length;
  }

  private String doV() {
    lZ locallZ = new lZ();
    int i = 0;
    for (int j = 0; j < doU().length; j++) {
      int k = j + 1;
      String str = CS(k);
      if (str.length() != 0)
      {
        if (i > 0) {
          locallZ.tH().tH();
        }
        locallZ.tz();
        int m = doT() >= k ? 1 : 0;
        if (m != 0) {
          locallZ.am("00b400");
        }
        locallZ.a(bU.fH().getString("object", new Object[] { Integer.valueOf(k) })).a(" :");
        locallZ.tA().tH();
        locallZ.a(str);
        i++;
      }
    }
    return locallZ.tP();
  }

  public String[] getFields() {
    return bF;
  }

  public boolean l(String paramString) {
    return false;
  }

  public void c(String paramString, Object paramObject)
  {
  }

  public void b(String paramString, Object paramObject)
  {
  }

  public void a(String paramString, Object paramObject)
  {
  }

  public void of()
  {
    this.mbL = null;
    dLE.doY().a(this, new String[] { "isEquipable" });
    dLE.doY().a(this, bF);
  }
}