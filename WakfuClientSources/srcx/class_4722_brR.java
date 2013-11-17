import java.awt.Rectangle;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class brR
  implements bWU
{
  private static final Logger K = Logger.getLogger(brR.class);

  private static final aee aOr = new bOO(new coj());
  private aee fnG;
  private final ArrayList fNQ = new ArrayList();

  private bTj fNR = null;

  private final Rectangle fNS = new Rectangle();

  private int fNT = 0;
  private aFE fNU;
  private int dWj;

  public static brR bAc()
  {
    brR localbrR;
    try
    {
      localbrR = (brR)aOr.Mm();
      localbrR.fnG = aOr;
    }
    catch (Exception localException)
    {
      K.error("Problème au borrowObject.");
      localbrR = new brR();
      localbrR.aJ();
    }
    return localbrR;
  }

  public void release() {
    try {
      if (this.fnG != null)
        this.fnG.y(this);
      else
        bc();
    }
    catch (Exception localException) {
      K.warn("Problème lors du retour dans un pool", localException);
      bc();
    }
  }

  public aBV f(String paramString, int paramInt1, int paramInt2)
  {
    return a(paramString, null, 0, 0, paramInt1, paramInt2);
  }

  public aBV a(String paramString, ckA paramckA, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    aBV localaBV = new aBV();
    localaBV.a(this);
    localaBV.setText(paramString);
    localaBV.c(paramckA);
    localaBV.setStartIndex(paramInt1);
    localaBV.setEndIndex(paramInt2);
    localaBV.setX(paramInt3);
    localaBV.setWidth(paramInt4);

    a(localaBV);
    return localaBV;
  }

  public dVI a(cKf paramcKf, int paramInt)
  {
    dVI localdVI = new dVI();
    localdVI.a(this);
    localdVI.c(paramcKf);
    localdVI.setX(paramInt);

    a(localdVI);
    return localdVI;
  }

  private void a(cDG paramcDG)
  {
    this.fNS.width += paramcDG.getWidth();

    this.fNQ.add(paramcDG);
  }

  public void qD(int paramInt) {
    cDG localcDG = (cDG)this.fNQ.remove(paramInt);
    this.fNS.width -= localcDG.getWidth();
  }

  public void bAd() {
    this.fNQ.clear();
    this.fNS.width = 0;
    bAe();
  }

  public void bAe() {
    this.fNR = null;
  }

  public bTj bAf() {
    return this.fNR;
  }

  public void e(int paramInt1, int paramInt2, boolean paramBoolean) {
    this.fNR = new bTj();
    this.fNR.a(this);
    this.fNR.setX(paramInt1);
    this.fNR.setWidth(paramInt2);
    this.fNR.gF(paramBoolean);
  }

  public Rectangle getBounds()
  {
    return this.fNS;
  }

  public int getX()
  {
    return this.fNS.x;
  }

  public void setX(int paramInt) {
    this.fNS.x = paramInt;
  }

  public int getY()
  {
    return this.fNS.y;
  }

  public void setY(int paramInt) {
    this.fNS.y = paramInt;
  }

  public int getHeight() {
    return this.fNS.height;
  }

  public void setHeight(int paramInt) {
    this.fNS.height = paramInt;
  }

  public int getWidth() {
    return this.fNS.width;
  }

  public int bAg() {
    return this.fNT;
  }

  public void qE(int paramInt) {
    this.fNT = paramInt;
  }

  public aFE bAh() {
    return this.fNU;
  }

  public void a(aFE paramaFE) {
    this.fNU = paramaFE;
  }

  public boolean isEmpty() {
    return this.fNQ.isEmpty();
  }

  public int aOg()
  {
    return this.dWj;
  }

  public void lM(int paramInt) {
    this.dWj = paramInt;
  }

  public int bAi() {
    return this.fNQ.size();
  }

  public cDG qF(int paramInt) {
    return (cDG)this.fNQ.get(paramInt);
  }

  public cDG bAj() {
    if (!this.fNQ.isEmpty()) {
      return (cDG)this.fNQ.get(0);
    }
    return null;
  }

  public cDG bAk() {
    if (!this.fNQ.isEmpty()) {
      return (cDG)this.fNQ.get(this.fNQ.size() - 1);
    }
    return null;
  }

  public void bAl()
  {
    this.fNS.width = 0;
    for (cDG localcDG : this.fNQ)
      this.fNS.width += localcDG.getWidth();
  }

  public final ArrayList bAm()
  {
    return this.fNQ;
  }

  public void aJ() {
    this.fNT = 0;
  }

  public void bc() {
    this.fNQ.clear();
    this.fNR = null;
    this.fNS.setBounds(0, 0, 0, 0);
    this.fNU = null;
    this.dWj = 0;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0; for (int j = this.fNQ.size(); i < j; i++) {
      localStringBuilder.append(((cDG)this.fNQ.get(i)).toString());
    }
    return localStringBuilder.toString();
  }
}