// Action script...

// [Initial MovieClip Action of sprite 20920]
#initclip 185
if (!dofus.datacenter.Effect)
{
    if (!dofus)
    {
        _global.dofus = new Object();
    } // end if
    if (!dofus.datacenter)
    {
        _global.dofus.datacenter = new Object();
    } // end if
    var _loc1 = (_global.dofus.datacenter.Effect = function (mType, mParam1, mParam2, mParam3, mParam4, mRemainingTurn, mSpellID, nModificator)
    {
        super();
        this.initialize(mType, mParam1, mParam2, mParam3, mParam4, mRemainingTurn, mSpellID, nModificator);
    }).prototype;
    _loc1.__get__type = function ()
    {
        return (this._nType);
    };
    _loc1.__set__probability = function (nProbability)
    {
        this._nPropability = nProbability;
        //return (this.probability());
    };
    _loc1.__get__probability = function ()
    {
        return (this._nPropability);
    };
    _loc1.__get__param1 = function ()
    {
        return (this._nParam1);
    };
    _loc1.__set__param1 = function (value)
    {
        this._nParam1 = value;
        //return (this.param1());
    };
    _loc1.__get__param2 = function ()
    {
        return (this._nParam2);
    };
    _loc1.__set__param2 = function (value)
    {
        this._nParam2 = value;
        //return (this.param2());
    };
    _loc1.__get__param3 = function ()
    {
        return (this._nParam3);
    };
    _loc1.__set__param3 = function (value)
    {
        this._nParam3 = value;
        //return (this.param3());
    };
    _loc1.__get__param4 = function ()
    {
        return (this._sParam4);
    };
    _loc1.__set__param4 = function (value)
    {
        this._sParam4 = value;
        //return (this.param4());
    };
    _loc1.__set__remainingTurn = function (nRremainingTurn)
    {
        this._nRemainingTurn = nRremainingTurn;
        //return (this.remainingTurn());
    };
    _loc1.__get__remainingTurn = function ()
    {
        return (this._nRemainingTurn);
    };
    _loc1.__get__remainingTurnStr = function ()
    {
        return (this.getTurnCountStr(true));
    };
    _loc1.__get__spellID = function ()
    {
        return (this._nSpellID);
    };
    _loc1.__get__isNothing = function ()
    {
        return (this.api.lang.getEffectText(this._nType).d == "NOTHING");
    };
    _loc1.__get__description = function ()
    {
        var _loc2 = this.api.lang.getEffectText(this._nType).d;
        var _loc3 = [this._nParam1, this._nParam2, this._nParam3, this._sParam4];
        switch (this._nType)
        {
            case 10://PERMITS_USE_EMOTE(10),//Permet d'utiliser une emote
            {
                _loc3[2] = this.api.lang.getEmoteText(this._nParam3).n;
                break;
            } 
            case 165://AUGMENTS_DAMAGES_X_OF_XPERCENT(165,16,'+'),//E[165] = {d: "Augmente les dommages (#1) de #2%", c: 16, o: "+"};
            {
                _loc3[0] = this.api.lang.getItemTypeText(this._nParam1).n;
                break;
            } 
            case 601://NULL601(601,'+'),//E[601] = {d: "null", c: 0, o: "+"};
            {
                var _loc4 = this.api.lang.getMapText(this._nParam2);
                _loc3[0] = this.api.lang.getMapSubAreaText(_loc4.sa).n;
                _loc3[1] = _loc4.x;
                _loc3[2] = _loc4.y;
                break;
            } 
            case 614://PLUS_X_XP_IN_JOB_X(614,'+'),//E[614] = {d: "+ #1 d\'XP dans le métier #2", c: 0, o: "+"};
            {
                _loc3[0] = this._nParam3;
                _loc3[1] = this.api.lang.getJobText(this._nParam2).n;
                break;
            } 
            case 615://FORGET_JOB_X(615),//E[615] = {d: "Fait oublier le métier de #3", c: 0, o: ""};
            {
                _loc3[2] = this.api.lang.getJobText(this._nParam3).n;
                break;
            } 
            case 616://FORGET_SPELL_LEVEL_ONE(616),//E[616] = {d: "Fait oublier un niveau du sort #3", c: 0, o: ""};
            case 624://FORGET_SPELL_LEVEL_ONE624(624),//E[624] = {d: "Fait oublier un niveau du sort #3", c: 0, o: ""};
            {
                _loc3[2] = this.api.lang.getSpellText(this._nParam3).n;
                break;
            } 
            case 699://LIER_METIER(699,'/'),//E[699] = {d: "Lier son métier : #1", c: 0, o: "/"};
            {
                _loc3[0] = this.api.lang.getJobText(this._nParam1).n;
                break;
            } 
            case 623://SUMMON_X(623,-1,'/'),//E[623] = {d: "Invoque : #3", c: -1, o: "/"};
            {
                _loc3[2] = this.api.lang.getMonstersText(this._nParam3).n;
                break;
            } 
            case 715://X_X715(715,'/'),//E[715] = {d: "#1 : #3", c: 0, o: "/"};
            {
                _loc3[0] = this.api.lang.getMonstersSuperRaceText(this._nParam1).n;
                break;
            } 
            case 716://X_X716(716,'/'),//E[716] = {d: "#1 : #3", c: 0, o: "/"};
            {
                _loc3[0] = this.api.lang.getMonstersRaceText(this._nParam1).n;
                break;
            } 
            case 717://X_X717(717,'/'),//E[717] = {d: "#1 : #3", c: 0, o: "/"};
            {
                _loc3[0] = this.api.lang.getMonstersText(this._nParam1).n;
                break;
            } 
            case 805://RECU_LE(805),//E[805] = {d: "Reçu le : #1", c: 0, o: ""};
            case 808://A_MANGE_LE(808),//E[808] = {d: "A mangé le : #1", c: 0, o: ""};
            case 983://ECHANGEABLE_LE_DATE(983,'/'),//E[983] = {d: "Échangeable dès le : #1", c: 0, o: "/"};
            {//toute des dates ici
                this._nParam3 = this._nParam3 == undefined ? (0) : (this._nParam3);
                var _loc5 = String(Math.floor(this._nParam2) / 100).split(".");
                var _loc6 = Number(_loc5[0]);
                var _loc7 = this._nParam2 - _loc6 * 100;
                var _loc8 = String(Math.floor(this._nParam3) / 100).split(".");
                var _loc9 = Number(_loc8[0]);
                var _loc10 = this._nParam3 - _loc9 * 100;
                _loc3[0] = ank.utils.PatternDecoder.getDescription(this.api.lang.getConfigText("DATE_FORMAT"), [this._nParam1, new ank.utils.ExtendedString(_loc6 + 1).addLeftChar("0", 2), new ank.utils.ExtendedString(_loc7).addLeftChar("0", 2), _loc9, new ank.utils.ExtendedString(_loc10).addLeftChar("0", 2)]);
                break;
            } 
			case 806://corpulence du familier      CORPULENCE(806),//E[806] = {d: "Corpulence : #1", c: 0, o: ""};
            {
                if (this._nParam2 == undefined && this._nParam3 == undefined)
                {
                    _loc3[0] = this.api.lang.getText("NORMAL");
                }
                else
                {
                    _loc3[0] = this._nParam2 > 6 ? (this.api.lang.getText("FAT")) : (this._nParam3 > 6 ? (this.api.lang.getText("LEAN")) : (this.api.lang.getText("NORMAL")));
                } // end else if
                break;
            } 
			case 807://date du dernier repas sur le familier  ->  DERNIER_REPAS(807),//E[807] = {d: "Dernier repas : #1", c: 0, o: ""};
            {
                if (this._nParam3 == undefined)
                {
                    _loc3[0] = this.api.lang.getText("NO_LAST_MEAL");
                }
                else
                {
                    _loc3[0] = this.api.lang.getItemUnicText(this._nParam3).n;
                } // end else if
                break;
            } 
			case 950://appliquer un état   ->   ETAT(950,71,'/'),//E[950] = {d: "Etat #3", c: 71, o: "/"};
			case 951://enlever un état     ->   ENLEVE_ETAT(951,71,'/'),//E[951] = {d: "Enlève l\'état \'#3\'", c: 71, o: "/"};
            {
                _loc3[2] = this.api.lang.getStateText(this._nParam3);
                break;
            } 
            case dofus.managers.SpellsBoostsManager.ACTION_BOOST_SPELL_AP_COST:
            case dofus.managers.SpellsBoostsManager.ACTION_BOOST_SPELL_RANGE:
            case dofus.managers.SpellsBoostsManager.ACTION_BOOST_SPELL_RANGEABLE:
            case dofus.managers.SpellsBoostsManager.ACTION_BOOST_SPELL_DMG:
            case dofus.managers.SpellsBoostsManager.ACTION_BOOST_SPELL_HEAL:
            case dofus.managers.SpellsBoostsManager.ACTION_BOOST_SPELL_AP_COST:
            case dofus.managers.SpellsBoostsManager.ACTION_BOOST_SPELL_CAST_INTVL:
            case dofus.managers.SpellsBoostsManager.ACTION_BOOST_SPELL_SET_INTVL:
            case dofus.managers.SpellsBoostsManager.ACTION_BOOST_SPELL_CC:
            case dofus.managers.SpellsBoostsManager.ACTION_BOOST_SPELL_CASTOUTLINE:
            case dofus.managers.SpellsBoostsManager.ACTION_BOOST_SPELL_NOLINEOFSIGHT:
            case dofus.managers.SpellsBoostsManager.ACTION_BOOST_SPELL_MAXPERTURN:
            case dofus.managers.SpellsBoostsManager.ACTION_BOOST_SPELL_MAXPERTARGET:
            {//ici les effets spéciaux sur les items de classe
                _loc3[0] = this.api.lang.getSpellText(Number(_loc3[0])).n;
                break;
            } 
            case 939://AUGMENTS_CAPACITE_FAMILIER
            case 940://CAPACITE_ACCRUES
            {
                var _loc11 = new dofus.datacenter.Item(-1, Number(_loc3[2]), 1, 0, "", 0);
                _loc3[2] = _loc11.name;
                break;
            } 
            case 960://ALIGNEMENT(960,'/'),//E[960] = {d: "Alignement : #3", c: 0, o: "/"};
            {
                _loc3[2] = this.api.lang.getAlignment(this._nParam3).n;
                break;
            } 
            case 999://NULL999(999,'+'),//E[999] = {d: "null", c: 0, o: "+"};
            {
                break;
            } 
        } // End of switch
        if (this.api.lang.getEffectText(this._nType).j && this.api.kernel.OptionsManager.getOption("ViewDicesDammages"))
        {
            var _loc12 = this._sParam4.toLowerCase().split("d");
            _loc12[1] = _loc12[1].split("+");
            if (!(_loc12[0] == undefined || (_loc12[1] == undefined || (_loc12[1][0] == undefined || _loc12[1][0] == undefined))))
            {
                var _loc13 = "";
                _loc13 = _loc13 + (_loc12[0] != "0" && _loc12[1][0] != "0" ? (_loc12[0] + "d" + _loc12[1][0]) : (""));
                _loc13 = _loc13 + (_loc12[1][1] != "0" ? ((_loc13 != "" ? ("+") : ("")) + _loc12[1][1]) : (""));
                _loc3[0] = _loc13;
                _loc3[1] = _loc3[2] = _loc3[4] = undefined;
            } // end if
        } // end if
        var _loc14 = "";
        if (this._nPropability > 0 && this._nPropability != undefined)
        {
            _loc14 = _loc14 + (" - " + this.api.lang.getText("IN_CASE_PERCENT", [this._nPropability]) + ": ");
        } // end if
        if (this._nType == 666)
        {
            _loc14 = _loc14 + this.api.lang.getText("DO_NOTHING");
        }
        else
        {
            var _loc15 = ank.utils.PatternDecoder.getDescription(_loc2, _loc3);
            if (_loc15 == null || _loc15 == "null")
            {
                return (new String());
            } // end if
            if (_loc15 != undefined)
            {
                _loc14 = _loc14 + _loc15;
            } // end if
        } // end else if
		
		//Ca cest avec les items de classes qui modifient les sorts (le modificator)
        if (this._nModificator > 0 && this.api.kernel.SpellsBoostsManager.isBoostedHealingOrDamagingEffect(this._nType))
        {
            _loc14 = _loc14 + (" " + this.api.lang.getText("BOOSTED_SPELLS_EFFECT_COMPLEMENT", [this._nModificator]));
        } // end if
        var _loc16 = this.getTurnCountStr(false);
        if (_loc16.length == 0)
        {
            return (_loc14);
        }
        else
        {
            return (_loc14 + " (" + _loc16 + ")");
        } // end else if
    };
    _loc1.__get__characteristic = function ()
    {
        return (this.api.lang.getEffectText(this._nType).c);
    };
    _loc1.__get__operator = function ()
    {
        return (this.api.lang.getEffectText(this._nType).o);
    };
    _loc1.__get__element = function ()
    {
        return (this.api.lang.getEffectText(this._nType).e);
    };
    _loc1.__get__spellName = function ()
    {
        return (this.api.lang.getSpellText(this._nSpellID).n);
    };
    _loc1.__get__spellDescription = function ()
    {
        return (this.api.lang.getSpellText(this._nSpellID).d);
    };
    _loc1.__get__showInTooltip = function ()
    {
        return (this.api.lang.getEffectText(this._nType).t);
    };
    _loc1.initialize = function (mType, mParam1, mParam2, mParam3, mParam4, mRemainingTurn, mSpellID, nModificator)
    {
        this.api = _global.API;
        this._nType = Number(mType);
        this._nParam1 = _global.isNaN(Number(mParam1)) ? (undefined) : (Number(mParam1));
        this._nParam2 = _global.isNaN(Number(mParam2)) ? (undefined) : (Number(mParam2));
        this._nParam3 = _global.isNaN(Number(mParam3)) ? (undefined) : (Number(mParam3));
        this._sParam4 = mParam4;
        this._nRemainingTurn = mRemainingTurn == undefined ? (0) : (Number(mRemainingTurn));
        if (this._nRemainingTurn < 0 || this._nRemainingTurn >= 63)
        {
            this._nRemainingTurn = Number.POSITIVE_INFINITY;
        } // end if
        this._nSpellID = Number(mSpellID);
        this._nModificator = Number(nModificator);
    };
    _loc1.getParamWithOperator = function (nParamID)
    {
        var _loc3 = this.operator == "-" ? (-1) : (1);
        return (this["_nParam" + nParamID] * _loc3);
    };
    _loc1.getTurnCountStr = function (bShowLast)
    {
        var _loc3 = new String();
        if (this._nRemainingTurn == undefined)
        {
            return ("");
        } // end if
        if (_global.isFinite(this._nRemainingTurn))
        {
            if (this._nRemainingTurn > 1)
            {
                return (String(this._nRemainingTurn) + " " + this.api.lang.getText("TURNS"));
            }
            else if (this._nRemainingTurn == 0)
            {
                return ("");
            }
            else if (bShowLast)
            {
                return (this.api.lang.getText("LAST_TURN"));
            }
            else
            {
                return (String(this._nRemainingTurn) + " " + this.api.lang.getText("TURN"));
            } // end else if
        }
        else
        {
            return (this.api.lang.getText("INFINIT"));
        } // end else if
    };
    _loc1.addProperty("element", _loc1.__get__element, function ()
    {
    });
    _loc1.addProperty("isNothing", _loc1.__get__isNothing, function ()
    {
    });
    _loc1.addProperty("remainingTurn", _loc1.__get__remainingTurn, _loc1.__set__remainingTurn);
    _loc1.addProperty("spellDescription", _loc1.__get__spellDescription, function ()
    {
    });
    _loc1.addProperty("description", _loc1.__get__description, function ()
    {
    });
    _loc1.addProperty("characteristic", _loc1.__get__characteristic, function ()
    {
    });
    _loc1.addProperty("operator", _loc1.__get__operator, function ()
    {
    });
    _loc1.addProperty("spellName", _loc1.__get__spellName, function ()
    {
    });
    _loc1.addProperty("probability", _loc1.__get__probability, _loc1.__set__probability);
    _loc1.addProperty("showInTooltip", _loc1.__get__showInTooltip, function ()
    {
    });
    _loc1.addProperty("remainingTurnStr", _loc1.__get__remainingTurnStr, function ()
    {
    });
    _loc1.addProperty("param1", _loc1.__get__param1, _loc1.__set__param1);
    _loc1.addProperty("type", _loc1.__get__type, function ()
    {
    });
    _loc1.addProperty("param2", _loc1.__get__param2, _loc1.__set__param2);
    _loc1.addProperty("param3", _loc1.__get__param3, _loc1.__set__param3);
    _loc1.addProperty("param4", _loc1.__get__param4, _loc1.__set__param4);
    _loc1.addProperty("spellID", _loc1.__get__spellID, function ()
    {
    });
    ASSetPropFlags(_loc1, null, 1);
    _loc1._nPropability = 0;
	_loc1._nModificator = -1; //Ca cest avec les items de classes qui modifient les sorts
} // end if
#endinitclip
