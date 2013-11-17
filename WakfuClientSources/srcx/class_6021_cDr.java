import org.apache.log4j.Logger;

class cDr
  implements cIw
{
  cDr(bVG parambVG)
  {
  }

  public boolean R(int paramInt)
  {
    if (!this.iwJ.uj(paramInt)) {
      this.iwJ.ui(paramInt);
      bVG.K.info("apprentissage de la custom de havre-sac innée id=" + paramInt);
    }
    return true;
  }
}