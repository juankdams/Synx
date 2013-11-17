public class cDP extends djh
{
  private static final String bdh = "@(#) $RCSfile: Text.java,v $ $Revision: 1.24 $ $Date: 2004/02/27 11:32:57 $ $Name: jdom_1_0 $";
  static final String EMPTY_STRING = "";
  protected String value;

  protected cDP()
  {
  }

  public cDP(String paramString)
  {
    kQ(paramString);
  }

  public void append(String paramString)
  {
    if (paramString == null)
      return;
    String str;
    if ((str = asE.fv(paramString)) != null) {
      throw new aim(paramString, "character content", str);
    }

    if (paramString == "")
      this.value = paramString;
    else this.value += paramString;
  }

  public void b(cDP paramcDP)
  {
    if (paramcDP == null) {
      return;
    }
    this.value += paramcDP.getText();
  }

  public Object clone()
  {
    cDP localcDP = (cDP)super.clone();
    localcDP.value = this.value;
    return localcDP;
  }

  public String getText()
  {
    return this.value;
  }

  public String czH()
  {
    return nk(getText());
  }

  public String czI()
  {
    return getText().trim();
  }

  public String getValue()
  {
    return this.value;
  }

  public static String nk(String paramString)
  {
    if (paramString == null) {
      return "";
    }
    char[] arrayOfChar1 = paramString.toCharArray();
    char[] arrayOfChar2 = new char[arrayOfChar1.length];
    int i = 1;
    int j = 0;
    for (int k = 0; k < arrayOfChar1.length; k++) {
      if (" \t\n\r".indexOf(arrayOfChar1[k]) != -1) {
        if (i == 0) {
          arrayOfChar2[(j++)] = ' ';
          i = 1;
        }
      }
      else {
        arrayOfChar2[(j++)] = arrayOfChar1[k];
        i = 0;
      }
    }
    if ((i != 0) && (j > 0)) {
      j--;
    }
    return new String(arrayOfChar2, 0, j);
  }

  public cDP kQ(String paramString)
  {
    if (paramString == null) {
      this.value = "";
      return this;
    }
    String str;
    if ((str = asE.fv(paramString)) != null) {
      throw new aim(paramString, "character content", str);
    }
    this.value = paramString;
    return this;
  }

  public String toString()
  {
    return 64 + 
      "[Text: " + 
      getText() + 
      "]";
  }
}