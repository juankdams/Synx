public class cMh
  implements iw
{
  private EJ biH = null;
  private bHH krs = bHH.gGh;
  private cJt krt = null;
  private char kru = '0';
  private String krv = "";

  public void a(EJ paramEJ)
  {
    this.biH = paramEJ;
  }

  public void cDA() {
    this.krs = bHH.gGh;
    this.krv = "";
    this.kru = '0';
  }

  public String ql()
  {
    return null;
  }

  public cfr cFk()
  {
    cDA();

    this.krt = new cJt();
    this.krt.cDA();
    do
    {
      if (this.krs == bHH.gGh)
      {
        this.kru = this.biH.NG();
        if (this.kru == '<')
        {
          this.krs = bHH.gGi;
        }
      }
      else if (this.krs == bHH.gGi)
      {
        this.kru = this.biH.NG();
        cFl();
      }
      else if (this.krs == bHH.gGr)
      {
        this.krt.nw(this.krv);

        return this.krt;
      }
    }
    while (this.krs != bHH.gGr);

    this.krt.nw(this.krv);

    return this.krt;
  }

  private void cFl()
  {
    do {
      if (this.krs == bHH.gGi)
      {
        if (this.kru == '/')
        {
          this.krt.ik(true);
        }
        else if (Character.isLetterOrDigit(this.kru))
        {
          this.krs = bHH.gGk;
          this.krv += this.kru;
        }

      }
      else if (this.krs == bHH.gGk)
      {
        if (Character.isLetterOrDigit(this.kru))
        {
          this.krs = bHH.gGk;
          this.krv += this.kru;
        }
        else if (this.krv.length() > 0)
        {
          if (this.kru == ' ')
          {
            this.krs = bHH.gGl;
            cFm();
            break;
          }
          if (this.kru == '>')
          {
            this.krs = bHH.gGr;
            break;
          }
          if (this.kru == '/')
          {
            this.krt.ik(true);
          }
        }

      }

    }

    while (((this.kru = this.biH.NG()) != 65535) && (this.krs != bHH.gGl) && (this.krs != bHH.gGr));
  }

  private void cFm()
  {
    String str = "";

    while ((this.krs != bHH.gGr) && ((this.kru = this.biH.NH()) != 65535))
    {
      if (this.krs == bHH.gGl)
      {
        this.biH.NG();
        if (Character.isLetterOrDigit(this.kru))
        {
          str = str + this.kru;
          this.krs = bHH.gGm;
        }
        else if (this.kru != ' ')
        {
          if (this.kru == '/')
          {
            this.krt.il(true);
          }
          else if (this.kru == '>')
          {
            this.krs = bHH.gGr;
          }
        }
      }
      else if (this.krs == bHH.gGm)
      {
        this.biH.NG();
        if (Character.isLetterOrDigit(this.kru))
        {
          str = str + this.kru;
        }
        else if (this.kru == ' ')
        {
          this.krs = bHH.gGn;
        }
        else if (this.kru == '=')
        {
          this.krs = bHH.gGo;

          this.krt.addAttribute(str, cFn());
        }
        else if (this.kru == '>')
        {
          this.krs = bHH.gGr;

          this.krt.addAttribute(str, null);
        }

      }
      else if (this.krs == bHH.gGq)
      {
        if (Character.isLetterOrDigit(this.kru))
        {
          this.krs = bHH.gGm;

          cFm();
        }
        else
        {
          if (this.kru == '>')
          {
            this.biH.NG();
            this.krs = bHH.gGr;
            return;
          }

          this.biH.NG();
        }
      }
      else if (this.krs == bHH.gGn)
      {
        if (this.kru == '=')
        {
          this.biH.NG();
          this.krs = bHH.gGo;

          this.krt.addAttribute(str, cFn());
        } else {
          if (this.kru == '>')
          {
            this.biH.NG();
            this.krs = bHH.gGr;

            this.krt.addAttribute(str, null);
            return;
          }
          if (Character.isLetterOrDigit(this.kru))
          {
            this.krt.addAttribute(str, null);

            this.krs = bHH.gGm;
            cFm();
          }
          else
          {
            this.biH.NG();
          }
        }
      }
    }
  }

  private String cFn()
  {
    int i = 0; int j = 0;
    StringBuffer localStringBuffer = new StringBuffer();
    while ((this.kru = this.biH.NG()) != 65535)
    {
      if (this.krs == bHH.gGo)
      {
        if (this.kru == '\'')
        {
          i = 1;
          this.krs = bHH.gGp;
        }
        else if (this.kru == '"')
        {
          j = 1;
          this.krs = bHH.gGp;
        }
        else if (this.kru != ' ')
        {
          localStringBuffer.append(this.kru);
          this.krs = bHH.gGp;
        }
      }
      else if (this.krs == bHH.gGp)
      {
        if (this.kru == ' ')
        {
          if ((i != 0) || (j != 0))
          {
            localStringBuffer.append(this.kru);
          }
          else
          {
            this.krs = bHH.gGq;
            return localStringBuffer.toString();
          }
        }
        else if (this.kru == '\'')
        {
          if (i != 0)
          {
            this.krs = bHH.gGq;
            return localStringBuffer.toString();
          }

          localStringBuffer.append(this.kru);
        }
        else if (this.kru == '"')
        {
          if (j != 0)
          {
            this.krs = bHH.gGq;
            return localStringBuffer.toString();
          }

          localStringBuffer.append(this.kru);
        }
        else {
          if (this.kru == '>')
          {
            this.krs = bHH.gGr;
            return localStringBuffer.toString();
          }

          localStringBuffer.append(this.kru);
        }
      }
    }
    return localStringBuffer.toString();
  }
}