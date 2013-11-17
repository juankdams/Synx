class apz
  implements dGy
{
  apz(cfb paramcfb, cYk paramcYk, int paramInt1, int paramInt2, short paramShort, byz parambyz)
  {
  }

  public boolean b(dWu paramdWu)
  {
    this.dvz.ac(this.aOU, this.aOV, this.dvA);
    if ((((paramdWu instanceof VE)) || ((paramdWu instanceof aCf))) && (paramdWu.fa() == this.aOU) && (paramdWu.fb() == this.aOV) && (paramdWu.fc() <= this.dvA) && (paramdWu.fc() + 6 > this.dvA))
    {
      paramdWu.b(dJO.lVA, this.aOx);
    } else if ((paramdWu instanceof bVa)) {
      bVa localbVa = (bVa)paramdWu;
      boolean bool1 = localbVa.o(this.dvz);
      boolean bool2 = localbVa.caY();
      if ((bool1) && (!bool2))
        paramdWu.b(dJO.lVE, this.aOx);
      else if ((!bool1) && (bool2))
        paramdWu.b(dJO.lVF, this.aOx);
      else if ((bool1) && (bool2))
        paramdWu.b(dJO.lVA, this.aOx);
    }
    else if (paramdWu.o(this.dvz)) {
      paramdWu.b(paramdWu.adT(), this.aOx);
    }
    return true;
  }
}