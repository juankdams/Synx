class cTC extends dBq
{
  cTC(ckT paramckT, byz parambyz, byte paramByte)
  {
    super(paramckT, parambyz, paramByte);
  }

  public int sS()
  {
    int i = super.sS();
    if (i != 0) {
      return i;
    }
    int j = 0;
    int k = 0;
    Fs localFs = this.dmy.bHj().Ta();

    for (Su localSu : this.aCI.bgG()) {
      if (localSu.getType() == 0)
      {
        if (localSu.Fx() == this.bml)
          j = 1;
        else if ((localFs != null) && (localFs.N(localSu.getId())))
          k = 1;
      }
    }
    if (k != 0)
      return 1035;
    if (j == 0) {
      return 1040;
    }
    return 0;
  }
}