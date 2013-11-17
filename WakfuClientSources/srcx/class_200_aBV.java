import java.awt.Color;
import org.apache.log4j.Logger;

public class aBV extends cDG
{
  private static Logger K = Logger.getLogger(aBV.class);
  private String hi;
  private char[] dWi;
  private int dWj;
  private P dQn = null;
  private bMR dWk = null;
  private Color dWl = null;
  private boolean dWm = false;
  private boolean dWn = false;
  private boolean dWo = true;
  private boolean dWp = true;

  public aBV()
  {
    a(cUE.kHp);
  }

  public int aOb()
  {
    return this.hi.length();
  }

  public String getText()
  {
    return this.hi;
  }

  public char[] aOc() {
    return this.dWi;
  }

  public void setText(String paramString)
  {
    if ((paramString != null) && (paramString.startsWith("\n")))
    {
      paramString = paramString.substring(1);
    }
    this.hi = paramString;
    if (paramString != null)
      this.dWi = this.hi.toCharArray();
    else
      this.dWi = null;
  }

  public ckA aOd()
  {
    return (ckA)this.ixc;
  }

  public P aOe()
  {
    if ((this.dQn == null) && (aOd() != null))
    {
      return aOd().aOe();
    }
    return this.dQn;
  }

  public void b(P paramP)
  {
    this.dQn = paramP;
  }

  public bMR aOf()
  {
    return this.dWk;
  }

  public void a(bMR parambMR)
  {
    this.dWk = parambMR;
  }

  public int aOg() {
    return this.dWj;
  }

  public void lM(int paramInt) {
    this.dWj = paramInt;
  }

  public Color getColor()
  {
    if ((this.dWl == null) && (aOd() != null))
    {
      return aOd().getColor();
    }
    return this.dWl;
  }

  public void setColor(Color paramColor)
  {
    this.dWl = paramColor;
  }

  public boolean isUnderline()
  {
    if ((this.dWo) && (aOd() != null))
    {
      return aOd().isUnderline();
    }
    return this.dWm;
  }

  public void setUnderline(boolean paramBoolean)
  {
    this.dWm = paramBoolean;
    this.dWo = false;
  }

  public boolean aOh() {
    if ((this.dWp) && (aOd() != null))
    {
      return aOd().aOh();
    }
    return this.dWn;
  }

  public void df(boolean paramBoolean) {
    this.dWn = paramBoolean;
    this.dWp = false;
  }

  public int a(P paramP, int paramInt)
  {
    double d = 0.0D;
    P localP = aOe();
    if ((localP == null) && (paramP != null))
    {
      localP = paramP;
    }

    if (localP != null)
    {
      String str = this.hi;
      for (int i = 0; i < str.length(); i++)
      {
        char c = str.charAt(i);

        int j = localP.a(c);
        if (d + j >= paramInt)
        {
          return i;
        }
        d += j;
      }
    }

    return -1;
  }

  public int b(P paramP, int paramInt)
  {
    String str = this.hi.substring(0, paramInt);
    P localP = aOe();
    if ((localP == null) && (paramP != null))
    {
      localP = paramP;
    }

    if (localP != null)
    {
      return localP.f(str);
    }

    return 0;
  }

  public int c(P paramP, int paramInt)
  {
    String str = this.hi.substring(0, paramInt);
    P localP = aOe();
    if ((localP == null) && (paramP != null))
    {
      localP = paramP;
    }

    if (localP != null)
    {
      return localP.f(str);
    }

    return 0;
  }

  public String toString()
  {
    return this.hi;
  }
}