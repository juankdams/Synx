import java.util.HashMap;

public final class bkj
{
  private static final String bdh = "@(#) $RCSfile: Namespace.java,v $ $Revision: 1.41 $ $Date: 2004/02/27 11:32:57 $ $Name: jdom_1_0 $";
  private static HashMap fAE;
  public static final bkj fAF = new bkj("", "");

  public static final bkj fAG = new bkj("xml", "http://www.w3.org/XML/1998/namespace");
  private String prefix;
  private String uri;

  static
  {
    fAE = new HashMap();

    fAE.put("&", fAF);
    fAE.put("xml&http://www.w3.org/XML/1998/namespace", 
      fAG);
  }

  private bkj(String paramString1, String paramString2)
  {
    this.prefix = paramString1;
    this.uri = paramString2;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject instanceof bkj)) {
      return this.uri.equals(((bkj)paramObject).uri);
    }
    return false;
  }

  public static bkj it(String paramString)
  {
    return aa("", paramString);
  }

  public static bkj aa(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString1.trim().equals(""))) {
      paramString1 = "";
    }
    if ((paramString2 == null) || (paramString2.trim().equals(""))) {
      paramString2 = "";
    }

    String str1 = 64 + 
      paramString1 + '&' + paramString2;
    bkj localbkj1 = (bkj)fAE.get(str1);
    if (localbkj1 != null)
      return localbkj1;
    String str2;
    if ((str2 = asE.fy(paramString1)) != null) {
      throw new cCz(paramString1, "Namespace prefix", str2);
    }
    if ((str2 = asE.fz(paramString2)) != null) {
      throw new cCz(paramString2, "Namespace URI", str2);
    }

    if ((!paramString1.equals("")) && (paramString2.equals(""))) {
      throw new cCz("", "namespace", 
        "Namespace URIs must be non-null and non-empty Strings");
    }

    if (paramString1.equals("xml")) {
      throw new cCz(paramString1, "Namespace prefix", 
        "The xml prefix can only be bound to http://www.w3.org/XML/1998/namespace");
    }

    if (paramString2.equals("http://www.w3.org/XML/1998/namespace")) {
      throw new cCz(paramString2, "Namespace URI", 
        "The http://www.w3.org/XML/1998/namespace must be bound to the xml prefix.");
    }

    bkj localbkj2 = new bkj(paramString1, paramString2);
    fAE.put(str1, localbkj2);
    return localbkj2;
  }

  public String getPrefix()
  {
    return this.prefix;
  }

  public String getURI()
  {
    return this.uri;
  }

  public int hashCode()
  {
    return this.uri.hashCode();
  }

  public String toString()
  {
    return "[Namespace: prefix \"" + this.prefix + "\" is mapped to URI \"" + 
      this.uri + "\"]";
  }
}