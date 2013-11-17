import java.io.File;
import org.xml.sax.AttributeList;
import org.xml.sax.DocumentHandler;
import org.xml.sax.SAXParseException;

class zN extends cIT
{
  public zN(si paramsi, DocumentHandler paramDocumentHandler)
  {
    super(paramsi, paramDocumentHandler);
  }

  public void a(String paramString, AttributeList paramAttributeList)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4 = null;

    for (int i = 0; i < paramAttributeList.getLength(); i++) {
      String str1 = paramAttributeList.getName(i);
      String str2 = paramAttributeList.getValue(i);

      if (str1.equals("default"))
        localObject1 = str2;
      else if (str1.equals("name"))
        localObject2 = str2;
      else if (str1.equals("id"))
        localObject3 = str2;
      else if (str1.equals("basedir"))
        localObject4 = str2;
      else {
        throw new SAXParseException("Unexpected attribute \"" + paramAttributeList.getName(i) + "\"", si.b(this.iGV));
      }

    }

    if ((localObject1 != null) && (!localObject1.equals("")))
      si.c(this.iGV).bK(localObject1);
    else {
      throw new cJ("The default attribute is required");
    }

    if (localObject2 != null) {
      si.c(this.iGV).setName(localObject2);
      si.c(this.iGV).g(localObject2, si.c(this.iGV));
    }

    if (localObject3 != null) {
      si.c(this.iGV).g(localObject3, si.c(this.iGV));
    }

    if (si.c(this.iGV).getProperty("basedir") != null) {
      si.c(this.iGV).K(si.c(this.iGV).getProperty("basedir"));
    }
    else if (localObject4 == null) {
      si.c(this.iGV).K(si.d(this.iGV).getAbsolutePath());
    }
    else if (new File(localObject4).isAbsolute()) {
      si.c(this.iGV).K(localObject4);
    } else {
      File localFile = si.yH().e(si.d(this.iGV), localObject4);

      si.c(this.iGV).w(localFile);
    }

    si.c(this.iGV).a("", si.f(this.iGV));
  }

  public void startElement(String paramString, AttributeList paramAttributeList)
  {
    if (paramString.equals("target"))
      b(paramString, paramAttributeList);
    else
      si.b(this.iGV, this, si.f(this.iGV), paramString, paramAttributeList);
  }

  private void b(String paramString, AttributeList paramAttributeList)
  {
    new abP(this.iGV, this).a(paramString, paramAttributeList);
  }
}