import org.xml.sax.AttributeList;
import org.xml.sax.DocumentHandler;
import org.xml.sax.SAXParseException;

class abP extends cIT
{
  private wZ aOL;

  public abP(si paramsi, DocumentHandler paramDocumentHandler)
  {
    super(paramsi, paramDocumentHandler);
  }

  public void a(String paramString, AttributeList paramAttributeList)
  {
    Object localObject1 = null;
    Object localObject2 = "";
    Object localObject3 = null;
    Object localObject4 = null;
    Object localObject5 = null;
    Object localObject6 = null;

    for (int i = 0; i < paramAttributeList.getLength(); i++) {
      String str1 = paramAttributeList.getName(i);
      String str2 = paramAttributeList.getValue(i);

      if (str1.equals("name")) {
        localObject1 = str2;
        if (localObject1.equals("")) {
          throw new cJ("name attribute must not be empty", new aaA(si.b(this.iGV)));
        }
      }
      else if (str1.equals("depends")) {
        localObject2 = str2;
      } else if (str1.equals("if")) {
        localObject3 = str2;
      } else if (str1.equals("unless")) {
        localObject4 = str2;
      } else if (str1.equals("id")) {
        localObject5 = str2;
      } else if (str1.equals("description")) {
        localObject6 = str2;
      } else {
        throw new SAXParseException("Unexpected attribute \"" + str1 + "\"", si.b(this.iGV));
      }

    }

    if (localObject1 == null) {
      throw new SAXParseException("target element appears without a name attribute", si.b(this.iGV));
    }

    this.aOL = new wZ();

    this.aOL.bh("");

    this.aOL.setName(localObject1);
    this.aOL.L(localObject3);
    this.aOL.M(localObject4);
    this.aOL.setDescription(localObject6);
    si.c(this.iGV).a(localObject1, this.aOL);

    if ((localObject5 != null) && (!localObject5.equals(""))) {
      si.c(this.iGV).g(localObject5, this.aOL);
    }

    if (((String)localObject2).length() > 0)
      this.aOL.bg((String)localObject2);
  }

  public void startElement(String paramString, AttributeList paramAttributeList)
  {
    si.b(this.iGV, this, this.aOL, paramString, paramAttributeList);
  }
}