import java.util.ArrayList;
import org.apache.log4j.Logger;

class cec
  implements buF
{
  cec(djm paramdjm)
  {
  }

  public void a(djm paramdjm, boolean paramBoolean)
  {
    if ((!paramdjm.isVisible()) || (!paramdjm.bYk())) {
      return;
    }

    if (paramBoolean) {
      if (this.hyp.krb) {
        dOc localdOc = bsP.getInstance().getMouseOver();
        if ((localdOc != null) && (localdOc != bsP.getInstance())) {
          return;
        }
        String str1 = ((cMb)paramdjm.vK()).getName();
        String str2 = this.hyp.cSk();
        if (str2 != null) {
          str1 = str1 + str2;
        }

        if (str1 == null) {
          str1 = "erreur le texte est null";
          djm.an().error("Le text est null, ce qui veut certainement dire que l initialisation de l'objet n a pas eu lieu ou s est mal passé.");
        }

        dD localdD = new dD(paramdjm, ((cMb)paramdjm.vK()).cFa(), this.hyp.hA());
        lZ locallZ;
        if ((paramdjm.vK() instanceof czr)) {
          locallZ = new lZ();
          str1 = locallZ.tz().a(str1).tA().tP();
          localdD.c(str1, null);
          ArrayList localArrayList = ((czr)paramdjm.vK()).cwk().dbW();
          for (BG localBG : localArrayList) {
            locallZ = new lZ();
            locallZ.a(localBG.getName()).a(" x").o(localBG.Hy().goO);
            locallZ.tH();
            locallZ.bw(localBG.Hv()).a(" §");
            localdD.c(locallZ.tP(), localBG.getItem().fJ());
          }
        } else {
          localdD.c(str1, null);
        }
        cjO.clE().j(localdD);
      }

      if (this.hyp.apP())
        beo.c(paramdjm);
    }
    else {
      daO.cML().a(paramdjm);
      beo.e(paramdjm);
    }
  }
}