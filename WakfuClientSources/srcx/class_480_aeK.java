import java.awt.geom.AffineTransform;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.CubicCurve2D.Double;
import java.awt.geom.PathIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class aeK
  implements aCV
{
  public static final double POSITIVE_INFINITY = (1.0D / 0.0D);
  private static final AffineTransform transform = new AffineTransform();
  private static final Comparator bEa = new lE();

  private final ArrayList cWn = new ArrayList();
  private final CubicCurve2D cWo = new CubicCurve2D.Double();
  private final double[] coords = new double[6];
  private String m_name;
  private double cWp;
  private double cWq;
  private double cWr;
  private double cWs;
  private double cWt;
  private double cWu;

  public aeK(String paramString, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4)
  {
    this.m_name = paramString;
    a(paramDouble1, paramDouble2, paramDouble3, paramDouble4);
    reset();
  }

  public aeK(String paramString) {
    this(paramString, 0.0D, 1.0D, 0.0D, 1.0D);
  }

  public double aqq() {
    return this.cWt;
  }

  public double aqr() {
    return this.cWu;
  }

  public void b(double paramDouble1, double paramDouble2) {
    this.cWt = paramDouble1;
    this.cWu = paramDouble2;
  }

  public void setName(String paramString) {
    this.m_name = paramString;
  }

  public String getName() {
    return this.m_name;
  }

  public void a(bJP parambJP) {
    this.cWn.add(parambJP);
  }

  public void a(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4) {
    this.cWp = paramDouble1;
    this.cWr = paramDouble2;
    this.cWq = paramDouble3;
    this.cWs = paramDouble4;
  }

  public double aqs()
  {
    return this.cWp;
  }

  public double aqt() {
    return this.cWq;
  }

  public double aqu() {
    return this.cWr;
  }

  public double aqv() {
    return this.cWs;
  }

  public boolean c(double paramDouble1, double paramDouble2)
  {
    return (this.cWp <= paramDouble1) && (paramDouble1 <= this.cWr) && (this.cWq <= paramDouble2) && (paramDouble2 <= this.cWs);
  }

  void reset()
  {
    this.cWn.clear();

    bJP localbJP = new bJP(this.cWp, this.cWs);
    this.cWn.add(localbJP);

    localbJP = new bJP(this.cWr, this.cWs);
    this.cWn.add(localbJP);

    sort();
  }

  public float au(float paramFloat) {
    return (float)f(paramFloat);
  }

  public double e(double paramDouble) {
    if (paramDouble < ((bJP)this.cWn.get(0)).getX()) {
      return ((bJP)this.cWn.get(0)).getY();
    }
    for (int i = 1; i < this.cWn.size(); i++) {
      if (paramDouble < ((bJP)this.cWn.get(i)).getX()) {
        return a((bJP)this.cWn.get(i - 1), (bJP)this.cWn.get(i), paramDouble);
      }
    }
    return ((bJP)this.cWn.get(this.cWn.size() - 1)).getY();
  }

  public double f(double paramDouble) {
    double d = e(paramDouble);
    if (d < this.cWq)
      return this.cWq;
    if (d > this.cWs)
      return this.cWs;
    return d;
  }

  public PathIterator b(bJP parambJP1, bJP parambJP2) {
    this.cWo.setCurve(parambJP1.getX(), parambJP1.getY(), parambJP1.bRt(), parambJP1.bRu(), parambJP2.bRr(), parambJP2.bRs(), parambJP2.getX(), parambJP2.getY());

    return this.cWo.getPathIterator(transform, 0.01D);
  }

  private double a(bJP parambJP1, bJP parambJP2, double paramDouble) {
    PathIterator localPathIterator = b(parambJP1, parambJP2);
    double d1 = parambJP1.getX();
    double d2 = parambJP1.getY();

    while (!localPathIterator.isDone()) {
      localPathIterator.currentSegment(this.coords);
      localPathIterator.next();
      if (paramDouble < this.coords[0]) {
        d3 = (paramDouble - d1) / (this.coords[0] - d1);
        return bCO.e(d2, this.coords[1], d3);
      }
      d1 = this.coords[0];
      d2 = this.coords[1];
    }
    double d3 = (paramDouble - d1) / (parambJP2.getX() - d1);
    return bCO.e(d2, parambJP2.getY(), d3);
  }

  public boolean b(bJP parambJP) {
    if (this.cWn.size() == 2) {
      return false;
    }
    for (int i = this.cWn.size() - 1; i >= 0; i--) {
      if (this.cWn.get(i) == parambJP) {
        if (i == this.cWn.size() - 1) {
          ((bJP)this.cWn.get(i - 1)).D(1.0D);
        }
        if (i == 0) {
          ((bJP)this.cWn.get(1)).D(0.0D);
        }
        this.cWn.remove(i);
        break;
      }
    }
    return true;
  }

  public int c(bJP parambJP) {
    for (int i = 0; i < this.cWn.size(); i++) {
      if (this.cWn.get(i) == parambJP)
        return i;
    }
    return -1;
  }

  public void sort() {
    Collections.sort(this.cWn, bEa);
  }

  public bJP hO(int paramInt)
  {
    return (bJP)this.cWn.get(paramInt);
  }

  public int size() {
    return this.cWn.size();
  }

  public void clear()
  {
    this.cWn.clear();
  }

  public aeK aqw() {
    aeK localaeK = new aeK("");
    localaeK.b(this);
    return localaeK;
  }

  public void b(aeK paramaeK)
  {
    this.m_name = paramaeK.m_name;
    clear();
    this.cWp = paramaeK.cWp;
    this.cWr = paramaeK.cWr;
    this.cWq = paramaeK.cWq;
    this.cWs = paramaeK.cWs;
    for (int i = 0; i < paramaeK.size(); i++)
      a(paramaeK.hO(i).bRz());
  }

  public void scale(float paramFloat1, float paramFloat2)
  {
    if ((paramFloat1 == this.cWp) && (paramFloat2 == this.cWr))
      return;
    double d1 = (paramFloat2 - paramFloat1) / (this.cWr - this.cWp);
    double d2 = paramFloat1 - this.cWp * d1;

    for (int i = 0; i < size(); i++) {
      bJP localbJP = hO(i);

      localbJP.h(localbJP.getX() * d1 + d2, localbJP.getY());
      if (localbJP.bRw()) {
        localbJP.i(localbJP.bRr() * d1 + d2, localbJP.bRs());
      }
      if (localbJP.bRx()) {
        localbJP.j(localbJP.bRt() * d1 + d2, localbJP.bRu());
      }
    }
    this.cWp = paramFloat1;
    this.cWr = paramFloat2;
  }

  public void c(aeK paramaeK) {
    if (paramaeK == this)
      return;
    clear();

    double d1 = this.cWs == (1.0D / 0.0D) ? 1.0D : this.cWs;
    double d2 = this.cWq == (1.0D / 0.0D) ? 1.0D : this.cWq;
    double d3 = paramaeK.cWr - paramaeK.cWp;
    double d4 = (this.cWr - this.cWp) / d3;

    double d5 = paramaeK.cWs - paramaeK.cWq;
    double d6 = (d1 - this.cWq) / d5;

    double d7 = this.cWp - paramaeK.cWp * d4;
    double d8 = this.cWq - paramaeK.cWq * d6;

    for (int i = 0; i < paramaeK.size(); i++) {
      bJP localbJP = paramaeK.hO(i).bRz();

      localbJP.h(localbJP.getX() * d4 + d7, localbJP.getY() * d6 + d8);
      if (localbJP.bRw()) {
        localbJP.i(localbJP.bRr() * d4 + d7, localbJP.bRs() * d6 + d8);
      }
      if (localbJP.bRx()) {
        localbJP.j(localbJP.bRt() * d4 + d7, localbJP.bRu() * d6 + d8);
      }

      a(localbJP);
    }
  }

  public boolean d(aeK paramaeK) {
    if (paramaeK.size() != size())
      return false;
    if ((this.cWp != paramaeK.cWp) || (this.cWr != paramaeK.cWr))
      return false;
    if ((this.cWq != paramaeK.cWq) || (this.cWs != paramaeK.cWs))
      return false;
    for (int i = 0; i < size(); i++) {
      if (!hO(i).d(paramaeK.hO(i)))
        return false;
    }
    return true;
  }

  public boolean sc()
  {
    for (int i = 0; i < this.cWn.size() - 1; i++) {
      bJP localbJP = (bJP)this.cWn.get(i);
      double d = localbJP.getY();
      if (d != ((bJP)this.cWn.get(i + 1)).getY()) {
        return false;
      }
      if ((localbJP.bRw()) && (localbJP.bRs() != d))
        return false;
      if ((localbJP.bRx()) && (localbJP.bRu() != d))
        return false;
    }
    return true;
  }

  public boolean isIdentity() {
    for (int i = 0; i < this.cWn.size(); i++) {
      bJP localbJP = (bJP)this.cWn.get(i);
      if (localbJP.getX() != localbJP.getY())
        return false;
      if (localbJP.bRw())
        return false;
      if (localbJP.bRx())
        return false;
    }
    return true;
  }

  public double[] aqx()
  {
    double[] arrayOfDouble = { (1.0D / 0.0D), (-1.0D / 0.0D) };

    for (int i = 0; i < this.cWn.size() - 1; i++) {
      bJP localbJP1 = (bJP)this.cWn.get(i);
      bJP localbJP2 = (bJP)this.cWn.get(i + 1);
      PathIterator localPathIterator = b(localbJP1, localbJP2);
      while (!localPathIterator.isDone()) {
        localPathIterator.currentSegment(this.coords);
        localPathIterator.next();
        if (this.coords[1] < arrayOfDouble[0])
          arrayOfDouble[0] = this.coords[1];
        if (this.coords[1] > arrayOfDouble[1])
          arrayOfDouble[1] = this.coords[1];
      }
    }
    return arrayOfDouble;
  }

  public String toString()
  {
    return Zh.a(this);
  }
}