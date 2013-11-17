import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public abstract class dab
{
  public static final String kNV = "subPipe";
  public static final int kNW = -1;
  private static int kNX = 100;
  private final int aw;
  private String kNY = null;
  private boolean kNZ = false;
  private String m_name = null;
  private dDA kOa;
  private LinkedList kOb;
  protected List aEZ = new ArrayList();
  protected float[] bRQ;
  protected HashMap kOc = new HashMap();

  public dab(int paramInt, String paramString1, float[] paramArrayOfFloat, String paramString2, boolean paramBoolean)
  {
    this.aw = paramInt;
    this.kNY = paramString1;
    this.bRQ = paramArrayOfFloat;
    this.m_name = paramString2;
    this.kNZ = paramBoolean;
  }

  public String getInternalName()
  {
    return this.kNY;
  }

  public LinkedList cMy()
  {
    return this.kOb;
  }

  public dDA cMz()
  {
    return this.kOa;
  }

  public void a(String paramString, dab paramdab)
  {
    if (this.kOc == null) {
      this.kOc = new HashMap();
    }

    if (!this.kOc.containsKey(paramString)) {
      this.kOc.put(paramString, paramdab);
    }

    for (Eq localEq : cpz())
      localEq.a(paramdab, afz.cYt);
  }

  public void a(dab paramdab)
  {
    if (paramdab == null) {
      return;
    }
    if (this.kOc == null) {
      return;
    }
    this.kOc.remove(paramdab);
    if (paramdab != null)
      paramdab.clean();
  }

  public void a(aEe paramaEe)
  {
    if (this.kOb == null) {
      this.kOb = new LinkedList();
    }

    if (this.kOb.size() > kNX) {
      this.kOb.removeLast();
    }

    this.kOb.addFirst(paramaEe);
    int i = 0; for (int j = this.aEZ.size(); i < j; i++)
      ((Eq)this.aEZ.get(i)).c(paramaEe);
  }

  public void a(aEe paramaEe, String paramString)
  {
    dab localdab = (dab)this.kOc.get(paramString);

    if (localdab != null)
      localdab.a(paramaEe);
    else
      a(paramaEe);
  }

  public void gT(String paramString)
  {
  }

  public void a(Eq paramEq)
  {
    if (!this.aEZ.contains(paramEq))
      this.aEZ.add(paramEq);
  }

  public void b(Eq paramEq)
  {
    this.aEZ.remove(paramEq);
  }

  public List cpz()
  {
    return this.aEZ;
  }

  public dab oF(String paramString) {
    return (dab)this.kOc.get(paramString);
  }

  public HashMap cMA()
  {
    return this.kOc;
  }

  public float[] ckE() {
    return this.bRQ;
  }

  public String getName() {
    return this.m_name;
  }

  public boolean ciC() {
    return this.kNZ;
  }

  public int getId() {
    return this.aw;
  }

  public void l(float paramFloat1, float paramFloat2, float paramFloat3) {
    this.bRQ = new float[] { paramFloat1, paramFloat2, paramFloat3 };
  }

  public void clean()
  {
    if (this.kOb != null) {
      this.kOb.clear();
    }

    for (dab localdab : this.kOc.values()) {
      localdab.clean();
    }
    this.kOc.clear();
    this.aEZ.clear();
  }

  public boolean cMB() {
    return this.kNZ;
  }

  public boolean cMC() {
    return this.aEZ.isEmpty();
  }
}