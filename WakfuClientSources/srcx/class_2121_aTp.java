import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import org.apache.log4j.Logger;

public class aTp extends aWd
{
  public static final String TAG = "TextEditor";
  protected String eQO = null;
  protected String eQP = null;
  protected boolean eQQ = false;

  public static final int eQR = "autoHorizontalScrolled".hashCode();
  public static final int eQS = "maxChars".hashCode();
  public static final int eQT = "maxCharacters".hashCode();
  public static final int eQU = "password".hashCode();
  public static final int eQV = "restrict".hashCode();
  public static final int eQW = "editable".hashCode();
  public static final int eQX = "unicodeRestrict".hashCode();
  public static final int eQY = "ghostText".hashCode();

  public void appendText(String paramString)
  {
    if (paramString == null) {
      paramString = "";
    }

    if (this.lzM != null) {
      this.lzM += paramString;
    } else {
      if (this.eQO == null) {
        this.eQO = "";
      }

      this.eQO += paramString;
    }
    setNeedsToPreProcess();
  }

  public String getTag() {
    return "TextEditor";
  }

  public void setText(Object paramObject)
  {
    super.setText(paramObject);
    if ((paramObject == null) || ((this.eQP != null) && (!paramObject.equals(this.eQP))))
      this.eQQ = false;
    this.eQO = null;
  }

  public void setSelectable(boolean paramBoolean)
  {
    super.setSelectable(true);
  }

  public int getMaxCharacters()
  {
    return getTextBuilder().bYe().getMaxCharacters();
  }

  public void setMaxCharacters(int paramInt)
  {
    getTextBuilder().bYe().setMaxCharacters(paramInt);
  }

  public void setMaxChars(int paramInt)
  {
    setMaxCharacters(paramInt);
  }

  public int getMaxChars()
  {
    return getMaxCharacters();
  }

  public String getRestrict()
  {
    return getTextBuilder().bYe().getRestrict();
  }

  public void setRestrict(String paramString)
  {
    getTextBuilder().bYe().setRestrict(paramString);
  }

  public boolean getUnicodeRestrict()
  {
    return getTextBuilder().bYe().aFn();
  }

  public void setUnicodeRestrict(boolean paramBoolean)
  {
    getTextBuilder().bYe().setUnicodeRestrict(paramBoolean);
  }

  public boolean getPassword()
  {
    return getTextBuilder().bYe().aFm();
  }

  public void setPassword(boolean paramBoolean)
  {
    getTextBuilder().bYe().setPassword(paramBoolean);
  }

  public boolean getAutoHorizontalScrolled() {
    return getTextBuilder().bYc().booleanValue();
  }

  public void setAutoHorizontalScrolled(Boolean paramBoolean) {
    getTextBuilder().setAutoHorizontalScrolled(paramBoolean);
  }

  public void setEditable(boolean paramBoolean) {
    getTextBuilder().setEditable(paramBoolean);
  }

  public boolean getEditable()
  {
    return getTextBuilder().isEditable();
  }

  public String getText() {
    if (this.eQQ)
      return "";
    return super.getText();
  }

  public String getGhostText() {
    return this.eQP;
  }

  public void biL() {
    if ((this.eQP != null) && (this.eQP.length() > 0)) {
      setText(this.eQP);
      this.eQQ = true;
    }
  }

  public void setGhostText(String paramString) {
    this.eQP = paramString;
    biL();
  }

  public boolean bb(int paramInt)
  {
    biM();
    return super.bb(paramInt);
  }

  protected void biM() {
    if (this.eQO != null) {
      getTextBuilder().cC(this.eQO);
      this.eQO = null;
    }
  }

  protected void biN() {
    super.biN();
    if (zC.Ip().Iq() == this)
      biO();
  }

  public void ajj()
  {
    super.ajj();
    setFocusable(true);
  }

  public void aJ()
  {
    super.aJ();

    cwJ localcwJ = cwJ.checkOut();
    localcwJ.setWidget(this);
    a(localcwJ);

    setTextBuilder(new bRi(new KV()));
    getTextBuilder().a(this);

    getTextBuilder().setEditable(true);
    setSelectable(true);

    setAutoHorizontalScrolled(Boolean.valueOf(true));

    cvM localcvM = new cvM(this);
    this.lzK.a(localcvM);
    this.lzK.b(localcvM);
  }

  private void biO()
  {
    atq localatq = getTextBuilder().bYe();
    if (localatq.isEmpty())
    {
      getTextBuilder().aFi();
    }
    if (!localatq.aFy())
      if (isSelectOnFocus()) {
        selectAll();
      }
      else {
        ddB localddB = localatq.aFp();
        getTextBuilder().d(localddB, localddB.cms());
        getTextBuilder().bYg();
      }
  }

  protected void a(Gy paramGy)
  {
    super.a(paramGy);
    if ((paramGy.getFocused()) && (getTextBuilder().isEditable())) {
      biO();
      biP();
    }
  }

  protected boolean a(ctH paramctH)
  {
    if ((!paramctH.ey()) && (!paramctH.ez()) && (!paramctH.eB()) && (!paramctH.ex()) && (!Character.isIdentifierIgnorable(paramctH.getKeyChar())) && (paramctH.getKeyChar() != 65535))
    {
      bsP.getInstance().setKeyEventConsumed(true);
    }

    return super.a(paramctH);
  }

