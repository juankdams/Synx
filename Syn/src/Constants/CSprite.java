package Constants;

public class CSprite {

	
	//Les swf des extraclips sont disponibles dans dofus/clips/extra
	
	/**L'icone pour le mode marchand qui a des items de 2 catégories mini (équipments+potions+ressources)*/
	public static final byte EXTRA_CLIP_PLAYERSTORE_COMPLETE = 0;
	/**L'icone pour le mode marchand qui n'a que des équipements/armes en vente*/
	public static final byte EXTRA_CLIP_PLAYERSTORE_EQUIPMENTS = 1;
	/**L'icone pour le mode marchand qui n'a que des potions/parchos/pains... en vente*/
	public static final byte EXTRA_CLIP_PLAYERSTORE_MISCELLANEOUS = 2;
	/**L'icone pour le mode marchand qui n'a que des ressources en vente*/
	public static final byte EXTRA_CLIP_PLAYERSTORE_RESSOURCES = 3;
	/**Un gros point d'exclamation vert au dessus de la tête du sprite. 
	 * Utilisé pour les pnjs donnant des quêtes*/
	public static final byte EXTRA_CLIP_OVERHEAD_GREEN_EXCLAMATIONPOINT = 4;
	/**Un petit point d'exclamation bleu dans une expece d'étoile blanche. 
	 * Le tout penché en diago. C'est pour quand on fait un coup critique en combat.*/
	public static final byte EXTRA_CLIP_OVERHEAD_BLUE_EXCLAMATIONPOINT = 5;
	
	
	
	
	/*  XXX   QUAND ON CLIQUE SUR UN SPRITE (check dofus/graphics/battlefield/DofusBattlefield.as)
	 * 					y'a aussi onCellRelease qui est d'ailleurs call plein de fois dans le onSpriteRelease
	
	
	_loc1.onSpriteRelease = function (mcSprite)
    {
        var _loc3 = mcSprite.data;//_loc3 = un sprite, on sait pas quoi, mais un sprite. 
								//Ca peut etre un npc, perso, monster, monstergroup, mutant, etc...
        var _loc4 = _loc3.id;
        if (this.api.kernel.TutorialManager.isTutorialMode)
        {
            this.api.kernel.TutorialManager.onWaitingCase({code: "SPRITE_RELEASE", params: [_loc3.id]});
            return;
        } // end if
        if (_loc3.hasParent)
        {
            this.onSpriteRelease(_loc3.linkedParent.mc);
            return;
        } // end if
        switch (this.api.datacenter.Game.interactionType)
        {
            case 5:
            {
                if (this.api.datacenter.Player.currentUseObject != null && this.api.datacenter.Basics.gfx_canLaunch == true)
                {
                    this.api.network.Items.use(this.api.datacenter.Player.currentUseObject.ID, _loc3.id, _loc3.cellNum);
                } // end if
                this.api.gfx.setInteraction(ank.battlefield.Constants.INTERACTION_CELL_RELEASE);
                this.api.gfx.clearPointer();
                this.unSelect(true);
                this.api.datacenter.Player.reset();
                this.api.ui.removeCursor();
                this.api.datacenter.Game.setInteractionType("move");
                break;
            } 
            default:
            {
                if (_loc3 instanceof dofus.datacenter.Mutant && !_loc3.showIsPlayer)
                {
                    if (!this.api.datacenter.Game.isRunning)
                    {
                        if (this.api.datacenter.Player.isMutant)
                        {
                            return;
                        } // end if
                    } // end if
                    var _loc5 = this.mapHandler.getCellData(_loc3.cellNum).mc;
                    this.onCellRelease(_loc5);
                }
                else if (_loc3 instanceof dofus.datacenter.Character || _loc3 instanceof dofus.datacenter.Mutant && _loc3.showIsPlayer)
                {
                    if (this.api.datacenter.Game.isFight)
                    {
                        if (this.api.datacenter.Game.isRunning)
                        {
                            var _loc6 = this.mapHandler.getCellData(_loc3.cellNum).mc;
                            this.onCellRelease(_loc6);
                            return;
                        } // end if
                    } // end if
                    this.api.kernel.GameManager.showPlayerPopupMenu(_loc3, undefined);
                }
                else if (_loc3 instanceof dofus.datacenter.NonPlayableCharacter)
                {
                    if (this.api.datacenter.Player.cantSpeakNPC)
                    {
                        return;
                    } // end if
                    var _loc7 = _loc3.actions;
                    if (_loc7 != undefined && _loc7.length != 0)
                    {
                        var _loc8 = this.api.ui.createPopupMenu();
                        var _loc9 = _loc7.length;
                        while (_loc9-- > 0)
                        {
                            var _loc10 = _loc7[_loc9].action;
                            _loc8.addItem(_loc7[_loc9].name, _loc10.object, _loc10.method, _loc10.params);
                        } // end while
                        _loc8.show(_root._xmouse, _root._ymouse);
                    } // end if
                }
                else if (_loc3 instanceof dofus.datacenter.Team)
                {
                    var _loc11 = this.api.datacenter.Player.data.alignment.index;
                    var _loc12 = _loc3.alignment.index;
                    var _loc13 = _loc3.enemyTeam.alignment.index;
                    var _loc14 = _loc3.challenge.fightType;
                    var _loc15 = false;
                    switch (_loc14)
                    {
                        case 0:
                        {
                            switch (_loc3.type)
                            {
                                case 0:
                                case 2:
                                {
                                    _loc15 = this.api.datacenter.Player.canChallenge && (!this.api.datacenter.Player.isMutant || this.api.datacenter.Player.canAttackDungeonMonstersWhenMutant);
                                    break;
                                } 
                            } // End of switch
                            break;
                        } 
                        case 1:
                        case 2:
                        {
                            switch (_loc3.type)
                            {
                                case 0:
                                case 1:
                                {
                                    if (_loc11 == _loc12)
                                    {
                                        _loc15 = !this.api.datacenter.Player.isMutant;
                                    }
                                    else
                                    {
                                        _loc15 = this.api.lang.getAlignmentCanJoin(_loc11, _loc12) && (this.api.lang.getAlignmentCanAttack(_loc11, _loc13) && !this.api.datacenter.Player.isMutant);
                                    } // end else if
                                    break;
                                } 
                            } // End of switch
                            break;
                        } 
                        case 3:
                        {
                            switch (_loc3.type)
                            {
                                case 0:
                                {
                                    _loc15 = !this.api.datacenter.Player.isMutant || this.api.datacenter.Player.canAttackDungeonMonstersWhenMutant;
                                    break;
                                } 
                                case 1:
                                {
                                    _loc15 = false;
                                    break;
                                } 
                            } // End of switch
                            break;
                        } 
                        case 4:
                        {
                            switch (_loc3.type)
                            {
                                case 0:
                                {
                                    _loc15 = !this.api.datacenter.Player.isMutant || this.api.datacenter.Player.canAttackDungeonMonstersWhenMutant;
                                    break;
                                } 
                                case 1:
                                {
                                    _loc15 = false;
                                    break;
                                } 
                            } // End of switch
                            break;
                        } 
                        case 5:
                        {
                            switch (_loc3.type)
                            {
                                case 0:
                                {
                                    _loc15 = !this.api.datacenter.Player.isMutant && !this.api.datacenter.Player.cantInteractWithTaxCollector;
                                    break;
                                } 
                                case 3:
                                {
                                    _loc15 = false;
                                    break;
                                } 
                            } // End of switch
                            break;
                        } 
                        case 6:
                        {
                            switch (_loc3.type)
                            {
                                case 0:
                                {
                                    _loc15 = !this.api.datacenter.Player.isMutant || this.api.datacenter.Player.canAttackDungeonMonstersWhenMutant;
                                    break;
                                } 
                                case 2:
                                {
                                    _loc15 = this.api.datacenter.Player.isMutant && !this.api.datacenter.Player.canAttackDungeonMonstersWhenMutant == true;
                                    break;
                                } 
                            } // End of switch
                            break;
                        } 
                    } // End of switch
                    if (_loc15)
                    {
                        var _loc16 = this.api.ui.createPopupMenu();
                        var _loc17 = this.api.lang.getMapMaxTeam(this.api.datacenter.Map.id);
                        var _loc18 = this.api.lang.getMapMaxChallenge(this.api.datacenter.Map.id);
                        if (_loc3.challenge.count >= _loc18)
                        {
                            _loc16.addItem(this.api.lang.getText("CHALENGE_FULL"));
                        }
                        else if (_loc3.count >= _loc17)
                        {
                            _loc16.addItem(this.api.lang.getText("TEAM_FULL"));
                        }
                        else if (Key.isDown(Key.SHIFT))
                        {
                            this.api.network.GameActions.joinChallenge(_loc3.challenge.id, _loc3.id);
                            this.api.ui.hideTooltip();
                        }
                        else
                        {
                            _loc16.addItem(this.api.lang.getText("JOIN_SMALL"), this.api.network.GameActions, this.api.network.GameActions.joinChallenge, [_loc3.challenge.id, _loc3.id]);
                        } // end else if
                        _loc16.show(_root._xmouse, _root._ymouse);
                    } // end if
                }
                else if (_loc3 instanceof dofus.datacenter.ParkMount)
                {
                    if (_loc3.ownerName == this.api.datacenter.Player.Name || this.api.datacenter.Map.mountPark.guildName == this.api.datacenter.Player.guildInfos.name && this.api.datacenter.Player.guildInfos.playerRights.canManageOtherMount)
                    {
                        var _loc19 = this.api.ui.createPopupMenu();
                        _loc19.addStaticItem(this.api.lang.getText("MOUNT_OF", [_loc3.ownerName]));
                        _loc19.addItem(this.api.lang.getText("VIEW_MOUNT_DETAILS"), this.api.network.Mount, this.api.network.Mount.parkMountData, [_loc3.id]);
                        _loc19.show(_root._xmouse, _root._ymouse);
                    } // end if
                }
                else if (_loc3 instanceof dofus.datacenter.Creature)
                {
                    var _loc20 = this.mapHandler.getCellData(_loc3.cellNum).mc;
                    this.onCellRelease(_loc20);
                }
                else if (_loc3 instanceof dofus.datacenter.MonsterGroup || _loc3 instanceof dofus.datacenter.Monster)
                {
                    if (_loc3 instanceof dofus.datacenter.Monster && this.api.kernel.GameManager.isInMyTeam(_loc3))
                    {
                        this.api.kernel.GameManager.showMonsterPopupMenu(_loc3);
                    } // end if
                    if (!this.api.datacenter.Player.isMutant || (this.api.datacenter.Player.canAttackDungeonMonstersWhenMutant || this.api.datacenter.Player.canAttackMonstersAnywhereWhenMutant))
                    {
                        var _loc21 = this.mapHandler.getCellData(_loc3.cellNum).mc;
                        this.onCellRelease(_loc21);
                    } // end if
                }
                else if (_loc3 instanceof dofus.datacenter.OfflineCharacter)
                {
                    if (!this.api.datacenter.Player.isMutant || this.api.datacenter.Player.canAttackDungeonMonstersWhenMutant)
                    {
                        if (!this.api.datacenter.Player.canExchange)
                        {
                            return;
                        } // end if
                        var _loc22 = this.api.ui.createPopupMenu();
                        _loc22.addStaticItem(this.api.lang.getText("SHOP") + " " + this.api.lang.getText("OF") + " " + _loc3.name);
                        _loc22.addItem(this.api.lang.getText("BUY"), this.api.kernel.GameManager, this.api.kernel.GameManager.startExchange, [4, _loc3.id, _loc3.cellNum]);
                        if (this.api.datacenter.Player.isAtHome(this.api.datacenter.Map.id))
                        {
                            _loc22.addItem(this.api.lang.getText("KICKOFF"), this.api.network.Basics, this.api.network.Basics.kick, [_loc3.cellNum]);
                        } // end if
                        _loc22.show(_root._xmouse, _root._ymouse);
                    } // end if
                }
                else if (_loc3 instanceof dofus.datacenter.TaxCollector)
                {
                    if (!this.api.datacenter.Player.isMutant)
                    {
                        if (this.api.datacenter.Player.cantInteractWithTaxCollector)
                        {
                            return;
                        } // end if
                        if (this.api.datacenter.Game.isFight)
                        {
                            var _loc23 = this.mapHandler.getCellData(_loc3.cellNum).mc;
                            this.onCellRelease(_loc23);
                        }
                        else
                        {
                            var _loc24 = this.api.datacenter.Player.guildInfos.playerRights;
                            var _loc25 = _loc3.guildName == this.api.datacenter.Player.guildInfos.name;
                            var _loc26 = _loc25 && _loc24.canHireTaxCollector;
                            var _loc27 = this.api.ui.createPopupMenu();
                            _loc27.addItem(this.api.lang.getText("SPEAK"), this.api.network.Dialog, this.api.network.Dialog.create, [_loc4]);
                            _loc27.addItem(this.api.lang.getText("COLLECT_TAX"), this.api.kernel.GameManager, this.api.kernel.GameManager.startExchange, [8, _loc4], _loc25);
                            _loc27.addItem(this.api.lang.getText("ATTACK"), this.api.network.GameActions, this.api.network.GameActions.attackTaxCollector, [[_loc4]], !_loc25);
                            _loc27.addItem(this.api.lang.getText("REMOVE"), this.api.kernel.GameManager, this.api.kernel.GameManager.askRemoveTaxCollector, [[_loc4]], _loc26);
                            _loc27.show(_root._xmouse, _root._ymouse);
                        } // end if
                    } // end else if
                }
                else if (_loc3 instanceof dofus.datacenter.PrismSprite)
                {
                    if (!this.api.datacenter.Player.isMutant)
                    {
                        if (this.api.datacenter.Game.isFight)
                        {
                            var _loc28 = this.mapHandler.getCellData(_loc3.cellNum).mc;
                            this.onCellRelease(_loc28);
                        }
                        else
                        {
                            var _loc29 = this.api.datacenter.Player.alignment.compareTo(_loc3.alignment) == 0;
                            var _loc30 = this.api.ui.createPopupMenu();
                            _loc30.addItem(this.api.lang.getText("USE_WORD"), this.api.network.GameActions, this.api.network.GameActions.usePrism, [[_loc4]], _loc29);
                            _loc30.addItem(this.api.lang.getText("ATTACK"), this.api.network.GameActions, this.api.network.GameActions.attackPrism, [[_loc4]], !_loc29);
                            _loc30.show(_root._xmouse, _root._ymouse);
                        } // end else if
                    } // end else if
                } // end else if
                break;
            } 
        } // End of switch
    };
	 */
	
	
	
	
}
