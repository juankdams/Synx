package com.ankamagames.wakfu.client.console.command.commonIn;

import CM;
import Cs;
import Ou;
import aAx;
import aTp;
import aeF;
import ahB;
import atq;
import bRi;
import cBQ;
import cDA;
import cDG;
import coq;
import cpa;
import cth;
import dOc;
import dnc;
import drC;
import java.util.ArrayList;
import zC;

public class AutoCompleteContactCommand
  implements dnc
{
  public void a(cth paramcth, aeF paramaeF, ArrayList paramArrayList)
  {
    int i = aAx.aMd().aMi().auq();
    String str1 = drC.Bn(i);
    aTp localaTp = null;
    dOc localdOc = zC.Ip().Iq();
    if ((localdOc instanceof aTp))
      localaTp = (aTp)localdOc;
    else {
      localaTp = (aTp)cBQ.cxL().coO().nf(str1).fi("textEditorRenderableContainer.chatInput");
    }

    int j = localaTp.getTextBuilder().bYe().aFw();
    String str2 = localaTp.getText();
    int k = 1;
    if ((str2 != null) && (str2.length() > 0)) {
      ahB localahB = aAx.aMd().aMi();
      int m;
      int i1;
      String str4;
      Ou localOu;
      String str5;
      if ((localahB != null) && (CM.LV().LW().cqV().e(str2, (byte)127))) {
        k = 0;
        m = str2.indexOf(' ');
        if ((m != -1) && (m < str2.length())) {
          String str3 = str2.substring(m + 1);

          i1 = str3.lastIndexOf('"') + 1;
          if ((i1 == -1) || (str3.indexOf('"') == -1) || (str3.indexOf('"') == i1)) {
            i1 = str3.indexOf(' ');
          }
          if (i1 == -1) {
            i1 = str3.length();
          }

          if (j - (str2.length() - str3.length()) > i1) {
            k = 1;
          } else {
            str3 = str3.substring(0, i1);
            str4 = str3.replaceAll("\"", "");
            str4 = str4.trim();
            if ((str4 != null) && (str4.length() > 0)) {
              localOu = Ou.aaC();
              if ((localOu.aaG() == null) || (!localOu.cW(str4))) {
                localOu.cU(str4);
              }
              str5 = localOu.aaF();
              localaTp.setText(str2.replaceFirst(str3, "\"" + str5 + "\""));

              zC.Ip().e(localaTp);
            }
          }
        }
      }
      if ((k != 0) && (j != -1)) {
        m = 0;
        int n = str2.indexOf(' ', j);
        if (n == -1) {
          n = str2.length();
        }
        i1 = str2.substring(0, j).lastIndexOf(' ') + 1;
        str4 = str2.substring(i1, n);
        if (str4.length() == 0) {
          return;
        }
        if (str4.charAt(0) == '"') {
          i1++;
          str4 = str4.substring(1);
          m = 1;
          if (str4.length() == 0)
            return;
        }
        if (str4.charAt(str4.length() - 1) == '"') {
          n--;
          str4 = str4.substring(0, str4.length() - 1);
          m = 0;
          if (str4.length() == 0)
            return;
        }
        str4 = str4.trim();
        if ((str4 != null) && (str4.length() > 0)) {
          localOu = Ou.aaC();
          if ((localOu.aaG() == null) || (!localOu.cW(str4))) {
            localOu.cU(str4);
          }
          str5 = localOu.aaF();

          Cs localCs = localaTp.getTextBuilder().df(0, 0);
          if (localCs != null) {
            cDG localcDG = (cDG)localCs.getFirst();
            if (localcDG != null) {
              localaTp.getTextBuilder().c(localcDG.aOi(), i1);
              localaTp.getTextBuilder().d(localcDG.aOi(), n);
              localaTp.getTextBuilder().ko(m != 0 ? str5 + "\"" : str5);
            }
          }
        }
      }
    }
  }

  public boolean X() {
    return false;
  }
}