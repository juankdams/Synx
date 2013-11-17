public class dRS
  implements iw
{
  private EJ biH = null;
  private boolean mnL = false;

  public void a(EJ paramEJ) {
    this.biH = paramEJ;
  }

  public String ql()
  {
    return null;
  }

  public bhj qm()
  {
    this.mnL = false;

    StringBuffer localStringBuffer1 = new StringBuffer();
    StringBuffer localStringBuffer2 = new StringBuffer();

    int i = 0; int j = 0;
    char c;
    while ((c = this.biH.NG()) != 65535)
    {
      localStringBuffer2.append(c);
      if (c == '<')
      {
        if ((i == 0) && (j == 0))
        {
          if (this.biH.NH() == '!')
          {
            this.biH.NG();

            if (this.biH.NH() == '-')
            {
              while (this.biH.NG() == '-');
            }
            else
            {
              this.mnL = true;
            }

          }
          else
          {
            localStringBuffer1.append(c);
          }

        }
        else
        {
          localStringBuffer1.append(c);
        }
      }
      else if (c == '\'')
      {
        if (i != 0) i = 0; else {
          i = 1;
        }
        localStringBuffer1.append(c);
      }
      else if (c == '"')
      {
        if (j != 0) j = 0; else {
          j = 1;
        }
        localStringBuffer1.append(c);
      }
      else if (c == '>')
      {
        if ((i == 0) && (j == 0))
        {
          if (this.mnL)
            break;
          if (this.biH.getChar(this.biH.NE() - 2) == '-')
          {
            break;
          }

          localStringBuffer1.append(c);
        }
        else
        {
          localStringBuffer1.append(c);
        }
      }
      else if (c == '-')
      {
        if ((i != 0) || (j != 0))
        {
          localStringBuffer1.append(c);
        }
        else
        {
          int k = this.biH.NE();
          int m = 0; int n = 5;

          while ((this.biH.getChar(k++) != '>') && (m++ < n));
          if (m >= n)
          {
            localStringBuffer1.append(c);
          }
        }

      }
      else
      {
        localStringBuffer1.append(c);
      }

    }

    dcm localdcm = new dcm();
    localdcm.oQ(localStringBuffer2.toString());

    return localdcm;
  }
}