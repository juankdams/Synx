class avs
  implements apB
{
  avs(cOS paramcOS, int paramInt, String[] paramArrayOfString)
  {
  }

  public Boolean c(int paramInt, bEv parambEv)
  {
    if (parambEv != null) {
      aHA.debug("Handling media sub-item...", new Object[0]);

      aHA.debug("count={}", new Object[] { Integer.valueOf(paramInt) });
      cOS.a(this.dJW, this.dJY);
      aHA.debug("subItemIndex={}", new Object[] { Integer.valueOf(cOS.a(this.dJW)) });

      if (cOS.a(this.dJW) >= paramInt) {
        aHA.debug("End of sub-items reached", new Object[0]);
        if (!cOS.b(this.dJW)) {
          aHA.debug("Do not repeat sub-items", new Object[0]);
          cOS.a(this.dJW, -1);
          aHA.debug("Raising events for end of sub-items", new Object[0]);
          cOS.a(this.dJW, cOS.d(this.dJW).yB(cOS.c(this.dJW)));
        }
        else {
          aHA.debug("Repeating sub-items", new Object[0]);
          cOS.a(this.dJW, 0);
        }
      }
      if (cOS.a(this.dJW) != -1)
      {
        jJ localjJ = this.dJW.le.b(parambEv, cOS.a(this.dJW));
        aHA.debug("subItem={}", new Object[] { localjJ });

        if (localjJ != null) {
          aHA.debug("subItemMrl={}", new Object[] { this.dJW.c(localjJ) });

          this.dJW.le.a(cOS.e(this.dJW), localjJ);
          String str;
          if (cOS.f(this.dJW) != null) {
            for (str : cOS.f(this.dJW)) {
              aHA.debug("standardMediaOption={}", new Object[] { str });
              this.dJW.le.a(localjJ, str);
            }
          }

          if (this.dJZ != null) {
            for (str : this.dJZ) {
              aHA.debug("mediaOption={}", new Object[] { str });
              this.dJW.le.a(localjJ, str);
            }
          }

          this.dJW.le.f(cOS.e(this.dJW));

          this.dJW.le.g(localjJ);

          aHA.debug("Raising played event for sub-item {}", new Object[] { Integer.valueOf(cOS.a(this.dJW)) });
          cOS.a(this.dJW, cOS.d(this.dJW).eo(cOS.a(this.dJW), cOS.c(this.dJW)));

          return Boolean.valueOf(true);
        }
      }
    }

    return Boolean.valueOf(false);
  }
}