  protected boolean b(ctH paramctH)
  {
    if (super.b(paramctH)) {
      switch (paramctH.getKeyCode()) {
      case 127:
        bsP.getInstance().setKeyEventConsumed(true);
        return false;
      case 86:
        if (paramctH.ex())
        {
          Transferable localTransferable = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);
          try {
            if ((localTransferable != null) && (localTransferable.isDataFlavorSupported(DataFlavor.stringFlavor))) {
              String str = (String)localTransferable.getTransferData(DataFlavor.stringFlavor);
              if ((str != null) && (str.length() != 0))
                getTextBuilder().ko(str);
            }
          }
          catch (UnsupportedFlavorException localUnsupportedFlavorException) {
            K.debug("Problème au paste du texte");
          } catch (IOException localIOException) {
            K.debug("Problème au paste du texte");
          }
          bsP.getInstance().setKeyEventConsumed(true);
          return false;
        }
        break;
      case 88:
        if (paramctH.ex())
        {
          if (!getTextBuilder().bYe().aFm()) {
            blY();
            getTextBuilder().ko("");
          }
          bsP.getInstance().setKeyEventConsumed(true);
          return false;
        }
        break;
      case 65:
        if (paramctH.ex()) {
          selectAll();
          bsP.getInstance().setKeyEventConsumed(true);
          return false;
        }
        break;
      }

    }

    if ((!paramctH.ey()) && (!paramctH.ez()) && (!paramctH.eB()) && (!paramctH.ex()) && (!Character.isIdentifierIgnorable(paramctH.getKeyChar())) && (paramctH.getKeyChar() != 65535))
    {
      bsP.getInstance().setKeyEventConsumed(true);
    }

    return true;
  }

  protected boolean c(ctH paramctH)
  {
    if ((super.c(paramctH)) && (getTextBuilder().isEditable())) {
      switch (paramctH.getKeyChar())
      {
      case '\b':
        getTextBuilder().aFD();
        return false;
      case '':
        getTextBuilder().aFE();
        bsP.getInstance().setKeyEventConsumed(true);
        return false;
      case '\t':
        return false;
      case '\n':
        if (!getMultiline())
        {
          break;
        }
      default:
        getTextBuilder().ko(String.valueOf(paramctH.getKeyChar()));
        return false;
      }
    }

    return true;
  }

  public boolean isGhostTextVisible() {
    return this.eQQ;
  }

  private void biP() {
    if ((this.eQP == null) || (!this.eQQ))
      return;
    setTextImmediate("");
    this.eQQ = false;
  }

  public void c(bdj parambdj)
  {
    aTp localaTp = (aTp)parambdj;
    super.c(localaTp);
    localaTp.setMaxCharacters(getMaxCharacters());
    localaTp.setPassword(getPassword());
    localaTp.setAutoHorizontalScrolled(Boolean.valueOf(getAutoHorizontalScrolled()));
    localaTp.setRestrict(getRestrict());
    localaTp.setUnicodeRestrict(getUnicodeRestrict());
    if (this.eQO != null) {
      localaTp.eQO = this.eQO;
    }
    if (this.eQP != null)
      localaTp.setGhostText(getGhostText());
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == eQR)
      setAutoHorizontalScrolled(Boolean.valueOf(bUD.getBoolean(paramString)));
    else if ((paramInt == eQT) || (paramInt == eQS))
      setMaxCharacters(bUD.aR(paramString));
    else if (paramInt == eQU)
      setPassword(bUD.getBoolean(paramString));
    else if (paramInt == eQV)
      setRestrict(paramaKN.gL(paramString));
    else if (paramInt == eQW)
      setEditable(bUD.getBoolean(paramString));
    else if (paramInt == eQY)
      setGhostText(paramaKN.gL(paramString));
    else if (paramInt == eQX)
      setUnicodeRestrict(bUD.getBoolean(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == eQR)
      setAutoHorizontalScrolled(Boolean.valueOf(bUD.getBoolean(paramObject)));
    else if ((paramInt == eQT) || (paramInt == eQS))
      setMaxCharacters(bUD.aR(paramObject));
    else if (paramInt == eQU)
      setPassword(bUD.getBoolean(paramObject));
    else if (paramInt == eQV)
      setRestrict((String)paramObject);
    else if (paramInt == eQW)
      setEditable(bUD.getBoolean(paramObject));
    else if (paramInt == eQY)
      setGhostText((String)paramObject);
    else if (paramInt == eQX)
      setUnicodeRestrict(bUD.getBoolean(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }

  public boolean a(int paramInt, String paramString, aKN paramaKN) {
    if (paramInt == fyW)
      appendText(paramaKN.gL(paramString));
    else {
      return super.a(paramInt, paramString, paramaKN);
    }
    return true;
  }

  public boolean e(int paramInt, Object paramObject) {
    if (paramInt == fyW)
      appendText(String.valueOf(paramObject));
    else {
      return super.e(paramInt, paramObject);
    }
    return true;
  }
}