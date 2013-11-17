import java.util.ResourceBundle;

public class bln
  implements dBv
{
  public static final String fCf = "key";
  public static final String fCg = "effect";
  public static final String cgO = "text";
  public static final String fCh = "isBind";
  private final String[] bF = { "key", "effect", "text", "isBind" };
  private ckW fCi;

  public bln(ckW paramckW)
  {
    this.fCi = paramckW;
  }

  public String[] getFields() {
    return this.bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("key"))
    {
      switch (this.fCi.getKeyCode()) {
      case -1:
        str = bU.fH().getString("unassignedShortcutKey");
        break;
      case 9:
        str = "Tab";
        break;
      default:
        str = getKeyText(this.fCi.getKeyCode());
      }

      String str = str.startsWith("Unknown") ? bU.fH().getString("unknown") : str;
      if (this.fCi.cmL()) {
        str = getKeyText(16) + " + " + str;
      }
      if (this.fCi.cmK()) {
        str = getKeyText(18) + " + " + str;
      }
      if (this.fCi.cmJ()) {
        str = getKeyText(17) + " + " + str;
      }
      return str;
    }if (paramString.equals("effect"))
      return bwp();
    if (paramString.equals("text"))
      return getText();
    if (paramString.equals("isBind")) {
      return Boolean.valueOf("binding".equals(bwq()));
    }
    return null;
  }

  public void a(String paramString, Object paramObject) {
  }

  public void b(String paramString, Object paramObject) {
  }

  public void c(String paramString, Object paramObject) {
  }

  public boolean l(String paramString) {
    return false;
  }

  public int bwn() {
    return this.fCi.getKeyCode();
  }

  public String getId() {
    return this.fCi.getId();
  }

  public ckW bwo() {
    return this.fCi;
  }

  public int getModifiersEx() {
    return this.fCi.cmO();
  }

  public String bwp() {
    return bU.fH().getString("shortcutEffect." + ("binding".equals(bwq()) ? "binding" : getId()));
  }

  public String bwq()
  {
    return this.fCi.bwq();
  }

  public String getText() {
    return this.fCi.cmP();
  }

  public String toString()
  {
    return getText();
  }

  public static String getKeyText(int paramInt) {
    if (((paramInt >= 48) && (paramInt <= 57)) || ((paramInt >= 65) && (paramInt <= 90)))
    {
      return String.valueOf((char)paramInt);
    }

    ResourceBundle localResourceBundle = ResourceBundle.getBundle("sun.awt.resources.awt", bU.fH().ajJ().cAZ());
    switch (paramInt) {
    case 10:
      return localResourceBundle.getString("AWT.enter");
    case 8:
      return localResourceBundle.getString("AWT.backSpace");
    case 9:
      return localResourceBundle.getString("AWT.tab");
    case 3:
      return localResourceBundle.getString("AWT.cancel");
    case 12:
      return localResourceBundle.getString("AWT.clear");
    case 65312:
      return localResourceBundle.getString("AWT.compose");
    case 19:
      return localResourceBundle.getString("AWT.pause");
    case 20:
      return localResourceBundle.getString("AWT.capsLock");
    case 27:
      return localResourceBundle.getString("AWT.escape");
    case 32:
      return localResourceBundle.getString("AWT.space");
    case 33:
      return localResourceBundle.getString("AWT.pgup");
    case 34:
      return localResourceBundle.getString("AWT.pgdn");
    case 35:
      return localResourceBundle.getString("AWT.end");
    case 36:
      return localResourceBundle.getString("AWT.home");
    case 37:
      return localResourceBundle.getString("AWT.left");
    case 38:
      return localResourceBundle.getString("AWT.up");
    case 39:
      return localResourceBundle.getString("AWT.right");
    case 40:
      return localResourceBundle.getString("AWT.down");
    case 65368:
      return localResourceBundle.getString("AWT.begin");
    case 16:
      return localResourceBundle.getString("AWT.shift");
    case 17:
      return localResourceBundle.getString("AWT.control");
    case 18:
      return localResourceBundle.getString("AWT.alt");
    case 157:
      return localResourceBundle.getString("AWT.meta");
    case 65406:
      return localResourceBundle.getString("AWT.altGraph");
    case 44:
      return localResourceBundle.getString("AWT.comma");
    case 46:
      return localResourceBundle.getString("AWT.period");
    case 47:
      return localResourceBundle.getString("AWT.slash");
    case 59:
      return localResourceBundle.getString("AWT.semicolon");
    case 61:
      return localResourceBundle.getString("AWT.equals");
    case 91:
      return localResourceBundle.getString("AWT.openBracket");
    case 92:
      return localResourceBundle.getString("AWT.backSlash");
    case 93:
      return localResourceBundle.getString("AWT.closeBracket");
    case 106:
      return localResourceBundle.getString("AWT.multiply");
    case 107:
      return localResourceBundle.getString("AWT.add");
    case 108:
      return localResourceBundle.getString("AWT.separator");
    case 109:
      return localResourceBundle.getString("AWT.subtract");
    case 110:
      return localResourceBundle.getString("AWT.decimal");
    case 111:
      return localResourceBundle.getString("AWT.divide");
    case 127:
      return localResourceBundle.getString("AWT.delete");
    case 144:
      return localResourceBundle.getString("AWT.numLock");
    case 145:
      return localResourceBundle.getString("AWT.scrollLock");
    case 524:
      return localResourceBundle.getString("AWT.windows");
    case 525:
      return localResourceBundle.getString("AWT.context");
    case 112:
      return localResourceBundle.getString("AWT.f1");
    case 113:
      return localResourceBundle.getString("AWT.f2");
    case 114:
      return localResourceBundle.getString("AWT.f3");
    case 115:
      return localResourceBundle.getString("AWT.f4");
    case 116:
      return localResourceBundle.getString("AWT.f5");
    case 117:
      return localResourceBundle.getString("AWT.f6");
    case 118:
      return localResourceBundle.getString("AWT.f7");
    case 119:
      return localResourceBundle.getString("AWT.f8");
    case 120:
      return localResourceBundle.getString("AWT.f9");
    case 121:
      return localResourceBundle.getString("AWT.f10");
    case 122:
      return localResourceBundle.getString("AWT.f11");
    case 123:
      return localResourceBundle.getString("AWT.f12");
    case 61440:
      return localResourceBundle.getString("AWT.f13");
    case 61441:
      return localResourceBundle.getString("AWT.f14");
    case 61442:
      return localResourceBundle.getString("AWT.f15");
    case 61443:
      return localResourceBundle.getString("AWT.f16");
    case 61444:
      return localResourceBundle.getString("AWT.f17");
    case 61445:
      return localResourceBundle.getString("AWT.f18");
    case 61446:
      return localResourceBundle.getString("AWT.f19");
    case 61447:
      return localResourceBundle.getString("AWT.f20");
    case 61448:
      return localResourceBundle.getString("AWT.f21");
    case 61449:
      return localResourceBundle.getString("AWT.f22");
    case 61450:
      return localResourceBundle.getString("AWT.f23");
    case 61451:
      return localResourceBundle.getString("AWT.f24");
    case 154:
      return localResourceBundle.getString("AWT.printScreen");
    case 155:
      return localResourceBundle.getString("AWT.insert");
    case 156:
      return localResourceBundle.getString("AWT.help");
    case 192:
      return localResourceBundle.getString("AWT.backQuote");
    case 222:
      return localResourceBundle.getString("AWT.quote");
    case 224:
      return localResourceBundle.getString("AWT.up");
    case 225:
      return localResourceBundle.getString("AWT.down");
    case 226:
      return localResourceBundle.getString("AWT.left");
    case 227:
      return localResourceBundle.getString("AWT.right");
    case 128:
      return localResourceBundle.getString("AWT.deadGrave");
    case 129:
      return localResourceBundle.getString("AWT.deadAcute");
    case 130:
      return localResourceBundle.getString("AWT.deadCircumflex");
    case 131:
      return localResourceBundle.getString("AWT.deadTilde");
    case 132:
      return localResourceBundle.getString("AWT.deadMacron");
    case 133:
      return localResourceBundle.getString("AWT.deadBreve");
    case 134:
      return localResourceBundle.getString("AWT.deadAboveDot");
    case 135:
      return localResourceBundle.getString("AWT.deadDiaeresis");
    case 136:
      return localResourceBundle.getString("AWT.deadAboveRing");
    case 137:
      return localResourceBundle.getString("AWT.deadDoubleAcute");
    case 138:
      return localResourceBundle.getString("AWT.deadCaron");
    case 139:
      return localResourceBundle.getString("AWT.deadCedilla");
    case 140:
      return localResourceBundle.getString("AWT.deadOgonek");
    case 141:
      return localResourceBundle.getString("AWT.deadIota");
    case 142:
      return localResourceBundle.getString("AWT.deadVoicedSound");
    case 143:
      return localResourceBundle.getString("AWT.deadSemivoicedSound");
    case 150:
      return localResourceBundle.getString("AWT.ampersand");
    case 151:
      return localResourceBundle.getString("AWT.asterisk");
    case 152:
      return localResourceBundle.getString("AWT.quoteDbl");
    case 153:
      return localResourceBundle.getString("AWT.Less");
    case 160:
      return localResourceBundle.getString("AWT.greater");
    case 161:
      return localResourceBundle.getString("AWT.braceLeft");
    case 162:
      return localResourceBundle.getString("AWT.braceRight");
    case 512:
      return localResourceBundle.getString("AWT.at");
    case 513:
      return localResourceBundle.getString("AWT.colon");
    case 514:
      return localResourceBundle.getString("AWT.circumflex");
    case 515:
      return localResourceBundle.getString("AWT.dollar");
    case 516:
      return localResourceBundle.getString("AWT.euro");
    case 517:
      return localResourceBundle.getString("AWT.exclamationMark");
    case 518:
      return localResourceBundle.getString("AWT.invertedExclamationMark");
    case 519:
      return localResourceBundle.getString("AWT.leftParenthesis");
    case 520:
      return localResourceBundle.getString("AWT.numberSign");
    case 45:
      return localResourceBundle.getString("AWT.minus");
    case 521:
      return localResourceBundle.getString("AWT.plus");
    case 522:
      return localResourceBundle.getString("AWT.rightParenthesis");
    case 523:
      return localResourceBundle.getString("AWT.underscore");
    case 24:
      return localResourceBundle.getString("AWT.final");
    case 28:
      return localResourceBundle.getString("AWT.convert");
    case 29:
      return localResourceBundle.getString("AWT.noconvert");
    case 30:
      return localResourceBundle.getString("AWT.accept");
    case 31:
      return localResourceBundle.getString("AWT.modechange");
    case 21:
      return localResourceBundle.getString("AWT.kana");
    case 25:
      return localResourceBundle.getString("AWT.kanji");
    case 240:
      return localResourceBundle.getString("AWT.alphanumeric");
    case 241:
      return localResourceBundle.getString("AWT.katakana");
    case 242:
      return localResourceBundle.getString("AWT.hiragana");
    case 243:
      return localResourceBundle.getString("AWT.fullWidth");
    case 244:
      return localResourceBundle.getString("AWT.halfWidth");
    case 245:
      return localResourceBundle.getString("AWT.romanCharacters");
    case 256:
      return localResourceBundle.getString("AWT.allCandidates");
    case 257:
      return localResourceBundle.getString("AWT.previousCandidate");
    case 258:
      return localResourceBundle.getString("AWT.codeInput");
    case 259:
      return localResourceBundle.getString("AWT.japaneseKatakana");
    case 260:
      return localResourceBundle.getString("AWT.japaneseHiragana");
    case 261:
      return localResourceBundle.getString("AWT.japaneseRoman");
    case 262:
      return localResourceBundle.getString("AWT.kanaLock");
    case 263:
      return localResourceBundle.getString("AWT.inputMethodOnOff");
    case 65481:
      return localResourceBundle.getString("AWT.again");
    case 65483:
      return localResourceBundle.getString("AWT.undo");
    case 65485:
      return localResourceBundle.getString("AWT.copy");
    case 65487:
      return localResourceBundle.getString("AWT.paste");
    case 65489:
      return localResourceBundle.getString("AWT.cut");
    case 65488:
      return localResourceBundle.getString("AWT.find");
    case 65482:
      return localResourceBundle.getString("AWT.props");
    case 65480:
      return localResourceBundle.getString("AWT.stop");
    }

    if ((paramInt >= 96) && (paramInt <= 105)) {
      str = localResourceBundle.getString("AWT.numpad");
      char c = (char)(paramInt - 96 + 48);
      return str + "-" + c;
    }

    String str = localResourceBundle.getString("AWT.unknown");
    return str + " keyCode: 0x" + Integer.toString(paramInt, 16);
  }
}