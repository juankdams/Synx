import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.apache.log4j.Logger;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class bpA
  implements crm
{
  protected static final Logger K = Logger.getLogger(bpA.class);
  private DocumentBuilder fJU;
  private Document fJV;
  private OutputStream fJW = null;

  private static final bpA fJX = new bpA();

  public static bpA byM() {
    return fJX;
  }

  public bpA() {
    try {
      this.fJU = DocumentBuilderFactory.newInstance().newDocumentBuilder();
    } catch (ParserConfigurationException localParserConfigurationException) {
      K.error("Exception", localParserConfigurationException);
    }
  }

  public void iy(String paramString)
  {
    try
    {
      InputStream localInputStream = dtb.pT(paramString);
      i(localInputStream);
      localInputStream.close();
    }
    catch (Exception localException) {
      File localFile = new File(paramString);
      if (localFile.exists()) {
        try {
          this.fJV = this.fJU.parse(localFile);
        } catch (SAXException localSAXException) {
          this.fJU = DocumentBuilderFactory.newInstance().newDocumentBuilder();
          throw localSAXException;
        }
        if (this.fJV == null)
          throw new Exception("Impossible de parser le document " + paramString);
      }
      else {
        this.fJV = null;
        throw new FileNotFoundException("Fichier non trouvé : " + paramString);
      }
    }
  }

  public void i(InputStream paramInputStream)
  {
    this.fJV = this.fJU.parse(paramInputStream);
  }

  public boolean iz(String paramString) {
    File localFile1 = new File(paramString);
    File localFile2 = localFile1.getParentFile();
    boolean bool = (localFile2.mkdirs()) && (localFile1.createNewFile());
    this.fJW = new FileOutputStream(paramString);
    return bool;
  }

  public void e(OutputStream paramOutputStream) {
    this.fJW = paramOutputStream;
  }

  public void close()
  {
    this.fJV = null;
  }

  public void a(bwZ parambwZ, cdJ[] paramArrayOfcdJ)
  {
    try
    {
      if (this.fJV == null) {
        K.error("read() invoqué sur un document non ouvert ( voir : open() )");
        return;
      }

      parambwZ.bEy();

      Node localNode = this.fJV.getFirstChild();
      while ((localNode != null) && (localNode.getNodeType() != 1)) {
        localNode = localNode.getNextSibling();
      }

      CC localCC = a(localNode, paramArrayOfcdJ);
      if (localCC != null) {
        parambwZ.b(localCC);
      }

      parambwZ.bEz();
    }
    catch (Exception localException) {
      parambwZ.jj("Exception : " + localException.getMessage());
      K.error("Exception", localException);
    }
  }

  private static String a(String paramString, cdJ[] paramArrayOfcdJ) {
    if ((paramArrayOfcdJ != null) && (paramArrayOfcdJ.length > 0)) {
      for (cdJ localcdJ : paramArrayOfcdJ) {
        String str = localcdJ.kR(paramString);
        if (str != null) {
          return str;
        }
      }
    }
    return paramString;
  }

  private CC a(Node paramNode, cdJ[] paramArrayOfcdJ) {
    if (paramNode == null) {
      return null;
    }

    String str1 = a(paramNode.getNodeName(), paramArrayOfcdJ);
    String str2 = a(paramNode.getNodeValue(), paramArrayOfcdJ);

    CC localCC = new CC(str1, str2);

    NamedNodeMap localNamedNodeMap = paramNode.getAttributes();
    if (localNamedNodeMap != null) {
      for (int i = 0; i < localNamedNodeMap.getLength(); i++) {
        Node localNode2 = localNamedNodeMap.item(i);
        str1 = a(localNode2.getNodeName(), paramArrayOfcdJ);
        str2 = a(localNode2.getNodeValue(), paramArrayOfcdJ);

        localCC.c(new dvw(str1, str2));
      }

    }

    Node localNode1 = paramNode.getFirstChild();
    while (localNode1 != null) {
      localCC.a(a(localNode1, paramArrayOfcdJ));
      localNode1 = localNode1.getNextSibling();
    }

    return localCC;
  }

  public void b(bwZ parambwZ)
  {
    b(parambwZ, true);
  }

  public void b(bwZ parambwZ, boolean paramBoolean)
  {
    if (parambwZ == null) {
      return;
    }

    parambwZ.bEA();
    try
    {
      if (paramBoolean)
        d(parambwZ);
      else
        c(parambwZ);
    }
    catch (TransformerException localTransformerException) {
      K.error("Probleme pendant la sauvegarde d'un fichier XML.", localTransformerException);
    }

    parambwZ.bEB();
  }

  private void c(bwZ parambwZ) {
    Document localDocument = this.fJU.newDocument();

    Node localNode = a(parambwZ.bEx(), localDocument);
    localDocument.appendChild(localNode);

    Transformer localTransformer = TransformerFactory.newInstance().newTransformer();

    DOMSource localDOMSource = new DOMSource(localDocument);
    StreamResult localStreamResult = new StreamResult(this.fJW);
    localTransformer.transform(localDOMSource, localStreamResult);
  }

  private static Node a(K paramK, Document paramDocument) {
    if (paramK == null) {
      return null;
    }

    Node localNode1 = b(paramK, paramDocument);

    for (K localK : paramK.getChildren()) {
      Node localNode2 = a(localK, paramDocument);

      localNode1.appendChild(localNode2);
    }

    return localNode1;
  }

  private static Node b(K paramK, Document paramDocument) {
    String str1 = paramK.getName();
    String str2 = paramK.getStringValue();

    if (str1.equals("#text")) {
      return paramDocument.createTextNode(str2);
    }
    if (str1.equals("#comment")) {
      return paramDocument.createComment(str2);
    }
    if (str1.equals("#cdata-section")) {
      return paramDocument.createCDATASection(str2);
    }

    Element localElement = paramDocument.createElement(str1);

    for (K localK : paramK.aj()) {
      Attr localAttr = paramDocument.createAttribute(localK.getName());
      localAttr.setValue(localK.getStringValue());

      localElement.setAttributeNode(localAttr);
    }
    return localElement;
  }

  private void d(bwZ parambwZ) {
    CC localCC = parambwZ.bEx();
    try
    {
      a(this.fJW, "UTF-8");
      if (localCC != null) {
        a(localCC, this.fJW, "UTF-8", 0);
      }

      this.fJW.close();
      this.fJW = null;
    } catch (Exception localException) {
      parambwZ.jj("Exception : " + localException.getMessage());
      K.error("Exception", localException);
    }
  }

  private static void a(OutputStream paramOutputStream, String paramString) {
    paramOutputStream.write(("<?xml version=\"1.0\" encoding=\"" + paramString + "\"?>\r\n").getBytes(paramString));
  }

  private void a(K paramK, OutputStream paramOutputStream, String paramString, int paramInt) {
    if (paramK == null) {
      return;
    }

    y(paramK);

    String str1 = paramK.getName();
    String str2 = paramK.getStringValue();

    StringBuffer localStringBuffer = new StringBuffer();
    for (int i = 0; i < paramInt; i++) {
      localStringBuffer.append("\t");
    }
    String str3 = localStringBuffer.toString();

    if (str1.equals("#text"))
    {
      paramOutputStream.write(str3.getBytes(paramString));
      paramOutputStream.write(str2.getBytes(paramString));
      paramOutputStream.write("\r\n".getBytes(paramString));
    } else if (str1.equals("#comment")) {
      paramOutputStream.write(str3.getBytes(paramString));
      paramOutputStream.write("<!--".getBytes(paramString));
      paramOutputStream.write(str2.getBytes(paramString));
      paramOutputStream.write("-->".getBytes(paramString));
    } else if (str1.equals("#cdata-section")) {
      paramOutputStream.write(str3.getBytes(paramString));
      paramOutputStream.write("<![CDATA[".getBytes(paramString));
      paramOutputStream.write(str2.getBytes(paramString));
      paramOutputStream.write("]]>\n".getBytes(paramString));
    }
    else {
      paramOutputStream.write(str3.getBytes(paramString));
      paramOutputStream.write("<".getBytes(paramString));
      paramOutputStream.write(str1.getBytes(paramString));
      a(paramK, paramOutputStream, paramString);
      int j = !paramK.getChildren().isEmpty() ? 1 : 0;
      int k = (paramK.getStringValue() != null) && (!paramK.getStringValue().equals("")) ? 1 : 0;
      if ((j == 0) && (k == 0)) {
        paramOutputStream.write("/".getBytes(paramString));
      }
      if (k == 0)
        paramOutputStream.write(">\r\n".getBytes(paramString));
      else {
        paramOutputStream.write(">".getBytes(paramString));
      }

      for (K localK : paramK.getChildren()) {
        a(localK, paramOutputStream, paramString, paramInt + 1);
      }
      if (paramK.getStringValue() != null) {
        paramOutputStream.write(paramK.getStringValue().trim().getBytes(paramString));
      }

      if (j != 0) {
        paramOutputStream.write(str3.getBytes(paramString));
      }
      if ((j != 0) || (k != 0)) {
        paramOutputStream.write("</".getBytes(paramString));
        paramOutputStream.write(str1.getBytes(paramString));
        paramOutputStream.write(">\r\n".getBytes(paramString));
      }
    }
  }

  private static void y(K paramK) {
    String str = paramK.getName();
    if (str.equals("#text"))
      paramK.a(paramK.getStringValue().replaceAll("[\n\t]", ""));
  }

  private static void a(K paramK, OutputStream paramOutputStream, String paramString)
  {
    if (paramK == null) {
      return;
    }

    for (K localK : paramK.aj()) {
      String str1 = localK.getName();
      String str2 = localK.getStringValue();

      paramOutputStream.write(" ".getBytes(paramString));
      paramOutputStream.write(str1.getBytes(paramString));
      paramOutputStream.write("=\"".getBytes(paramString));
      paramOutputStream.write(str2 != null ? str2.getBytes(paramString) : "".getBytes());
      paramOutputStream.write("\"".getBytes(paramString));
    }
  }

  public bwZ byN()
  {
    return new bwZ();
  }

  public void a(bwZ parambwZ, String paramString) {
    if (parambwZ == null) {
      return;
    }

    CC localCC = parambwZ.bEx();

    parambwZ.bEA();
    try
    {
      a(this.fJW, "UTF-8");
      this.fJW.write(paramString.getBytes("UTF-8"));
      if (localCC != null) {
        a(localCC, this.fJW, "UTF-8", 0);
      }

      this.fJW.close();
      this.fJW = null;
    } catch (Exception localException) {
      parambwZ.jj("Exception : " + localException.getMessage());
      K.error("Exception", localException);
      return;
    }

    parambwZ.bEB();
  }
}