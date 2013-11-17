public class bjX
  implements iw
{
  private String fAp = null;
  private EJ biH = null;
  private cfr biI = null;

  public void a(EJ paramEJ)
  {
    this.biH = paramEJ;
  }

  public void b(cfr paramcfr) {
    this.biI = paramcfr;
  }

  public String ql()
  {
    return null;
  }

  public clT buZ()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    this.fAp = "";
    int i = this.biH.NH();

    while ((i != 65535) && (i != 0))
    {
      if (i == 60)
      {
        if (this.biI != null)
        {
          localObject = this.biI.getTagName();
          if (((String)localObject).equalsIgnoreCase("script"))
          {
            int k = this.biH.NE() + 2;
            String str = this.biH.Y(k, k + "/script".length());

            if ((str.indexOf("script") > -1) || (str.indexOf("SCRIPT") > -1))
            {
              this.fAp = localStringBuffer.toString();

              break;
            }

            localStringBuffer.append(i);
            this.biH.NG();
          }

        }
        else
        {
          this.fAp = localStringBuffer.toString();

          break;
        }

      }
      else
      {
        localStringBuffer.append(i);
        this.biH.NG();
      }
      int j = this.biH.NH();
    }

    Object localObject = new uI();
    ((uI)localObject).aN(this.fAp);
    return localObject;
  }
}