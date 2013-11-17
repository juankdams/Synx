class dMj extends adV
{
  dMj(Fu paramFu, gA paramgA)
  {
  }

  public boolean a(cSx paramcSx)
  {
    if (((paramcSx instanceof dMr)) && (((dMr)paramcSx).getButton() == 3)) {
      bsP.getInstance().b(CH.bGv, this, true);
      dGx.dhr().unlock();
      Rl.acN().b(this);
    } else if ((paramcSx != null) && ((paramcSx instanceof dMr)) && (((dMr)paramcSx).getButton() == 1))
    {
      dOc localdOc = bsP.getInstance().getMouseOver();
      axU localaxU = (axU)localdOc.getParentOfType(axU.class);
      if (localaxU == null)
        return false;
      Object localObject = localaxU.getItemValue();
      if (!(localObject instanceof gA)) {
        return false;
      }
      gA localgA = (gA)localObject;
      if (!localgA.nN())
        return false;
      Fu.a(this.mcv, localgA.oj());

      byz localbyz = byv.bFN().bFO();
      Fu.a(this.mcv, this.bcY, localbyz);
      bsP.getInstance().b(CH.bGv, this, true);
      dGx.dhr().unlock();
      Rl.acN().b(this);
    }
    return false;
  }
}