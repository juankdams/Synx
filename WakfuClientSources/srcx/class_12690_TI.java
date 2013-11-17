import java.util.ArrayList;

public class TI extends dgQ
{
  public static final String TAG = "SpringLayoutData";
  public static final String cwM = "spld";
  private boolean cwN = false;
  private cgs cwO;
  private cgs cwP;
  private cgs cwQ;
  private cgs cwR;
  private cgs cwS;
  private cgs cwT;
  private cgs cwU;
  private cgs cwV;
  private Yl bas;

  public TI()
  {
  }

  public TI(cgs paramcgs1, cgs paramcgs2, cgs paramcgs3, cgs paramcgs4)
  {
    this.cwO = paramcgs1;
    this.cwP = paramcgs2;
    this.cwQ = paramcgs3;
    this.cwR = paramcgs4;
  }

  public void a(aNL paramaNL)
  {
    if (((paramaNL instanceof cgs)) && (isInTree())) {
      cgs localcgs = (cgs)paramaNL;
      a(localcgs.getEdge(), localcgs.getValue(), localcgs.getReferentId(), localcgs.getReferentEdge());

      this.cwN = true;
      setNeedsToPreProcess();
    }

    super.a(paramaNL);
  }

  private void agE() {
    if ((this.cwO != null) && (this.cwS != null) && (this.cwU != null))
      this.cwS = null;
  }

  private void agF()
  {
    if ((this.cwP != null) && (this.cwT != null) && (this.cwV != null))
      this.cwT = null;
  }

  public String getTag()
  {
    return "SpringLayoutData";
  }

  public cgs getEast()
  {
    if (this.cwQ != null) {
      return this.cwQ;
    }
    if (this.cwU == null) {
      if ((this.cwO != null) && (this.cwS != null))
        this.cwU = cgs.a(this.cwO, this.cwS);
      else {
        return cgs.vi(0);
      }
    }
    return this.cwU;
  }

  public void setEast(cgs paramcgs)
  {
    this.cwQ = paramcgs;
  }

  public cgs getNorth()
  {
    if (this.cwR != null) {
      return this.cwR;
    }
    if (this.cwV == null) {
      if ((this.cwP != null) && (this.cwT != null))
        this.cwV = cgs.a(this.cwP, this.cwT);
      else {
        return cgs.vi(0);
      }
    }
    return this.cwV;
  }

  public void setNorth(cgs paramcgs)
  {
    this.cwR = paramcgs;
  }

  public cgs getX()
  {
    if (this.cwO != null) {
      return this.cwO;
    }
    if (this.cwU == null) {
      if ((this.cwQ != null) && (this.cwS != null))
        this.cwU = cgs.b(this.cwQ, this.cwS);
      else {
        return cgs.vi(0);
      }
    }
    return this.cwU;
  }

  public void setX(cgs paramcgs)
  {
    this.cwO = paramcgs;
  }

  public cgs getY()
  {
    if (this.cwP != null) {
      return this.cwP;
    }
    if (this.cwV == null) {
      if ((this.cwR != null) && (this.cwT != null))
        this.cwV = cgs.b(this.cwR, this.cwT);
      else {
        return cgs.vi(0);
      }
    }
    return this.cwV;
  }

  public void setY(cgs paramcgs)
  {
    this.cwP = paramcgs;
  }

  public cgs getWidth() {
    if (this.cwS != null) {
      return this.cwS;
    }
    if (this.cwU == null) {
      if ((this.cwQ != null) && (this.cwO != null))
        this.cwU = cgs.b(this.cwQ, this.cwO);
      else {
        return cgs.vi(0);
      }
    }
    return this.cwU;
  }

  public void setWidth(cgs paramcgs) {
    this.cwS = paramcgs;
    agE();
  }

  public cgs getHeight() {
    if (this.cwT != null) {
      return this.cwT;
    }
    if (this.cwV == null) {
      if ((this.cwR != null) && (this.cwP != null))
        this.cwV = cgs.b(this.cwR, this.cwP);
      else {
        return cgs.vi(0);
      }
    }
    return this.cwV;
  }

  public void setHeight(cgs paramcgs) {
    this.cwT = paramcgs;
    agF();
  }

  public Yl getLayout()
  {
    return this.bas;
  }

  public void setLayout(Yl paramYl)
  {
    this.bas = paramYl;
  }

  public cgs getConstraint(String paramString)
  {
    if (paramString.equalsIgnoreCase("North"))
      return getNorth();
    if (paramString.equalsIgnoreCase("East"))
      return getEast();
    if (paramString.equalsIgnoreCase("West"))
      return getX();
    if (paramString.equalsIgnoreCase("South")) {
      return getY();
    }
    return null;
  }

  public void a(String paramString1, int paramInt, String paramString2, String paramString3) {
    cgs localcgs = cgs.a(cgs.vi(paramInt), new sj(this.bas, paramString2, paramString3));
    a(paramString1, localcgs);
  }

  public void a(String paramString1, int paramInt, dOc paramdOc, String paramString2) {
    cgs localcgs = cgs.a(cgs.vi(paramInt), new sj(this.bas, paramdOc, paramString2));
    a(paramString1, localcgs);
  }

  public void a(String paramString, cgs paramcgs) {
    if (paramString.equalsIgnoreCase("North"))
      setNorth(paramcgs);
    else if (paramString.equalsIgnoreCase("East"))
      setEast(paramcgs);
    else if (paramString.equalsIgnoreCase("West"))
      setX(paramcgs);
    else if (paramString.equalsIgnoreCase("South"))
      setY(paramcgs);
  }

  public static TI a(Yl paramYl, dOc paramdOc)
  {
    TI localTI = new TI();
    localTI.setLayout(paramYl);
    localTI.setX(cgs.r(paramdOc));
    localTI.setY(cgs.s(paramdOc));
    localTI.setWidth(cgs.p(paramdOc));
    localTI.setHeight(cgs.q(paramdOc));
    return localTI;
  }

  public void agG()
  {
  }

  public void c(bdj parambdj)
  {
    TI localTI = (TI)parambdj;
    super.c(localTI);
  }

  public void ZW()
  {
    super.ZW();

    PT localPT = null;

    dOc localdOc = (dOc)getParentOfType(dOc.class);
    if (localdOc != null) {
      dRq localdRq = localdOc.getContainer();
      if (localdRq != null) {
        localPT = localdRq.getLayoutManager();
      }
    }

    if ((localPT instanceof Yl)) {
      setLayout((Yl)localPT);
      if ((this.etK instanceof dOc)) {
        ((Yl)localPT).a((dOc)this.etK, this);
      }
    }

    int i = getChildren().size();
    for (int j = 0; j < i; j++) {
      aNL localaNL = (aNL)getChildren().get(j);
      if ((localaNL instanceof cgs)) {
        cgs localcgs = (cgs)localaNL;
        a(localcgs.getEdge(), localcgs.getValue(), localcgs.getReferentId(), localcgs.getReferentEdge());

        this.cwN = true;
        setNeedsToPreProcess();
      }
    }
  }

  public boolean bb(int paramInt)
  {
    boolean bool = super.bb(paramInt);

    if (this.cwN) {
      dRq localdRq = (dRq)getParentOfType(dRq.class);
      localdRq.cfM();
      this.cwN = false;
    }

    return bool;
  }

  public String toString()
  {
    return "[x=" + getX() + ", y=" + getY() + ", width=" + getWidth() + ", height=" + getHeight() + "]";
  }
}