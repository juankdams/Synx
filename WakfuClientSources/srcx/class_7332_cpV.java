import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

public class cpV
  implements Cloneable
{
  private static final String bdh = "@(#) $RCSfile: XMLOutputter.java,v $ $Revision: 1.112 $ $Date: 2004/09/01 06:08:18 $ $Name: jdom_1_0 $";
  private dTO hZt = dTO.dtT();

  protected static final dTO hZu = dTO.dtT();

  protected dTO hZv = this.hZt;

  private boolean hZw = true;

  public cpV()
  {
  }

  public cpV(dTO paramdTO)
  {
    this.hZt = ((dTO)paramdTO.clone());
    this.hZv = this.hZt;
  }

  public cpV(cpV paramcpV)
  {
    this.hZt = ((dTO)paramcpV.hZt.clone());
    this.hZv = this.hZt;
  }

  public Object clone()
  {
    try
    {
      return super.clone();
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new RuntimeException(localCloneNotSupportedException.toString());
    }
  }

  private bAr cph()
  {
    return new bAr(this);
  }

  private boolean lK(String paramString)
  {
    if ((paramString != null) && 
      (paramString.length() > 0) && 
      (isWhitespace(paramString.charAt(paramString.length() - 1)))) {
      return true;
    }
    return false;
  }

  public String lL(String paramString)
  {
    bfL localbfL = this.hZv.mqU;

    StringBuffer localStringBuffer = null;
    for (int i = 0; i < paramString.length(); i++) {
      char c = paramString.charAt(i);
      String str;
      switch (c) {
      case '<':
        str = "&lt;";
        break;
      case '>':
        str = "&gt;";
        break;
      case '"':
        str = "&quot;";
        break;
      case '&':
        str = "&amp;";
        break;
      case '\r':
        str = "&#xD;";
        break;
      case '\t':
        str = "&#x9;";
        break;
      case '\n':
        str = "&#xA;";
        break;
      default:
        if (localbfL.d(c)) {
          str = "&#x" + Integer.toHexString(c) + ";";
        }
        else {
          str = null;
        }
        break;
      }
      if (localStringBuffer == null) {
        if (str != null)
        {
          localStringBuffer = new StringBuffer(paramString.length() + 20);

          localStringBuffer.append(paramString.substring(0, i));
          localStringBuffer.append(str);
        }

      }
      else if (str == null) {
        localStringBuffer.append(c);
      }
      else {
        localStringBuffer.append(str);
      }

    }

    return localStringBuffer == null ? paramString : localStringBuffer.toString();
  }

  public String lM(String paramString)
  {
    if (this.hZw == false) return paramString;

    bfL localbfL = this.hZv.mqU;

    StringBuffer localStringBuffer = null;
    for (int i = 0; i < paramString.length(); i++) {
      char c = paramString.charAt(i);
      String str;
      switch (c) {
      case '<':
        str = "&lt;";
        break;
      case '>':
        str = "&gt;";
        break;
      case '&':
        str = "&amp;";
        break;
      case '\r':
        str = "&#xD;";
        break;
      case '\n':
        str = this.hZv.mqO;
        break;
      default:
        if (localbfL.d(c)) {
          str = "&#x" + Integer.toHexString(c) + ";";
        }
        else {
          str = null;
        }
        break;
      }
      if (localStringBuffer == null) {
        if (str != null)
        {
          localStringBuffer = new StringBuffer(paramString.length() + 20);

          localStringBuffer.append(paramString.substring(0, i));
          localStringBuffer.append(str);
        }

      }
      else if (str == null) {
        localStringBuffer.append(c);
      }
      else {
        localStringBuffer.append(str);
      }

    }

    return localStringBuffer == null ? paramString : localStringBuffer.toString();
  }

  public dTO cpi()
  {
    return (dTO)this.hZt.clone();
  }

  private void a(Writer paramWriter, int paramInt)
  {
    if ((this.hZv.mqN == null) || 
      (this.hZv.mqN.equals(""))) {
      return;
    }

    for (int i = 0; i < paramInt; i++)
      paramWriter.write(this.hZv.mqN);
  }

  private boolean aY(Object paramObject)
  {
    String str = null;

    if ((paramObject instanceof String)) {
      str = (String)paramObject;
    }
    else if ((paramObject instanceof cDP)) {
      str = ((cDP)paramObject).getText();
    } else {
      if ((paramObject instanceof dHQ)) {
        return false;
      }

      return false;
    }

    for (int i = 0; i < str.length(); i++) {
      if (!isWhitespace(str.charAt(i)))
        return false;
    }
    return true;
  }

  private static boolean isWhitespace(char paramChar)
  {
    if ((paramChar == ' ') || (paramChar == '\n') || (paramChar == '\t') || (paramChar == '\r')) {
      return true;
    }
    return false;
  }

  private Writer f(OutputStream paramOutputStream)
  {
    return b(paramOutputStream, this.hZt.encoding);
  }

  private static Writer b(OutputStream paramOutputStream, String paramString)
  {
    if ("UTF-8".equals(paramString)) {
      paramString = "UTF8";
    }

    BufferedWriter localBufferedWriter = new BufferedWriter(
      new OutputStreamWriter(
      new BufferedOutputStream(paramOutputStream), paramString));

    return localBufferedWriter;
  }

  private void c(Writer paramWriter)
  {
    if (this.hZv.mqN != null)
      paramWriter.write(this.hZv.mqO);
  }

  private static int a(List paramList, int paramInt)
  {
    if (paramInt < 0) {
      paramInt = 0;
    }

    int i = paramInt;
    int j = paramList.size();
    while (i < j) {
      Object localObject = paramList.get(i);
      if ((!(localObject instanceof cDP)) && (!(localObject instanceof dHQ))) {
        return i;
      }
      i++;
    }
    return j;
  }

  public void a(List paramList, OutputStream paramOutputStream)
  {
    Writer localWriter = f(paramOutputStream);
    a(paramList, localWriter);
  }

  public void a(List paramList, Writer paramWriter)
  {
    a(paramWriter, paramList, 0, paramList.size(), 
      0, cph());
    paramWriter.flush();
  }

  public void a(cbG paramcbG, OutputStream paramOutputStream)
  {
    Writer localWriter = f(paramOutputStream);
    a(paramcbG, localWriter);
  }

  public void a(cbG paramcbG, Writer paramWriter)
  {
    a(paramWriter, paramcbG);
    paramWriter.flush();
  }

  public void a(cft paramcft, OutputStream paramOutputStream)
  {
    Writer localWriter = f(paramOutputStream);
    a(paramcft, localWriter);
  }

  public void a(cft paramcft, Writer paramWriter)
  {
    a(paramWriter, paramcft);
    paramWriter.flush();
  }

  public void a(tk paramtk, OutputStream paramOutputStream)
  {
    Writer localWriter = f(paramOutputStream);
    a(paramtk, localWriter);
  }

  public void a(tk paramtk, Writer paramWriter)
  {
    a(paramWriter, paramtk);
    paramWriter.flush();
  }

  public void a(aFz paramaFz, OutputStream paramOutputStream)
  {
    Writer localWriter = f(paramOutputStream);
    a(paramaFz, localWriter);
  }

  public void a(aFz paramaFz, Writer paramWriter)
  {
    a(paramWriter, paramaFz, this.hZt.encoding);

    List localList = paramaFz.getContent();
    int i = localList.size();
    for (int j = 0; j < i; j++) {
      Object localObject = localList.get(j);

      if ((localObject instanceof dRW)) {
        a(paramWriter, paramaFz.aRZ(), 0, 
          cph());
      }
      else if ((localObject instanceof cft)) {
        a(paramWriter, (cft)localObject);
      }
      else if ((localObject instanceof Re)) {
        a(paramWriter, (Re)localObject);
      }
      else if ((localObject instanceof tk)) {
        a(paramWriter, paramaFz.aRX());

        paramWriter.write(this.hZv.mqO);
      }

      c(paramWriter);
      a(paramWriter, 0);
    }

    paramWriter.write(this.hZv.mqO);

    paramWriter.flush();
  }

  public void a(dRW paramdRW, OutputStream paramOutputStream)
  {
    Writer localWriter = f(paramOutputStream);
    a(paramdRW, localWriter);
  }

  public void a(dRW paramdRW, Writer paramWriter)
  {
    a(paramWriter, paramdRW, 0, cph());
    paramWriter.flush();
  }

  public void a(dHQ paramdHQ, OutputStream paramOutputStream)
  {
    Writer localWriter = f(paramOutputStream);
    a(paramdHQ, localWriter);
  }

  public void a(dHQ paramdHQ, Writer paramWriter)
  {
    a(paramWriter, paramdHQ);
    paramWriter.flush();
  }

  public void a(Re paramRe, OutputStream paramOutputStream)
  {
    Writer localWriter = f(paramOutputStream);
    a(paramRe, localWriter);
  }

  public void a(Re paramRe, Writer paramWriter)
  {
    boolean bool = this.hZv.mqS;

    this.hZv.lz(true);
    a(paramWriter, paramRe);
    this.hZv.lz(bool);

    paramWriter.flush();
  }

  public void a(cDP paramcDP, OutputStream paramOutputStream)
  {
    Writer localWriter = f(paramOutputStream);
    a(paramcDP, localWriter);
  }

  public void a(cDP paramcDP, Writer paramWriter)
  {
    a(paramWriter, paramcDP);
    paramWriter.flush();
  }

  public void b(dRW paramdRW, OutputStream paramOutputStream)
  {
    Writer localWriter = f(paramOutputStream);
    b(paramdRW, localWriter);
  }

  public void b(dRW paramdRW, Writer paramWriter)
  {
    List localList = paramdRW.getContent();
    a(paramWriter, localList, 0, localList.size(), 
      0, cph());
    paramWriter.flush();
  }

  public String E(List paramList)
  {
    StringWriter localStringWriter = new StringWriter();
    try {
      a(paramList, localStringWriter); } catch (IOException localIOException) {
    }
    return localStringWriter.toString();
  }

  public String a(cbG paramcbG)
  {
    StringWriter localStringWriter = new StringWriter();
    try {
      a(paramcbG, localStringWriter); } catch (IOException localIOException) {
    }
    return localStringWriter.toString();
  }

  public String a(cft paramcft)
  {
    StringWriter localStringWriter = new StringWriter();
    try {
      a(paramcft, localStringWriter); } catch (IOException localIOException) {
    }
    return localStringWriter.toString();
  }

  public String b(tk paramtk)
  {
    StringWriter localStringWriter = new StringWriter();
    try {
      a(paramtk, localStringWriter); } catch (IOException localIOException) {
    }
    return localStringWriter.toString();
  }

  public String a(aFz paramaFz)
  {
    StringWriter localStringWriter = new StringWriter();
    try {
      a(paramaFz, localStringWriter); } catch (IOException localIOException) {
    }
    return localStringWriter.toString();
  }

  public String c(dRW paramdRW)
  {
    StringWriter localStringWriter = new StringWriter();
    try {
      a(paramdRW, localStringWriter); } catch (IOException localIOException) {
    }
    return localStringWriter.toString();
  }

  public String a(dHQ paramdHQ)
  {
    StringWriter localStringWriter = new StringWriter();
    try {
      a(paramdHQ, localStringWriter); } catch (IOException localIOException) {
    }
    return localStringWriter.toString();
  }

  public String a(Re paramRe)
  {
    StringWriter localStringWriter = new StringWriter();
    try {
      a(paramRe, localStringWriter); } catch (IOException localIOException) {
    }
    return localStringWriter.toString();
  }

  public String a(cDP paramcDP)
  {
    StringWriter localStringWriter = new StringWriter();
    try {
      a(paramcDP, localStringWriter); } catch (IOException localIOException) {
    }
    return localStringWriter.toString();
  }

  private void a(Writer paramWriter, dRW paramdRW, bAr parambAr)
  {
    List localList = paramdRW.dsN();
    if (localList != null)
      for (int i = 0; i < localList.size(); i++) {
        bkj localbkj = (bkj)localList.get(i);
        a(paramWriter, localbkj, parambAr);
      }
  }

  protected void a(Writer paramWriter, List paramList, dRW paramdRW, bAr parambAr)
  {
    for (int i = 0; i < paramList.size(); i++) {
      dbr localdbr = (dbr)paramList.get(i);
      bkj localbkj = localdbr.cNd();
      if ((localbkj != bkj.fAF) && 
        (localbkj != bkj.fAG)) {
        a(paramWriter, localbkj, parambAr);
      }

      paramWriter.write(" ");
      a(paramWriter, localdbr);
      paramWriter.write("=");

      paramWriter.write("\"");
      paramWriter.write(lL(localdbr.getValue()));
      paramWriter.write("\"");
    }
  }

  protected void a(Writer paramWriter, cbG paramcbG)
  {
    String str = 
      this.hZv.mqT == aFu.ebz ? 
      paramcbG.getText().trim() : this.hZv.mqT == aFu.ebA ? 
      paramcbG.czH() : 
      paramcbG.getText();
    paramWriter.write("<![CDATA[");
    paramWriter.write(str);
    paramWriter.write("]]>");
  }

  protected void a(Writer paramWriter, cft paramcft)
  {
    paramWriter.write("<!--");
    paramWriter.write(paramcft.getText());
    paramWriter.write("-->");
  }

  private void a(Writer paramWriter, List paramList, int paramInt1, int paramInt2, int paramInt3, bAr parambAr)
  {
    int k = paramInt1;
    while (k < paramInt2) {
      int i = k == paramInt1 ? 1 : 0;
      Object localObject = paramList.get(k);

      if (((localObject instanceof cDP)) || ((localObject instanceof dHQ))) {
        int j = b(paramList, k);

        k = a(paramList, j);

        if (j < k) {
          if (i == 0)
            c(paramWriter);
          a(paramWriter, paramInt3);
          a(paramWriter, paramList, j, k);
        }

      }
      else
      {
        if (i == 0) {
          c(paramWriter);
        }

        a(paramWriter, paramInt3);

        if ((localObject instanceof cft)) {
          a(paramWriter, (cft)localObject);
        }
        else if ((localObject instanceof dRW)) {
          a(paramWriter, (dRW)localObject, paramInt3, parambAr);
        }
        else if ((localObject instanceof Re)) {
          a(paramWriter, (Re)localObject);
        }

        k++;
      }
    }
  }

  protected void a(Writer paramWriter, aFz paramaFz, String paramString)
  {
    if (!this.hZt.mqP)
    {
      paramWriter.write("<?xml version=\"1.0\"");
      if (!this.hZt.mqQ) {
        paramWriter.write(" encoding=\"" + paramString + "\"");
      }
      paramWriter.write("?>");

      paramWriter.write(this.hZv.mqO);
    }
  }

  protected void a(Writer paramWriter, tk paramtk)
  {
    String str1 = paramtk.AJ();
    String str2 = paramtk.AK();
    String str3 = paramtk.getInternalSubset();
    int i = 0;

    paramWriter.write("<!DOCTYPE ");
    paramWriter.write(paramtk.getElementName());
    if (str1 != null) {
      paramWriter.write(" PUBLIC \"");
      paramWriter.write(str1);
      paramWriter.write("\"");
      i = 1;
    }
    if (str2 != null) {
      if (i == 0) {
        paramWriter.write(" SYSTEM");
      }
      paramWriter.write(" \"");
      paramWriter.write(str2);
      paramWriter.write("\"");
    }
    if ((str3 != null) && (!str3.equals(""))) {
      paramWriter.write(" [");
      paramWriter.write(this.hZv.mqO);
      paramWriter.write(paramtk.getInternalSubset());
      paramWriter.write("]");
    }
    paramWriter.write(">");
  }

  protected void a(Writer paramWriter, dRW paramdRW, int paramInt, bAr parambAr)
  {
    List localList1 = paramdRW.getAttributes();
    List localList2 = paramdRW.getContent();

    String str = null;
    if (localList1 != null) {
      str = paramdRW.h("space", 
        bkj.fAG);
    }

    dTO localdTO = this.hZv;

    if ("default".equals(str)) {
      this.hZv = this.hZt;
    }
    else if ("preserve".equals(str)) {
      this.hZv = hZu;
    }

    paramWriter.write("<");
    a(paramWriter, paramdRW);

    int i = parambAr.size();

    b(paramWriter, paramdRW, parambAr);

    a(paramWriter, paramdRW, parambAr);

    if (localList1 != null) {
      a(paramWriter, localList1, paramdRW, parambAr);
    }

    int j = b(localList2, 0);
    int k = localList2.size();
    if (j >= k)
    {
      if (this.hZv.mqR) {
        paramWriter.write("></");
        a(paramWriter, paramdRW);
        paramWriter.write(">");
      }
      else {
        paramWriter.write(" />");
      }
    }
    else {
      paramWriter.write(">");

      if (a(localList2, j) < k)
      {
        c(paramWriter);
        a(paramWriter, localList2, j, k, 
          paramInt + 1, parambAr);
        c(paramWriter);
        a(paramWriter, paramInt);
      }
      else
      {
        a(paramWriter, localList2, j, k);
      }
      paramWriter.write("</");
      a(paramWriter, paramdRW);
      paramWriter.write(">");
    }

    while (parambAr.size() > i) {
      parambAr.pop();
    }

    this.hZv = localdTO;
  }

  private void b(Writer paramWriter, dRW paramdRW, bAr parambAr)
  {
    bkj localbkj = paramdRW.cNd();
    if (localbkj == bkj.fAG) {
      return;
    }
    if ((localbkj != bkj.fAF) || 
      (parambAr.getURI("") != null))
      a(paramWriter, localbkj, parambAr);
  }

  protected void a(Writer paramWriter, dHQ paramdHQ)
  {
    paramWriter.write("&");
    paramWriter.write(paramdHQ.getName());
    paramWriter.write(";");
  }

  private void a(Writer paramWriter, bkj parambkj, bAr parambAr)
  {
    String str1 = parambkj.getPrefix();
    String str2 = parambkj.getURI();

    if (str2.equals(parambAr.getURI(str1))) {
      return;
    }

    paramWriter.write(" xmlns");
    if (!str1.equals("")) {
      paramWriter.write(":");
      paramWriter.write(str1);
    }
    paramWriter.write("=\"");
    paramWriter.write(str2);
    paramWriter.write("\"");
    parambAr.b(parambkj);
  }

  protected void a(Writer paramWriter, Re paramRe)
  {
    String str1 = paramRe.getTarget();
    int i = 0;

    if (this.hZv.mqS == false) {
      if (str1.equals("javax.xml.transform.disable-output-escaping")) {
        this.hZw = false;
        i = 1;
      }
      else if (str1.equals("javax.xml.transform.enable-output-escaping")) {
        this.hZw = true;
        i = 1;
      }
    }
    if (i == 0) {
      String str2 = paramRe.getData();

      if (!"".equals(str2)) {
        paramWriter.write("<?");
        paramWriter.write(str1);
        paramWriter.write(" ");
        paramWriter.write(str2);
        paramWriter.write("?>");
      }
      else {
        paramWriter.write("<?");
        paramWriter.write(str1);
        paramWriter.write("?>");
      }
    }
  }

  private void a(Writer paramWriter, dbr paramdbr)
  {
    String str = paramdbr.cNd().getPrefix();
    if ((str != null) && (!str.equals(""))) {
      paramWriter.write(str);
      paramWriter.write(58);
      paramWriter.write(paramdbr.getName());
    }
    else {
      paramWriter.write(paramdbr.getName());
    }
  }

  private void a(Writer paramWriter, dRW paramdRW)
  {
    if (paramdRW.cNd().getPrefix().length() == 0) {
      paramWriter.write(paramdRW.getName());
    }
    else {
      paramWriter.write(paramdRW.cNd().getPrefix());
      paramWriter.write(58);
      paramWriter.write(paramdRW.getName());
    }
  }

  private void a(Writer paramWriter, String paramString)
  {
    if (this.hZv.mqT == aFu.ebA) {
      paramString = cDP.nk(paramString);
    }
    else if (this.hZv.mqT == aFu.ebz) {
      paramString = paramString.trim();
    }
    paramWriter.write(lM(paramString));
  }

  protected void a(Writer paramWriter, cDP paramcDP)
  {
    String str = 
      this.hZv.mqT == aFu.ebz ? 
      paramcDP.getText().trim() : this.hZv.mqT == aFu.ebA ? 
      paramcDP.czH() : 
      paramcDP.getText();
    paramWriter.write(lM(str));
  }

  private void a(Writer paramWriter, List paramList, int paramInt1, int paramInt2)
  {
    Object localObject1 = null;

    paramInt1 = b(paramList, paramInt1);

    int i = paramList.size();
    if (paramInt1 < i)
    {
      paramInt2 = c(paramList, paramInt2);

      for (int j = paramInt1; j < paramInt2; j++) {
        Object localObject2 = paramList.get(j);
        String str;
        if ((localObject2 instanceof cDP)) {
          str = ((cDP)localObject2).getText();
        }
        else if ((localObject2 instanceof dHQ)) {
          str = "&" + ((dHQ)localObject2).getValue() + ";";
        }
        else {
          throw new IllegalStateException("Should see only CDATA, Text, or EntityRef");
        }

        if ((str != null) && (!"".equals(str)))
        {
          if ((localObject1 != null) && 
            ((this.hZv.mqT == aFu.ebA) || 
            (this.hZv.mqT == aFu.ebz)) && (
            (lK((String)localObject1)) || 
            (lN(str)))) {
            paramWriter.write(" ");
          }

          if ((localObject2 instanceof cbG)) {
            a(paramWriter, (cbG)localObject2);
          }
          else if ((localObject2 instanceof dHQ)) {
            a(paramWriter, (dHQ)localObject2);
          }
          else {
            a(paramWriter, str);
          }

          localObject1 = str;
        }
      }
    }
  }

  public void a(dTO paramdTO)
  {
    this.hZt = ((dTO)paramdTO.clone());
    this.hZv = this.hZt;
  }

  private int b(List paramList, int paramInt)
  {
    if (paramInt < 0) {
      paramInt = 0;
    }

    int i = paramInt;
    int j = paramList.size();
    if ((this.hZv.mqT != aFu.ebB) && 
      (this.hZv.mqT != aFu.ebA)) { if (this.hZv.mqT != aFu.ebz); }
    else while (i < j) {
        if (!aY(paramList.get(i))) {
          return i;
        }
        i++;
      }

    return i;
  }

  private int c(List paramList, int paramInt)
  {
    int i = paramList.size();
    if (paramInt > i) {
      paramInt = i;
    }

    int j = paramInt;
    if ((this.hZv.mqT != aFu.ebB) && 
      (this.hZv.mqT != aFu.ebA)) { if (this.hZv.mqT != aFu.ebz); }
    else while (j >= 0) {
        if (!aY(paramList.get(j - 1)))
          break;
        j--;
      }

    return j;
  }

  private boolean lN(String paramString)
  {
    if ((paramString != null) && 
      (paramString.length() > 0) && 
      (isWhitespace(paramString.charAt(0)))) {
      return true;
    }
    return false;
  }

  public String toString()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    for (int i = 0; i < this.hZt.mqO.length(); i++) {
      int j = this.hZt.mqO.charAt(i);
      switch (j) { case 13:
        localStringBuffer.append("\\r");
        break;
      case 10:
        localStringBuffer.append("\\n");
        break;
      case 9:
        localStringBuffer.append("\\t");
        break;
      case 11:
      case 12:
      default:
        localStringBuffer.append("[" + j + "]");
      }

    }

    return 
      "XMLOutputter[omitDeclaration = " + this.hZt.mqP + ", " + 
      "encoding = " + this.hZt.encoding + ", " + 
      "omitEncoding = " + this.hZt.mqQ + ", " + 
      "indent = '" + this.hZt.mqN + "'" + ", " + 
      "expandEmptyElements = " + this.hZt.mqR + ", " + 
      "lineSeparator = '" + localStringBuffer.toString() + "', " + 
      "textMode = " + this.hZt.mqT + "]";
  }
}