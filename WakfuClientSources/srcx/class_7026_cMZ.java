import com.ankamagames.wakfu.client.console.command.debug.anim.AnmDebuggerCommand;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class cMZ
{
  protected static final Logger K = Logger.getLogger(cMZ.class);
  public static final String PACKAGE = "wakfu.adminCharacterEditor";
  private static final ArrayList ksp = new ArrayList();
  private static final ArrayList ksq = new ArrayList();

  public static void openCharacterColorEditor(cSx paramcSx)
  {
    if (cBQ.cxL().mZ("adminCharacterEditorDialog")) {
      byz localbyz = byv.bFN().bFO();

      ksp.clear();
      ksq.clear();
      for (afi localafi : afi.values()) {
        aKG localaKG = new aKG(-1, bCO.bLk(), bCO.bLk(), bCO.bLk());
        if (localafi.aqQ())
          ksp.add(new bhE(localaKG, localafi));
        else {
          ksq.add(new bhE(localaKG, localafi));
        }
      }
      reloadAnmimation(null);
      dLE.doY().t("adminColors", ksp);
      dLE.doY().t("adminInactiveColors", ksq);

      cBQ.cxL().a("adminCharacterColorEditorDialog", VV.dJ("adminCharacterColorEditorDialog"), 1L, (short)10000);

      cBQ.cxL().mW("adminCharacterEditorDialog");
    } else {
      cBQ.cxL().a("adminCharacterEditorDialog", VV.dJ("adminCharacterEditorDialog"), 1L, (short)10000);

      cBQ.cxL().mW("adminCharacterColorEditorDialog");
      dLE.doY().removeProperty("adminAnimDirection");
      dLE.doY().removeProperty("adminAnimName");
      dLE.doY().removeProperty("adminColors");
      dLE.doY().removeProperty("adminInactiveColors");
    }
  }

  public static void loadAnmDebugger(cSx paramcSx) {
    if (cBQ.cxL().mZ("debugAnmDialog"))
      cBQ.cxL().mW("debugAnmDialog");
    else
      AnmDebuggerCommand.bCW();
  }

  public static void reloadAnmimation(cSx paramcSx)
  {
    byz localbyz = byv.bFN().bFO();
    cew localcew = localbyz.aeL();
    dLE.doY().a(localbyz, new String[] { "actorDescriptorLibrary" });
    dLE.doY().a(localbyz, new String[] { "actorEquipment" });
    dLE.doY().t("adminAnimDirection", Integer.valueOf(localcew.E().m_index));
    dLE.doY().t("adminAnimName", localcew.atp());
  }

  public static void deleteActiveColor(cSx paramcSx, bhE parambhE) {
    ksp.remove(parambhE);
    ksq.add(parambhE);
    dLE.doY().t("adminColors", null);
    dLE.doY().t("adminInactiveColors", null);
    dLE.doY().t("adminColors", ksp);
    dLE.doY().t("adminInactiveColors", ksq);
  }

  public static void activateColor(cSx paramcSx) {
    ddG localddG = (ddG)paramcSx.cIl().getElementMap().fi("comboColor");
    bhE localbhE = (bhE)localddG.getSelectedValue();
    ksq.remove(localbhE);
    ksp.add(localbhE);
    dLE.doY().t("adminColors", null);
    dLE.doY().t("adminInactiveColors", null);
    dLE.doY().t("adminColors", ksp);
    dLE.doY().t("adminInactiveColors", ksq);
  }

  public static void setFilterRed(bXo parambXo, bhE parambhE) {
    if (parambhE != null) {
      parambhE.bg(parambXo.getValue());
      parambhE.b((auC)parambXo.cIk().getElementMap().fi("localPlayerDisplay"));
    }
  }

  public static void setFilterGreen(bXo parambXo, bhE parambhE) {
    if (parambhE != null) {
      parambhE.bh(parambXo.getValue());
      parambhE.b((auC)parambXo.cIk().getElementMap().fi("localPlayerDisplay"));
    }
  }

  public static void setFilterBlue(bXo parambXo, bhE parambhE)
  {
    if (parambhE != null) {
      parambhE.bi(parambXo.getValue());
      parambhE.b((auC)parambXo.cIk().getElementMap().fi("localPlayerDisplay"));
    }
  }

  public static void setFilterRed(cSx paramcSx, aTp paramaTp, bhE parambhE)
  {
    if (paramaTp.getText().length() == 0) {
      return;
    }
    float f = bUD.getShort(paramaTp.getText()) / 255.0F;
    parambhE.bg(f);
    parambhE.b((auC)paramcSx.cIk().getElementMap().fi("localPlayerDisplay"));
  }

  public static void setFilterGreen(cSx paramcSx, aTp paramaTp, bhE parambhE)
  {
    if (paramaTp.getText().length() == 0) {
      return;
    }
    float f = bUD.getShort(paramaTp.getText()) / 255.0F;
    parambhE.bh(f);
    parambhE.b((auC)paramcSx.cIk().getElementMap().fi("localPlayerDisplay"));
  }

  public static void setFilterBlue(cSx paramcSx, aTp paramaTp, bhE parambhE)
  {
    if (paramcSx.mp() != CH.bGj)
      return;
    if (paramaTp.getText().length() == 0) {
      return;
    }
    float f = bUD.getShort(paramaTp.getText()) / 255.0F;
    parambhE.bi(f);
    parambhE.b((auC)paramcSx.cIk().getElementMap().fi("localPlayerDisplay"));
  }

  public static void applyColor(cSx paramcSx, bhE parambhE)
  {
    parambhE.b((auC)paramcSx.cIk().getElementMap().fi("localPlayerDisplay"));
  }

  private static final void h(cSx paramcSx) {
    biy localbiy = (biy)paramcSx.cIk().getElementMap().fi("applyColorButton");
    localbiy.setEnabled(true);
  }

  public static void validLevel(dMr paramdMr) {
    aTp localaTp = (aTp)cBQ.cxL().coO().nf("adminCharacterEditorDialog").fi("level");
    if ((localaTp == null) || (localaTp.getText() == null) || (localaTp.getText().length() == 0)) {
      return;
    }
    cyx localcyx = byv.bFN().aJK();
    if (localcyx == null) {
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
      return;
    }

    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)44);
    localaIG.bg(Short.parseShort(localaTp.getText()));
    localcyx.d(localaIG);
    acB();
  }

  public static void validSpellLevel(dMr paramdMr, apX paramapX, aTp paramaTp) {
    cyx localcyx = byv.bFN().aJK();
    if (localcyx == null) {
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
      return;
    }

    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)26);
    localaIG.mH(paramapX.ok());
    localaIG.bg(Short.parseShort(paramaTp.getText()));
    localcyx.d(localaIG);
    acB();
  }

  public static void learnSkill(dMr paramdMr, aIV paramaIV)
  {
    cyx localcyx = byv.bFN().aJK();
    if (localcyx == null) {
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
      return;
    }
    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)97);
    localaIG.mH(paramaIV.aER());
    localcyx.d(localaIG);

    acB();
  }

  public static void addSkillXp(dMr paramdMr, aIV paramaIV, aTp paramaTp) {
    cyx localcyx = byv.bFN().aJK();
    if (localcyx == null) {
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
      return;
    }
    long l = 0L;
    try {
      l = Long.parseLong(paramaTp.getText());
    } catch (Exception localException) {
      K.error("Exception", localException);
    }
    paramaTp.setText("0");
    aIG localaIG = new aIG();
    localaIG.bM((byte)3);
    localaIG.bf((short)99);
    localaIG.mH(paramaIV.aER());
    localaIG.dU(l);
    localcyx.d(localaIG);

    acB();
  }

  private static void acB()
  {
    dka.cSF().a(new bDA(), 1500L, 1);
  }
}