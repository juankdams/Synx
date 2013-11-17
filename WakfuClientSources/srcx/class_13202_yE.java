import com.ankamagames.wakfu.client.WakfuClientInstance;

class yE
  implements dkT
{
  yE(drM paramdrM, ld paramld, bFg parambFg)
  {
  }

  public void a(int paramInt, String paramString)
  {
    if (paramInt == 8) {
      long l = this.bsi.oj();

      cS localcS = (cS)drM.a(this.bse).aKi().d(this.bsj.aaN());
      cXZ localcXZ = this.bsj.a(localcS, l, (short)1, null);
      if (localcXZ.bYF() == 0)
      {
        acf localacf = new acf();
        localacf.aM(drM.a(this.bse).getId());
        localacf.h(this.bsj.EN());
        localacf.aW(l);
        WakfuClientInstance.awy().awz().aJK().d(localacf);

        BJ localBJ = new BJ();
        localBJ.aM(drM.a(this.bse).getId());
        WakfuClientInstance.awy().awz().aJK().d(localBJ);

        dLE.doY().a(bWW.ccf(), new String[] { "boughtChallenges", "challengeInventory", "boughtBuffs", "buffInventory", "climateInventory", "walletHandler" });
      }
    }
  }
}