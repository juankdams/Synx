import org.xml.sax.DocumentHandler;

class dSi extends cIT
{
  public dSi(si paramsi, DocumentHandler paramDocumentHandler)
  {
    super(paramsi, paramDocumentHandler);
  }

  public void characters(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    String str1 = new String(paramArrayOfChar, paramInt1, paramInt2);
    String str2 = si.c(this.iGV).getDescription();
    if (str2 == null)
      si.c(this.iGV).setDescription(str1);
    else
      si.c(this.iGV).setDescription(str2 + str1);
  }
}