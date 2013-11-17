import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public abstract class bly extends cwV
  implements gb, Cloneable
{
  private EZ fCv = new EZ();
  private List fCw = new ArrayList();
  private List fCx = new ArrayList();
  private File bwQ;
  private boolean fCy = true;
  private boolean caseSensitive = true;
  private boolean fCz = true;
  private boolean fCA = true;
  private int fCB = 5;

  private bqf fCC = null;

  public bly()
  {
  }

  protected bly(bly parambly)
  {
    this.bwQ = parambly.bwQ;
    this.fCv = parambly.fCv;
    this.fCw = parambly.fCw;
    this.fCx = parambly.fCx;
    this.fCy = parambly.fCy;
    this.caseSensitive = parambly.caseSensitive;
    this.fCz = parambly.fCz;
    this.fCA = parambly.fCA;
    this.fCB = parambly.fCB;
    b(parambly.Ga());
  }

  public void a(cxK paramcxK)
  {
    if ((this.bwQ != null) || (this.fCv.h(Ga()))) {
      throw cuq();
    }
    if (!this.fCw.isEmpty()) {
      throw cur();
    }
    if (!this.fCx.isEmpty()) {
      throw cur();
    }
    super.a(paramcxK);
  }

  public synchronized void s(File paramFile)
  {
    if (cum()) {
      throw cuq();
    }
    this.bwQ = paramFile;
    this.fCC = null;
  }

  public File bwD()
  {
    return c(Ga());
  }

  public synchronized File c(FF paramFF)
  {
    if (cum()) {
      return z(paramFF).c(paramFF);
    }
    cuo();
    return this.bwQ;
  }

  public synchronized EZ azr()
  {
    if (cum()) {
      throw cur();
    }
    EZ localEZ = new EZ();
    this.fCw.add(localEZ);
    this.fCC = null;
    return localEZ;
  }

  public synchronized cMT OA()
  {
    if (cum()) {
      throw cur();
    }
    this.fCC = null;
    return this.fCv.OA();
  }

  public synchronized cMT OB()
  {
    if (cum()) {
      throw cur();
    }
    this.fCC = null;
    return this.fCv.OB();
  }

  public synchronized cMT OC()
  {
    if (cum()) {
      throw cur();
    }
    this.fCC = null;
    return this.fCv.OC();
  }

  public synchronized cMT OD()
  {
    if (cum()) {
      throw cur();
    }
    this.fCC = null;
    return this.fCv.OD();
  }

  public synchronized void C(File paramFile)
  {
    if (cum()) {
      throw cuq();
    }
    s(paramFile.getParentFile());
    OA().setName(paramFile.getName());
  }

  public synchronized void bE(String paramString)
  {
    if (cum()) {
      throw cuq();
    }
    this.fCv.bE(paramString);
    this.fCC = null;
  }

  public synchronized void p(String[] paramArrayOfString)
  {
    if (cum()) {
      throw cuq();
    }
    if (paramArrayOfString != null) {
      for (int i = 0; i < paramArrayOfString.length; i++) {
        this.fCv.OA().setName(paramArrayOfString[i]);
      }
      this.fCC = null;
    }
  }

  public synchronized void bF(String paramString)
  {
    if (cum()) {
      throw cuq();
    }
    this.fCv.bF(paramString);
    this.fCC = null;
  }

  public synchronized void q(String[] paramArrayOfString)
  {
    if (cum()) {
      throw cuq();
    }
    if (paramArrayOfString != null) {
      for (int i = 0; i < paramArrayOfString.length; i++) {
        this.fCv.OC().setName(paramArrayOfString[i]);
      }
      this.fCC = null;
    }
  }

  public synchronized void u(File paramFile)
  {
    if (cum()) {
      throw cuq();
    }
    this.fCv.u(paramFile);
    this.fCC = null;
  }

  public synchronized void v(File paramFile)
  {
    if (cum()) {
      throw cuq();
    }
    this.fCv.v(paramFile);
    this.fCC = null;
  }

  public synchronized void cv(boolean paramBoolean)
  {
    if (cum()) {
      throw cuq();
    }
    this.fCy = paramBoolean;
    this.fCC = null;
  }

  public synchronized boolean bwE()
  {
    if (cum()) {
      return z(Ga()).bwE();
    }
    cuo();
    return this.fCy;
  }

  public synchronized void setCaseSensitive(boolean paramBoolean)
  {
    if (cum()) {
      throw cuq();
    }
    this.caseSensitive = paramBoolean;
    this.fCC = null;
  }

  public synchronized boolean isCaseSensitive()
  {
    if (cum()) {
      return z(Ga()).isCaseSensitive();
    }
    cuo();
    return this.caseSensitive;
  }

  public synchronized void cw(boolean paramBoolean)
  {
    if (cum()) {
      throw cuq();
    }
    this.fCz = paramBoolean;
    this.fCC = null;
  }

  public synchronized boolean bwF()
  {
    if (cum()) {
      return z(Ga()).isCaseSensitive();
    }
    cuo();
    return this.fCz;
  }

  public void qd(int paramInt)
  {
    this.fCB = paramInt;
  }

  public int bwG()
  {
    return this.fCB;
  }

  public void eR(boolean paramBoolean)
  {
    this.fCA = paramBoolean;
  }

  public boolean bwH()
  {
    return this.fCA;
  }

  public bqf bwI()
  {
    return y(Ga());
  }

  public bqf y(FF paramFF)
  {
    if (cum()) {
      return z(paramFF).y(paramFF);
    }
    cuo();
    bqf localbqf = null;
    synchronized (this) {
      if ((this.fCC != null) && (paramFF == Ga())) {
        localbqf = this.fCC;
      } else {
        if (this.bwQ == null) {
          throw new cJ("No directory specified for " + cun() + ".");
        }

        if ((!this.bwQ.exists()) && (this.fCA)) {
          throw new cJ(this.bwQ.getAbsolutePath() + " does not exist.");
        }

        if ((!this.bwQ.isDirectory()) && (this.bwQ.exists())) {
          throw new cJ(this.bwQ.getAbsolutePath() + " is not a directory.");
        }

        localbqf = new bqf();
        a(localbqf, paramFF);
        localbqf.cw(this.fCz);
        localbqf.eR(this.fCA);
        localbqf.qd(this.fCB);
        this.fCC = (paramFF == Ga() ? localbqf : this.fCC);
      }
    }
    localbqf.kX();
    return localbqf;
  }

  public void a(ek paramek)
  {
    a(paramek, Ga());
  }

  public synchronized void a(ek paramek, FF paramFF)
  {
    if (cum()) {
      z(paramFF).a(paramek, paramFF);
      return;
    }
    T(paramFF);
    if (paramek == null) {
      throw new IllegalArgumentException("ds cannot be null");
    }
    paramek.d(this.bwQ);

    EZ localEZ = C(paramFF);
    paramFF.d(cun() + ": Setup scanner in dir " + this.bwQ + " with " + localEZ, 4);

    paramek.b(localEZ.f(paramFF));
    paramek.a(localEZ.g(paramFF));
    if ((paramek instanceof cHc)) {
      cHc localcHc = (cHc)paramek;
      localcHc.a(a(paramFF));
    }
    if (this.fCy) {
      paramek.kP();
    }
    paramek.setCaseSensitive(this.caseSensitive);
  }

  protected bly z(FF paramFF)
  {
    return (bly)U(paramFF);
  }

  public synchronized boolean lT()
  {
    if (cum()) {
      return z(Ga()).lT();
    }
    cuo();
    return !this.fCx.isEmpty();
  }

  public synchronized boolean bwJ()
  {
    if ((cum()) && (Ga() != null)) {
      return z(Ga()).bwJ();
    }
    cuo();
    if (this.fCv.h(Ga())) {
      return true;
    }
    for (EZ localEZ : this.fCw) {
      if (localEZ.h(Ga())) {
        return true;
      }
    }
    return false;
  }

  public synchronized int lU()
  {
    if (cum()) {
      return z(Ga()).lU();
    }
    cuo();
    return this.fCx.size();
  }

  public synchronized ank[] a(FF paramFF)
  {
    if (cum()) {
      return z(Ga()).a(paramFF);
    }
    T(paramFF);
    return (ank[])this.fCx.toArray(new ank[this.fCx.size()]);
  }

  public synchronized Enumeration lV()
  {
    if (cum()) {
      return z(Ga()).lV();
    }
    cuo();
    return Collections.enumeration(this.fCx);
  }

  public synchronized void a(ank paramank)
  {
    if (cum()) {
      throw cur();
    }
    this.fCx.add(paramank);
    this.fCC = null;
    setChecked(false);
  }

  public void a(eO parameO)
  {
    a(parameO);
  }

  public void a(bQW parambQW)
  {
    a(parambQW);
  }

  public void a(czH paramczH)
  {
    a(paramczH);
  }

  public void a(dbz paramdbz)
  {
    a(paramdbz);
  }

  public void a(dIM paramdIM)
  {
    a(paramdIM);
  }

  public void a(diF paramdiF)
  {
    a(paramdiF);
  }

  public void a(dFB paramdFB)
  {
    a(paramdFB);
  }

  public void a(cNP paramcNP)
  {
    a(paramcNP);
  }

  public void a(dSW paramdSW)
  {
    a(paramdSW);
  }

  public void a(arQ paramarQ)
  {
    a(paramarQ);
  }

  public void a(bMy parambMy)
  {
    a(parambMy);
  }

  public void a(bxQ parambxQ)
  {
    a(parambxQ);
  }

  public void a(UF paramUF)
  {
    a(paramUF);
  }

  public void a(bJY parambJY)
  {
    a(parambJY);
  }

  public void a(cPj paramcPj)
  {
    a(paramcPj);
  }

  public void a(buP parambuP)
  {
    a(parambuP);
  }

  public void a(aS paramaS)
  {
    a(paramaS);
  }

  public void a(NA paramNA)
  {
    a(paramNA);
  }

  public void a(dff paramdff) {
    a(paramdff);
  }

  public void a(ccl paramccl) {
    a(paramccl);
  }

  public void b(ank paramank)
  {
    a(paramank);
  }

  public String toString()
  {
    if (cum()) {
      return z(Ga()).toString();
    }
    cuo();
    bqf localbqf = y(Ga());
    String[] arrayOfString = localbqf.kU();
    StringBuffer localStringBuffer = new StringBuffer();

    for (int i = 0; i < arrayOfString.length; i++) {
      if (i > 0) {
        localStringBuffer.append(';');
      }
      localStringBuffer.append(arrayOfString[i]);
    }
    return localStringBuffer.toString();
  }

  public synchronized Object clone()
  {
    if (cum())
      return z(Ga()).clone();
    try
    {
      bly localbly = (bly)super.clone();
      localbly.fCv = ((EZ)this.fCv.clone());
      localbly.fCw = new ArrayList(this.fCw.size());
      for (EZ localEZ : this.fCw) {
        localbly.fCw.add((EZ)localEZ.clone());
      }
      localbly.fCx = new ArrayList(this.fCx);
      return localbly;
    } catch (CloneNotSupportedException localCloneNotSupportedException) {
      throw new cJ(localCloneNotSupportedException);
    }
  }

  public String[] A(FF paramFF)
  {
    return C(paramFF).f(paramFF);
  }

  public String[] B(FF paramFF)
  {
    return C(paramFF).g(paramFF);
  }

  public synchronized EZ C(FF paramFF)
  {
    if (cum()) {
      return z(paramFF).C(paramFF);
    }
    cuo();
    EZ localEZ = (EZ)this.fCv.clone();
    int i = this.fCw.size();
    for (int j = 0; j < i; j++) {
      localEZ.a((EZ)this.fCw.get(j), paramFF);
    }
    return localEZ;
  }

  protected synchronized void a(Stack paramStack, FF paramFF)
  {
    if (isChecked()) {
      return;
    }
    if (cum()) {
      super.a(paramStack, paramFF);
    } else {
      for (Iterator localIterator = this.fCx.iterator(); localIterator.hasNext(); ) { localObject = (ank)localIterator.next();
        if ((localObject instanceof cwV))
          b((cwV)localObject, paramStack, paramFF);
      }
      Object localObject;
      for (localIterator = this.fCw.iterator(); localIterator.hasNext(); ) { localObject = (EZ)localIterator.next();
        b((cwV)localObject, paramStack, paramFF);
      }
      setChecked(true);
    }
  }
}