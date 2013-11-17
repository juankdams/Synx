public class aTw
  implements iw
{
  private EJ biH = null;
  private cfr eRB = null;

  void a(EJ paramEJ)
  {
    this.biH = paramEJ;
  }

  void a(cfr paramcfr) {
    this.eRB = paramcfr;
  }

  public String ql()
  {
    return null;
  }

  public bhj qm()
  {
    ctq localctq = new ctq();
    StringBuffer localStringBuffer = new StringBuffer();
    char c;
    while ((c = this.biH.NH()) != 65535)
    {
      if (c == '<')
      {
        if (this.eRB != null)
        {
          String str1 = this.eRB.getTagName();

          if (str1.equalsIgnoreCase(this.eRB.getTagName()))
          {
            int i = this.biH.NE() + 2;
            String str2 = this.biH.Y(i, i + ("/" + this.eRB.getTagName()).length());

            if ((str2.indexOf(this.eRB.getTagName().toLowerCase()) > -1) || (str2.indexOf(this.eRB.getTagName().toUpperCase()) > -1))
            {
              localctq.a(this.eRB);
              localctq.setValue(localStringBuffer.toString());
              return localctq;
            }

            localStringBuffer.append(c);
            this.biH.NG();
          }
          else {
            this.biH.NG();
          }
        }
        else
        {
          localctq.setValue(localStringBuffer.toString());
          return localctq;
        }
      }
      else
      {
        localStringBuffer.append(c);
        this.biH.NG();
      }
    }
    return localctq;
  }
}